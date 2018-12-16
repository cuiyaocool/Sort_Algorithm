package sort;

import common.PrintR;

/**
 * ����
 * ����������õ�����µ�ʱ�临�Ӷ���O(nlogn),��������Խ�ӽ������㷨Ч��Խ�ߡ�
 * �����µĸ��Ӷ�ΪO(n^2)
 * ƽ�����Ӷ�O(nlogn)
 * ��ƽ�����ԣ��������������������㷨����õ�
 * ���������ͳ�ʼ�����й�
 * ���ڵݹ���Ҫ����ջ�����Կռ临�Ӷ�O(logn)
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
