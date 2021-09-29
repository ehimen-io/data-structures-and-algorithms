package datastructures;

import java.util.ArrayList;

public class Vertex {
    String data;
    ArrayList<Edge> edges;

    public Vertex(String data) {
        this.data = data;
        this.edges = new ArrayList<Edge>();
    }

    // Adds a new edge to the edge list
    public void addEdge(Vertex newVertex) {
        this.edges.add(new Edge(newVertex));
    }

    // Adds a new edge to the edge list
    public void addEdge(int cost, Vertex newVertex) {
        this.edges.add(new Edge(cost, newVertex));
    }

    // Returns the index of the edge between this and endVertex. Returns -1 if no
    // edge is found
    public int findEdge(Vertex endVertex) {
        int found = -1;

        for (int i = 0; i < this.edges.size(); i++) {
            if (this.edges.get(i).endVertex == endVertex) {
                found = i;
                break;
            }
        }
        return found;
    }

    // Returns the cost of the edge between this and endVertex. Returns -1 if no
    // edge is found
    public int getCost(Vertex endVertex) {
        int index = this.findEdge(endVertex);
        if (index == -1) {
            return -1;
        } else {
            return this.edges.get(index).cost;
        }
    }

}
