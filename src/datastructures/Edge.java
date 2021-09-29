package datastructures;

public class Edge {
    int cost;
    Vertex endVertex;

    public Edge(Vertex endVertex) {
        this.endVertex = endVertex;
    }

    public Edge(int cost, Vertex endVertex) {
        this(endVertex);
        this.cost = cost;
    }
}
