enum Color{
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

    private String hashCode;

    Color(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getHashCode(){
        return hashCode;
    }
}
public class CostimizedEnum {
    public static void main(String[] args) {
        Color color = Color.BLUE;
        System.out.println(color + " HashCode is : " + color.getHashCode());
    }
}
