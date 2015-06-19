package problem10;

import java.util.HashMap;
import java.util.ArrayList;

public class Problem10 {
	public static void main(String[] args) {
		Box box1 = new Box(10, 8, 9);
		Box box2 = new Box(5, 6, 7);
		Box box3 = new Box(6, 7, 8);
		Box box4 = new Box(8, 4, 6);
		Box[] boxes = {box1, box2, box3, box4};
		HashMap<Box, ArrayList<Box>> map = new HashMap<Box, ArrayList<Box>>();
		ArrayList<Box> array = getStack(map, null, boxes);
		for (int i = 0 ; i < array.size() ; i ++ ) {
			System.out.println(array.get(i).height+"");
		}
	}

	public static ArrayList<Box> getStack(HashMap<Box, ArrayList<Box>> map, Box bottom, Box[] boxes) {
		if (map.containsKey(bottom)) {
			return map.get(bottom);
		}

		int maxHeight = 0;
		ArrayList<Box> stack = new ArrayList<Box>();
		for (int i = 0 ; i < boxes.length ; i ++ ) {
			if (canPlace(boxes[i], bottom)) {
				ArrayList<Box> array = getStack(map, boxes[i], boxes);
				if (getHeight(array) > maxHeight) {
					maxHeight = getHeight(array);
					stack = array;
				}
			}
		}
		if (bottom != null) {
			stack.add(0, bottom);
		}
		if(!map.containsKey(bottom))
			map.put(bottom, stack);
		return stack;
	}

	public static boolean canPlace(Box box1, Box box2) {
		if(box2 == null) {
			return true;
		}
		if (box1.height < box2.height && box1.width < box2.width && box1.depth < box2.depth) {
			return true;
		}
		return false;
	}

	public static int getHeight(ArrayList<Box> array) {
		int res = 0;
		for (int i = 0 ; i < array.size() ; i ++ ) {
			res += array.get(i).height;
		}
		return res;
	}
}
