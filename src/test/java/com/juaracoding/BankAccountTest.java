package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccount(271110, "Restu", 40000);
        Assert.assertEquals(bankAccount.deposit(30000), 70000);
    }

}