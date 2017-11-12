package aleksander_pj_lotto;

public class NumbersCompare {
	
	public static int lottoCompare(int[] x, int[] y) {
		int sum = 0;
		
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<y.length; j++) {
				if(x[i]==y[j]) {
					sum++;
				}
			}
		}
		
		return sum;
	}

}
