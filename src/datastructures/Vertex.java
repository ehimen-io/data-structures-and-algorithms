package datastructures;

import java.util.ArrayList;

public class Vertex {
    String data;
    ArrayList<Edge> edges;

    public Vertex(String data) {
        this.data = data;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Vertex newVertex) {
        this.edges.add(new Edge(newVertex));
    }

    public void addEdge(int cost, Vertex newVertex) {
        this.edges.add(new Edge(cost, newVertex));
    }

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

    public int getCost(Vertex endVertex) {
        int index = this.findEdge(endVertex);
        if (index == -1) {
            return -1;
        } else {
            return this.edges.get(index).cost;
        }
    }

}
