import java.util.ArrayList;
import java.util.HashMap;

class Kruskal{
    int Matrix[][];
    HashMap<String,Integer> vertex;
    edges[] input;

    Kruskal(String[] ip){
        input= new edges[ip.length];
        for(int i=0; i<input.length; i++){input[i] = new edges(ip[i]); }
        input = Sort(input);
        setVertex(input);
        setMatrix(vertex.size());;
    }

    edges[] Sort(edges[] input){
        for(int i=0; i<input.length; i++){
            int min=i;
            for(int j=i+1; j<input.length; j++){
                if(input[min].getDistance()>input[j].getDistance()){
                    min=j;
                }
            }
            if(min != i){
                edges y = input[i];
                input[i] = input[min];
                input[min] = y;
            }
        }
        return input;
    }

    void setVertex(edges[] input){
        vertex = new HashMap<>(); 
        ArrayList<String> Strvertex = new ArrayList<>();
        for(edges ip : input){
            if(!Strvertex.contains(ip.getVertex2()))Strvertex.add(ip.getVertex2());
            if(!Strvertex.contains(ip.getVertex1()))Strvertex.add(ip.getVertex1()); 
        }
        for(int i=0; i<Strvertex.size(); i++){
            vertex.put(Strvertex.get(i), i);
        }
    }

    void setMatrix(int quantity){
        Matrix = new int[quantity][quantity];
        for(int i=0; i<input.length; i++){
            if(checkcontinue2(vertex.get(input[i].getVertex1()),vertex.get(input[i].getVertex2()), -999)){
                Matrix[vertex.get(input[i].getVertex2())][vertex.get(input[i].getVertex1())] = input[i].getDistance();
                Matrix[vertex.get(input[i].getVertex1())][vertex.get(input[i].getVertex2())] = input[i].getDistance();
                input[i].setAdd(true);
            }
        }
    }

    boolean checkcontinue2(int start, int end, int k){
        if(start == end) return false;
            for(int j=0; j<Matrix[0].length; j++){
                if(Matrix[start][j] != 0 && k != j){
                    if(!checkcontinue2(j, end ,start)){
                        return false;
                    }
                }
            }
        return true;
    }

    void printMatrix(){
        for(int i=0; i<Matrix.length; i++){
            for(int j=0; j<Matrix[i].length; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    void printAns(){
        for(edges ip : input)System.out.println(ip);
    }
}