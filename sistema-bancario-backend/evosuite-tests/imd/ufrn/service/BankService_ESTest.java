/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 12 20:05:08 GMT 2024
 */

package imd.ufrn.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import imd.ufrn.model.Account;
import imd.ufrn.model.BonusAccount;
import imd.ufrn.model.SavingsAccount;
import imd.ufrn.repository.BankRepository;
import imd.ufrn.service.BankService;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BankService_ESTest extends BankService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      bankService0.createAccount(2, 2, 0.0);
      bankService0.payFees((-2554.37625624536));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BonusAccount bonusAccount0 = new BonusAccount(0, 115.449182246, 0);
      bankRepository0.saveAccount(bonusAccount0);
      bonusAccount0.setPunctuation(2786);
      BankService bankService0 = new BankService(bankRepository0);
      bonusAccount0.setBalance(2786);
      boolean boolean0 = bankService0.realizeTransfer(0, 0, 2786);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      Account account0 = new Account(0, 115.449182246);
      bankRepository0.saveAccount(account0);
      BankService bankService0 = new BankService(bankRepository0);
      Double double0 = new Double(0);
      account0.setAccountNumber((-2357));
      bankService0.realizeDebit(0, (double) double0);
      boolean boolean0 = bankService0.realizeTransfer((-2357), 0, 115.449182246);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      // Undeclared exception!
      try { 
        bankService0.realizeTransfer((-2357), 0, 115.449182246);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.service.BankService", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.realizeTransfer(0, 0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount(4910, 4265.25, 1);
      bankRepository0.saveAccount(bonusAccount0);
      double double0 = bankService0.realizeCredit(4910, 4910, false);
      assertEquals((-644.75), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.createAccount(3533, 2, (-1706.0006212794488));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.createAccount(0, 0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BonusAccount bonusAccount0 = new BonusAccount(0, 0, 0);
      bankRepository0.saveAccount(bonusAccount0);
      BankService bankService0 = new BankService(bankRepository0);
      double double0 = bankService0.realizeCredit(0, 0, false);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      Account account0 = new Account(0, 115.449182246);
      bankRepository0.saveAccount(account0);
      BankService bankService0 = new BankService(bankRepository0);
      bankService0.realizeDebit(0, 115.449182246);
      Account account1 = bankService0.getAccountByNumber(0);
      assertEquals(0.0, account1.getBalance(), 0.01);
      assertNotNull(account1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      Account account0 = new Account(0, 115.449182246);
      bankRepository0.saveAccount(account0);
      BankService bankService0 = new BankService(bankRepository0);
      double double0 = bankService0.realizeCredit(0, 2197.9, false);
      assertEquals((-2082.450817754), double0, 0.01);
      
      Account account1 = bankService0.getAccountByNumber(0);
      assertNotNull(account1);
      assertEquals((-2082.450817754), account1.getBalance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      Account account0 = new Account(0, 115.449182246);
      bankRepository0.saveAccount(account0);
      BankService bankService0 = new BankService(bankRepository0);
      Account account1 = bankService0.getAccountByNumber(0);
      assertSame(account1, account0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      Account account0 = new Account(0, 115.449182246);
      bankRepository0.saveAccount(account0);
      BankService bankService0 = new BankService(bankRepository0);
      account0.setAccountNumber(2750);
      Account account1 = bankService0.getAccountByNumber(0);
      assertEquals(115.449182246, account1.getBalance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      Account account0 = new Account(0, 115.449182246);
      bankRepository0.saveAccount(account0);
      BankService bankService0 = new BankService(bankRepository0);
      account0.setAccountNumber((-2357));
      Account account1 = bankService0.getAccountByNumber(0);
      assertSame(account1, account0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      SavingsAccount savingsAccount0 = new SavingsAccount(0, 0.0);
      bankRepository0.saveAccount(savingsAccount0);
      double double0 = bankService0.checkBalance(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount((-3963), 2769.0, (-3963));
      bankRepository0.saveAccount(bonusAccount0);
      double double0 = bankService0.checkBalance((-3963));
      assertEquals(2769.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      // Undeclared exception!
      try { 
        bankService0.realizeDebit(2312, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.service.BankService", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BankService bankService0 = new BankService((BankRepository) null);
      // Undeclared exception!
      try { 
        bankService0.payFees(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.service.BankService", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BankService bankService0 = new BankService((BankRepository) null);
      // Undeclared exception!
      try { 
        bankService0.getAccountByNumber(4141);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.service.BankService", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BankService bankService0 = new BankService((BankRepository) null);
      // Undeclared exception!
      try { 
        bankService0.createAccount(2, 2, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.service.BankService", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      Account account0 = new Account(0, 115.449182246);
      bankRepository0.saveAccount(account0);
      BankService bankService0 = new BankService(bankRepository0);
      double double0 = bankService0.realizeCredit(0, 0, false);
      assertEquals(115.449182246, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.createAccount(0, 3, 3);
      assertTrue(boolean0);
      
      double double0 = bankService0.realizeCredit(0, 4910.0, true);
      assertEquals((-4907.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      Account account0 = new Account(0, 115.449182246);
      bankRepository0.saveAccount(account0);
      BankService bankService0 = new BankService(bankRepository0);
      bankService0.payFees(4006.0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BonusAccount bonusAccount0 = new BonusAccount(0, 0, 0);
      bankRepository0.saveAccount(bonusAccount0);
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.realizeTransfer(0, 0, 2786);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.realizeTransfer(0, (-949), (-2000.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      // Undeclared exception!
      try { 
        bankService0.realizeCredit((-227), (-227), false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.service.BankService", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      SavingsAccount savingsAccount0 = new SavingsAccount(686, 686);
      bankRepository0.saveAccount(savingsAccount0);
      boolean boolean0 = bankService0.realizeTransfer(686, 686, 686);
      assertTrue(boolean0);
      
      double double0 = bankService0.checkBalance(686);
      assertEquals((-686.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BonusAccount bonusAccount0 = new BonusAccount(0, 0, 0);
      bankRepository0.saveAccount(bonusAccount0);
      BankService bankService0 = new BankService(bankRepository0);
      Optional<Double> optional0 = bankService0.realizeDebit(0, 0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      SavingsAccount savingsAccount0 = new SavingsAccount((-2256), (-2256));
      bankRepository0.saveAccount(savingsAccount0);
      BankService bankService0 = new BankService(bankRepository0);
      Optional<Double> optional0 = bankService0.realizeDebit((-2256), 0.0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      Account account0 = new Account(69, 69);
      bankRepository0.saveAccount(account0);
      Optional<Double> optional0 = bankService0.realizeDebit(69, (-1.0));
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      bankService0.createAccount(2, 2, (-2554.37625624536));
      bankService0.payFees((-2554.37625624536));
      Optional<Double> optional0 = bankService0.realizeDebit(2, 69);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.createAccount(795, 1, 795);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.createAccount(686, 686, 686);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      Account account0 = bankService0.getAccountByNumber(0);
      assertNull(account0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      // Undeclared exception!
      try { 
        bankService0.checkBalance(686);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.service.BankService", e);
      }
  }
}
