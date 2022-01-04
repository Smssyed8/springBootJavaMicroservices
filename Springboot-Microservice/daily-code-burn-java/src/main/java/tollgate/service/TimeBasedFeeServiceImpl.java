package tollgate.service;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TimeBasedFeeServiceImpl implements  TimeBasedFeeService{

    private static final String TOLL_TIME_FEE_YAML_FILE = "/tollFeeTime.yaml";
    private static final List<TimeFee> timeFeeList = new ArrayList<>();

    static {
        readFromYaml();
    }

    @Override
    public double getFeeForTime(LocalTime time) {
          return timeFeeList.stream()
            .filter(timeFee -> isWithinTimeList(timeFee, time))
            .findAny()
            .map(TimeFee::getFee)
            .orElse(8d);
    }

    private boolean isWithinTimeList(TimeFee timeFee, LocalTime time) {

 return false;
    };

    /**
     * To read YAML file and populate TollTimeFee list.
     *
     */
    private static void readFromYaml() {

        try (InputStream in = TimeBasedFeeServiceImpl.class.getResourceAsStream(TOLL_TIME_FEE_YAML_FILE)) {
           /* Yaml yaml = new Yaml(new Constructor(Json));
            TollTimeFeeList list = yaml.load(in);

            list.getTimeFeeList()
                    .stream()
                    .map(timeFeeString -> mapToTollTimeFee(timeFeeString))
                    .forEach(tollTimeFeeList::add);*/

            Yaml yaml = new Yaml();
            Object obj = yaml.load(in);
            if (obj instanceof ArrayList) {
                JSONArray arrayList = (JSONArray) obj;
                arrayList.stream()
                        .map(timeFeeString -> mapToTollTimeFee((JSONObject) timeFeeString))
                        .forEach(timeFeeList::add);

            }
            /*JSONObject jsonObject = new JSONObject((Map<String, ?>) obj);
            jsonObject.get("TimeList")
             String str = JSONValue.toJSONString(obj);*/
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    private static TimeFee mapToTollTimeFee(JSONObject timeFeeString) {
        return new TimeFee()
                .setStartTime(LocalTime.parse(timeFeeString.getAsString("start")))
                .setEndTime(LocalTime.parse(timeFeeString.getAsString("end")))
                .setFee((Double)timeFeeString.get("fee"));
    }
}
