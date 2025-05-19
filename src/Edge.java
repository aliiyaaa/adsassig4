public class Edge<T> {
    private Vertex<T> source;
    private Vertex<T> destination;
    private double weight;

    public Edge(Vertex<T> source, Vertex<T> destination) {
        this(source, destination, 1.0);
    }

    public Edge(Vertex<T> source, Vertex<T> destination, double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex<T> getSource() {
        return source;
    }

    public Vertex<T> getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }
}
