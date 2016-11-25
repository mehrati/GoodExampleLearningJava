import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;//add Apache commons codec lib
import org.apache.commons.io.IOUtils;//add Apache commons io lib

public class MD5 {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "filePath";
		System.out.println(MD5ForFile.getMD5Hash(path));

	}
}

class MD5ForFile {

	public static String getMD5Hash(String pathFile) throws FileNotFoundException {
		String MD5hash = null;
		FileInputStream fi = new FileInputStream(new File(pathFile));
		try {
			// md5Hex converts an array of bytes into an array of characters
			// representing the hexadecimal values of each byte in order.
			// The returned array will be double the length of the passed array,
			// as it takes two characters to represent any given byte.
			MD5hash = DigestUtils.md5Hex(IOUtils.toByteArray(fi));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(fi);
		}
		return MD5hash;
	}

}
