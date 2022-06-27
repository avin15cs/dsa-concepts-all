package Walmart.FactoryDesignPattern;

abstract class HardDrive {
    abstract void show();
}

class Samsung extends HardDrive {

    @Override
    void show() {
        System.out.println("Samsung HD");
    }
}

class SanDisk extends HardDrive {

    @Override
    void show() {
        System.out.println("SanDisk HD");
    }
}

class HardDriveFactory{
    public static HardDrive getInstance(String str){
        if(str.equals("Samsung"))
            return new Samsung();

        else
            return new SanDisk();
    }
}
public class FD{
    public static void main(String[] args) {
//        HardDriveFactory hardDriveFactory = new HardDriveFactory();
        HardDrive hardDrive = HardDriveFactory.getInstance("Samsung");
        hardDrive.show();
    }
}