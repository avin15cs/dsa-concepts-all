package OOPsConcepts.Encapsulation.T1;

public class DoEat{
    public static void main(String[] args) {
        Encapsulation e1=new Encapsulation();
        //doEat() method is not accessible from other class within package as it is marked as private
//        e1.doEat();
//doSleep() is accessible within package but outside package it is accessible through child class
        e1.doSleep();

    }
}