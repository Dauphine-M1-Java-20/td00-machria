package fr.dauphine.ja.achriamajid.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	ArrayList<Integer> numbers=null;
	public ArrayList<Integer> getToto() {
		return numbers;
	}
	public void setToto(ArrayList<Integer> toto) {
		this.numbers = toto;
	}
    public PrimeCollection() {
    	this.numbers = new ArrayList<>();
    }
    public void initRandom(int n, int m) {
    	for (int i=0;i<n;i++) {
    		this.numbers.add((int)(Math.random() * m));
    	}
    }
    private boolean isPrime(int p) {
    	if(p<=0)
    		return false;
    	for(int i=2; i<=p/2; i++)
        {
           if(p%i==0) return false;
        }
        return true;
    }
    public static boolean isPrimetest(int p) {
    	for(int i=2; i<=p/2; i++)
        {
           if(p%i==0) return false;
        }
        return true;
    }
    public void printPrimes(){
    	for (Integer e:this.numbers) {
    		if(isPrime(e))
    			System.out.println(e);
    	}
    }
    public static void main(String[] args) {
		PrimeCollection a = new PrimeCollection();
		a.initRandom(100, 2000);
		a.printPrimes();
	}
}
