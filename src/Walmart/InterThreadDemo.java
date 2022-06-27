package Walmart;

class Q{
    int num;
    boolean valueSet=false;
    public synchronized void put(int num) throws InterruptedException {
        while(valueSet){
            wait();
        }
        this.num=num;
        System.out.println("Put: "+num);
        valueSet=true;
        notify();
    }

    public synchronized void get() throws InterruptedException {
        while(!valueSet){
            wait();
        }
        System.out.println("Get: "+num);
        valueSet=false;
        notify();
    }


}

class Producer implements Runnable{
    Q q;
    public Producer(Q q){
        this.q=q;
        Thread thread = new Thread(this,"Producer");
        thread.start();
    }

    @Override
    public void run() {
        int i=0;
        while(true){

            try {
                q.put(i++);
                Thread.sleep(1000);
            }
            catch (InterruptedException e) { }
        }
    }
}

class Consumer implements Runnable{
    Q q;
    public Consumer(Q q){
        this.q=q;
        Thread thread=new Thread(this,"Consumer");
        thread.start();
    }
    @Override
    public void run() {
        while(true){
            try {
                q.get();
                Thread.sleep(1000);
            }
            catch (InterruptedException e) { }
        }
    }
}
public class InterThreadDemo {
    public static void main(String[] args) {
        Q q=new Q();
        new Producer(q);
        new Consumer(q);
    }
}