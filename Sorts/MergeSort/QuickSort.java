class QuickSort {

	public static void main(String[] args) {

		int[] data = { 12,7,23,8,2 };

		System.out.println("\nArray Before Sort :");
		printData(data);
		System.out.println(" ");

		quickSort(data, 0, data.length - 1);

		System.out.println("\nArray After Sort :");
		printData(data);
	}

	public static int partition(int[] data, int l, int h) {

		int pivot = data[h];
		int j = h - 1;
		// for(int i=0;i<=j;i++)
		int i = 0;
		while (i <= j) {
			if (data[i] > pivot) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				j--;
			} else {
				i++;
			}

		}
		data[h] = data[j + 1];
		data[j + 1] = pivot;

		printData(data);
		return j + 1;

	}

	public static void quickSort(int[] data, int l, int h) {
		if (l < h) {
			int p = partition(data, l, h);
			if (p != -1) {
				quickSort(data, l, p - 1);
				quickSort(data, p + 1, h);
			}
		}

	}

	private static void printData(int[] data) {
		for (int i = 0; i < data.length; i++)
			System.out.print("  " + data[i]);
	}

}
