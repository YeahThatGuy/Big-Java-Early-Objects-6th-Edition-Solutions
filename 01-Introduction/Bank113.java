public class Bank113 {

    public static void main(String[] args) {

        double balance = 10000;
        double interestRate = 0.5;
        double withdrawal = 500;

        int timeMonths = 0;

        while (balance > 0) {
            balance = ((balance * 0.005) + balance) - 500;

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