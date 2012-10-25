package cn.edu.zju.cs.zhen.introToAlgorithms.two;

public class OneTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {31,41,59,26,41,58};
		nonIncreasingInsertSort(array);
	}
	private static int[] nonIncreasingInsertSort(int[] array){
		if(array == null)
			return array;
		for(int i=1; i<array.length; i++){
			int key = array[i];
			int j=i-1;
			while(j>=0 && array[j]<key){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
		return array;
	}
}
