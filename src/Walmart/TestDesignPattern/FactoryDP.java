package Walmart.TestDesignPattern;

public class FactoryDP {
    public static void main(String[] args) {
        HardDrive hardDrive = HardDriveFactory.getInstance("Samsung");
        hardDrive.show();
    }
}

abstract class HardDrive{
    abstract void show();
}

class Samsung extends HardDrive{

    @Override
    void show() {
        System.out.println("Samsung HD");
    }
}

class Sony extends HardDrive{

    @Override
    void show() {
        System.out.println("Sony HD");
    }
}

class HardDriveFactory{
    public static HardDrive getInstance(String s){
        if(s=="Samsung")
            return new Samsung();

        else
            return new Sony();
    }
}
