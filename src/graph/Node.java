package graph;

/**
 * A node in a graph.
 * 
 * @author NextLegacy
 */
public class Node<T>
{
    boolean visited;
    T data;

    public Node(T data)
    {
        this.data = data;
    }

    public T data() { return data; }

    public void setData(T data) { this.data = data; }
}
