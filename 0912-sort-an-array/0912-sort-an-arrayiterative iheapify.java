class Solution {
    public int[] sortArray(int[] a) {
     int n=a.length;
     for(int i=n/2-1;i>=0;i--){//Building Maxheap
        heapify(a,n,i);
     }
     for(int i=n-1;i>=0;i--){//Extracting last one by one
        int temp=a[0];
        a[0]=a[i];//replacing root element with last element
        a[i]=temp;//store sorted greatest element at last of array and decrese the length of unsorted array
        heapify(a,i,0);//size =i
        }
        return a;
    }
        public static void heapify(int[] arr, int n, int i) {
        while (true) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            // If left child is larger than root
            if (left < n && arr[left] > arr[largest]) {
                largest = left;
            }

            // If right child is larger than largest so far
            if (right < n && arr[right] > arr[largest]) {
                largest = right;
            }

            // If largest is not root
            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                // Move down to the largest child
                i = largest;
            } else {
                break;
            }
           
        }
        }
    }