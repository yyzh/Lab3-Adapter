/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q3;

/**
 *
 * @author a1
 */
public class InternationalAccount {
    private String accountnumber;

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }
    private Double balance;
    private String currency;
    
    
    public void increase(double amount){
         this.balance = balance + amount;
    }
    
    public void decrease(double amount){
        this.balance = balance - amount;
    }
}
