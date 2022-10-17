public class Employee {
    //properties
    private String name;

    //constructor
    public Employee(String name) {
        this.name = name;
    }

    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
