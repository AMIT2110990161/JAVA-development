enum Opration{
    Add{
        public int apply(int a, int b) {
            return a + b;
        }
    },
    Multiply{
        public int apply(int a, int b) {
            return a * b;
        }
    };

    public abstract int apply(int a, int b);
}

public class InsideMethod {
    public static void main(String[] args) {
        int res = Opration.Multiply.apply(4, 2);
        System.out.println(res);
    }
}
