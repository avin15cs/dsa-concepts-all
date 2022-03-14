package OOPsConcepts;

public class Constructor {
    public static void main(String[] args) {
        //default constructor used
        Human h1=new Human();
        Human h2=new Human("Aditya",17);
        h1.name="Avinash";
        h1.age=25;


        System.out.println(Human.count);
    }
}
class Human{
    String name;
    int age;

    //to count how many constructors made- we can use static variable
    // static variable is a class property not object's property
    static int count;

    //default constructor check
    public Human(){
        count++;
        System.out.println("creating an object");
    }

    //Now to add name and age while constructor creation we can create constructor with Property
    public Human(String name, int age){
        //to call one constructor with other constructor we use "this" keyword
        //here without "this" keyword, count++ wont happen,
        // but with "this" keyword, it will happen, try once!
        this();
//        name=newName;
//        age=newAge;

        //Now for pointing to instance variable we can use this keyword
        this.name=name;
        this.age=age;
    }
    void walk(){
        System.out.println(name+" is walking");
    }

}