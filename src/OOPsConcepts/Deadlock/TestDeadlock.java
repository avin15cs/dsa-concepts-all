package OOPsConcepts.Deadlock;

public class TestDeadlock {
    static String resource1="Avinash";
    static String resource2="Modi";
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                synchronized(resource1){
                    System.out.println("Thread 1: lock Resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2){
                        System.out.println("Thread 1: lock Resource 2");
                    }
                }
            }
        };

        Thread t2=new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread 2: Lock Resource 2");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource1){
                        System.out.println("Thread 1: lock Resource 2");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
