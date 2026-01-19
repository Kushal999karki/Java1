package work11;
public class Circle extends Shape implements Drawable
{
    private double radius;
    public Circle(double radius)
    {
       this.radius= radius; 
    }
    @Override
    public double calculateArea()
    {
        return (22/7) * radius * radius;
    }
    @Override
    public double calculatePerimeter()
    {
        return 2 * (22/7) * radius;
    }
    @Override
    public void draw()
    {
        System.out.println("Drawing the circle");
    }
}