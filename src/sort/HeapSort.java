package sort;

import common.PrintR;

/**
 * 堆排序
 * 
 * @author cy
 *
 */

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] R = {49,38,65,97,76,13,27,49};
		System.out.println(HeapSort.class);
		PrintR.Print(R);
		heapSort(R);
		PrintR.Print(R);
	}
	
	
	private static void heapSort(int[] r) {
		// TODO Auto-generated method stub
		int i = 0;
		int len = r.length;
		int temp = 0;
		for (i = len/2 - 1; i >= 0; i--) {
			Sift(r, i, len - 1);
		}
		for(i = len - 1; i >= 1; i--){
			temp = r[0];
			r[0]= r[i];
			r[i] = temp;
			Sift(r, 0, i-1);
		}
	}
	
	/**
	 * 
	 * @param R 数组
	 * @param low 排序范围的开始，数组下标
	 * @param high 排序范围的结束， 数组下标
	 */
	private static void Sift(int[] R, int low, int high) {
		int lchild = low * 2 + 1;
		int temp = R[low];
		while (lchild <= high) {
			if (lchild < high) {
				if (R[lchild] < R[lchild + 1]) {
					lchild++;
				}
			}
			if (temp < R[lchild]) {
				R[low] = R[lchild];
				low = lchild;
				lchild *= 2;
				lchild++;
			} else {
				break;
			}
		}
		R[low] = temp;
	}
}

