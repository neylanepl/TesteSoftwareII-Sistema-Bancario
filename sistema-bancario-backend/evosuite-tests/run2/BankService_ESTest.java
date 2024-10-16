/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 12 19:48:22 GMT 2024
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
import java.util.ConcurrentModificationException;
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
      boolean boolean0 = bankService0.realizeTransfer(4664, 1, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount(0, 0, (-1));
      bankRepository0.saveAccount(bonusAccount0);
      double double0 = bankService0.realizeCredit(0, 1591.1601788, false);
      assertEquals((-1591.1601788), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.createAccount(1, 1461, 1461);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.createAccount(0, 1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      Account account0 = new Account(1, 1);
      bankRepository0.saveAccount(account0);
      double double0 = bankService0.realizeCredit(1, 0.0, false);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount(2146879743, 2146879743, 2146879743);
      bankRepository0.saveAccount(bonusAccount0);
      boolean boolean0 = bankService0.realizeTransfer(2146879743, 2146879743, 2146879743);
      assertTrue(boolean0);
      
      BonusAccount bonusAccount1 = (BonusAccount)bankService0.getAccountByNumber(2146879743);
      assertNotNull(bonusAccount1);
      assertEquals((-2133775022), bonusAccount1.getPunctuation());
      assertEquals((-2.146879743E9), bonusAccount1.getBalance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount(0, 0, 0);
      bankRepository0.saveAccount(bonusAccount0);
      Account account0 = bankService0.getAccountByNumber(0);
      assertEquals(0.0, account0.getBalance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      Account account0 = new Account(3792, 683.285);
      bankRepository0.saveAccount(account0);
      Account account1 = bankService0.getAccountByNumber(3792);
      assertEquals(3792, account1.getAccountNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount((-2529), 100.0, 632);
      bankRepository0.saveAccount(bonusAccount0);
      Account account0 = bankService0.getAccountByNumber((-2529));
      assertSame(account0, bonusAccount0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount(0, 0, (-1));
      bankRepository0.saveAccount(bonusAccount0);
      double double0 = bankService0.checkBalance(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount(0, 1.0, (-2321));
      bankRepository0.saveAccount(bonusAccount0);
      double double0 = bankService0.checkBalance(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      SavingsAccount savingsAccount0 = new SavingsAccount(667, 667);
      bankRepository0.saveAccount(savingsAccount0);
      bankService0.payFees((-1475.590152));
      double double0 = bankService0.checkBalance(667);
      assertEquals((-9175.18631384), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      // Undeclared exception!
      try { 
        bankService0.realizeTransfer(2, 1627, 1.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.service.BankService", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      // Undeclared exception!
      try { 
        bankService0.realizeDebit(18, 18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.service.BankService", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      Account account0 = new Account((-608), 632.0);
      bankRepository0.saveAccount(account0);
      SavingsAccount savingsAccount0 = new SavingsAccount(2144091098, 7.0);
      bankRepository0.saveAccount(savingsAccount0);
      savingsAccount0.setAccountNumber(2);
      // Undeclared exception!
      try { 
        bankService0.payFees((-1999.790106073));
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap$HashIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      BankService bankService0 = new BankService((BankRepository) null);
      // Undeclared exception!
      try { 
        bankService0.getAccountByNumber(31);
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
        bankService0.createAccount((-1863), 2, (-3113.4));
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
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount(0, 0.0, 0);
      bankRepository0.saveAccount(bonusAccount0);
      double double0 = bankService0.realizeCredit(0, 0, true);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      SavingsAccount savingsAccount0 = new SavingsAccount(667, 667);
      bankRepository0.saveAccount(savingsAccount0);
      Optional<Double> optional0 = bankService0.realizeDebit(667, 652);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      Account account0 = new Account(1, 1);
      bankRepository0.saveAccount(account0);
      bankService0.payFees((-2000.0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      Account account0 = new Account(10, 10);
      bankRepository0.saveAccount(account0);
      bankService0.realizeDebit(10, 10);
      boolean boolean0 = bankService0.realizeTransfer(10, 10, 10);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.realizeTransfer((-1), 11, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount(0, 0, (-1));
      bankRepository0.saveAccount(bonusAccount0);
      boolean boolean0 = bankService0.createAccount(2, 2, 1.0);
      boolean boolean1 = bankService0.realizeTransfer(2, 0, 1.0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      // Undeclared exception!
      try { 
        bankService0.realizeCredit(0, (-1794.2196720123875), false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.service.BankService", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      Account account0 = new Account(1, 1);
      bankRepository0.saveAccount(account0);
      bankService0.realizeCredit(1, 1527.188625449413, false);
      Optional<Double> optional0 = bankService0.realizeDebit(1, 1);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount(0, 0, 0);
      bankRepository0.saveAccount(bonusAccount0);
      Optional<Double> optional0 = bankService0.realizeDebit(0, 0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      BonusAccount bonusAccount0 = new BonusAccount(0, 0, (-1));
      bankRepository0.saveAccount(bonusAccount0);
      Optional<Double> optional0 = bankService0.realizeDebit(0, (-603.788));
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.createAccount(3549, 3, 3549);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.createAccount(2, 2, 2);
      assertTrue(boolean0);
      
      boolean boolean1 = bankService0.realizeTransfer(2, 2, 2);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      boolean boolean0 = bankService0.createAccount(0, (-2329), 4927.070731837);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      Account account0 = bankService0.getAccountByNumber((-2329));
      assertNull(account0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BankRepository bankRepository0 = new BankRepository();
      BankService bankService0 = new BankService(bankRepository0);
      // Undeclared exception!
      try { 
        bankService0.checkBalance(667);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("imd.ufrn.service.BankService", e);
      }
  }
}
