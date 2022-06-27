package Walmart;

//Make class as final
//Make variables as final and private
//No setter method
//Make Deep Copy of the Object

public final class ImmutableClass {

    private final int id;
    private final String name;
    private final Engine engine;
    public ImmutableClass(int id, String name, Engine engine) {
        this.id = id;
        this.name = name;
        this.engine = engine;   //Shallow copy
//        Engine newEngine=new Engine(engine.speed);
//        this.engine=newEngine;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }


    public static void main(String[] args) {
        Engine engine=new Engine(50);
        ImmutableClass immutableClass = new ImmutableClass(1,"Test", engine);
//        immutableClass.id=12; --> Won't work
        System.out.println(immutableClass);

        System.out.println(immutableClass.engine.speed);

        engine.speed=70;
        System.out.println(immutableClass.engine.speed);
    }
}

class Engine{
    int speed;
    Engine(int speed){
        this.speed=speed;
    }
}