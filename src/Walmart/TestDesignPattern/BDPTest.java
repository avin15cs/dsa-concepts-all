package Walmart.TestDesignPattern;

public class BDPTest {
    public static void main(String[] args) {
        Phon phon=new PhonBuilder().setBattery(2000).setOs("Windows").getPhon();
        System.out.println(phon);
    }
}

class Phon{
    int ram;
    String os;
    int battery;

    public Phon(int ram, String os, int battery){
        this.ram=ram;
        this.os=os;
        this.battery=battery;
    }

    @Override
    public String toString() {
        return "Phon{" +
                "ram=" + ram +
                ", os='" + os + '\'' +
                ", battery=" + battery +
                '}';
    }
}

class PhonBuilder{
    int ram;
    String os;
    int battery;

    public PhonBuilder setRam(int ram){
        this.ram=ram;
        return this;
    }

    public PhonBuilder setOs(String os){
        this.os=os;
        return this;
    }

    public PhonBuilder setBattery(int battery){
        this.battery=battery;
        return this;
    }

    public Phon getPhon(){
        return new Phon(ram,os,battery);
    }
}