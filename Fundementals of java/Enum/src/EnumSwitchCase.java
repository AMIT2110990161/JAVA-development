enum Light{
    Red, Yellow, Green;
}

public class EnumSwitchCase {
    public static void main(String[] args) {
        Light cl = Light.Red;

        switch(cl){
            case Red:
                System.out.println("Pls Stop!");
                break;
            case Yellow:
                System.out.println("Get Ready!");
                break;
            case Green:
                System.out.println("go go");
                break;
        }
    }
}
