package arithmetic;

import java.util.Arrays;

/**
 * 实现数组a[1000]，查找俩个相同的数
 * 二分法查找
 * @author 丁鹏
 *
 */

public class SearchDemo {
	//调用二分查找相同的元素
	public static void result(int data[]){
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			int target = data[i];
			data[i]=0;
			int result = binaryFind(data, target);
			if(result!=-1){
				System.out.println("相同元素为："+data[result]);
				break;
			}
		}
	}
	//实现二分算法
	public static int binaryFind(int[]data,int target){
		int start = 0;
		int end = data.length-1;
		while(start<=end){
			int middleIndex = (start+end) /2;
			if(target==data[middleIndex]){
				return  middleIndex;
			}
			if(target>=data[middleIndex]){
				start = middleIndex +1 ;
			}else{
				end = middleIndex -1;
			}
		}
		return -1;
	}
}
 