 class Person {
    int nic;
    String name;
    Person(int nic,String name){
      this.nic=nic;
      this.name=name;
    }
}
class Employee extends Person{
    float salary;
    Employee(int nic,String name,Float salary){
        super(nic,name);
        this.salary=salary;
    }
    void output(){
        System.out.println(nic+ " "+name+" "+salary);
    }
}
class Test2{
    public static void main(String[] args) {
        Employee e= new Employee(3425677, "Kamal", 25000f);
        e.output();
    }
}
