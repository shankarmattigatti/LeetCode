/**
 * 34. Find First and Last Position of Element in Sorted Array
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const searchRange = function(nums, target) {
    let firstPos = findFirstPosition(nums, target);
    if(firstPos == -1)
        return [-1, -1];
    
    let lastPos = findLastPosition(nums, target);
    return [firstPos, lastPos];
};

    
const findFirstPosition = function (arr, target) {
    let low = 0, high = arr.length - 1, index = -1;
    while (low <= high) {
        let mid = Math.floor(low + (high - low) / 2);
        
        if (arr[mid] == target) {
            index = mid;
            high = mid - 1;
        } else if(target < arr[mid]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return index;
}
    
const findLastPosition = function (arr, target) {
    let low = 0, high = arr.length - 1, index = -1;
    while (low <= high) {
        let mid = Math.floor(low + (high - low) / 2);
        
        if (arr[mid] == target) {
            index = mid;
            low = mid + 1;
        } else if(target < arr[mid]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return index;
}