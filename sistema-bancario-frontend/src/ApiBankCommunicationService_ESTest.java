/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 11 20:00:33 GMT 2024
 */

package imd.ufrn.service;

import org.junit.Test;
import static org.junit.Assert.*;
import imd.ufrn.model.api.AccountResponse;
import imd.ufrn.service.ApiBankCommunicationService;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ApiBankCommunicationService_ESTest extends ApiBankCommunicationService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ApiBankCommunicationService apiBankCommunicationService0 = new ApiBankCommunicationService();
      boolean boolean0 = apiBankCommunicationService0.transfer(0, 2258, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ApiBankCommunicationService apiBankCommunicationService0 = new ApiBankCommunicationService();
      apiBankCommunicationService0.payFees(0.0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ApiBankCommunicationService apiBankCommunicationService0 = new ApiBankCommunicationService();
      Optional<Double> optional0 = apiBankCommunicationService0.debit((-506), (-506));
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ApiBankCommunicationService apiBankCommunicationService0 = new ApiBankCommunicationService();
      double double0 = apiBankCommunicationService0.credit(1769, (-991.324));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ApiBankCommunicationService apiBankCommunicationService0 = new ApiBankCommunicationService();
      double double0 = apiBankCommunicationService0.checkBalance(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ApiBankCommunicationService apiBankCommunicationService0 = new ApiBankCommunicationService();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://localhost:8080/banco/contas/-506");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "[cSNzehtsh@[UZ");
      AccountResponse accountResponse0 = apiBankCommunicationService0.getAccountByNumber((-506));
      assertNull(accountResponse0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ApiBankCommunicationService apiBankCommunicationService0 = new ApiBankCommunicationService();
      boolean boolean0 = apiBankCommunicationService0.createAccount(1, (-1328), (-817.76325));
      assertFalse(boolean0);
  }
}
