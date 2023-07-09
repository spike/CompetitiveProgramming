class Solution {
public:
    int search(vector<int>& nums, int target) {
        int lo = -1; 
        int hi = nums.size(); 
        while (hi - lo > 1) { 
            int mid = lo + (hi - lo) / 2; 
            if (nums[mid] <= target) { 
                lo = mid; 
            } else { 
                hi = mid; 
            } 
        } 
        if (lo >= 0 && lo < nums.size() 
            && nums[lo] == target) 
            return lo; 
        else 
            return -1; 
    }
};