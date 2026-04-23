public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray() {
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
    }
	return numbers;
}

	public static String[] createArray(String s1, String s2, String s3, String s4) {
    
    String[] words = {s1, s2, s3, s4};
    
    return words;
}

	public static int findValue(int target, int[] numbers) {
    
    for (int i = 0; i < numbers.length; i++) {
        
        if (numbers[i] == target) {
            return i;
        }
    }

    
    return -1;
}

		public static int findThirdValue(String target, String[] words) {
    int count = 0;

    for (int i = 0; i < words.length; i++) {
        
        if (words[i].equals(target)) {
            count++;
            
            if (count == 3) {
                return i;
            }
        }
    }

    return -1;
}

}
