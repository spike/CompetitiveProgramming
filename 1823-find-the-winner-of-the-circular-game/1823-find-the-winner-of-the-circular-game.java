class Solution {
    public int findTheWinner(int n, int k) {
        int ejected = 0;
        int countDown = 0;
        Deque<Integer> circle = new ArrayDeque<Integer>(n);
        for (int i = 1; i <= n; i++) {
            circle.addLast(i);
        }
        while (!circle.isEmpty()) {
            countDown = k-1;
            while (!circle.isEmpty() && countDown > 0) {
                circle.addLast(circle.removeFirst());
                countDown--;
            }
            ejected = circle.removeFirst();
        }
        return ejected;
    }
}   // brute force simulation
    // Time: O(k * n), Space O(n)