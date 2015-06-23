package problem8;

public class RankNode {
	RankNode left;
	RankNode right;
	int left_size;
	int data;

	public RankNode(int d) {
		data = d;
		left = null;
		right = null;
		left_size = 0;
	}

	public void insert(int d) {
		if (d <= data) {
			if (left == null) {
				left = new RankNode(d);
			} else {
				left.insert(d);
			}
			left_size++;
		} else {
			if (right == null) {
				right = new RankNode(d);
			} else {
				right.insert(d);
			}
		}
	}

	public int getRank(int d) {
		if (d == data) {
			return left_size;
		} else if (d < data) {
			if(left == null) {
				return -1;
			}
			return left.getRank(d);
		} else {
			if (right == null){
				return -1;
			}
			int getRight = right.getRank(d);
			if(getRight == -1) {
				return -1;
			}
			return left_size+1+getRight;
		}
	}
}
