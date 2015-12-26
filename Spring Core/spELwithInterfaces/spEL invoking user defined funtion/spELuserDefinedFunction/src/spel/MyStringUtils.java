package spel;

public class MyStringUtils {
	public static String myReverseString(String input) {
		StringBuilder backwards = new StringBuilder();
		for (int i = 0; i < input.length(); i++){
			backwards.append(input.charAt(input.length() - 1 - i));
		}
		return backwards.toString();
	}
}
