package OOPsConcepts.Inheritance;

public class Abstraction {
    //Data Hiding is done for reducing and hiding complexities and not due to Security reasons
    //Abstraction is achieved through abstract keyword and through interfaces
    public static void main(String[] args) {
        //Since car is a concept, no point of making an object, lets make it abstract
        //Now car cannot be instantiated
//        Car car =new Car();
    }
}

//This car is just a concept
//In real world there is no point of making an object of car
//We can make objects of Audi and BMW but not car
//Hence we will make car abstract, making abstract means its object can't be created directly/cant be instantiated
abstract class Car{
    int price;

    //Since abstract method is created, class will also be abstract
    //abstract method will be defined in child class only, in parent only method signature is written
    abstract void start();

    void stop(){
        System.out.println("Car is stopped");
    }
}

class Audi extends Car{

    //start() is a abstract method hence it needs to be declared in child class
    @Override
    void start() {
        System.out.println("Audi is starting");
    }
}

class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW is starting");
    }
}