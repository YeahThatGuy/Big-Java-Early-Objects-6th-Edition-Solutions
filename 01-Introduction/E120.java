//table with 2 columns
package e13;

public class E120 {

    public static void main(String[] args) {
        
        int californiaTax = 2;
        int alabamaTax = 10;
        int newYorkTax = 5;
        int ohioTax = 1;
        int alaskaTax = 0;
        
        System.out.println("Sales Tax Rates\n-------------------");
        System.out.println("Alaska\t\t" + alaskaTax + "%\nAlabama\t\t" + 
                alabamaTax + "%\nCalifornia\t" + californiaTax +
                "%\nNew York\t" + newYorkTax + "%\nOhio\t\t" + ohioTax + "%");
    }
}