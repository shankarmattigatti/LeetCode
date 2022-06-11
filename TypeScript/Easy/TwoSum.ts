// 1. Two Sum

function twoSum(nums: number[], target: number): number[] {
    const map: Map<number, number> = new Map();
    for (let i = 0; i < nums.length; i++) {
        const match = map.get(target - nums[i]);
        if (match !== undefined)
            return [i, match];
        else
            map.set(nums[i], i);
    }

    return [-1, -1];
}