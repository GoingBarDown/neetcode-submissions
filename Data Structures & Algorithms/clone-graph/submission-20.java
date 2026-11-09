/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
    HashMap<Node, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    public Node dfs(Node node, HashMap<Node, Node> hash) {
        if (node == null) {
            return null;
        }

        if (hash.containsKey(node)) {
            // if alreadu cloned, simply return the clone 
            return hash.get(node); 
        }

        // Code after this is for creating a clone
        Node copy = new Node(node.val);
        hash.put(node, copy);

        for (Node nei : node.neighbors) {
           copy.neighbors.add(dfs(nei, hash));
        }
        return copy;

    }
}