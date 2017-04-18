class Queue {
	public int arr[];
	private int i,j;

	// this is a constructor
	Queue(int size) {
		arr = new int[size];
		i = 0;
		j = 0;

	}

	// this adds to the queue
	public boolean push(int x) {
		if (i < arr.length) {
			arr[i] = x;
			i++;
			return true;
		}
		else {
			return false;
		}
	}

	// this removes from the queue
	public void pop() {
		
	}
}

class QDemo {
	public static void main(String args[]) {
		Queue one = new Queue(9);

		for(int l = 0; l < 9; l++) {
			System.out.print(one.arr[l]);
		}

		System.out.println();
		one.push(5);
		one.push(6);
		one.push(9);
		one.push(3);
		one.push(7);
		one.push(4);
		one.push(1);
		one.push(2);
		one.push(8);
		one.push(13);

		for(int l = 0; l < 9; l++) {
			System.out.print(one.arr[l]);
		}
	}
}