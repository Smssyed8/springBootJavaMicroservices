import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strList = new ArrayList<String>();
		
		//List<Date>
		strList.add("Syed");
		strList.add("Sharath");
		
		List<String> sList =  strList.stream().filter(s -> s.equals("Syed"))
				//.map(LocalDateTime::toLocalDate)
				.collect(Collectors.toList());

	}

}
