import java.util.HashSet;
import java.util.Iterator;

public class hashBrowns {

    public static void main(String[] args) {
        
        /*HashSets are similar to HashMaps, but they do not have key-value pairs, just values */
        HashSet<String> h = new HashSet<String>();

        h.add("jake");
        h.add("boyle");
        h.add("amy");

        System.out.println(h);

        /*Other methods are size(), contains("xyz"), isEmpty(), clear() */

        /*Iterate through a HashSet */

        /*We are using Integer instead of int becoz we want to use the object instead of the primitive type int */
        HashSet<Integer> hashBrowns = new HashSet<Integer>();

        hashBrowns.add(2);
        hashBrowns.add(26);
        hashBrowns.add(90);

        System.out.println(hashBrowns);

        Object[] arr = hashBrowns.toArray();

        /*Foll. command may give out a different eachtime as we can't define order in hashset, insertion of elements in hasset is based on hashcode */
        System.out.println(arr[0]);
        System.out.println(hashBrowns.hashCode());

        Iterator<Integer> it = hashBrowns.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());  //prints out elements of the set in no particular order
        }

    }
    
}