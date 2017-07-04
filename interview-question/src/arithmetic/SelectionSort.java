package arithmetic;

import static unit.SortUnit.swap;

/**
 * 设计1-100的随机数排序
 * 排序工具类（选择排序）
 * @author 丁鹏
 *
 */
public class SelectionSort {
	public static void selectSort(int[] number){
		for (int i = 0; i < number.length-1; i++) {
			int m = i;
			for (int j = i+1; j < number.length; j++) {
				if(number[j]<number[m])
					m = j;
			}
			if(i!= m){
				swap(number,i,m);
			}
		}
	}
}
