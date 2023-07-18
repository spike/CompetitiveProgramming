/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let lo = -1;
    let hi = nums.length;
    while (hi - lo > 1) {
        let mid = Math.floor((lo + hi) / 2);
        if (nums[mid] <= target) {
          lo = mid;
        } else {
          hi = mid;
        }
    }
    if (nums[lo] == target) return lo; else return -1;
};