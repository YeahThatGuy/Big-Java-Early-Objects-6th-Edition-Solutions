public class R113 {

    public static void main(String[] args) {

        double balance = 10000;
        double interestRate = 0.005;
        double withdrawal = 500;

        int timeMonths = 0;

        while (balance > 0) {
            balance = ((balance * interestRate) + balance) - 500;
            //this control statement is needed for the last loop, when balance < 0
            if (balance > 0) {
                timeMonths++;
                System.out.println(balance);
            } else {
                break;
            }
        }
        double timeYear = timeMonths / 12.0;
        System.out.println(timeMonths + " months or " + timeYear + " years");
    }

}
