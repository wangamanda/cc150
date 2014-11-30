public class Problem4 {
	public static void main(String[] args) {
		String s = "Mr John Smith    ";
		replaceSpaces(s.toCharArray(), 13);
	}

	public static void replaceSpaces(char[] str, int length) {
		if(length < 1) {
			System.out.println("");
			return;
		}
		int cnt = 0;
		for(int i = 0 ; i < length ; i ++ ) {
			if(str[i] == ' ') {
				cnt++;
			}
		}
		int newLength = length+2*cnt;
		int i = 0 ; 
		int j = 0 ;
		char[] newArr = new char[newLength];
		while(i < length) {
			if(str[i] != ' ') {
				newArr[j++] = str[i++];
			} else {
				newArr[j++] = '%';
				newArr[j++] = '2';
				newArr[j++] = '0';
				i++;
			}
		}
		System.out.println(new String(newArr));
	}
}
