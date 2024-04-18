import java.util.ArrayList;
import java.util.List;

public class Visit2 {
    
    public static int sum(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public static void main(String[] args) {
        int[] xCor = {0, 10, 20, 50, 100, 30};
        int[] yCor = {0, 10, 20, 50, 100, 30};
        
        List<Integer> xCoordinates = new ArrayList<>();
        List<Integer> yCoordinates = new ArrayList<>();
        for (int i = 0; i < xCor.length; i++) {
            xCoordinates.add(xCor[i]);
            yCoordinates.add(yCor[i]);
        }
        
        List<Integer> minPath = nearestNeighbor(xCoordinates, yCoordinates);
        int minCost = calculateTotalCost(minPath, xCoordinates, yCoordinates);
        
        System.out.println("Minimum cost: " + minCost);
        System.out.println("Minimum path: " + minPath);
    }
    
    // Nearest Neighbor Algorithm to find an approximate solution
    public static List<Integer> nearestNeighbor(List<Integer> xCoordinates, List<Integer> yCoordinates) {
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[xCoordinates.size()];
        
        // Start at the first point (0, 0)
        int startPoint = 0;
        path.add(startPoint);
        visited[startPoint] = true;
        
        // Repeat until all points are visited
        while (path.size() < xCoordinates.size()) {
            int lastVisited = path.get(path.size() - 1);
            int minDistance = Integer.MAX_VALUE;
            int nearestNeighbor = -1;
            
            // Find the nearest unvisited neighbor from the last visited point
            for (int i = 0; i < xCoordinates.size(); i++) {
                if (!visited[i]) {
                    int distance = sum(xCoordinates.get(lastVisited), yCoordinates.get(lastVisited), 
                                       xCoordinates.get(i), yCoordinates.get(i));
                    if (distance < minDistance) {
                        minDistance = distance;
                        nearestNeighbor = i;
                    }
                }
            }
            
            // Mark the nearest neighbor as visited and add it to the path
            visited[nearestNeighbor] = true;
            path.add(nearestNeighbor);
        }
        
        // Add the starting point to complete the cycle
        // path.add(startPoint);
        
        return path;
    }
    
    // Function to calculate the total cost of a path
    public static int calculateTotalCost(List<Integer> path, List<Integer> xCoordinates, List<Integer> yCoordinates) {
        int totalCost = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            totalCost += sum(xCoordinates.get(path.get(i)), yCoordinates.get(path.get(i)), 
                             xCoordinates.get(path.get(i + 1)), yCoordinates.get(path.get(i + 1)));
        }
        return totalCost;
    }
}
