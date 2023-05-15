public class FlightsReservation{
    private Flights flights;
    private PlaneSeating seating;
    
    public FlightsReservation(Flights flights) {
        this.flights = flights;
        seating = new Plane22Seating("xx_xx,xx_x^,^x_xx,x^_xx,xx_^x");
    }

    public boolean reserveSeat(int row, int col) {
        return seating.reserveSeat(row, col);
    }

    public void showSeating(){
        System.out.println(flights);
        seating.showSeating();
    }

}
