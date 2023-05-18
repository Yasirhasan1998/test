package array1;

import java.util.Arrays;

public class MostWater {

	public static void main(String[] args) {
		int[] height = {1, 5, 4, 3};
		long[] heightLong = Arrays.stream(height).mapToLong(i -> i).toArray();

		MostWater obj = new MostWater();
		long output = obj.maxArea(heightLong);

	}
	  public static long maxArea(long[] heightLong) {
		   int n = heightLong.length;
		        int left = 0, right = n - 1;
		        long maxArea = 0;
		        
		        while (left < right) {
		            int hLeft = (int) heightLong[left], hRight = (int) heightLong[right];
		            long area = (long) Math.min(hLeft, hRight) * (right - left);
		            maxArea = Math.max(maxArea, area);
		            
		            if (hLeft < hRight) {
		                left++;
		            } else {
		                right--;
		            }
		        }
		        
		        return maxArea;
	  }
}
