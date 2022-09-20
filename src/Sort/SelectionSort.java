package Sort;
public class SelectionSort {

	static int[] arr = { 4, 7, 9, 1, 6, 3 };

	public static void main(String[] args) {
		ausgabe(arr);
		ausgabe(sort(arr));
	}

	public static int[] sort(int array[]) {
		int[] sort = array;
		int counter = 0;
		int number = 0;
		int tmp = 0;

		for (int i = 0; i < sort.length - 1; i++) {

			number = sort[i];

			for (int j = counter; j < sort.length - 1; j++) {
				if (number > sort[j + 1]) {
					tmp = sort[j + 1];
					sort[j + 1] = number;
					number = tmp;
				}
			}
			sort[counter] = number;
			counter++;
		}
		return sort;
	}

	public static void ausgabe(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}

}
