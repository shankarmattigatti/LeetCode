/**
 * 2251. Number of Flowers in Full Bloom
 * @param {number[][]} flowers
 * @param {number[]} people
 * @return {number[]}
 */
const fullBloomFlowers = function(flowers, people) {
    const startDates = [];
    const endDates = [];
    
    for (let flower of flowers) {
        let startDate = flower[0];
        let endDate = flower[1];
        startDates.push(startDate);
        endDates.push(endDate);
    }
    
    startDates.sort((a, b) => a - b);
    endDates.sort((a, b) => a - b);
    
    const result = [];
    for (let visitTime of people) {
        let flowersStartedBlooming = findUpperBound(startDates, visitTime);
        let flowersEndedBlooming = findLowerBound(endDates, visitTime);
        let flowersInBloom = flowersStartedBlooming - flowersEndedBlooming;
        
        result.push(flowersInBloom);
    }
    
    return result;
};

const findLowerBound = function (arr, target) {
    let left = 0, right = arr.length;
    while (left < right) {
        let middle = Math.floor((left + right) / 2);
        if (arr[middle] < target) {
            left = middle + 1;
        } else {
            right = middle;
        }
    }
    return left;
};

const findUpperBound = function (arr, target) {
    let left = 0, right = arr.length;
    while (left < right) {
        let middle = Math.floor((left + right) / 2);
        if (arr[middle] <= target) {
            left = middle + 1;
        } else {
            right = middle;
        }
    }
    return left;
};