package package1;

public class Access2 {
    
    int days = 1;    //default
    public int hours = 24;
    protected int minutes = 1440;
    private int seconds = 3600;

    //We can do the same for methods
    protected int getSeconds() {
        return seconds;
    }
}

