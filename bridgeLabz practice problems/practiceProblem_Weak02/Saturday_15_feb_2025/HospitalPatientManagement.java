import java.time.LocalTime;
import java.util.ArrayList;

abstract class Patient implements IMedicalRecord {
    private static int totalPatient = 0;
    private final int patientID;
    private String name;
    private int age;
    private int billAmount;
    private final ArrayList<String> record;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getBillAmount(){
        return billAmount;
    }
    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public Patient(String name, int age) {
        this.patientID = ++totalPatient;
        this.name = name;
        this.age = age;
        this.billAmount = 0;
        this.record = new ArrayList<>();
    }

    public abstract void calculateBill();

    public void getPatientDetails(){
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public void addRecord(){
        record.add("Record added at " + String.valueOf(LocalTime.now()));
    }

    @Override
    public void viewRecord(){
        for (String record : record){
            System.out.println(record);
        }
    }
}

interface IMedicalRecord {
    void addRecord();
    void viewRecord();
}

class InPatient extends Patient {

    public InPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public void calculateBill(){
        setBillAmount((int)(Math.random() * 100000) + 10000);
        System.out.println("In Patient calculated bill: " + getBillAmount());
    }
}

class OutPatient extends Patient {

    public OutPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public void calculateBill(){
        setBillAmount((int)(Math.random() * 1000000) + 100000);
        System.out.println("Out Patient calculated bill: " + getBillAmount());
    }
}

public class HospitalPatientManagement {
     public static void main(String[] args) {
        InPatient p1 = new InPatient("John", 18);
        OutPatient p2 = new OutPatient("Jane", 18);

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            p.calculateBill();
            p.addRecord();
            p.viewRecord();
        }
    }
}
