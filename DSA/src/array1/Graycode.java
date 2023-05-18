package array1;

import java.util.ArrayList;
import java.util.List;

public class Graycode {

	public static void main(String[] args) {
		System.out.println(grayCode(2));

	}
//	public static List<Integer> grayCode(int n) {
//		List<Integer> result= new ArrayList<>();
//		result.add(0);
//		// generate gray code sequence for each bit
//        for (int i = 0; i < n; i++) {
//            // calculate the bit to flip
//            int mask = 1 << i;
//            // add the gray code sequence in reverse order
//            for (int j =  result.size()- 1; j >= 0; j--) {
//                result.add(result.get(j) | mask);
//            }
//        }
//        return result;
//	}
	public static List<Integer> grayCode(int n) {
		List<Integer> list= new ArrayList<>();
		list.add(0);
		if(n==0)
			return list;
		list.add(1);
		//Conceder a current value 1 which is itrread
		int current=1;
        for (int i = 2; i <=n; i++) {
            current*=2;
            
            // add the gray code sequence in reverse order
            for (int j =  list.size()- 1; j >= 0; j--) {
                list.add(list.get(j) + current);
            }
        }
        return list;
	}     

}
