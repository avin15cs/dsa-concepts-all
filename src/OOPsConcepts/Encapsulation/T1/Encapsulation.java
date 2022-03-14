package OOPsConcepts.Encapsulation.T1;

public class Encapsulation {
    public static void main(String[] args) {
        //Encapsulating
        //Data hiding is achieved using encapsulation
        //Packages help us hide functions and variables
        //We do encapsulation for data hiding due to security reasons
        Laptop l1 = new Laptop();

        //lets encapsulate variable price
        //l1.price=23;

        //Achieve encapsulation using getters and Setters
        l1.setPrice(23);
        int price=l1.getPrice();
        System.out.println(price);

    }

    //public function is accessible from other packages classes as well.
    public void doWork() {
        System.out.println("Working working");
    }

    //accessible within package
    void doWalk() {
        System.out.println("Walking walking");
    }
    //accessible within class
    private void doEat() {
        System.out.println("Eating");
    }
    //accessible outside class through inheritance
    protected void doSleep() {
        System.out.println("Sleeping");
    }
}

class Laptop{
    int ram;
    int rom;
    private int price;
    public void setPrice(int price){
        //isUser an Admin
        boolean isAdmin = false;
        if(!isAdmin)
            System.out.println("You are not Admin");
        else
            this.price=price;
    }

    public int getPrice() {
        return price;
    }
}