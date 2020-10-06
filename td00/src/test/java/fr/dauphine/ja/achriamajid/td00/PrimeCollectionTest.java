package fr.dauphine.ja.achriamajid.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        test0IsPrime();
        testTwoIsPrime();
        test9IsPrime();
    }
    
    public void test0IsPrime() {
    	assertFalse(PrimeCollection.isPrimetest(0));
    }
    public void testTwoIsPrime() {
    	assertTrue(PrimeCollection.isPrimetest(2));
    }
    public void test9IsPrime() {
    	assertFalse(PrimeCollection.isPrimetest(9));
    }
}
