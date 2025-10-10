package Tehtava3;

import java.util.ArrayList;
import java.util.List;

public class Department extends Organization {
    private List<Organization> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(Organization organization) {
        children.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        children.remove(organization);
    }

    @Override
    public double getSalary() {
        return children.stream().mapToDouble(Organization::getSalary).sum();
    }

    @Override
    public String toXml(int indentLevel) {
        String indent = "  ".repeat(indentLevel);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s<Department name=\"%s\">\n", indent, name));
        for (Organization child : children) {
            sb.append(child.toXml(indentLevel + 1));
        }
        sb.append(String.format("%s</Department>\n", indent));
        return sb.toString();
    }
}
