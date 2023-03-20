import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {
        
        /*When there's an error in our code, Java will stop and throw an error also called an Exception.
         * There are many types of exceptions like FileNotFoundException, ArrayIndexOutOfBoundsException etc.
         * One important exception is NullPointerException, it's thrown when th eprogram tries to use an object referencing a null value.
         */

         int a = null; //will throw error, as null can't be assigned to primitive data types in java

         Scanner scan = null;   //no error as non-primitive
         scan.nextInt();        // throws null pointer exception as scan points to nothing(null) so we can't call a function on it


        /*** Handling Exceptions ***/

        /*Exceptions can be handled using try(try this code) and catch(run this code if try throws an exception i.e. catch the exception). Using try-catch, we can also specify the code block to be run in case of different exceptions(errors) */

        try{
            int[] var = {4};
            System.out.println(var[1]);    //will throw an exception
        }
        catch(NullPointerException e) {
            System.out.println("Your array is null!");
        }        
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
        }
        catch(Exception e) {
            System.out.println("Something else went wrong!");
        }

    }
}
