package Entities;

public class Employee {

    private Integer id;
    private String name;
    private  Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalaryPercentade(double percentage){
        salary += percentage/100*salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f",id,name,salary);
    }
}
