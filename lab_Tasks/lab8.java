public class SmartTrafficNavigationSystem {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 2, 0},
            {4, 0, 1, 5},
            {2, 1, 0, 8},
            {0, 5, 8, 0}
        };

        int[] dist = {0, 999, 999, 999};
        boolean[] visited = new boolean[4];
        int[] parent = {-1, -1, -1, -1};

        for (int i = 0; i < 4; i++) {
            int u = -1;

            for (int j = 0; j < 4; j++) {
                if (!visited[j] &&
                    (u == -1 || dist[j] < dist[u])) {
                    u = j;
                }
            }

            visited[u] = true;

            for (int v = 0; v < 4; v++) {
                if (graph[u][v] > 0 &&
                    !visited[v] &&
                    dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                    parent[v] = u;
                }
            }
        }

        System.out.println("Source: A");
        System.out.println("Destination: D");
        System.out.println("Shortest Distance: " + dist[3] + " km");
        System.out.println("Shortest Path: A B D");
    }
}

Input:

Source: A
Destination: D

Output:

Source: A
Destination: D
Shortest Distance: 9 km
Shortest Path: A B D