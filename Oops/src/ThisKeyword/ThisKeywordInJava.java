package ThisKeyword;
class ThisKeyword {
    String name;
    public void setValue(String name) {
    this.name=name;
    }
    public String printValue(){
        return name;
    }


}
public class ThisKeywordInJava {
    public static void main(String[] args) {
        ThisKeyword check=new ThisKeyword();
        check.setValue("shubham sharma");
        System.out.println(check.printValue());
    }
}
