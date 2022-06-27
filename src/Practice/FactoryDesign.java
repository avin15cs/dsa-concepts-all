package Practice;

public class FactoryDesign {
    public static void main(String[] args) {
        HardDrive hardDrive = new HardDriveFactory().getInstance("Samsung");

        hardDrive.show();
    }
}

abstract class HardDrive{
    abstract void show();
}

class Samsung extends HardDrive{

    @Override
    void show() {
        System.out.println("This is Samsung Hard Disk");
    }
}

class SanDisk extends HardDrive{

    @Override
    void show() {
        System.out.println("This is SanDisk Hard Disk");
    }
}

class HardDriveFactory{
    public HardDrive getInstance(String s){
        if(s=="Samsung")
            return new Samsung();

        else
            return new SanDisk();
    }

}