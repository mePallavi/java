package package2;

//import Access2 class if you want to use it this code
import package1.Access2;

public class Access4 extends Access2 {
    public static void main(String[] args) {
        
        //object of Access4
        Access4 a = new Access4();
                
        //default not acessible as different package even when Access4 is subclass of Access2
        System.out.println(a.days);

        //public is accessible everywhere
        System.out.println(a.hours);

        //protected is accessible here as Access4 is subclass of Access2
        System.out.println(a.minutes);
        a.getSeconds();

        //private is not accessible as different class and package
        System.out.println(a.seconds);
    }
}
