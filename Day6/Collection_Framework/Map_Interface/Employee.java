package Map_Interface;

public class Employee{
    private String dep;
    private String name;

    public Employee(String name, String dep){
        this.dep = dep;
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public String getDep(){
        return dep;
    }

    @Override
    public String toString(){
        return name;
    }



}
