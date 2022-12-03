public class ReverseStriing {
    public static void main(String[] args) {
        String name="moa";
        String rev="";
for (int i=name.length()-1; i>=0; i--){
    rev=rev+name.charAt(i);
}
if (name.equals(rev))
    System.out.println(" palimdrome");
else {
    System.out.println(" not palimdrome");
}
    }
}


