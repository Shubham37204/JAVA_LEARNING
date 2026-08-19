//class Solution {
//
//    public ArrayList<Integer> bfsOfGraph(
//            int V,
//            ArrayList<ArrayList<Integer>> adj) {
//
//        ArrayList<Integer> bfs = new ArrayList<>();
//
//        boolean[] visited = new boolean[V];
//
//        Queue<Integer> q = new LinkedList<>();
//
//        // Start from node 0
//        q.add(0);
//        visited[0] = true;
//
//        while (!q.isEmpty()) {
//
//            int node = q.remove();
//
//            bfs.add(node);
//
//            // Visit all neighbors
//            for (int neighbor : adj.get(node)) {
//
//                if (!visited[neighbor]) {
//
//                    visited[neighbor] = true;
//
//                    q.add(neighbor);
//                }
//            }
//        }
//
//        return bfs;
//    }
//}

//-----------------------

//class Solution {
//
//    public ArrayList<Integer> dfsOfGraph(
//            int V,
//            ArrayList<ArrayList<Integer>> adj) {
//
//        ArrayList<Integer> dfs = new ArrayList<>();
//
//        boolean[] visited = new boolean[V];
//
//        dfsHelper(0, adj, visited, dfs);
//
//        return dfs;
//    }
//
//
//    private void dfsHelper(
//            int node,
//            ArrayList<ArrayList<Integer>> adj,
//            boolean[] visited,
//            ArrayList<Integer> dfs) {
//
//        // Mark current node visited
//        visited[node] = true;
//
//        // Add current node to answer
//        dfs.add(node);
//
//        // Visit all neighbors
//        for (int neighbor : adj.get(node)) {
//
//            if (!visited[neighbor]) {
//
//                dfsHelper(neighbor, adj, visited, dfs);
//            }
//        }
//    }
//}