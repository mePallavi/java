package package1;

public class Access1 {
    public static void main(String[] args) {

        /*Summary:
        1. private: accessible in the same file
        2. default: accessible  in the same package 
        3. protected: accessible  in the same package; accessible in all packages w/ "extend" E.g. otherpackage extend package1{
        4. public: accessible  in all packages 
            same goes for methods */

        Access2 a = new Access2();

        //default acessible as same package 
        System.out.println(a.days);

        //public is accessible everywhere
        System.out.println(a.hours);

        //protected accessible same package
        System.out.println(a.minutes);
        a.getSeconds();

        //private is not accessible as different class
        System.out.println(a.seconds);
    }
}
