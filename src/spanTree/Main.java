package spanTree;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Edge {
    char u, v;

    public Edge(char u, char v) {
        this.u = u;
        this.v = v;
    }

    @Override
    public String toString() {
        return "(" + u + ", " + v + ")";
    }
}

class Graph {
    List<Character> vertices;
    List<Edge> edges;

    public Graph(List<Character> vertices, List<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    public boolean isConnected(List<Edge> treeEdges) {
        Set<Character> visited = new HashSet<>();
        dfs(treeEdges, visited, treeEdges.get(0).u);
        return visited.size() == vertices.size(); 
    }

    
    /*public void df(List<Edge> treeEdges, char vertex) {
        if (visited.contains(vertex)) return;
        visited.add(vertex);
       
        }
    }*/

    public void dfs(List<Edge> treeEdges, Set<Character> visited, char vertex) {
        if (visited.contains(vertex)) return;
        visited.add(vertex);
        for (Edge edge : treeEdges) {
            if (edge.u == vertex && !visited.contains(edge.v)) {
                dfs(treeEdges, visited, edge.v);
            }
            if (edge.v == vertex && !visited.contains(edge.u)) {
                dfs(treeEdges, visited, edge.u);
            }
        }
    }
    //to find all spanning trees, consider all subgraphs
    public List<List<Edge>> findSpanningTrees() {
        List<List<Edge>> spanningTrees = new ArrayList<>();
        int n = edges.size();
        
        for (int i = 0; i < (1 << n); i++) { //1<<n same as pow(2,n)
            List<Edge> treeEdges = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {          // checks if edge can be added. if & =0. 0010*1000=0 add it 
                    treeEdges.add(edges.get(j));
                }
                if (treeEdges.size() == vertices.size() - 1 && isConnected(treeEdges)) {
                    spanningTrees.add(treeEdges);
                }    
            }

            
        }

        return spanningTrees;
    }

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        //вертисы
        List<Character> vertices = new ArrayList<>();
        vertices.add('A');
        vertices.add('B');
        vertices.add('C');
        vertices.add('D');
        vertices.add('E');

        //рёбра
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge('A', 'B'));
        edges.add(new Edge('B', 'C'));
        edges.add(new Edge('B', 'D'));
        edges.add(new Edge('C', 'D'));
        edges.add(new Edge('C', 'E'));

        Graph graph = new Graph(vertices, edges);

        List<List<Edge>> spanningTrees = graph.findSpanningTrees();

        int totalSpanningTrees = 0;
        for (List<Edge> tree : spanningTrees) {
            totalSpanningTrees += graph.factorial(tree.size());
        }

        System.out.println("amount: " + totalSpanningTrees);
        
        System.out.println("spanning trees:");
        for (List<Edge> tree : spanningTrees) {
            System.out.println("Spanning Tree: " + tree);
        }
        System.out.println("And other combinations with permutations");
    }
}
