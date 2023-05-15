public class Main{
    public static void main(String[] args) {
        String[] input = {
            "Minneapolis Chicago 355",
            "Louisville Cincinnati 83",
            "Chicago Milwaukee 74",
            "St.Louis Louisville 242",
            "Louisville Milwaukee 348",
            "Louisville Nashville 151",
            "Chicago Louisville 269",
            "Minneapolis Nashville 695",
            "Louisville Detroit 306",
            "St.Louis Chicago 262",
            "Cincinnati Detroit 230"
        };
        Kruskal q1 = new Kruskal(input);
        q1.printMatrix();
        q1.printAns();
    }
}
