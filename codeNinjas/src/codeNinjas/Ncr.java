package codeNinjas;

public class Ncr {
	public static void main (String[] args) {
	    
		/*Solution Description
	    factn=3628800.
	    factr=720
	    factnr=24
	    ncr=3628800/(720 * 24)
	       =210*/
		
		
		int n=6,r=2;
	    int factn=1,factr=1,factnr=1;
	    for(int i=2;i<=n;i++)
	    {
	        factn*=i;
	        if(i<=r)
	            factr*=i;
	        if(i<=n-r)
	            factnr*=i;
	    }
	    int ncr=factn/(factr*factnr);
	    System.out.print(ncr);
	}

}
