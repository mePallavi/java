public class exponents {
    
    public static void main(String[] args)
    {
        int a=5;
        System.out.println( Math.pow(a,2) );  //prints 25.0; default double

        System.out.println( (int) Math.pow(a,2) );  //prints 25; converts double to int

        System.out.println( Math.pow(2.5,4.2) );  //prints double

        System.out.println( (int) Math.pow(2.5,4.2) );  //prints integer

    }
}