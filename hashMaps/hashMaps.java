import java.util.HashMap;

public class hashMaps {
    public static void main(String[] args) {
        
        /* A HashMap is a list of key-value pairs.
         * HashMap <Key-DataType, Value-DataType>
         * HashMaps don't have a set order, they are printed randomly unlike with an array where all values are indexed. Here, we can get a value only through it's key
         */
        HashMap<String, String> passwords = new hashMaps<String, String>();

        /*Insert elements */
        passwords.put("faaltu@abc.com", "faaltuNumber1");
        passwords.put("pogo@abc.com", "cartoonNetw2rk");
        passwords.put("banana@abc.com", "@wesomeApp1e");

        System.out.println(passwords);

        /*Remove element*/
        passwords.remove("faaltu@abc.com")
        System.out.println(passwords);

        /*Check if value is present */
        System.out.println(passwords.containsValue("hello"));    //returns true/false

        /*Check if key is present */
        System.out.println(passwords.containsKey("hello"));    //returns true/false

        /*Other functions are size(), replace(key, value) etc.
         * values() to get all values, keySet() to get all keys
         */

    }
}
