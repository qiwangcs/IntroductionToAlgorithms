package cn.edu.zju.cs.zhen.introToAlgorithms.two;

/*
Consider sorting n numbers stored in array A by first finding the smallest element
of A and exchanging it with the element in A[1]. Then find the second smallest
element of A, and exchange it with A[2]. Continue in this manner for the first n-1
elements of A. Write pseudocode for this algorithm, which is known as selection
sort. What loop invariant does this algorithm maintain? Why does it need to run
for only the first n 1 elements, rather than for all n elements? Give the best-case
and worst-case running times of selection sort in ‚-notation.
*/
public class TwoTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {31,41,59,26,41,58};
		selectionSort(array);
	}
	public static int[] selectionSort(int[] array){
		for(int i=0; i<array.length-1; i++){
			int min = Integer.MAX_VALUE;
			int index=0;
			for(int j=i; j<array.length; j++){
				if(array[j]<min){
					min = array[j];
					index = j;
				}
			}
			array[index]=array[i];
			array[i]=min;
		}
		return array;
	}
}
