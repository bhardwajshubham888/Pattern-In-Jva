 public class CommonPrefix {
    public static void main(String[] args) {
        String [] words={"flowing","flow","flower"};
        String prefix=words[0];
       for (String word: words) {
           while (word.indexOf(prefix) != 0) {
               prefix = prefix.substring(0, prefix.length() - 1);
           }
       }
           if (prefix.equals("")){
               System.out.println(" value is not match");
           }
           else {
               System.out.println(prefix);
       }
    }
}
