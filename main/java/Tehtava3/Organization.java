package Tehtava3;

public  abstract class Organization {
    protected  String name;
    public  Organization(String name) {
        this.name = name;
    }

    public abstract  double getSalary();

    public abstract  String toXml(int indentLevel);

    public  void  add (Organization organization){
    }
    public  void  remove(Organization organization){
    }
    public String getName(){
        return name;
    }
}
