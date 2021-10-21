package collection;
import java.util.*;
import java.util.stream.Collectors;

public class SortingJavaObject {

    /** This class shows how to sort primitive arrays,
     * Wrapper classes Object Arrays
     * @param args
     */
    public static void main(String[] args) {
        //sort primitives array like int array
        int[] intArr = {5,9,1,10};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        //sorting String array
        String[] strArr = {"A", "C", "B", "Z", "E"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        //sorting list of objects of Wrapper classes
        List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");
        Collections.sort(strList);
        
        Map<String, String> map = new HashMap<String,String>();
        
        for(String str: strList) System.out.print(" "+str);


        List<String> stringList = new ArrayList<>();
        stringList.add("Syed");
        stringList.add("Syed1");
        stringList.add("Syed2");

        Collections.sort(stringList);
        stringList.stream().filter(e -> e != "Syed1")
                .collect(Collectors.toList()).forEach(e -> System.out.print(e));

       int[] arr = {3,5,1,2};
       Arrays.sort(arr);
       Arrays.stream(arr).forEach(e -> System.out.print(e));

       ///Employee sort code
        //sorting custom object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);

        //sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));

        //sort employees array using Comparator by Salary
        Arrays.sort(empArr, Employee.SalaryComparator);
        System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));

        //sort employees array using Comparator by Age
        Arrays.sort(empArr, Employee.AgeComparator);
        System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));

        //sort employees array using Comparator by Name
        Arrays.sort(empArr, Employee.NameComparator);
        System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));

        //Employees list sorted by ID and then name using Comparator class
        //empArr[0] = new Employee(1, "Mikey", 25, 10000);
        Arrays.sort(empArr, new EmployeeComparatorByIdAndName());
        System.out.println("Employees list sorted by ID and Name:\n"+Arrays.toString(empArr));


        Arrays.sort(empArr, Employee.twoComparator);
        System.out.println("Employees list sorted by twoComparator:\n"+Arrays.toString(empArr));

        Employee emp = new Employee(1,"Syed", 24, 10000);
        Employee emp2 = new Employee(2,"Punya", 25, 20000);
        Employee emp3 = new Employee(2,"Punya", 25, 20000);
        System.out.println(emp2.equals(emp3));
        
        Set<Employee> setV = new HashSet<Employee>();
        setV.add(emp2);
        setV.add(emp3);
        
        //System.out.println(setV);
        
        Map<Integer,Employee> mapV = new HashMap<Integer,Employee>();
        mapV.put(1, emp2);
        mapV.put(2, emp3);
        
        
        
        System.out.println(mapV);

    }

}

