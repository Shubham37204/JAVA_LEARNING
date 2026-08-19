import java.util.*;

void main() {
    int n = 4;

    List<List<Integer>> graph = new ArrayList<>();

    // Create list for every vertex
    for (int i = 0; i < n; i++) {
        graph.add(new ArrayList<>());
    }

    // Add edges
    graph.get(0).add(1);
    graph.get(1).add(0);

    graph.get(0).add(2);
    graph.get(2).add(0);

    graph.get(1).add(3);
    graph.get(3).add(1);

    // Print graph
    for (int i = 0; i < n; i++) {
        System.out.println(i + " -> " + graph.get(i));
    }
}
