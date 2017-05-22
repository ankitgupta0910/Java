import java.util.Comparator;

/**
 * Created by ankitgupta on 5/21/17.
 */
public class Employee implements Comparable<Employee>{

    String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object o){
        if(o != null && o instanceof Employee)
        {
            int id = ((Employee)o).getId();
            String name = ((Employee)o).getName();
            if(id != 0 && name != null && id == this.getId() && name.equals(this.getName()))
            {
                return true;
            }

        }
        return false;
    }

    public int hashCode(){
//        System.out.println("Hash" + this.name.hashCode() +this.id);
        return this.name.hashCode() + this.id;
//            return 5;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
}

// Class to compare Movies by name
class NameCompare implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
        return e1.getName().compareTo(e2.getName());
    }
}
