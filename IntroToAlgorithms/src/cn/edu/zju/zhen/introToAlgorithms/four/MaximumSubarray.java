package cn.edu.zju.zhen.introToAlgorithms.four;

class Result{
	int start;
	int end;
	int max;
	Result(int start, int end, int max){
		this.start = start;
		this.end = end;
		this.max = max;
	}
	public String toString(){
		return "" + start + ":" + end + ":" + max;
	}
}
public class MaximumSubarray {
	public Result subArray(int[] array, int start, int end){
		if(start == end)
			return new Result(start, end, array[start]);
		
		Result result1 = subArray(array, start, end-1);
		Result result2 = maxSubarrayWithLast(array,start,end);
		
		if(result1.max > result2.max)
			return result1;
		else
			return result2;
	}
	public Result maxSubarrayWithLast(int[] array, int start, int end){
		int max = Integer.MIN_VALUE;
		int leftIndex = end;
		int sum = 0;
		for(int i=end; i>=start; i--){
			sum += array[i];
			if(max < sum)
			{
				max = sum;
				leftIndex = i;
			}
		}
		return new Result(leftIndex, end, max);
	}
	public static void main(String[] args){
		MaximumSubarray maxSubarray = new MaximumSubarray();
		
		int[] array = new int[]{7,-1,-3,-2,4,-1,6,3,1,-2,3};
		Result result = maxSubarray.subArray(array, 0, array.length-1);
		System.out.println(result);
	}
}
