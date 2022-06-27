package Walmart.AdapterDesignPattern;

public class ADP {
    public static void main(String[] args) {
        Pen pen=new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(pen);
        assignmentWork.writeAssignment("I am a bit tired to write an assignment");
    }
}

interface Pen{
     void write(String str);
}

class AssignmentWork{
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void writeAssignment(String str){
        pen.write(str);
    }
}

class PilotPen{
    public void mark(String str){
        System.out.println(str);
    }
}

class PenAdapter implements Pen{

    PilotPen pilotPen=new PilotPen();
    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }
}
