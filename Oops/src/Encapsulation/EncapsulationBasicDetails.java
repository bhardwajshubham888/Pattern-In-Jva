package Encapsulation;

public class EncapsulationBasicDetails {
    public static void main(String[] args) {
        StudentDetails employe=new StudentDetails();
        // outerside person try to access the information
        employe.getName();
        employe.getMobilenumber();
        System.out.println(employe.name);
        System.out.println(employe.mobilenumber);

    }
}
