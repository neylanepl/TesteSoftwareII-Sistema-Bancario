package imd.ufrn;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = bankService1.realizeTransfer((int) (short) -1, (int) 'a', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bankService1.realizeCredit((int) 'a', (double) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional8 = bankService1.realizeDebit((int) (short) -1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        java.lang.Class<?> wildcardClass2 = bankService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional12 = bankService1.realizeDebit((int) (byte) 1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.realizeTransfer((int) '#', (int) (byte) 0, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = bankService1.realizeTransfer((int) 'a', 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.realizeTransfer((int) '#', (int) (byte) 0, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bankService1.realizeCredit((int) (byte) 0, (double) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bankService1.realizeCredit((int) (short) -1, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount((int) (short) 0, (int) '4', (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bankService1.realizeCredit((int) (short) -1, (double) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        java.lang.Class<?> wildcardClass10 = bankService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount((int) (short) 0, (int) '4', (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = bankService1.realizeTransfer((int) (byte) 1, (int) (byte) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bankService1.realizeCredit((int) (byte) 10, (double) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        java.lang.Class<?> wildcardClass6 = bankService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional8 = bankService1.realizeDebit((int) 'a', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bankService1.realizeCredit((int) 'a', (double) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.realizeTransfer((int) '#', (int) (byte) 0, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bankService1.checkBalance(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = bankService1.realizeTransfer((int) (byte) 1, (int) (short) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount((int) (short) 0, (int) '4', (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            imd.ufrn.model.Account account7 = bankService1.getAccountByNumber((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bankService1.realizeCredit(10, (double) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.realizeTransfer((int) '#', (int) (byte) 0, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            imd.ufrn.model.Account account15 = bankService1.getAccountByNumber((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = bankService1.createAccount(0, (int) (short) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bankService1.realizeCredit(1, 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount((int) (short) 0, (int) '4', (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            imd.ufrn.model.Account account7 = bankService1.getAccountByNumber((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional8 = bankService1.realizeDebit((int) (short) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (byte) -1, (-1), (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional20 = bankService1.realizeDebit((int) (short) 0, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bankService1.realizeCredit((int) (byte) 1, (double) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            imd.ufrn.model.Account account15 = bankService1.getAccountByNumber((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional12 = bankService1.realizeDebit((int) (byte) -1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.realizeTransfer((int) '#', (int) (byte) 0, (double) (-1.0f));
        boolean boolean17 = bankService1.realizeTransfer(100, (int) '#', (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bankService1.realizeCredit(100, (double) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bankService1.checkBalance((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        // The following exception was thrown during execution in test generation
        try {
            imd.ufrn.model.Account account3 = bankService1.getAccountByNumber(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.realizeTransfer((int) '#', (int) (byte) 0, (double) (-1.0f));
        boolean boolean17 = bankService1.realizeTransfer(100, (int) '#', (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.createAccount(100, (int) (byte) -1, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            imd.ufrn.model.Account account11 = bankService1.getAccountByNumber((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.realizeTransfer((int) '#', (int) (byte) 0, (double) (-1.0f));
        java.lang.Class<?> wildcardClass14 = bankService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        boolean boolean21 = bankService1.realizeTransfer(1, (int) ' ', (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional24 = bankService1.realizeDebit((int) ' ', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) ' ', 0, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bankService1.checkBalance(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount((int) (short) 0, (int) '4', (double) 0L);
        java.lang.Class<?> wildcardClass6 = bankService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = bankService1.realizeTransfer(100, (int) (byte) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        boolean boolean21 = bankService1.createAccount((int) ' ', (int) '4', (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional24 = bankService1.realizeDebit((int) (short) -1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        boolean boolean21 = bankService1.realizeTransfer(1, (int) ' ', (double) (byte) 0);
        java.lang.Class<?> wildcardClass22 = bankService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bankService1.realizeCredit((int) (byte) 1, (double) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = bankService1.createAccount((int) (short) 0, 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bankService1.realizeCredit(1, 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        boolean boolean21 = bankService1.realizeTransfer(1, (int) ' ', (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = bankService1.checkBalance(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (byte) -1, (-1), (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = bankService1.realizeTransfer((int) (short) 0, (int) (short) 100, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        // The following exception was thrown during execution in test generation
        try {
            imd.ufrn.model.Account account3 = bankService1.getAccountByNumber((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional20 = bankService1.realizeDebit((int) '#', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        boolean boolean21 = bankService1.createAccount((int) ' ', (int) '4', (double) 1L);
        java.lang.Class<?> wildcardClass22 = bankService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        boolean boolean21 = bankService1.realizeTransfer(1, (int) ' ', (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bankService1.realizeCredit(1, (double) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = bankService1.checkBalance((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional4 = bankService1.realizeDebit((int) 'a', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.realizeTransfer((int) '#', (int) (byte) 0, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = bankService1.realizeTransfer((int) (short) 10, (int) (byte) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        boolean boolean21 = bankService1.createAccount(100, (int) (byte) -1, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = bankService1.realizeTransfer((int) ' ', (int) (byte) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        boolean boolean21 = bankService1.createAccount((int) (short) -1, (int) '4', (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = bankService1.realizeTransfer((int) '4', (int) (byte) 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional20 = bankService1.realizeDebit((int) (byte) -1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (byte) -1, (-1), (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount((int) (short) 0, (int) '4', (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        boolean boolean21 = bankService1.realizeTransfer(1, (int) ' ', (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = bankService1.checkBalance((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bankService1.checkBalance((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount((int) (byte) 0, (int) '4', (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = bankService1.createAccount((int) '4', 1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) ' ', 0, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bankService1.realizeCredit((int) ' ', (double) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount((int) (byte) 0, (int) '4', (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bankService1.checkBalance((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.createAccount(100, (int) (byte) -1, (double) 1L);
        boolean boolean13 = bankService1.createAccount(100, (int) '#', (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            imd.ufrn.model.Account account15 = bankService1.getAccountByNumber((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional12 = bankService1.realizeDebit((int) '4', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.createAccount((int) 'a', (int) (byte) -1, (double) 0L);
        boolean boolean13 = bankService1.createAccount(1, (int) (short) 10, (double) (-1.0f));
        boolean boolean17 = bankService1.realizeTransfer((int) (byte) -1, (int) (short) 1, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (byte) -1, (-1), (double) 0);
        boolean boolean21 = bankService1.createAccount((int) (short) -1, (int) (short) 0, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = bankService1.realizeTransfer((int) (byte) 0, (int) ' ', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount((int) (byte) 0, (int) '4', (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional8 = bankService1.realizeDebit((int) ' ', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) ' ', 0, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            bankService1.payFees((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.realizeTransfer((int) (byte) -1, (int) (byte) 1, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        boolean boolean21 = bankService1.createAccount(100, (int) (byte) -1, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional24 = bankService1.realizeDebit((int) (byte) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.createAccount((int) (short) 10, (int) (short) 10, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Double> doubleOptional20 = bankService1.realizeDebit((int) (short) 0, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        imd.ufrn.repository.BankRepository bankRepository0 = null;
        imd.ufrn.service.BankService bankService1 = new imd.ufrn.service.BankService(bankRepository0);
        boolean boolean5 = bankService1.createAccount(0, 100, (double) 0);
        boolean boolean9 = bankService1.realizeTransfer((int) '#', 100, 0.0d);
        boolean boolean13 = bankService1.createAccount((int) (byte) -1, 100, (double) ' ');
        boolean boolean17 = bankService1.realizeTransfer((int) (short) -1, (int) '4', 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}

