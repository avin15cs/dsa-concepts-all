package Walmart.TestMultiThreading;

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();

        test1.start();
        test2.start();

        test1.join();
        test2.join();
        System.out.println("Count: "+Counter.count);
    }
}

class Counter{
    static int count;
    public static synchronized void increment(){
        count++;
    }
}

class Test1 extends Thread{
    public void run(){
        for(int i=1;i<=1000;i++)
            Counter.increment();
    }
}

class Test2 extends Thread{
    public void run(){
        for(int i=1;i<=1000;i++)
            Counter.increment();
    }
}