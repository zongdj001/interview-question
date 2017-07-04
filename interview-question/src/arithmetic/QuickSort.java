package arithmetic;
import static unit.SortUnit.*;
public class QuickSort {
	 public static void sort(int[] number){
		 quickSort(number, 0, number.length-1);
	 }
	 public static void quickSort(int[] number,int left,int right){
		 if(left<right){
			 int s = number[left];
			 int i = left;
			 int j = right+1;
			 while(true){
				 while(i+1<number.length&&number[++i]<s);
				 
				 while(j-1>-1&&number[--j]>s);
				 
				 if(i>=j){
					 break;
				 }
				 swap(number,i,j);
			 }
			 number[left] =number[j];
			 number[j]=s;
			 
			 quickSort(number, left, j-1);
			 quickSort(number, j+1, right);
		 }
	 }
}
