class edges {
    private String vertex1;
    private String vertex2;
    private int distance;
    private boolean add = false;;

    edges(String edges){
        String[] str = edges.split(" "); 
        vertex1 = str[0];
        vertex2 = str[1];
        distance = Integer.parseInt(str[2]);
    }
    public String getVertex1() {
        return vertex1;
    }
    public String getVertex2() {
        return vertex2;
    }
    public int getDistance() {
        return distance;
    }
    public boolean getAdd() {
        return add;
    }
    public void setAdd(boolean add) {
        this.add = add;
    }
    String addtoString(){
        if(add)return "added";
        return "Not added";
    }
    @Override
    public String toString() {
        return vertex1+" "+vertex2+" "+distance+" "+addtoString();
    }
}


