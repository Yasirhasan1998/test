//package array1;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.*;
//
//public class TwoSumProblem {
//	public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
//		ArrayList<Pair<Integer, Integer>> result = new ArrayList<>();
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < n; i++) {
//			int complement = target - arr.get(i);
//			if (map.containsKey(complement)) {
//				int j = map.get(complement);
//				result.add(new Pair<Integer, Integer>(j, i));
//			}
//			map.put(arr.get(i), i);
//		}
//
//		return result;
//	}
//
//	public static void main(String[] args) {
//		ArrayList<Integer> arr1 = new ArrayList<Integer>();
//		arr1.add(2);
//		arr1.add(7);
//		arr1.add(11);
//		arr1.add(13);
//
//		ArrayList<Integer> arr2 = new ArrayList<Integer>();
//		arr2.add(1);
//		arr2.add(-1);
//		arr2.add(-1);
//		arr2.add(2);
//		arr2.add(2);
//
//		int target1 = 9;
//		int target2 = 1;
//
//		ArrayList<Pair<Integer, Integer>> result1 = twoSum(arr1, target1, arr1.size());
//		ArrayList<Pair<Integer, Integer>> result2 = twoSum(arr2, target2, arr2.size());
//
//		for (Pair<Integer, Integer> pair : result1) {
//			System.out.println(arr1.get(pair.getKey()) + " " + arr1.get(pair.getValue()));
//		}
//
//		for (Pair<Integer, Integer> pair : result2) {
//			System.out.println(arr2.get(pair.getKey()) + " " + arr2.get(pair.getValue()));
//		}
//	}
//
//}
