import java.util.*;

void main(){

        int n = 4;

        List<List<int[]>> graph = new ArrayList<>();

        // Create a list for every vertex
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Directed weighted edges

        // 0 --5--> 1
        graph.get(0).add(new int[]{1, 5});

        // 0 --10--> 2
        graph.get(0).add(new int[]{2, 10});

        // 1 --7--> 3
        graph.get(1).add(new int[]{3, 7});

        // Print graph
        for (int i = 0; i < n; i++) {

            System.out.print(i + " -> ");

            for (int[] edge : graph.get(i)) {

                int neighbor = edge[0];
                int weight = edge[1];

                System.out.print(
                        "(" + neighbor + ", weight=" + weight + ") "
                );
            }

            System.out.println();
        }
    }
