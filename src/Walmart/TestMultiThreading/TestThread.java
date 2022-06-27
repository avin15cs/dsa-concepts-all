package Walmart.TestMultiThreading;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new T1();
        Thread t2=new T2();
        t1.start();
        System.out.println(t1.getName());
        Thread.sleep(1000);
        t2.setName("Thread-T2");
        System.out.println(t2.getName());
        t2.start();

        t1.join();
        t2.join();

        System.out.println("In main()");
    }
}

class T1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In T1: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
        }
    }
}

class T2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In T2: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
        }
    }
}