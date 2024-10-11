public class cat extends Animal{
    public boolean  isindoor;
    public cat(String name,int age,boolean isindoor){
        super(name,age);
        this.isindoor=isindoor;
    }
    public boolean getisindoor(){
        return isindoor;
    }
}