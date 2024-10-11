public class dog extends Animal{
    public String breed;
    public dog(String name,int age,String breed){
        super(name,age);
        this.breed=breed;
    }
    public String getbreed(){
        return breed;
    }
    
}