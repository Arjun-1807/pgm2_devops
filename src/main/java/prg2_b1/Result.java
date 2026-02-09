package prg2_b1;

public class Result {
    public static String display(int m) {
    	if(m%2==0)
    		return"Even";
    	else
    		return"Odd";
    }

    public static void main(String[] args) {
        System.out.println(display(55));
    }
}