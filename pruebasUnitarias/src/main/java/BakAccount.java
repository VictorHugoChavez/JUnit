public class BakAccount {
    private double balance;
    private double miniumBalance;
    private boolean isActivate = true;
    private String holderName;

    public BakAccount(double balance,double miniumBalance){
        this.balance=balance;
        this.miniumBalance=miniumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMiniumBalance() {
        return miniumBalance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMiniumBalance(double miniumBalance) {
        this.miniumBalance = miniumBalance;
    }

     public double withdraw(double amount){
        if(balance - amount>miniumBalance){
            balance-=amount;
            return amount;
        }else{
            throw new RuntimeException();
        }
     }

     public double deposit(double amount){
        return balance += amount;
     }

    public void setActivate(boolean activate) {
        isActivate = activate;
    }

    public boolean isActivate() {
        return isActivate;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    @Override
    public String toString() {
        return "BakAccount{" +
                "balance=" + balance +
                ", miniumBalance=" + miniumBalance +
                '}';
    }
}
