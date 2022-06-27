package OOPsConcepts;

//one public class in one .java file
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Lets make object for Person class
        Person p1=new Person();
        p1.age=25;
        p1.name="Avinash";

        Person p2 = new Person();
        p2.age = 31;
        p2.name = "Aditya";
        //Accessing properties
        System.out.println(p1.age+" "+p1.name);
        System.out.println(p2.age+" "+p2.name);

        //Accessing behaviour
        p1.walk();
        p2.eat();

        //Achieving compile time polymorphism- click on any walk() function it will  land to its definition.
        p2.walk();
        p2.walk(5000);
    }
}

//This class doesn't take memory in runtime as no objects are created yet
class Person{
    //Properties
    String name;
    int age;

    //behaviour
    void walk(){
        System.out.println(name+" is walking");
    }

    void eat(){
        System.out.println(name+" is eating");
    }

    //Polymorphism(poly-multiple morph-forms) has been achieved.
    //two walk functions: one with arguments, other without arguments.
    void walk(int steps){
        System.out.println(name+ " walked " + steps +"steps");
    }
}