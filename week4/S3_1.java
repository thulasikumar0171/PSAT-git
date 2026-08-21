import java.io.BufferedInputStream;
import java.io.IOException;

public class S3_1 {
	public static void main(String[] args) throws Exception {
		FastScanner in = new FastScanner();
		int n = in.nextInt();

		if (n <= 0) {
			return;
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		// One pass uses O(n) time and O(1) extra space.
		for (int i = 0; i < n; i++) {
			int value = in.nextInt();
			if (value < min) min = value;
			if (value > max) max = value;
		}

		System.out.println(min + " " + max);
	}

	private static final class FastScanner {
		private final BufferedInputStream input = new BufferedInputStream(System.in);
		private final byte[] buffer = new byte[1 << 16];
		private int pointer;
		private int length;

		private int read() throws IOException {
			if (pointer >= length) {
				length = input.read(buffer);
				pointer = 0;
				if (length == -1) return -1;
			}
			return buffer[pointer++];
		}

		int nextInt() throws IOException {
			int c;
			do {
				c = read();
			} while (c <= ' ' && c != -1);

			int sign = 1;
			if (c == '-') {
				sign = -1;
				c = read();
			}

			int value = 0;
			while (c > ' ') {
				value = value * 10 + c - '0';
				c = read();
			}
			return value * sign;
		}
	}
}
