package arrays;

// Question : Given an array Arr of size N, print second largest distinct element from an array.

// NOTE :: There must be a main method which drives the code and calls print2largest 

public class SecondLargestElement {
	int print2largest(int arr[], int n) {
		if (n > 0) {
			int first = Integer.MIN_VALUE;
			int second = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {

				// check for largest element
				if (arr[i] > first) {
					second = first;
					first = arr[i];
				}

				// check for second largest element and duplicate elements basically if arr[i]>second is true and arr[i]!=first is false means same we have encountered the same element again
				else if (arr[i] > second && arr[i] != first) {
					second = arr[i];
				}
			}

			// if this condition is true means array contains same elements
			if (second == Integer.MIN_VALUE) {
				return -1;
			}

			return second;
		} else {
			return -1;
		}
	}
}
