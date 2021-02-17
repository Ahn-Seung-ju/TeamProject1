package Day0217;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String accountNo; // 계좌번호
    private String name;  // 소유자명
    private long balance ; // 잔고
    private ArrayList<Transaction> transaction; //거래내역(0개이상)

    
    /////////// getter //////////
    public String getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    ////////// 생성자 //////////
    public Account(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = 0;
        transaction = new ArrayList<Transaction>();
    }

    @Override
    public String toString() {
        return "[계좌번호 :"+this.accountNo+", 소유자 명 : "+this.name+", 잔액 : "+this.balance+"원]";
    }


    ////////// method /////////
    
    //입금한다
    public void deposit(long amount) {
        this.balance+=amount;   //amount 값을 잔고에 넣어준다
        System.out.println(amount+"원을 입금하였습니다.");
        System.out.println("현재잔액은 "+this.balance+"원 입니다.");
        setDate("입금", amount);
    }
    
    //출금한다
    public void withdraw(long amount) {
        if(this.balance<amount) { // 잔고가 출금하려는 금액보다 적을때 
            System.out.println("잔액이 부족합니다. 현재잔액: "+this.balance);
            return;
        } else { //amount 값을 잔고에서 빼낸다
            this.balance-=amount;
            System.out.println(amount+"원을 인출하였습니다");
            System.out.println("현재잔액은 "+this.balance+"원 입니다.");
        }
        setDate("출금", amount);
    }
    
    //거래내역에 저장하는 단계
    private void setDate(String kind, long amount) {
        Transaction t = new Transaction();
        
        Date date = new Date();
        SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy년MM월dd일");
        SimpleDateFormat sdfTime = new SimpleDateFormat("HH시mm분");
        
        t.setAmount(amount);
        t.setBalance(balance);
        t.setKind(kind);
        t.setTransactionDate(sdfDay.format(date));
        t.setTransactionTime(sdfTime.format(date));
        transaction.add(t);
        
        //transaction.add(new Transaction(sdfDay.format(date),sdfTime.format(date), kind, amount, this.balance));
    }
        
    //잔고를 확인한다
    public long getBalance() {
        return this.balance;
    }
    
    //거래내역을 본다
    public void Transactions() {
        System.out.println("= 거래내역 =");
        for(Transaction t : transaction) {
            System.out.println(t);
        }
    }

}
