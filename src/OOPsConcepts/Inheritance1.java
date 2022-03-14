package OOPsConcepts;

public class Inheritance1 {
    public static void main(String[] args)throws Exception {
        Staff s1= new Staff();
        s1.name="Avinash";
        s1.age=25;

        //Default constructor wont be created now for child now
//        Developer d2=new Developer(); //--> this will give error
        Developer d1 = new Developer("Aditya",17);

        //just write d1. and you will see work() and onVacation() function
        //These functions are inherited from parent
        d1.work();
        //just write d1. you will find .hashcode, .equals these are functions of Object class
        //Parent of all objects and classes is Object.
        d1.hashCode();

        //runtime polymorphism is achieved here:
        Staff s3=d1;
        //if you click on s3.walk() it will go to parent in compile time, but in runtime it will print Child class Developer function walk
        s3.walk();
        d1.walk();
    }
}

//extends keyword help us to achieve inheritance
class Developer extends Staff{
    public Developer(String name, int age){
        //calls parent constructor, click on super it will land to parent Constructor
        super(name,age);
    }

    void coding(){
        System.out.println("Developer "+name + " is coding.");
    }

    @Override
    void walk(){
        System.out.println("Developer "+name + " is walking.");
    }
}
class Staff{
    String name;
    int age;

    static int count;
    public Staff(){
        count++;
        System.out.println("Object is created");
    }
    public Staff(String name,int age){
        this();
        this.name=name;
        this.age=age;
    }
    void work(){
        System.out.println(name+" is working");
    }
    void onVacation(){
        System.out.println(name+" is on vacation");
    }
    void walk(){
        System.out.println(name+" is walking.");
    }
}