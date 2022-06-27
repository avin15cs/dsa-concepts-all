package Practice.MT;

public class PrintOddEven {
    public static void main(String[] args) {
        Print print=new Print();
        Thread t1=new Thread(new OddEvenTask(print, 10, false),"Odd");
        Thread t2=new Thread(new OddEvenTask(print, 10, true),"Even");

        t1.start();
        t2.start();
    }
}

class Print{
    private static boolean isEven;

    synchronized void printEven(int n){
        while(!isEven){
            try{
                wait();
            }catch (Exception e){}
        }
        System.out.println(Thread.currentThread().getName()+": "+n);
        isEven=false;
        notify();
    }

    synchronized void printOdd(int n){
        while(isEven){
            try{
                wait();
            }catch (Exception e){}
        }
        System.out.println(Thread.currentThread().getName()+": "+n);
        isEven=true;
        notify();
    }
}
class OddEvenTask implements Runnable{
    private Print print;
    private int max;
    private boolean isEvenNo;

    public OddEvenTask(Print print, int max, boolean isEvenNo) {
        this.print = print;
        this.max = max;
        this.isEvenNo = isEvenNo;
    }

    @Override
    public void run() {
        int number=isEvenNo?2:1;
        while(number<=max){
            if(isEvenNo){
                print.printEven(number);
            }else{
                print.printOdd(number);
            }
            number+=2;
        }
    }
}