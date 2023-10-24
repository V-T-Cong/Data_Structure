import java.util.Random;

public class Ex01 {

	public static void SelectionSort(int arr[]) {
		int temp = 0;
		int n = arr.length;

		for (int i = 0; i < n-1; i ++) {
			int min_idx = i;
			for (int j = i +1 ; j < n; j ++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}

			temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void BubbleSort(int arr[]) {
		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < n-1; i ++) {
			for (int j = 0; j < n - 1; j++) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}

	public static void InsersionSort(int arr[]) {
		int n = arr.length;
		int j = 0;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
		arr[j + 1] = key;
		}	
	}

	public static void merge(int[] arr, int l, int m, int r) {
		// Find the sizes of the two subarrays.
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temporary arrays to store the elements of the two subarrays.
		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy the elements of the two subarrays to the temporary arrays.
		System.arraycopy(arr, l, L, 0, n1);
		System.arraycopy(arr, m + 1, R, 0, n2);

		// Merge the two sorted subarrays.
		int i = 0;
		int j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy the remaining elements from L to arr, if any.
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy the remaining elements from R to arr, if any.
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            // Recursively sort the two halves.
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves.
            merge(arr, l, m, r);
        }
    }

	public static void main(String[] args) {
		Random random = new Random();
        int arraySize = 20;
        int[] randomArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = random.nextInt(101); // Generates a random integer between 0 and 100
        }

		System.out.print("Random Array: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }

		System.out.println();

		System.out.print("Selection sort: ");
		InsersionSort(randomArray);
		for (int num : randomArray) {
            System.out.print(num + " ");
        }
	}
}
