public class Flights {
    private String code;
    private City soure;
    private City destination;
    private DayOfWeek day;
    private Time departTime;

    public Flights(String code, City soure, City destination,DayOfWeek day,  Time departTime) {
        this.code = code;
        this.soure = soure;
        this.destination = destination;
        this.day = day;
        this.departTime = departTime;
    }

    public String getCode() {
        return code;
    }

    public City getSoure() {
        return soure;
    }

    public City getDestination() {
        return destination;
    }

    public Time getDepartTime() {
        return departTime;
    }
    
    public DayOfWeek getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Flights [" + code + ", " + soure + " to " + destination + ", " + day
                + ", Time=" + departTime + "]";
    }
    
    

}
