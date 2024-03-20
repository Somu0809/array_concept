package neww;

public class Main_2 {
	
	static boolean come(String a) {
		
		char x = 'a';
		
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i) == x) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		String[] words = {"abc", "bcd", "aaaa", "cbc"};
		
		for(int j =0; j<words.length; j++) {
			
			if(come(words[j])) {
				
				 System.out.print(j + " ");
			}
			
		}

	}

	private static boolean come(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

}
