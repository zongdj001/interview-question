package unit;

import java.util.Random;

public class SortUnit {
	public static void swap(int[] number,int i,int j){
		int n = number[i];
		number[i] = number[j];
		number[j] = n;
	}
	public static int[] getArray(int n){
		Random rd = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
		}
		return arr;
	}
	public static void print(int[] number){
		System.out.print("[");
		for (int i = 0; i < number.length; i++) {
			if(i!=number.length-1){
				System.out.print(number[i]+",");
			}else
			System.out.print(number[i]);
		}
		System.out.println("]");
	}

}
