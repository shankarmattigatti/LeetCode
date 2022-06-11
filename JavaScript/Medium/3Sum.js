// 15. 3Sum

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    nums.sort((a, b) => a - b);
    let result = new Array();
    for (let i = 0; i < nums.length - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1])
            continue;

        let targetSum = -nums[i];
        let low = i + 1, high = nums.length - 1;
        while (low < high) {
            let currentSum = nums[low] + nums[high];
            if (currentSum == targetSum) {
                result.push([-targetSum, nums[low], nums[high]]);
                low++;
                high--;
                while (low < high && nums[low] == nums[low - 1])
                    low++;

                while (low < high && nums[high] == nums[high + 1])
                    high--;

            } else if(targetSum > currentSum) {
                low++;
            } else {
                high--;
            }
        }
    }
    
    return result;
};