import java.util.*;

/**
 * Created by ankitgupta on 5/21/17.
 */
public class treeMapSorting {

    public static void main(String[] args) {
        Employee e1 = new Employee("Ankit", 101);
        Employee e2 = new Employee("Gagan", 102);
        Employee e3 = new Employee("Jagmohan", 103);
        Employee e4 = new Employee("Rimmy", 104);
        Employee e5 = new Employee("Hardeep", 105);
        Employee e6 = new Employee("Hardeep", 105);
        Employee e7 = new Employee("Hardeep", 105);

//        System.out.println(e5.equals(e6));

        Map<Integer,Employee> hm = new TreeMap<>();
        hm.put(5,e1);
        hm.put(4,e5);
        hm.put(3,e4);
        hm.put(2,e3);
        hm.put(1,e2);
        hm.put(6,e6);

//        System.out.println(hm.size());

        Map<Employee, Integer> hms = new HashMap<>();
//        Employee e1 = new Employee(101);
//        Employee e2 = new Employee(101);

        hms.put(e5,1);
        hms.put(e6,1);
        hms.put(e7,1);

        System.out.println(hms.size());
        List<Employee> peopleByAge = new ArrayList<Employee>(hm.values());
//
        System.out.println("\nSorted by name using Comparator");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(peopleByAge, nameCompare);
        for (Employee employee: peopleByAge)
            System.out.println(employee.getName() + " " + employee.getId());
//
        System.out.println(" ");
        System.out.println("\nSorted by name using Comparable");
        Collections.sort(peopleByAge);
        for (Employee employee: peopleByAge)
            System.out.println(employee.getName() + " " + employee.getId());

        Set<Employee> empSet = new HashSet<Employee>();
            for (int i = 0; i<100;i++){
                empSet.add(new Employee("Ank" + i,i));
            }

        System.out.println(empSet.size());


        long startTime = System.nanoTime();
        System.out.println(empSet.contains(new Employee("Ank4",4)));
        System.out.println(System.nanoTime()-startTime);

        }
}
