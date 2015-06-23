public class Problem5 {
	public static void main(String[] args) {
		for (int i = 0 ; i < args.length ; i ++ ) {
			System.out.print(args[i]+" ");
		}
		System.out.println();
		int res = findString(args, "ball");
		System.out.println(res+"");
	}

	public static int findString(String[] strs, String s) {
		int left = 0;
		int right = strs.length-1;
		while(left <= right) {
			int mid = left + (right-left)/2;
			if (strs[mid].isEmpty()) {
				int i = mid-1;
				int j = mid+1;
				while (i >= left && j <= right) {
					if(!strs[i].isEmpty()) {
						mid = i;
						break;
					}
					if(!strs[j].isEmpty()) {
						mid = j;
						break;
					}
					i--;
					j++;
				}
				while(i >= left) {
					if(!strs[i].isEmpty()){
						mid = i;
						break;
					}
					i--;
				}
				while(j <= right) {
					if(!strs[j].isEmpty()){
						mid = j;
						break;
					}
					j++;
				}

				if(i < left && j > right) {
					return -1;
				}
			}

			if(s.compareTo(strs[mid]) == 0) {
				return mid;
			} else if (s.compareTo(strs[mid]) > 0) {
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		return -1;
	}
}
