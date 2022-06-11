// 4. Median of Two Sorted Arrays

function findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    const nums: number[] = nums1.concat(nums2)
    nums.sort((a, b) => a - b);

    if (((nums.length + 1) % 2) === 0) {
        let median: number = (nums.length + 1) / 2;
        return nums[median - 1];
    } else {
        let first: number = (nums.length / 2);
        let second: number = first + 1;

        let med1: number = nums[first - 1];
        let med2: number = nums[second - 1];
        return (med1 + med2) / 2;
    }
}