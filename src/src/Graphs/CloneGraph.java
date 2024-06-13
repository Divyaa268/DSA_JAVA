package Graphs;

import java.util.*;


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

public class CloneGraph {
    public Node cloneGraph(Node node) {

        if(node == null)
        {
            return null;
        }

        // Map to store the original node to its clone
        Map<Node, Node> clonemap = new HashMap<>();

        // Initialize the queue for BFS
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        // Clone the root node
        clonemap.put(node, new Node(node.val));

        // BFS traversal
        while(!q.isEmpty())
        {
            Node curr = q.poll();

            // Iterate through the neighbors of the current node
            for(Node neighbor : curr.neighbors)
            {
                // If the neighbor hasn't been cloned yet
                if(!clonemap.containsKey(neighbor))
                {
                    // Clone the neighbor and add it to the map
                    clonemap.put(neighbor, new Node(neighbor.val));

                    // Add the neighbor to the queue for further processing
                    q.add(neighbor);
                }
                // Add the cloned neighbor to the neighbors list of the cloned current node
                clonemap.get(curr).neighbors.add(clonemap.get(neighbor));
            }
        }
        // Return the clone of the initial node
        return clonemap.get(node);
    }

    public static void main(String[] args) {
        CloneGraph solution = new CloneGraph();

        // Example 1
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Node clonedGraph1 = solution.cloneGraph(node1);
        // Output for the example can be verified by checking the structure of clonedGraph1

        // Example 2
        Node node = new Node(1);
        Node clonedGraph2 = solution.cloneGraph(node);
        // Output for the example can be verified by checking the structure of clonedGraph2

        // Example 3
        Node clonedGraph3 = solution.cloneGraph(null);
        // Output for the example can be verified by checking the structure of clonedGraph3
    }
}
