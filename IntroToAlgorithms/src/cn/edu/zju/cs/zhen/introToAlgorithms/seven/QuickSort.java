package cn.edu.zju.cs.zhen.introToAlgorithms.seven;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 31, 41, 59, 26, 41, 58 };
		quickSort(array, 0, array.length-1);
		System.out.println();
	}
	static int[] quickSort(int[] array, int p, int q){
		if(p==q)
			return array;
		int pilot = qSort(array, p, q);
		if(pilot>p)
			quickSort(array, p, pilot-1);
		if(pilot<q)
			quickSort(array, pilot+1,q);
		return array;
	} 
	static private int qSort(int[] array, int p, int q){
		int aQ = array[q];
		int j = p;
		for(int i=p; i<q; i++){
			if(array[i]<aQ)
			{
				int tmp = array[j];
				array[j] = array[i];
				array[i] = tmp;
				j++;
			}
		}
		array[q] = array[j];
		array[j] = aQ;
		return j;
	}
}
