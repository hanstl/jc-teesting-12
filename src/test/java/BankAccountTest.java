import org.example.BankAccount;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankAccountTest {
    int no = 5;
    String n = "Yanuar";
    double dep1 = 1000000;
    double dana1 = 500000;
    double hasil = dep1 + dana1;


    BankAccount bankAccount;
    @BeforeMethod
    public void setUpAndSetAccountAndDisplayTest(){
        bankAccount = new BankAccount();
        bankAccount.setAccount(no,n,dep1);
        Assert.assertTrue(bankAccount.display().contains(String.valueOf(n)));
    }

    @Test
    public void depositTest(){
        double hasilDeposit = bankAccount.deposit(dana1);
        Assert.assertEquals(hasilDeposit,hasil);
    }
    @Test
    public void withdrawTest1(){
        double hasilWithdraw = bankAccount.withdraw(dana1);
        Assert.assertEquals(hasilWithdraw,dana1);
    }
    @Test
    public void checkBalanceTest(){
        bankAccount.checkBalance();
        Assert.assertTrue(bankAccount.display().contains(String.valueOf(dep1)));
    }

}
