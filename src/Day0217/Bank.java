package Day0217;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts; // 계좌정보
    private int totalAccount; //총계좌수
    
    
    ////// getter ////////

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    
    ////// 생성자 /////////
    Bank(){
        accounts = new ArrayList<Account>();
    }
    
    
    ////// method ///////
    //계좌를 생성한다
    public void addAccount(String accountNo, String name) {
        accounts.add(new Account(accountNo, name)); //계좌 생성
        totalAccount++; //계좌수 증가
    }
    
    //계좌를 찾는다(계좌번호로)
    public Account getAccount(String accountNo) {
        for(Account act : accounts) {
            if(act.getAccountNo().equals(accountNo)) {
                System.out.println("= 해당 계좌번호의 계좌정보 =");
                System.out.println(act);
                return act;
            }
        }
        System.out.println("계좌번호가 올바르지 않습니다.");
        return null;
    }
    
    //계좌를 찾는다(소유자명으로)
    public void findAccounts(String username) {
        int count=0;
        System.out.println("= 해당 소유자명의 계좌 목록 =");
        for(Account act : accounts) {
            if(act.getName().equals(username)) {
                System.out.println(act);
                count++;
            }
        }
        if(count==0) {
            System.out.println("입력하신 소유자명의 계좌가 존재하지 않습니다.");
        }
    }
    
    //계좌목록을 본다
    public void accountList() {
        System.out.println("= 전체 계좌 목록 =");
        for(Account act : accounts) {
            System.out.println(act);
        }
    }
    
    //총계좌수를 반환한다
    public void TotalAccount() {
        System.out.println("전체 계좌 수 : "+totalAccount);
    }

}
