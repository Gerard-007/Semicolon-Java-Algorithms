public class ReverseSenetence {
	public static void main(String[] args) {
		String userInput = "There is a tide in the affairs of man";
		System.out.println(reverseSentence(userInput));
	}


	public static String reverseSentence(String userInput) {
		String array[] = userInput.split(" ");
        	StringBuilder copy = new StringBuilder();
        	int counter = 0;
        	for (int i = array.length; i > 0; i--) {
            		copy.append(array[i - 1]);
			copy.append(" ");
            		counter++;
        	}
		return copy.toString();
    	}
}