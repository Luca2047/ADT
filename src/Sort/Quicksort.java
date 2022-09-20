package Sort;

public class Quicksort {

	public int divison(int list[], final int first, final int last) {
	
		int pivot = list[(first+ last)/2];
		int positionLeft = first;
		int positionRight = last;
		
		while(positionLeft <= positionRight) {
			
			while(list[positionLeft]<pivot) {
				positionLeft++;
			}
			
			while(list[positionRight]> pivot) {
				positionRight--;
			}
			
			if(positionLeft <=positionRight) {
				int tmp =list[positionLeft];
				list[positionLeft] = list[positionRight];
				list[positionRight] = tmp;
				positionLeft++;
				positionRight--;
			}
		}
		return positionLeft;
		
	}
	
	public void quicksort(int list[],final int first, final int last) {
		
		int index= divison(list,first,last);
		
		if(first<index-1) {
			quicksort(list,first,index-1);
		}
		
		if(index<last) {
			quicksort(list,index,last);
		}
		
		
	}
}
