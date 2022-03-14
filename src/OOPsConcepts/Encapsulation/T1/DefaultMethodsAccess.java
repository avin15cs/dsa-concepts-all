package OOPsConcepts.Encapsulation.T1;

public class DefaultMethodsAccess {
    public static void main(String[] args) {
        Encapsulation e1= new Encapsulation();
        //doWalk() method is default method and it can be accessed from other class in same package
        e1.doWalk();

        //doEat() method is private and is not accessible from other class even within same package
        //e1.doEat();

        //doSleep() method is a protected method and hence it is accessible within package but it wont be accessible other package other than in child class
        e1.doSleep();
    }
}
