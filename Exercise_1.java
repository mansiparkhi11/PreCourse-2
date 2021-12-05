class BinarySearch { 
    // Returns index of x if it is present in a[l.. r], else return -1 
    int binarySearch(int a[], int key) {
        int low = 0, high = a.length - 1;
        while (low <= high){
            if (a[mid] == key){
                return mid;
            }else if (a[mid]>= key){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
  


} 
