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
        public static void heapify(int arr[],int n,int i)
        {
            int max=i;//let parent root be max
            int left=2*i+1;
            int right=2*i+2;
            if(left<n && arr[left]>arr[max])//left child exist & its valus is greater than the parent
            max=left;//max index is left child
            if(right<n && arr[right]>arr[max])//right child exist & its valus is greater than the greatest(parent or left child)
            max=right; //max indes is right child
            //swap the parent with the max if parent is not max
            if(max!=i){
            int temp = arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
           // System.out.println("largest root here "+ arr[i]);
             heapify(arr,n,max);//heapify the heap below the current little the max heap 
            }
           
        }
    }