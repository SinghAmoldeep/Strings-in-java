package amol.leetcode;

public class Testimmutablestring {
    public static void main(String[] args) {
        String s = new String("Amoldeep");
        s.concat("Singh");
        System.out.println(s);
        //s is still pointing to the object value=Amoldeep not where value=Amoldeep Singh cause it is immutable
        //but if we explicitily assign the value then we can see the difference
        String s1 = "Amoldeep";
        s=s.concat(" Singh");
        System.out.println(s);
    }
}
