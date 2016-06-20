package puzzles;

import java.util.HashMap;
import java.util.Map;

/*
 The purpose of this program is to re-arrange the given string in such a way that same characters should be positioned 
 with a distance of n chars between each other. It might not be possible always to realign the string in this fashion always, 
 in that case program should return the message that String can't be re-arranged.  


 */

public class StringAdjacent {

	private String reAlignString(String str, int distance) {
		String output = null;
		if (distance >= str.length() - 1) {
			output = " Given space is not enough to be created between similar characters in the given String";
			return output;
		}

		Boolean duplicateChars = checkForDuplicateChars(str);
		if (!duplicateChars) {
			output = " Given String cannot be re-arranged as it dosn't contain duplicate chars";
			return output;
		}

		char[] charArray1 = str.toCharArray();

		Map<Integer, String> charsTraced = new HashMap<Integer, String>();

		for (int i = 0; i < charArray1.length; i++) {
			if (i > 0) {
				charsTraced.put(i - 1, charArray1[i - 1] + "");
			}
			for (int j = i + 1; j < charArray1.length; j++) {
				boolean charReoccured = false;
				if (charArray1[i] == charArray1[j]) {
					charReoccured = true;
				}
				if (charReoccured) {
					if ((j - i) < distance) {
						if ((i + distance) > charArray1.length) {
							output = "The Duplicate character cannot be put at given distance , as String is not long enough.";
							return output;
						} else {
							boolean findNonsimilarChar = false;
							int nonSimCharPos = -1;
							for (int k = i + distance; k < charArray1.length; k++) {
								if (charArray1[i] != charArray1[k]) {
									findNonsimilarChar = true;
									nonSimCharPos = k;
									break;
								}
							}

							if (findNonsimilarChar) {
								char temp = charArray1[j];
								charArray1[j] = charArray1[nonSimCharPos];
								charArray1[nonSimCharPos] = temp;
							} else {
								output = " Couldn;t find Duplicate Chars with a distance greater than given distance . "
										+ "Hence String cannot be rearranged.";
								return output;
							}

						}
					} else {
//						System.out.println(" No need to reposition " + charArray1[j] + " at position " + j
//								+ " as it is " + "already at proper distance with its duplicate");
					}
				}

			}
		}

		String str2="";
		for(char ch : charArray1){
			str2 = str2+ch;
		}
		
		output = str2;
		return output;
	}

	private Boolean checkForDuplicateChars(String str) {
		Boolean result = false;
		char[] charArray = str.toCharArray();
		outer: for (int i = 0; i < charArray.length; i++) {
			inner: for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					result = true;
					break outer;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {

		StringAdjacent obj = new StringAdjacent();
		String result = null;
		result = obj.reAlignString("awcyatad", 4);
		System.out.println("The result is : " + result);

	}

}
