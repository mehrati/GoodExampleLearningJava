import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Encode {

	public static void main(String[] srgs) throws UnsupportedEncodingException {

		String strEncode = Base64.getEncoder().encodeToString("www.google.com".getBytes("utf-8"));
		System.out.println("Encode : " + strEncode);
		String strEncodeUrl = Base64.getUrlEncoder().encodeToString("www.google.com".getBytes("utf-8"));
		System.out.println("EncodeUrl : " + strEncodeUrl);
		String strEncodeMime = Base64.getMimeEncoder().encodeToString("www.google.com".getBytes("utf-8"));
		System.out.println("EncodeMime : " + strEncodeMime);

	}

}

