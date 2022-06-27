package Practice;

public class BuilderClass {
    public static void main(String[] args) {
        Builder obj=new BuilderFactory().setName("Avinash modi").setBatch("2015-2019").getBuilder();
        System.out.println(obj);
    }
}
class Builder{
    String name;
    String batch;
    int rollno;

    Builder(String name,String batch, int rollno){
        this.name=name;
        this.batch=batch;
        this.rollno=rollno;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "name=" + name +
                ", batch='" + batch + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
class BuilderFactory{
    String name;
    String batch;
    int rollno;

    public BuilderFactory setName(String name){
        this.name=name;
        return this;
    }

    public BuilderFactory setBatch(String batch){
        this.batch=batch;
        return this;
    }

    public BuilderFactory setRollNo(int rollno){
        this.rollno=rollno;
        return this;
    }

    public Builder getBuilder(){
        return new Builder(name,batch,rollno);
    }
}