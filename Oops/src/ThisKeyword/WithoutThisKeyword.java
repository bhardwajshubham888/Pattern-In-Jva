package ThisKeyword;

class student {
    String name;

    public void inputName(String name) {
        name=name;
    }
    public String printName() {
        return name;
    }

}
public class WithoutThisKeyword {
    public static void main(String[] args) {
        student atul=new student();
        atul.inputName(" aul bhardwaj");;
        System.out.println(atul.name);
    }
}
