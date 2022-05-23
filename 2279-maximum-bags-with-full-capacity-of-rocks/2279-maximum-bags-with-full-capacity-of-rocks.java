class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        List<Integer> lst = new ArrayList();
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= rocks[i]) {
                lst.add(capacity[i] - rocks[i]);
            }
        }
        Collections.sort(lst);
        int count = 0;
        int i = 0;
        while (i < lst.size() && additionalRocks > 0) {
            if (lst.get(i) <= additionalRocks) {
                additionalRocks -= lst.get(i);
                count++;
            }
            i++;
        }
        return count;
    }
}