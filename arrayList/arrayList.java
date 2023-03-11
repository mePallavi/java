import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        
        /*ArrayList class is a resizable array. We can easily add, delete, change or clear values in an ArrayList*/
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");     //add elements
        fruits.add("banana");
        fruits.add("grape");

        /*We can print the whole ArrayList with just its name, unlike with Arrays where we need to specify the index of each element */
        System.out.println(fruits);

        String getFruit = fruits.get(1);            //access an element of an ArrayList
        System.out.println("getFruit: " + getFruit);

        fruits.set(1, "orange");                    //change the value in ArrayList
        System.out.println(fruits);

        fruits.remove("grape");   //remove elements
        System.out.println(fruits);

        fruits.clear();           //clears the whole ArrayList
        System.out.println(fruits);
    }
}
