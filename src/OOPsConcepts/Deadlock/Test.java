package OOPsConcepts.Deadlock;

public class Test {
    public static void main(String[] args) {
        final String resource1="Ratan Jaiswal";
        final String resource2="Vimal Jaiswal";

        Thread t1=new Thread(){
            public void run(){
                synchronized(resource1){
                    System.out.println("Thread 1:Locked Resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2){
                        System.out.println("Thread1: Locked Resource2");
                    }
                }
            }
        };

        Thread t2=new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread 2: locked Resource2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource1){
                        System.out.println("Thread 2: Locked Resource2");

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
