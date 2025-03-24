package enumLearning;

enum Day{
    Sunday, Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday;
}

public class Basics {
    public static void main(String[] args) {
        Day today = Day.Friday;
        System.out.println("Today is : " + today);
    }
}
