package Sort;

public class Bubblesort {

	static int[] arr = { 4, 7, 9, 1, 6, 3 };

	public static void main(String[] args) {
		ausgabe(arr);
		ausgabe(sort(arr));
	}

	public static int[] sort(int array[]) {
		int[] sort = array;
		int tmp = 0;

		for (int i = sort.length; i > 0; i--) {



			for (int j = 0; j < i - 1; j++) {
				if (sort[j] > sort[j + 1]) {

					tmp=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=tmp;
				}
			}


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
