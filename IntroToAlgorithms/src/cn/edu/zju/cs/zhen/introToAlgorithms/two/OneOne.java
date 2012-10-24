package cn.edu.zju.cs.zhen.introToAlgorithms.two;

public class OneOne {
	public static void main(String[] args){
		int[] array = {31,41,59,26,41,58};
		insertSort(array);
	}
	private static int[] insertSort(int[] array){
		if(array == null)
			return array;
		for(int i=1; i<array.length; i++)
		{
			int key = array[i];
			int j=i-1;
			while(j>=0 && array[j]>key){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
		return array;
	}
}
