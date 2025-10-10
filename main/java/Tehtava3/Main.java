package Tehtava3;

public class Main {
    public static void main(String[] args) {
        Organization root = new Department("Headquarters");

        Organization hr = new Department("HR");
        hr.add(new Employee("Jose", 50000));
        hr.add(new Employee("Eva", 55000));

        Organization it = new Department("IT");
        Organization dev = new Department("Development");
        dev.add(new Employee("Mikael", 70000));
        dev.add(new Employee("Sara", 72000));

        Organization ops = new Department("Operations");
        ops.add(new Employee("Eve", 60000));

        it.add(dev);
        it.add(ops);

        root.add(hr);
        root.add(it);
        root.add(new Employee("lili", 150000));

        System.out.println("Total Salary: $" + root.getSalary());
        System.out.println("\nOrganizational Structure in XML:\n");
        System.out.println(root.toXml(0));
    }
}
