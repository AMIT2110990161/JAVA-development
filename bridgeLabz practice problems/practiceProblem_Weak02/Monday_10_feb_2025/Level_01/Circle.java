package Level_01;
public class Circle {
    private float radius;
    private final float pi = 3.14f;
    public Circle(float radius){
        this.radius = radius;
    }

    void area(){
        double area = pi*(Math.pow(radius, 2));
        System.out.format("Area of Circle : %.2f",area);
    } 

    void circumference(){
        float circumference = 2*pi*radius;
        System.out.println("\nCircumference of Circle : " + circumference);
    }


    public static void main(String[] args) {
        Circle cr = new Circle(8.9f);
        cr.area();
        cr.circumference();
    }
}
