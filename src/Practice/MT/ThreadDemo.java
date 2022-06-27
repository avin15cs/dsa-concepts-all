package Practice.MT;

public class ThreadDemo {
    public static void main(String[] args)throws Exception {
        T1 t1=new T1();
        t1.start();

        T2 t2=new T2();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count= " +Counter.count);
    }
}

class T1 extends Thread{
    public void run(){
        for(int i=1;i<=1000;i++)
            Counter.setCount();
    }
}

class T2 extends Thread{
    public void run(){
        for(int i=1;i<=1000;i++)
            Counter.setCount();
    }
}

class Counter{
    static int count;

    public static synchronized void setCount() {
        count++;
    }
}