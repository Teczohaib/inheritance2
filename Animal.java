public class Animal{
    public String name;
    public int age;
    public Animal(String name,int age){
this.name=name;
this.age=age;
    }

public String getName(){
    return name;}
    public int getage(){
        return age;
    }
    public void  makesound(){
        System.out.println("Animal makes a sound");
    }
}