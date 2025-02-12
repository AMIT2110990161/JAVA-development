package practiceProblem_Weak02.Tuesday_11_feb_2025.Access_Modifiers;

public class Students {
    public long rollNuber;
    protected String name;
    private double CGPA;

    public Students(){

    }

    public Students(long rollNuber, String name) {
        this.rollNuber = rollNuber;
        this.name = name;
    }

    double getCgpa(){
        return CGPA;
    }

    void setCgpa(double CGPA){
        this.CGPA = CGPA;
    }

    public static void main(String[] args) {
        Students st = new Students(161, "Amit kumar");
        st.setCgpa(8.23);
        System.out.println(st.getCgpa());
    }
}
