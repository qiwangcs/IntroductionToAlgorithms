package cn.edu.zju.cs.zhen.introToAlgorithms.two;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 31, 41, 59, 26, 41, 58 };
		mergeSort(array, 0, array.length - 1);
		System.out.println();
	}

	static void mergeSort(int[] array, int start, int end) {
		if (end > start) {
			int median = (end - start) / 2 + start;
			mergeSort(array, start, median);
			mergeSort(array, median + 1, end);

			merge(array, start, median, end);
		}
	}

	static void merge(int[] array, int start, int median, int end) {
		int[] tempArray = new int[end - start + 1];
		int i1 = 0, i2 = 0;
		for (int i = 0; i < tempArray.length; i++) {
			//If one sub string is to the end, then select next element in another sub string
			if (start + i1 > median) {
				tempArray[i] = array[median + 1 + i2];
				i2++;
			} else if (median+1+i2 > end) {
				tempArray[i] = array[start + i1];
				i1++;
			} else {
				if (array[start + i1] < array[median + 1 + i2]) {
					tempArray[i] = array[start + i1];
					i1++;
				} else {
					tempArray[i] = array[median + 1 + i2];
					i2++;
				}
			}
		}
		for (int i = 0; i < tempArray.length; i++) {
			array[start + i] = tempArray[i];
		}
	}
}
