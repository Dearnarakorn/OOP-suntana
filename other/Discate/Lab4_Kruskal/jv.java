import java.util.*;
class Edge{
    private int degree;
    private String start;
    private String end;

    public Edge(String[] str){
        degree = Integer.parseInt (str[0]);
        start = str[1];
        end = str[2];
    }
    public int getDegree(){return degree;}
    public String getStart(){return start;}
    public String getEnd(){return end;}
    public String toString(){
        return degree + " " + start + " " + end;
    }
};
class Node{
    private String name;
    private Map<Node, Integer> parents;

    public Node(String name){
        this.name = name;
        parents = new HashMap<>();
    }

    public String getName(){return name;}

    public Map<Node, Integer> getParents(){return parents;}

    public void addParent(Node parent , int degree){
        if(parents.containsKey(parent)) return;
        parents.put(parent, degree);
        parent.addParent(this, degree);
    }

    public void printNode(){
        System.out.print(name + " : ");
        for(Map.Entry<Node, Integer> p : parents.entrySet()){
            System.out.print(p.getKey().getName() + "(" + p.getValue() + ") ");
        }
    }
};

public class jv {
    
    static boolean findParent(Node node, String target, String pre) {
        if (node.getName().equals(target)) return false;
        for (Map.Entry<Node, Integer> p : node.getParents().entrySet()) {
            if (p.getKey().getName().equals(pre))
                continue;
            if (!findParent(p.getKey(), target, node.getName())) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] str1 = {"355 Minneapolis Chicaco",
                        "695 Minneapolis Nashville",
                        "74 Milviaukee Chicaco",
                        "262 Chicaco St.Louis",
                        "348 Milviaukee Louisville",
                        "269 Chicaco Louisville",
                        "242 St.Louis Louisville",
                        "151 Nashville Louisville",
                        "83 Louisville Cincinnati",
                        "230 Cincinnati Detroit",
                        "306 Detroit Louisville"};

        String[] str2 = {"1 A D",
                        "2 A B",
                        "3 B C",
                        "4 C D",
                        "5 E D",
                        "6 A E",
                        "7 E F"};

        String[] str3 = {"1 0 1",
                        "2 1 2",
                        "3 0 3",
                        "4 2 3",
                        "5 4 3",
                        "6 0 4",
                        "7 4 5"};

        List<Edge> edges = new ArrayList<>();
        for (String s : str3) {
            edges.add(new Edge(s.split(" ")));
        }
        Collections.sort(edges, Comparator.comparing(Edge::getDegree));

        for(int i = 0 ; i < edges.size() ; i++){
            System.out.println(edges.get(i).toString());
        }
        System.out.println("---------------------------");
        Map<String, Node> graph = new HashMap<>();
        for (Edge e : edges) {
            String node1 = e.getStart();
            String node2 = e.getEnd();
            int degree = e.getDegree();

            System.out.println("---" +degree+" "+ node1 +","+ node2 + "---");
            if(!graph.containsKey(node1)) {
                graph.put(node1, new Node(node1));
            }
            if(!graph.containsKey(node2)){
                graph.put(node2, new Node(node2));
            }

            if(findParent(graph.get(node1), node2, ""))
            graph.get(node1).addParent(graph.get(node2), degree);
            for(Node node : graph.values()){
                node.printNode();
                System.out.println();
            }

        }
        
    }
}
