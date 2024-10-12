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
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        java.lang.Class<?> wildcardClass5 = apiBankCommunicationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        boolean boolean20 = apiBankCommunicationService0.createAccount(0, (int) (short) 10, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        java.util.Optional<java.lang.Double> doubleOptional11 = apiBankCommunicationService0.debit((int) 'a', (-1.0d));
        java.lang.Class<?> wildcardClass12 = apiBankCommunicationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance((int) 'a');
        boolean boolean12 = apiBankCommunicationService0.transfer((int) (short) -1, (int) (short) 100, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        java.util.Optional<java.lang.Double> doubleOptional11 = apiBankCommunicationService0.debit((int) 'a', (-1.0d));
        double double13 = apiBankCommunicationService0.checkBalance((int) (byte) 0);
        double double15 = apiBankCommunicationService0.checkBalance((int) 'a');
        imd.ufrn.model.api.AccountResponse accountResponse17 = apiBankCommunicationService0.getAccountByNumber((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(accountResponse17);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        apiBankCommunicationService0.payFees((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        java.util.Optional<java.lang.Double> doubleOptional11 = apiBankCommunicationService0.debit((int) 'a', (-1.0d));
        double double13 = apiBankCommunicationService0.checkBalance((int) (byte) 0);
        double double16 = apiBankCommunicationService0.credit((-1), (double) 10.0f);
        apiBankCommunicationService0.payFees((double) 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        double double18 = apiBankCommunicationService0.checkBalance((int) (short) 10);
        boolean boolean22 = apiBankCommunicationService0.createAccount((int) (short) 0, (int) (byte) 100, (double) 10.0f);
        double double25 = apiBankCommunicationService0.credit((int) 'a', (double) (byte) -1);
        double double28 = apiBankCommunicationService0.credit(100, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        double double10 = apiBankCommunicationService0.checkBalance((int) ' ');
        apiBankCommunicationService0.payFees((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        double double18 = apiBankCommunicationService0.checkBalance((int) (short) 10);
        imd.ufrn.model.api.AccountResponse accountResponse20 = apiBankCommunicationService0.getAccountByNumber((int) (byte) 1);
        imd.ufrn.model.api.AccountResponse accountResponse22 = apiBankCommunicationService0.getAccountByNumber((int) (short) -1);
        double double24 = apiBankCommunicationService0.checkBalance((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(accountResponse20);
        org.junit.Assert.assertNull(accountResponse22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance((int) 'a');
        java.util.Optional<java.lang.Double> doubleOptional11 = apiBankCommunicationService0.debit(100, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional11);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        imd.ufrn.model.api.AccountResponse accountResponse16 = apiBankCommunicationService0.getAccountByNumber(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(accountResponse16);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        double double18 = apiBankCommunicationService0.checkBalance((int) (short) 10);
        boolean boolean22 = apiBankCommunicationService0.createAccount((int) (short) 0, (int) (byte) 100, (double) 10.0f);
        apiBankCommunicationService0.payFees(0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        apiBankCommunicationService0.payFees((double) (byte) 0);
        java.lang.Class<?> wildcardClass11 = apiBankCommunicationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance((int) 'a');
        apiBankCommunicationService0.payFees((double) 0.0f);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (byte) 0, (-1), (double) 0);
        double double17 = apiBankCommunicationService0.credit(0, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        java.util.Optional<java.lang.Double> doubleOptional11 = apiBankCommunicationService0.debit((int) 'a', (-1.0d));
        double double13 = apiBankCommunicationService0.checkBalance((int) (byte) 0);
        double double16 = apiBankCommunicationService0.credit((-1), (double) 10.0f);
        java.lang.Class<?> wildcardClass17 = apiBankCommunicationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        boolean boolean12 = apiBankCommunicationService0.createAccount((int) (byte) 100, 1, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        java.util.Optional<java.lang.Double> doubleOptional11 = apiBankCommunicationService0.debit((int) 'a', (-1.0d));
        boolean boolean15 = apiBankCommunicationService0.transfer(0, (int) (short) 1, (double) 100);
        imd.ufrn.model.api.AccountResponse accountResponse17 = apiBankCommunicationService0.getAccountByNumber((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(accountResponse17);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        boolean boolean12 = apiBankCommunicationService0.transfer((int) '#', (int) (byte) 10, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        java.util.Optional<java.lang.Double> doubleOptional11 = apiBankCommunicationService0.debit((int) 'a', (-1.0d));
        boolean boolean15 = apiBankCommunicationService0.transfer(0, (int) (short) 1, (double) 100);
        double double17 = apiBankCommunicationService0.checkBalance((int) '#');
        imd.ufrn.model.api.AccountResponse accountResponse19 = apiBankCommunicationService0.getAccountByNumber((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(accountResponse19);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        boolean boolean18 = apiBankCommunicationService0.createAccount((int) (short) 1, 1, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        apiBankCommunicationService0.payFees((-1.0d));
        boolean boolean14 = apiBankCommunicationService0.transfer(1, (int) 'a', (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        boolean boolean12 = apiBankCommunicationService0.transfer((int) (short) 1, 0, (double) 'a');
        imd.ufrn.model.api.AccountResponse accountResponse14 = apiBankCommunicationService0.getAccountByNumber((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(accountResponse14);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance((int) 'a');
        apiBankCommunicationService0.payFees((double) 0.0f);
        boolean boolean14 = apiBankCommunicationService0.createAccount((int) '#', (int) (byte) 0, (double) (-1.0f));
        imd.ufrn.model.api.AccountResponse accountResponse16 = apiBankCommunicationService0.getAccountByNumber((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(accountResponse16);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance((int) 'a');
        apiBankCommunicationService0.payFees((double) 0.0f);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (byte) 0, (-1), (double) 0);
        apiBankCommunicationService0.payFees((double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        double double18 = apiBankCommunicationService0.checkBalance((int) (short) 10);
        apiBankCommunicationService0.payFees((double) 100);
        double double23 = apiBankCommunicationService0.credit((int) (byte) 100, 1.0d);
        double double25 = apiBankCommunicationService0.checkBalance((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        apiBankCommunicationService0.payFees((-1.0d));
        boolean boolean14 = apiBankCommunicationService0.createAccount(0, (int) (byte) 0, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        apiBankCommunicationService0.payFees((double) (byte) 0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (byte) 0, (-1), (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance((int) (byte) -1);
        boolean boolean14 = apiBankCommunicationService0.transfer(10, 0, (double) 100);
        java.util.Optional<java.lang.Double> doubleOptional17 = apiBankCommunicationService0.debit((int) (byte) -1, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleOptional17);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        boolean boolean12 = apiBankCommunicationService0.transfer((int) (short) 1, 0, (double) 'a');
        double double15 = apiBankCommunicationService0.credit((int) (byte) 0, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        double double18 = apiBankCommunicationService0.checkBalance((int) (short) 10);
        boolean boolean22 = apiBankCommunicationService0.createAccount((int) (short) 0, (int) (byte) 100, (double) 10.0f);
        double double25 = apiBankCommunicationService0.credit((int) 'a', (double) (byte) -1);
        java.util.Optional<java.lang.Double> doubleOptional28 = apiBankCommunicationService0.debit((int) (byte) 100, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional28);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance((int) 'a');
        apiBankCommunicationService0.payFees((double) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        apiBankCommunicationService0.payFees((double) (byte) 0);
        apiBankCommunicationService0.payFees((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        double double18 = apiBankCommunicationService0.checkBalance((int) (short) 10);
        imd.ufrn.model.api.AccountResponse accountResponse20 = apiBankCommunicationService0.getAccountByNumber((int) (byte) 1);
        boolean boolean24 = apiBankCommunicationService0.transfer((int) (byte) 10, (int) (short) 1, (double) (-1.0f));
        double double26 = apiBankCommunicationService0.checkBalance((int) '#');
        double double29 = apiBankCommunicationService0.credit((int) (byte) 0, 0.0d);
        boolean boolean33 = apiBankCommunicationService0.createAccount(0, (int) ' ', (double) (byte) 0);
        double double35 = apiBankCommunicationService0.checkBalance((int) (byte) 100);
        boolean boolean39 = apiBankCommunicationService0.transfer((int) (short) 1, 100, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(accountResponse20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        double double18 = apiBankCommunicationService0.checkBalance((int) (short) 10);
        imd.ufrn.model.api.AccountResponse accountResponse20 = apiBankCommunicationService0.getAccountByNumber((int) (byte) 1);
        boolean boolean24 = apiBankCommunicationService0.transfer((int) (byte) 10, (int) (short) 1, (double) (-1.0f));
        double double26 = apiBankCommunicationService0.checkBalance((int) '#');
        double double29 = apiBankCommunicationService0.credit((int) (byte) 0, 0.0d);
        boolean boolean33 = apiBankCommunicationService0.createAccount(0, (int) ' ', (double) (byte) 0);
        double double35 = apiBankCommunicationService0.checkBalance((int) (byte) 100);
        double double38 = apiBankCommunicationService0.credit((int) (byte) 10, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(accountResponse20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        double double18 = apiBankCommunicationService0.checkBalance((int) (short) 10);
        apiBankCommunicationService0.payFees((double) 100);
        double double22 = apiBankCommunicationService0.checkBalance(10);
        apiBankCommunicationService0.payFees((double) (byte) 1);
        imd.ufrn.model.api.AccountResponse accountResponse26 = apiBankCommunicationService0.getAccountByNumber(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNull(accountResponse26);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        java.util.Optional<java.lang.Double> doubleOptional11 = apiBankCommunicationService0.debit((int) 'a', (-1.0d));
        double double13 = apiBankCommunicationService0.checkBalance((int) (byte) 0);
        java.util.Optional<java.lang.Double> doubleOptional16 = apiBankCommunicationService0.debit((int) (byte) 1, (double) (short) 0);
        boolean boolean20 = apiBankCommunicationService0.transfer((int) (byte) 1, 1, (double) ' ');
        imd.ufrn.model.api.AccountResponse accountResponse22 = apiBankCommunicationService0.getAccountByNumber(100);
        apiBankCommunicationService0.payFees((double) 10);
        java.lang.Class<?> wildcardClass25 = apiBankCommunicationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(accountResponse22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        double double18 = apiBankCommunicationService0.checkBalance((int) (short) 10);
        imd.ufrn.model.api.AccountResponse accountResponse20 = apiBankCommunicationService0.getAccountByNumber((int) (byte) 1);
        double double22 = apiBankCommunicationService0.checkBalance(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(accountResponse20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance((int) 'a');
        apiBankCommunicationService0.payFees((double) 0.0f);
        double double12 = apiBankCommunicationService0.checkBalance((int) (byte) 10);
        double double14 = apiBankCommunicationService0.checkBalance((int) (byte) 10);
        double double16 = apiBankCommunicationService0.checkBalance((int) (byte) 10);
        java.util.Optional<java.lang.Double> doubleOptional19 = apiBankCommunicationService0.debit((int) (byte) -1, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional19);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        double double10 = apiBankCommunicationService0.checkBalance((int) ' ');
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (byte) -1, (int) (short) 10, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        boolean boolean12 = apiBankCommunicationService0.transfer((int) (short) 1, 0, (double) 'a');
        boolean boolean16 = apiBankCommunicationService0.transfer((int) (byte) -1, (int) ' ', (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        double double18 = apiBankCommunicationService0.checkBalance((int) (short) 10);
        imd.ufrn.model.api.AccountResponse accountResponse20 = apiBankCommunicationService0.getAccountByNumber((int) (byte) 1);
        boolean boolean24 = apiBankCommunicationService0.transfer((int) (byte) 10, (int) (short) 1, (double) (-1.0f));
        double double26 = apiBankCommunicationService0.checkBalance((int) '#');
        double double29 = apiBankCommunicationService0.credit((int) (byte) 0, 0.0d);
        boolean boolean33 = apiBankCommunicationService0.createAccount(0, (int) ' ', (double) (byte) 0);
        double double35 = apiBankCommunicationService0.checkBalance((int) (byte) 100);
        boolean boolean39 = apiBankCommunicationService0.createAccount((int) (byte) 0, (int) '4', (double) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(accountResponse20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance((int) 'a');
        imd.ufrn.model.api.AccountResponse accountResponse10 = apiBankCommunicationService0.getAccountByNumber(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(accountResponse10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        apiBankCommunicationService0.payFees((-1.0d));
        boolean boolean14 = apiBankCommunicationService0.createAccount((int) (byte) -1, (int) 'a', 10.0d);
        double double17 = apiBankCommunicationService0.credit((int) (short) 10, (double) (short) 10);
        apiBankCommunicationService0.payFees(100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        double double2 = apiBankCommunicationService0.checkBalance((int) (short) 0);
        imd.ufrn.model.api.AccountResponse accountResponse4 = apiBankCommunicationService0.getAccountByNumber((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(accountResponse4);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        boolean boolean8 = apiBankCommunicationService0.createAccount((int) (byte) 10, (int) (short) 0, 0.0d);
        double double10 = apiBankCommunicationService0.checkBalance(0);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (short) 10, 10, (double) (byte) 100);
        double double16 = apiBankCommunicationService0.checkBalance((int) '4');
        double double18 = apiBankCommunicationService0.checkBalance((int) (short) 10);
        boolean boolean22 = apiBankCommunicationService0.createAccount((int) (short) 0, (int) (byte) 100, (double) 10.0f);
        boolean boolean26 = apiBankCommunicationService0.createAccount((int) ' ', (int) 'a', (double) (byte) 1);
        boolean boolean30 = apiBankCommunicationService0.createAccount(1, (int) ' ', (double) (byte) 0);
        java.util.Optional<java.lang.Double> doubleOptional33 = apiBankCommunicationService0.debit(1, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleOptional33);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance(1);
        java.util.Optional<java.lang.Double> doubleOptional11 = apiBankCommunicationService0.debit((int) 'a', (-1.0d));
        boolean boolean15 = apiBankCommunicationService0.transfer(0, (int) (short) 1, (double) 100);
        imd.ufrn.model.api.AccountResponse accountResponse17 = apiBankCommunicationService0.getAccountByNumber((int) ' ');
        imd.ufrn.model.api.AccountResponse accountResponse19 = apiBankCommunicationService0.getAccountByNumber((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(accountResponse17);
        org.junit.Assert.assertNull(accountResponse19);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance((int) 'a');
        apiBankCommunicationService0.payFees((double) 0.0f);
        boolean boolean14 = apiBankCommunicationService0.transfer((int) (byte) 0, (-1), (double) 0);
        boolean boolean18 = apiBankCommunicationService0.createAccount((-1), (int) '4', 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        imd.ufrn.service.ApiBankCommunicationService apiBankCommunicationService0 = new imd.ufrn.service.ApiBankCommunicationService();
        boolean boolean4 = apiBankCommunicationService0.createAccount((int) (short) -1, (int) (byte) 1, (double) 0);
        imd.ufrn.model.api.AccountResponse accountResponse6 = apiBankCommunicationService0.getAccountByNumber(0);
        double double8 = apiBankCommunicationService0.checkBalance((int) 'a');
        apiBankCommunicationService0.payFees((double) 0.0f);
        double double12 = apiBankCommunicationService0.checkBalance((int) (byte) 10);
        double double14 = apiBankCommunicationService0.checkBalance((int) (byte) 10);
        java.util.Optional<java.lang.Double> doubleOptional17 = apiBankCommunicationService0.debit((int) (byte) -1, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(accountResponse6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleOptional17);
    }
}

