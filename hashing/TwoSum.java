package hashing;

import java.util.*;

public class TwoSum {
	
	public static int[] twoSum(int []nums, int target) {
		HashMap<Integer,Integer> map=new HashMap<>();
		//filling
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		
		//searching
		
		for(int i=0;i<nums.length;i++) {
			int n=nums[i];
			int rem = target-n;
			if(map.containsKey(rem)) {
				int index= map.get(rem);
				if(index==i) continue;
				return new int[]{i,index};
			}
		}
		return new int[] {};
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array: ");
		int size = sc.nextInt();
		int [] nums=new int[size];
		System.out.println("elemnets: ");
		
		for(int i=0;i<size; i++) {
			nums[i]= sc.nextInt();	
		}
		
		System.out.println("enter the taget: ");
		int target = sc.nextInt();
		
		int[] result =twoSum(nums,target);
		if(result.length==2) {
			System.out.println(result[0]+" "+result[1]);
		}else {
			System.out.println("no result found");
		}
		
	}
}