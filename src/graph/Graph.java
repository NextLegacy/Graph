package graph;

import static graph.utils.ArrayUtils.*;

public class Graph<T>
{
    private Node<T>[] nodes;
    private Edge<T>[] edges;

    public void addNode(Node<T> node, double weight)
    {
        if (contains(nodes, node))
            throw new IllegalArgumentException("Node " + node + " is already a node of " + this + ".");

        nodes = push(nodes, node);
    }

    public void removeNode(Node<T> node)
    {
        nodes = remove(nodes, node);
        
        final Edge<T>[] edgesToNode = filter(edges, edge -> edge.to() == node || edge.from() == node);

        edges = remove(edges, edgesToNode);
    }

    public void addEdge(Edge<T> edge)
    {
        if (contains(edges, edge))
            throw new IllegalArgumentException("Edge " + edge + " is already an edge of " + this + ".");

        if (!contains(nodes, edge.from()))
            throw new IllegalArgumentException("Node " + edge.from() + " is not a node of " + this + ".");

        if (!contains(nodes, edge.to()))
            throw new IllegalArgumentException("Node " + edge.to() + " is not a node of " + this + ".");

        edges = push(edges, edge);
    }

    public void removeEdge(Edge<T> edge)
    {
        edges = remove(edges, edge);
    }
}
