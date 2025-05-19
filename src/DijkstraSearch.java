import java.util.*;

public class DijkstraSearch<T> extends Search<T> {
    private final Map<Vertex<T>, Double> dist;

    public DijkstraSearch(WeightedGraph<T> graph, Vertex<T> source) {
        super(source);
        dist = new HashMap<>();

        for (Vertex<T> v : graph.getVertices()) {
            dist.put(v, Double.POSITIVE_INFINITY);
        }
        dist.put(source, 0.0);

        PriorityQueue<Vertex<T>> pq = new PriorityQueue<>(Comparator.comparingDouble(dist::get));
        pq.add(source);

        while (!pq.isEmpty()) {
            Vertex<T> current = pq.poll();
            marked.add(current);

            for (Map.Entry<Vertex<T>, Double> entry : graph.getAdjacencyList(current).entrySet()) {
                Vertex<T> neighbor = entry.getKey();
                double weight = entry.getValue();

                double newDist = dist.get(current) + weight;
                if (newDist < dist.get(neighbor)) {
                    dist.put(neighbor, newDist);
                    edgeTo.put(neighbor, current);
                    pq.add(neighbor);
                }
            }
        }
    }
}
