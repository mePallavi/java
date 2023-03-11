public class methods {

    /*methods are just like functions
    main method is the default method and all other methods are called inside it */
    public static void add(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        add(3, 5);

    //STRING METHODS
        String name = "The one who must not be named";
        
        /*some of the common string methods are:
         * toUpperCase()
         * toLowerCase()
         * length()
         * charAt(i)    -- i=index whose value you want
         * substring(begin, end)  -- end index is not included
        */

        int len = name.length();
        System.out.println(len);
        System.out.println( name.substring(5, len));
        /*29 is the length of the string, 28 is the index of the last char
         * to get the last char in substring method, we need to give the length of string instead of last index as endIndex is not included
         */
    }


}