class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        HashMap<Integer, Integer> hm = new HashMap();
        for (var num : nums2) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> lst = new ArrayList();
        for (int i = 0; i < nums1.length; i++) {
            int freq = hm.getOrDefault(nums1[i], 0);
            if (freq > 0) {
                lst.add(nums1[i]);
                hm.put(nums1[i], freq-1);
            }
        }
        return lst.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}