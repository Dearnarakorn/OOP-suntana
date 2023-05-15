abstract class PlaneSeating {
    protected char[][] seating;
    protected String planeType;

    public void showSeating(){
        for(int row = 0; row<seating.length; row++){
            System.out.printf("row %d --> " , row+1);
            for(char col : seating[row]){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public abstract boolean reserveSeat(int row, int col);    
}
