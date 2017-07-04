package arithmetic;
import static unit.SortUnit.*;

public class BubbleSort {
     public static void bubbleSort(int[] number){
    	 for (int i = 0; i < number.length-1; i++) {
			for (int j = 0; j < number.length-i-1; j++) {
				if(number[j]>number[j+1]){
					swap(number,j,j+1);
				}
			}
		}
     }
     
     public static void main(String[] args) {
		int[] arr = new int[]{3,4,1,6,5};
		print(arr);
		bubbleSort(arr);
		print(arr);
	}
}
