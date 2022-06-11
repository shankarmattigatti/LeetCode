// 4. Median of Two Sorted Arrays

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    const nums = nums1.concat(nums2)
    nums.sort((a, b) => a - b);
    if (((nums.length + 1) % 2 ) === 0){
         let median = (nums.length + 1)/2
         return nums[median - 1]     
     } else {
       let first = (nums.length/2) 
       let second = first + 1
      
       let med1 = nums[first - 1]
       let med2 = nums[second - 1]
       return (med1 + med2) / 2;
    }
};