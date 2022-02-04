public class typeCasting {
    
    public static void main(String[] args)
    {
        /*
        Type casting:
        When we take a number/data of one type and store it in another type 
        
        e.g. int a = 0.5
            gives error as double can't be stored in int
        */

        int a = (int) 2.5; //double is converted to int

        System.out.println(a); //outputs 2;

        
    }
}