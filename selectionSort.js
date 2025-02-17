function selectionSort(arr) {
    let n = arr.length
    /**
     * We have the unsorted region initially from index 0
     * so i denotes the start of unsorted region
     */
    for(let i=0; i < n; i++){ // i < n-1 means we just want to go till second last element
        let min_idx = findMinElement(arr, i);
        if(min_idx != i){
            //min element and the first element of unsorted region are diff, than swap
            let temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

}

/**
 * 
 * This function finds out the index of the minimum element in the array from index [i, n-1]
 */
function findMinElement(arr, i){
    let min_idx_el = i; //initially the first number is min.
    for(let j = i+1; j < arr.length; j++){
        if(arr[j] < arr[min_idx_el]){
            //if the current index is smaller than the assumed minimum element, we update the assumed min element
            min_idx_el = j;
        }
    }
    return min_idx_el;
}

const arr = [5,4,3,2,1];
selectionSort(arr);
console.log(arr);