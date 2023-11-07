package Task_3;

public class Employee {
    private long id;
    private String name;
    private String role;

    public Employee() {
    }

    public Employee(long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
