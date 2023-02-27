package graph;

/**
 * An edge in a graph.
 * 
 * @author NextLegacy
 */
public class Edge<T>
{
    private Node<T> from;
    private Node<T> to;
    private double weight;

    public Edge(Node<T> from, Node<T> to, double weight)
    {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public Node<T> from  () { return from  ; }
    public Node<T> to    () { return to    ; }
    public double  weight() { return weight; }

    public void setFrom  (Node<T> from  ) { this.from   = from  ; }
    public void setTo    (Node<T> to    ) { this.to     = to    ; }
    public void setWeight(double  weight) { this.weight = weight; }

    @Override    
    public String toString()
    {
        return from + " -> " + to + " (" + weight + ")";
    }
}
