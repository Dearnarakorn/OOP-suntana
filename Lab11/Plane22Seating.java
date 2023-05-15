class Plane22Seating extends PlaneSeating{
    public Plane22Seating(String args){
        super();
        String [] tokens = args.split(",");
        int numRow = tokens.length;
        int numCol = tokens[0].length();
        seating = new char[numRow][numCol];
        for(int i = 0; i < tokens.length; i++){
            seating[i] = tokens[i].toCharArray();
            //System.out.println("Arrays "+ Arrays.toString(seating[i]));
        }
    }
    
    private boolean isFull(){
        for (int i = 0; i < seating.length; i++) {
            for (int j = 0; j < seating[i].length; j++) {
                if (seating[i][j] == '^') {
                    return false;
                }
            }
        }
        System.out.println("this Flights is Full");
        return true;
    }

    @Override
    public boolean reserveSeat(int row, int col) { // 5 3 
        if(isFull())return false;
        row--; col--; //4 2
        int realcol = 0; 
        int c = col; 
        while(c>0){
            realcol++;
            if(seating[row][realcol] != '_')c--;
        }
        if(seating[row][realcol] == '^'){
            System.out.printf("seat %d, %d symbol is ^. Latest seat map is %n",row,col);
            seating[row][realcol] = 'x';
            showSeating();
            return true;
        }   
        showSeating();
        return false;
    }

}
