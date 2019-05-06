/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortowanie;





/**
 *
 * @author Hawkish
 */
class Merge {
public static int THREAD_MAX = Runtime.getRuntime().availableProcessors();
int rozmiarTablicy =200;
int a[];
    public void merge(int low, int mid, int high){
        int[] left = new int[mid - low + 1];
         int[] right = new int[high - mid];
         int n1 = mid - low + 1,
          n2 = high - mid, i, j;
      //  int[] a = null;
             for (i = 0; i < n1; i++)
        left[i] = a [i + low];
                 for (i = 0; i < n2; i++)
        right[i] = a[i + mid + 1];
 
    int k = low;
    i = j = 0;
        while (i < n1 && j < n2) {
        if (left[i] <= right[j])
            a[k++] = left[i++];
        else
            a[k++] = right[j++];
    }
  while (j < n2) {
        a[k++] = right[j++];
    }
}
  /*  void merge_sort(int low, int high)
{
    // calculating mid point of array
    int mid = low + (high - low) / 2;
    if (low < high) {
 
        // calling first half
        merge_sort(low, mid);
 
        // calling second half
        merge_sort(mid + 1, high);
 
        // merging the two halves
        merge(low, mid, high);
    }
}*/
    void  merge_sort(int low, int high)
{
    int part=0;
    // which part out of 4 parts
    int thread_part = part++;
 
    // calculating low and high
     low = thread_part * (rozmiarTablicy / 4);
     high = (thread_part + 1) * (rozmiarTablicy / 4) - 1;
 
    // evaluating mid point
    int mid = low + (high - low) / 2;
    if (low < high) {
        merge_sort(low, mid);
        merge_sort(mid + 1, high);
        merge(low, mid, high);
    }
}
 
    }
    

