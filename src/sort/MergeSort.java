package sort;

import common.PrintR;
/**
 * 归并排序
 * 
 * @author cy
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] R = {49,38,65,97,76,13,27,49};
		System.out.println(MergeSort.class);
		PrintR.Print(R);
		mergeSort(R, 0, R.length-1);
		PrintR.Print(R);
	}

	private static void mergeSort(int[] r, int i, int j) {
		// TODO Auto-generated method stub
		int mid = (i + j)/2;
		if (i < j) {
			mergeSort(r, i, mid);
			mergeSort(r, mid + 1, j);
			merge(r, mid, i, j);
		}
	}

	private static void merge(int[] r, int mid, int i, int j) {
		// TODO Auto-generated method stub
		int[] temp = new int[j - i + 1];
		int firstPartLow = i, secondPartLow = mid + 1;
		int k = 0;
		while (firstPartLow <= mid && secondPartLow <= j) {
			if (r[firstPartLow] > r[secondPartLow]) {
				temp[k++] = r[secondPartLow++];
			} else {
				temp[k++] = r[firstPartLow++];
			}
		}
		while (firstPartLow <= mid) {
			temp[k++] = r[firstPartLow++];
		}
		while (secondPartLow <= j) {
			temp[k++] = r[secondPartLow++];
		}
		//排序好的覆盖原数组
		for(int index = 0; index < temp.length; index++){
			r[i+index] = temp[index];
		}
	}

}
