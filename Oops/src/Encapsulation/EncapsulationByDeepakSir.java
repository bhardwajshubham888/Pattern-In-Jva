package Encapsulation;
class EmployeeDetails{
    private String name;
    private long PhonNumber;

    public  void setName(String name) {
        this.name=name;
    }

    public  String getName() {
       return name;
    }
    public void setPhonNumber(long phonNumber) {
        this.PhonNumber=phonNumber;
    }
    public int getPhonNumber() {
        return getPhonNumber();
    }

}
public class EncapsulationByDeepakSir {
    public static void main(String[] args) {
EmployeeDetails shubham=new EmployeeDetails();
EmployeeDetails AnkitSir=new EmployeeDetails();
        shubham.setName(" shubham sharma");
        shubham.setPhonNumber(1234567890l);
        AnkitSir.setName("Ankit sir");
        AnkitSir.setPhonNumber(1234567890l);
        System.out.println(" Employee name= "+shubham.getName() +" Employee NUMBER="+shubham.getPhonNumber());
        System.out.println(" Employee name= "+AnkitSir.getName() +" Employee NUMBER="+AnkitSir.getPhonNumber());
    }
}