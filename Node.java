public class Node {
    private int val;
    private int weight;

    public Node() {
        val = 0;
        weight = 0;
    }

    public Node(int init) {
        val = init;
    }

    public int getVal() {
        return val;
    }

    public int getWeight() {
        return weight;
    }

    public void merge(Node n) {
        if (n.getVal() == val) {
            val*=2;
            n.setEmpty();
            // Increase this node's value and set the node "merging into" to inactive
            // Now, does this work considering n is method-specific?
        }
    }

    public void calculateWeight() {
        
    }

    public boolean isEmpty() {
        return val == 0;
    }

    public String toString() {
        if (val == 0) {
            return "x";
        }
        return "" + val;
    }

    public void setEmpty() {
        val = 0;
        weight = 0;
    }
}
