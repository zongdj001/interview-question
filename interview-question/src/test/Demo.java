package test;
import static unit.SortUnit.*;
import org.junit.Before;
import org.junit.Test;
import static arithmetic.SearchDemo.*;
import arithmetic.BubbleSort;
import static arithmetic.BubbleSort.*;
import static arithmetic.SelectionSort.*;
import static arithmetic.QuickSort.*;

public class Demo {
	int[] arr = null;
	@Before
	public  void init(){
		arr = getArray(10);	
	}
	
 	@Test
	public void test1(){
		//int [] arr = getArray(10);
		print(arr);
		selectSort(arr);
		print(arr);
 	}
	
	@Test
	public void test2(){
		//int [] arr = getArray(10);
		print(arr);
		bubbleSort(arr);
		print(arr);
	}
	@Test
	public void test3(){
		int [] arr2 = new int[]{5,8,8,7,5,4};
		print(arr2);
		bubbleSort(arr2);
		print(arr2);
		int n = binaryFind(arr2,8);
		System.out.println(n);
		result(arr2);
	}
	@Test
	public void test4(){
		int[] arr2 = new int[1000];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i+1;
		}
		print(arr2);
		arr2[999] = 566;
		print(arr2);
		result(arr2);
		print(arr2);
	}
	@Test
	public void test5(){
		int[] arr2 = getArray(10);
		print(arr2);
		sort(arr2);
		print(arr2);
	}
}