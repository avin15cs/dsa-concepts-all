package OOPsConcepts.Inheritance;

public class Interfaces implements Cars, Person{
    public static void main(String[] args) {

    }


    //implements keyword is used for implementing interfaces
    @Override
    public void stop() {
        System.out.println("My car stopped");
    }

    @Override
    public void walk() {
        System.out.println("Transformer is walking");
    }
}

interface Cars{

    //only default methods can be defined in interface, normal methods can only be declared
    default void start(){
        System.out.println("Car Started");
    }
    //normal method-hence only declared and not defined
    //any method(other than default method) written in interface is abstract and hence cant be defined
    void stop();
}

interface Person{
    void walk();
}