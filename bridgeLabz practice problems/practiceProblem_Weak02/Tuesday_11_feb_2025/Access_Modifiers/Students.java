package practiceProblem_Weak02.Tuesday_11_feb_2025.Access_Modifiers;

public class Students {
    public long rollNuber;
    protected String name;
    private double CGPA;

    double getCgpa(){
        return CGPA;
    }

    void setCgpa(double CGPA){
        this.CGPA = CGPA;
    }

    public static void main(String[] args) {
        Students st = new Students();
    }
}
