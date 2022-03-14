package OOPsConcepts.Encapsulation.T2;

import OOPsConcepts.Encapsulation.T1.Encapsulation;

public class Test {
    public static void main(String[] args) {
        Encapsulation encapsulation =  new Encapsulation();
        //public method can be called easily.
        encapsulation.doWork();

        //default method(here doWalk() method) is not visible from other packages, only visible within package
//        encapsulation.doWalk();

        //doSleep() is not accessbile other package in any random class
//        encapsulation.doSleep();
    }
}

