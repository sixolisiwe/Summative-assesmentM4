package demo;

public class Airtime_Demo {

   private double balance;

    public void topUp(double topUpAmount){
        this.balance = this.balance + topUpAmount;

    }

    public double getBalance() {
        return balance;
    }

    public static void main (String[]args){
        Airtime_Demo airtimeAccount = new Airtime_Demo();

        airtimeAccount.topUp(55);

        System.out.println(airtimeAccount.getBalance());

    }
}
