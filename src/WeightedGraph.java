import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeightedGraph<T> {
    private final Set<Vertex<T>> vert = new HashSet<>();

    public Map<Vertex<T>, Double> getAdjacencyList(Vertex<T> vertex) {
        return vertex.getAdjacentVertices();
    }

    public void addVertex(Vertex<T> vertex) {
        vert.add(vertex);
    }

    public void addEdge(Vertex<T> source, Vertex<T> dest, double weight) {
        vert.add(source);
        vert.add(dest);
        source.addAdjacentVertex(dest, weight);
    }

    public Set<Vertex<T>> getVertices() {
        return vert;
    }
}
