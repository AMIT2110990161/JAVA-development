package abtractionAndInterfaces;

public class IneerAndNestedClass {
    class Son{ //this is inner class
        String name;
        void info(){
            System.out.println(this.name);
        }
    }

    static class Play{ //this is nested class
        int num = 69;
    } 
    public static void main(String[] args) {
        IneerAndNestedClass in = new IneerAndNestedClass();
        Son s = in.new Son();
        s.name = "Raman";
        s.info();

        Play pl = new IneerAndNestedClass.Play();
        System.out.println(pl.num);
    }
}
