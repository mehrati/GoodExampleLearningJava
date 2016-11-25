import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] srgs) {

		List<Integer> list = new ArrayList<>();
		for(int i=0;i<20;i+=3){
			list.add(i);
		}

		Object[] objects = list.toArray();
		for (Object object : objects) {
			System.out.println((Integer) object);
		}

		Integer[] list2 = list.toArray(new Integer[list.size()]);
		for(Integer l : list2){
			System.out.println(l);
		}
		
		Integer[] list3 = list.toArray(new Integer[0]);
		for(Integer l : list3){
			System.out.println(l);
		}
	}

}

