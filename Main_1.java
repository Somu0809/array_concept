package neww;

public class Main_1 {
	
	
	static String now(String a) {
		String b = "";
		
		for(int i =0; i<a.length(); i++) {
			b = a.charAt(i) + b;
		}
		return b;
	}
	

	public static void main(String[] args) {
		
		String[] words = {"abc", "bcd", "aba", "cfg", "madam"};
		
		for(int j =0; j<words.length; j++) {
			
			if(now(words[j]).equals(words[j]) ){
				
				System.out.println(words[j]);
				
				break;
			}
		}

	}

}
