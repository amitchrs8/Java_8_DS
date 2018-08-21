package puzzles;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MagicNumber {

	public static void main(String[] args) {
		printMagicNumber(50, 1000);
	}

	public static boolean isMagicNumber(Integer number) {
		boolean result = false;
		Integer[] intArray = new Integer[number.toString().length()];
		if(intArray.length<2) {
			return false;
		}
		for (int i = 0; i < intArray.length; i++) {
			int digit = number % 10;
			number = number / 10;
			intArray[intArray.length - i - 1] = digit;
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < intArray.length; i++) {
			int visitedIndex = (i + intArray[i]) % (intArray.length);
			if (set.contains(intArray[visitedIndex])) {
				result = false;
				return result;
			} else {
				set.add(intArray[visitedIndex]);
			}
		}
		result = true;
		for (int i = 0; i < intArray.length; i++) {
			if (!set.contains(intArray[i])) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void printMagicNumber(int start, int end) {
		IntStream.range(start, end).filter(num -> isMagicNumber(num)).forEach(System.out::println);
	}

}
