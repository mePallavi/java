package package2;

//import Access2 class if you want to use it this code
import package1.Access2;

public class Access3 {
    public static void main(String[] args) {
        
        //object of Access2
        Access2 a = new Access2();
        
        //default not acessible as different package 
        System.out.println(a.days);

        //public is accessible everywhere
        System.out.println(a.hours);

        //protected is not accessible here as different package
        System.out.println(a.minutes);

        //private is not accessible as different class and package
        System.out.println(a.seconds);
    }
}
