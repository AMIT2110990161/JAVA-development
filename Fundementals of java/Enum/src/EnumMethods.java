enum Size{
    Small, Medium, Large;
}
public class EnumMethods {
    public static void main(String[] args) {
        // loop through all the values
        for(Size s:Size.values()){
            System.out.println(s);
        }

        Size mySize = Size.valueOf("Large");
        System.out.println("My size is : " + mySize);

        int idx = Size.Medium.ordinal();
        System.out.println("Index of Medium : " + idx);
    }
}
