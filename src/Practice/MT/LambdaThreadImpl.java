package Practice.MT;

public class LambdaThreadImpl {
    public static void main(String[] args)throws Exception {
        Thread t1=new Thread(()->{
           for(int i=1;i<=5;i++) {
               System.out.print("T1: ");
               Count.count();
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });

        Thread t2=new Thread(()->{
            for(int i=1;i<=5;i++) {
                System.out.print("T2: ");
                Count.count();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();

        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count= "+Count.c);


        Thread t3=new Thread(()->{
            for(int i=1;i<=1000;i++)
                Count.count();
        },"Thread-3");

        System.out.println(t3.getName());
    }
}

class Count{
    static int c;
    public static synchronized void count(){
        System.out.println(c++);
    }
}