package sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 3, 6, 8, 2, 4, 7}, size, temp;
		//size = arr.length;
		int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
		/*for(int i = 0; i < size - 1; i++) {
			for(int j = 0; j < size - i - 1; i++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
				}
			}
		}*/
		for(int i = 0; i < n; i++)
			System.out.print(arr[i]);
		
	}

}
