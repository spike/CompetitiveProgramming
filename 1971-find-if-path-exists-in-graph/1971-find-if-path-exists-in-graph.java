class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, HashSet<Integer>> adj = new HashMap();
        for (int i = 0; i < n; i++) adj.put(i, new HashSet());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return dfs(adj, source, destination);
    }
    private boolean dfs(HashMap<Integer, HashSet<Integer>> adj, int s, int t) {
        if (s == t) return true;
        if (!adj.containsKey(s)) return false;
        HashSet<Integer> currentList = adj.get(s);
        adj.remove(s);
        for(var node : currentList) {
            if (dfs(adj, (int)node, t)) return true;
        }
        return false;
    }
 }