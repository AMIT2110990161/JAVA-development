package polimorfhism;

class Student{
    String name;
    int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    // @Override
    // public String toString(){
    //     return "Student name is " + name + " and his id : " + id;
    // }

    @Override
    public boolean equals(Object obj){
        Student that = (Student)obj;
        if(this.name.equals(that.name) && this.id == that.id)return true;
        return false;
    }


}

public class ObjectClass {
    public static void main(String[] args) {
        Student st = new Student("Amit kumar", 161);
        Student st1 = new Student("Amit kumar", 161);
        //System.err.println(st);//here toString() method is automatically called form object class.

        System.out.println(st);
        System.out.println(st1);

        System.out.println(st==st1);
        System.out.println(st.equals(st1));
    }
}
