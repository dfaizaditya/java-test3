import java.util.*;

public class TSP {
    static int[][] dist = {
        { 0, 0, 0, 0, 0 },    { 0, 0, 10, 15, 20 },
        { 0, 10, 0, 25, 25 }, { 0, 15, 25, 0, 30 },
        { 0, 20, 25, 30, 0 },
    };

    public static List<Integer> nearestNeighbor(int[][] distances) {
        int n = distances.length;
        List<Integer> tour = new ArrayList<>();
        boolean[] visited = new boolean[n];

        // Start from vertex 0
        tour.add(0);
        visited[0] = true;

        for (int i = 0; i < n - 1; i++) {
            int currentCity = tour.get(i);
            int nearestCity = -1;
            int minDistance = Integer.MAX_VALUE;

            // Find the nearest unvisited city
            for (int j = 0; j < n; j++) {
                if (!visited[j] && distances[currentCity][j] < minDistance) {
                    minDistance = distances[currentCity][j];
                    nearestCity = j;
                }
            }

            // Add the nearest city to the tour
            tour.add(nearestCity);
            visited[nearestCity] = true;
        }

        // Return to the starting city to complete the tour
        tour.add(0);
        return tour;
    }

    public static int calculateCost(List<Integer> tour, int[][] distances) {
        int cost = 0;
        for (int i = 0; i < tour.size() - 1; i++) {
            int from = tour.get(i);
            int to = tour.get(i + 1);
            int legCost = distances[from][to];
            System.out.println("Cost from " + from + " to " + to + ": " + legCost);
            cost += legCost;
        }
        return cost;
    }

    public static void main(String[] args) {
        List<Integer> tour = nearestNeighbor(dist);
        int cost = calculateCost(tour, dist);
        System.out.println("Approximate TSP tour: " + tour);
        System.out.println("Total cost: " + cost);
    }
}
