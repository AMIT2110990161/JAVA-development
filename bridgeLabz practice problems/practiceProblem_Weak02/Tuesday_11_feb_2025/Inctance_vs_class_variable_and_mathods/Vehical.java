package practiceProblem_Weak02.Tuesday_11_feb_2025.Inctance_vs_class_variable_and_mathods;

public class Vehical {
    String ownerName;
    String vehicalType;
    static double regestrationFees;

    public Vehical(String ownerName, String vehicalType) {
        this.ownerName = ownerName;
        this.vehicalType = vehicalType;
    }

    void displayVehicalDetails(){
        System.err.println("---------Information-----------");
        System.out.println(ownerName + " is having " + vehicalType + " as his vehical");
        System.out.println(regestrationFees);
        System.out.println("---------------End of Information------------");
    }

    static void updateInstitutName(int newName){
        regestrationFees = newName;
    }
    public static void main(String[] args) {
        updateInstitutName(658521);
        Vehical vh = new Vehical("Amit kumar", "RoyalEnfild");
        vh.displayVehicalDetails();
    }
}
