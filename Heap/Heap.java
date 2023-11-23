package Heap;
import java.util.Arrays;
import java.util.Scanner;

public class Heap {
    //pointer pointing to the elements in the array in the heap
    int[] arr;

    //max poss size of the max heap
    int maxSize;

    //num of elements in the max heap currently
    int heapSize;

    //constructor function
    Heap(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        heapSize = 0;
    }

    //heapifies a subtree taking the given index as the root
    void maxHeapify(int i){
        int left = lChild(i);
        int right = rChild(i);
        int largest = i;
        if(left < heapSize && arr[left] > arr[i])
            largest = left;
        if(right < heapSize && arr[right] > arr[largest])
            largest = right;
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(largest);
        }
    }

    int parent(int i){
        return(i-1)/2;
    }

    int lChild(int i){
        return (2*i+1);
    }
    int rChild(int i){
        return (2*i+2);
    }

    int removeMax(){
        //is heap array empty or not
        if(heapSize <= 0)
            return Integer.MIN_VALUE;
        if(heapSize ==1){
            heapSize--;
            return arr[0];
        }

        //store max element to remove it
        int root = arr[0];
        arr[0] = arr[heapSize -1];
        heapSize--;

        //restore the property of the max heap
        maxHeapify(0);

        return root;
    }

    //increases value of key at index i to new value
    void increaseKey(int i, int newVal){
        arr[i] = newVal;
        while(i != 0 && arr[parent(i)] < arr[i]){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    //returns the max key (root) from max heap
    int getMax(){
        return arr[0];
    }

    int curSize(){
        return heapSize;
    }

    void deleteKey(int i){
        //increases the value of the key to infinity and then removes max value
        increaseKey(i, Integer.MAX_VALUE);
        removeMax();
    }

    //inserts a new key 'x' in the Max Heap
    void insertKey(int x){
        //can key be inserted or not
        if(heapSize == maxSize){
            System.out.println("\nOverflow: Could not insertKey\n");
            return;
        }

        //new key is initially inserted at end
        heapSize++;
        int i = heapSize -1;
        arr[i] = x;

        //max heap property is checked and if violation occurs, it is restored
        while(i !=0 && arr[parent(i)] < arr[i]){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    // Driver program to test above functions. 
    public static void main(String[] args) { 
        // Assuming the maximum size of the heap to be 15. 
        Heap h = new Heap(15); 
  
        // Asking the user to input the keys: 
        int k, i, n = 6; 
        System.out.println("Entered 6 keys:- 3, 10, 12, 8, 2, 14 \n"); 
        h.insertKey(3); 
        h.insertKey(10); 
        h.insertKey(12); 
        h.insertKey(8); 
        h.insertKey(2); 
        h.insertKey(14); 
  
        // Printing the current size 
        // of the heap. 
        System.out.println("The current size of the heap is "
                + h.curSize() + "\n"); 
  
        // Printing the root element which is 
        // actually the maximum element. 
        System.out.println("The current maximum element is " + h.getMax() 
                + "\n"); 
  
        // Deleting key at index 2. 
        h.deleteKey(2); 
  
        // Printing the size of the heap 
        // after deletion. 
        System.out.println("The current size of the heap is "
                + h.curSize() + "\n"); 
  
        // Inserting 2 new keys into the heap. 
        h.insertKey(15); 
        h.insertKey(5); 
        System.out.println("The current size of the heap is "
                + h.curSize() + "\n"); 
        System.out.println("The current maximum element is " + h.getMax() 
                + "\n"); 
    } 

}
