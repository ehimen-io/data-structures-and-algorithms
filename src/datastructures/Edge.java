package datastructures;

public class Edge {
    int cost;
    Vertex endVertex;

    public Edge(Vertex endVertex) {
        this(0, endVertex);
    }

    public Edge(int cost, Vertex endVertex) {
        this.endVertex = endVertex;
        this.cost = cost;
    }
}
