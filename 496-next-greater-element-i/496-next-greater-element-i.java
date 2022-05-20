class Solution {
    // Time: O(n ** 2), Space: O(n) n being length of nums2
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < nums2.length; i++) {
            int next = -1;
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    next = nums2[j];
                    break;
                }
            }
            hm.put(nums2[i], next);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = hm.get(nums1[i]);
        }
        return nums1;
    }
        // Brute force: Time: O(n ** 3), Space: O(1)
/*    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int nextGreaterElement = -1;
            for (int j = 0; j < nums2.length-1; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j+1; k < nums2.length; k++) {
                        if (nums2[k] > nums1[i]) {
                            nextGreaterElement = nums2[k];
                            break;
                        }
                    }
                }    
            }
            nums1[i] = nextGreaterElement;
        }
        return nums1;
    } */
}