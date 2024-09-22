public class BeautifyString {
	public static String beautifyUserInput(String userInput) {
		String initialResult;
		if(userInput.endsWith(".")) {
			initialResult = userInput;
		} else {
			initialResult = String.format("%s.", userInput);
		}
		char firstChar = userInput.charAt(0);
		String convertedFirstChar = String.format("%c", firstChar);
		String result = initialResult.replaceFirst(String.valueOf(initialResult.charAt(0)), convertedFirstChar.toUpperCase()); 
		return result;
	}
}