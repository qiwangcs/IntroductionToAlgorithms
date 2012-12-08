package cn.edu.zju.cs.zhen.introToAlgorithms.ten;

public class Queue {
	private int QUEUE_LENGTH;
	private int[] queue;
		
	private int head, tail;
	
	public Queue()
	{
		queue = new int[QUEUE_LENGTH];
		head = tail = 0;
	}
	
	public void enQueue(int element){
		head = (head==QUEUE_LENGTH?1:head+1);
		queue[head++] = element;
	
	}
	public int deQueue(){
		int element = queue[tail]; 
		queue[tail] = 0;
		tail = (tail==QUEUE_LENGTH?1:tail+1);
		return element;
	}
}
