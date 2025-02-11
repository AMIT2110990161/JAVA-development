package practiceProblem_Weak02.Tuesday_11_feb_2025.Level_01;

public class Circle {
    private float radius;

    public Circle(){
        this.radius = 22.7f;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    void printDetails(){
        System.out.println(radius);
    }

    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.printDetails();
        Circle cr1 = new Circle(56.2f);
        cr1.printDetails();
    }

}
