public class stringToInt {

    public static void main (String[] args)
    {
        //STRING TO INT----------------------------
        String s = "102";

        System.out.println(4 + s);  // outputs "1024"
        
        //Integer class provides methods to convert string to integer and vice-versa
        int a = Integer.parseInt(s); //now "102"->102; s is still a string

        System.out.println(a + 4); //outputs 106

        //INT TO STRING-----------------------------
        int n = 8;
        
        System.out.println(n + 1); //outputs 9

        String b = Integer.toString(n); // 8->"8"; n is still an int

        System.out.println(b + 1); // outputs "81"

        //INT FROM STRING WHICH CONTAINS OTHER CHARACTERS TOO--------------------------------------------
        String str = "age: 47";

        //regular expression; output is still a string but it contains only digits(1st arg), replacing other substrings with the 2nd arg 
        str = str.replaceAll("\\D+", ""); //"age: 47" -> "47"

        int num = Integer.parseInt(str); // "47" -> 47

        System.out.println(num + 2); // outputs 49
    }
}