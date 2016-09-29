
public class RomanNumerals {
	public int convertToInteger(String romanNum) throws RomanNumeralsException{
		for(char c : romanNum.toCharArray()) {
			if(c != 'I' || c != 'V' || c != 'X' || c != 'L' || c != 'C' || c != 'D' || c != 'M') {
				throw new RomanNumeralsException("Roman Numeral to be converted isn't valid");
			}
		
		}
		if(romanNum == "I")
			return 1;
		else 
			return 0;
	}
}
