package aleksander_pj_lotto;

import java.util.Arrays;

public class LottoSim {

	public static void main(String[] args) {
		
		int[] myNumbers = LottoMyNumbers.myNumbers(6);
		int[] lottoNumbers = LottoNumbers.numbersLotto(6);
		int correct = NumbersCompare.lottoCompare(myNumbers, lottoNumbers);
		
		System.out.println();
		System.out.print("Twoje liczby to: ");
		System.out.println(Arrays.toString(myNumbers));
		System.out.println();
		System.out.print("Wylosowane liczby to: ");
		System.out.println(Arrays.toString(lottoNumbers));
		System.out.println();
			if(correct>2) {
			System.out.println("Masz " + correct + " poprawnie trafione liczby");
			}
			else {
				System.out.println("Nic nie trafiłeś");
			}
		

	}

}
