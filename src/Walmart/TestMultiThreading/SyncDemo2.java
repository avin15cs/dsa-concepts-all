package Walmart.TestMultiThreading;

public class SyncDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Count count=new Count();
//        Runnable obj=()->{
//                for(int i=1;i<=1000;i++){
//                    count.increment();
//                }
//        };
//
//        Thread t1=new Thread(obj);
//
//        Thread t2=new Thread(()->{
//           for(int i=1;i<=1000;i++){
//               count.increment();
//            }
//        });

        Thread t1=new Thread(()->{
            for(int i=1;i<=1000;i++){
                count.increment();
            }
        });

        Thread t2=new Thread(()->{
            for(int i=1;i<=1000;i++){
                count.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count= "+count.count);
    }
}

class Count{
    int count;
    synchronized void increment(){
        count++;
    }
}