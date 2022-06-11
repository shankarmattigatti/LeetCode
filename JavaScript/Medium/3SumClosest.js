// 16. 3Sum Closest

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var threeSumClosest = function(nums, target) {
    if(nums == null || nums.length < 2)
            return -1;
        
    nums.sort((a, b) => a - b);
    let smallestDiff = 2147483647;
    for (let i = 0; i < nums.length - 2; i++) {
        let low = i + 1, high = nums.length - 1;
        while (low < high) {
            let diff = target - nums[i] - nums[low] - nums[high];
            if (diff == 0)
                return target - diff;

            if(Math.abs(diff) < Math.abs(smallestDiff) || (Math.abs(diff) == Math.abs(smallestDiff) && diff > smallestDiff))
                smallestDiff = diff;

            if(diff > 0)
                low++;
            else
                high--;
        }
    }
    
    return target - smallestDiff;
};