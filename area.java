public class shape
{
    double getarea(){
        return 0;
    }
}
public class rectangel implements shape
{
    private double width;
    private double height;

public rectangel( double width,double height)
{
    this.width=width;
    this.height=height;
}
public double getarea()
{
    return width*height;
    }
}
public class circle implements shape
{
    private double radius;
    public circle(double radius)
    {
    this.radius=radius;
}
public double getarea(){
   return 3.14*radius*radius; 
}}
public class area{
    public static void main(String args[]){
        shape[] s1= new shape[2];
        s1[0]=new rectangel(5,6);
        s1[1]=new circle(3);
        System.out.println("area of rectangel is"+s1[0].getarea());
         System.out.println("area of circle is"+s1[1].getarea());
    }
}