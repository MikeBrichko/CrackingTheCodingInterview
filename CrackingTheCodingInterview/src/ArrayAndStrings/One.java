package ArrayAndStrings;

public class One {
	public static void main(String args[]) {
		String one = "agbcdmneturk";
		String two = "sdhbsjdkfgesfbsj";
		
		System.out.println(hasUniqueCharacters(one));
		System.out.println(hasUniqueCharacters(two));
		
		System.out.println(isUniqueCharacters(one));
		System.out.println(isUniqueCharacters(two));
	}
	
	//Time complexity = n^2
	public static boolean hasUniqueCharacters(String s) {
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		return true;
	}
	
	//Time complexity = n
	//Space Complexity = 1
		public static boolean isUniqueCharacters(String s) {
			if(s.length() > 128) return false;
			
			boolean char_set[] = new boolean[128];
			for(int i=0; i<s.length(); i++) {
				int val = s.charAt(i);
				if(char_set[val]) {
					return false;
				}
				
				char_set[val] = true;
			}
			
			return true;
		}
}
