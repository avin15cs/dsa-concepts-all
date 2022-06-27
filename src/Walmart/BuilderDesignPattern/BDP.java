package Walmart.BuilderDesignPattern;

public class BDP {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setBattery(2000).setOS("Android").getPhone();
        System.out.println(phone);
    }
}

class Phone{

    private String os;
    private String ram;
    private int battery;

    public Phone(String os, String ram, int battery){
        this.os=os;
        this.ram=ram;
        this.battery=battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram='" + ram + '\'' +
                ", battery=" + battery +
                '}';
    }
}

class PhoneBuilder{

    private String os;
    private String ram;
    private int battery;

    public PhoneBuilder setOS(String os){
        this.os=os;
        return this;
    }

    public PhoneBuilder setRam(String ram){
        this.ram=ram;
        return this;
    }

    public PhoneBuilder setBattery(int battery){
        this.battery=battery;
        return this;
    }
     public Phone getPhone(){
        return new Phone(os,ram,battery);
     }

}