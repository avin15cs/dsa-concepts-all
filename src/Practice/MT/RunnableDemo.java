package Practice.MT;

public class RunnableDemo {
    public static void main(String[] args)throws Exception {
        R1 r1=new R1();
        R2 r2=new R2();

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count= "+R.count);
    }
}

class R1 implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
            R.setCount();
    }
}

class R2 implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=1000;i++)
            R.setCount();
    }
}

class R {
    static int count;

    public static synchronized void setCount(){
        count++;
    }
}
