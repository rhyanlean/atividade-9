import java.util.Arrays;

public class QuickSort {


	public class Main {
	    // Método Insertion Sort
	    public static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }

	    // Método Quick Sort
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pi = partition(arr, low, high);

	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }

	    // Função de particionamento para o Quick Sort
	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = (low - 1);
	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;

	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	    public static void main(String[] args) {
	        // Armazenando 10 números
	        int[] numbers = {5, 2, 7, 3, 9, 1, 4, 8, 6, 10};

	        // Usando Insertion Sort
	        insertionSort(numbers);
	        System.out.println("Após Insertion Sort: " + Arrays.toString(numbers));

	        // Reiniciando a lista de números
	        numbers = new int[]{5, 2, 7, 3, 9, 1, 4, 8, 6, 10};

	        // Usando Quick Sort
	        quickSort(numbers, 0, numbers.length - 1);
	        System.out.println("Após Quick Sort: " + Arrays.toString(numbers));
	        {
	        	
	        	
	        }
	


	
	
	


