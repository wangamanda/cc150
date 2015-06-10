import java.util.ArrayList;

public class Problem8 {
	public static void drawLine(byte[] screen, int w, int y, int x1, int x2) {
		int start_offset = x1 % 8;
		int start_full_byte = x1 / 8;
		if (start_offset != 0) {
			start_full_byte ++ ;
		}

		int end_offset = x2 % 8;
		int end_full_byte = x2 / 8;
		if (end_offset != 0) {
			end_full_byte -- ;
		}

		for (int i = w*y/8 + start_full_byte ; i <= w*y/8 + end_full_byte ; i ++ ) {
			screen[i] |= (byte)0xff;
		}

		byte start_mask = (byte)(0xff >> start_offset);
		byte end_mask = (byte)~(0xff >> (end_offset+1));
		if (x1/8 == x2/8) {
			screen[w*y/8 + x1/8] |= start_mask & end_mask;
		} else {
			if (start_offset != 0) {
				screen[w*y/8 + start_full_byte - 1] |= start_mask;
			}
			if (end_offset != 0) {
				screen[w*y/8 + end_full_byte + 1] |= end_mask;
			}
		}
	}

	public static void main(String[] args) {
		int width = 8 * 4;
		int height = 15;
		byte[] screen = new byte[width * height / 8];
		drawLine(screen, width, 10, 4, 29);
		printScreen(screen, width);
	}

	public static void printScreen(byte[] screen, int w) {
		int h = screen.length*8 / w;
		for (int i = 0 ; i < h ; i ++ ) {
			for (int j = 0 ; j < w/8 ; j ++ ) {
				printByte(screen[i*w/8 + j]);
			}
			System.out.println();
		}
	}

	public static void printByte(byte b) {
		for (int i = 7 ; i >= 0 ; i -- ) {
			System.out.print((b >> i) & 1);
		}
	}
}
