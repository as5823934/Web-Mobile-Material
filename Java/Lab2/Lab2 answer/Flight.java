package ch5_pp;

public class Flight {
    private String flightName, flightOrigin, destination;
    private int flightNumber;

    public Flight (String flightName, int flightNumber, String flightOrigin, String destination) {
        this.flightName = flightName;
        this.flightNumber = flightNumber;
        this.flightOrigin = flightOrigin;
        this.destination = destination;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightOrigin() {
        return flightOrigin;
    }

    public void serFlightorigin(String flightOrigin) {
        this.flightOrigin = flightOrigin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight Name : " + flightName + " Flight Number : " + flightNumber + " From : " + flightOrigin +
                " To : " + destination;
    }
}
