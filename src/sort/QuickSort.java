package sort;

import common.PrintR;

/**
 * 快排
 * 快速排序最好的情况下的时间复杂度是O(nlogn),待排序列越接近无序，算法效率越高。
 * 最坏情况下的复杂度为O(n^2)
 * 平均复杂度O(nlogn)
 * 就平均而言，快速排序是所有排序算法中最好的
 * 排序趟数和初始序列有关
 * 由于递归需要辅助栈，所以空间复杂度O(logn)
 * 
 * @author cy
 *
 */

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] R = {49,38,65,97,76,13,27,49};
		System.out.println(QuickSort.class);
		PrintR.Print(R);
		quickSort(R, 0, R.length-1);
		PrintR.Print(R);
	}

	private static void quickSort(int[] R, int s, int e) {
		// TODO Auto-generated method stub
		int temp;
		int i = s, j = e;
		if (s < e) {
			temp = R[s];
			while (i != j) {
				while (R[j] > temp && i < j) {
					j--;
				}
				if (i < j) {
					R[i] = R[j];
					i++;
				}
				while (R[i] < temp && i < j) {
					i++;
				}
				if (i < j) {
					R[j] = R[i];
					j--;
				}
			}
			R[i] = temp;
			quickSort(R, s, i - 1);
			quickSort(R, i + 1, e);
		}
	}
}
