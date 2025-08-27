package Tehtava3;

public class Employee extends Organization {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toXml(int indentLevel) {
        String indent = "  ".repeat(indentLevel);
        return String.format("%s<Employee name=\"%s\" salary=\"%.2f\" />\n", indent, name, salary);
    }
}


