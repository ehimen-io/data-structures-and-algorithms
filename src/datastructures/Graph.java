package datastructures;

import java.util.ArrayList;

public class Graph {
    ArrayList<Vertex> vertices;
    boolean directed;

    public Graph() {
        this(false);
    }

    public Graph(boolean directed) {
        this.vertices = new ArrayList<Vertex>();
        this.directed = directed;
    }

    public Vertex addVertex(Vertex newVertex) {
        this.vertices.add(newVertex);
        return newVertex;
    }

    // Adds an edge between vertex1 and vertex2, with an optional cost for the edge
    public void addEdgeBetween(Vertex vertex1, Vertex vertex2, int cost) {
        if (this.vertices.contains(vertex1) && this.vertices.contains(vertex2)) {
            vertex1.addEdge(cost, vertex2);
            if (!directed) {
                vertex2.addEdge(cost, vertex1);
            }
        } else {
            System.out.println("Invalid vertices");
        }
    }

    // Adds an edge between vertex1 and vertex2
    public void addEdgeBetween(Vertex vertex1, Vertex vertex2) {
        this.addEdgeBetween(vertex1, vertex2, 0);
    }

    // Remove an edge between vertex1 and vertex2, if it exists
    public void removeEdgeBetween(Vertex vertex1, Vertex vertex2) {
        if (this.vertices.contains(vertex1) && this.vertices.contains(vertex2)) {
            boolean success = vertex1.removeEdge(vertex2);
            if (!success) {
                System.out.println("Edge does not exist");
            } else if (!directed) {
                vertex2.removeEdge(vertex1);
            }
        } else {
            System.out.println("Invalid vertices");
        }
    }

    // Prints a string representation of the adjacency list
    public void print() {
        for (Vertex vertex : this.vertices) {
            System.out.println(vertex.data + " --> " + vertex.printEdges());
        }
    }

}
