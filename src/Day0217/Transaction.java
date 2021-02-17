package Day0217;

public class Transaction {
    String transactionDate; //거래일
    String transactionTime; //거래시간
    String kind; //구분 (입금 또는 출금)
    long amount; //거래금액
    long balance; //잔고
    
    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    /*
    public Transaction(String transactionDate, String transactionTime, String kind, long amount, long balance) {
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }
    */
    @Override
    public String toString() {
        return "[거래금액:"+amount+",원 잔액:"+balance+"원 거래시간: "+transactionDate+transactionTime+"]";
    }

}
