import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] srgs) {

		int[] a = new int[] { 1, 2, 3, 4, 5, 0, 0, 0, 0 };
		int[] b = { 6, 7, 8, 9 };
		System.arraycopy(b, 0, a, 5, 4);// arraycopy(src, srcPos, dest, destPos, length);
		System.out.println(Arrays.toString(a));
	}

}

