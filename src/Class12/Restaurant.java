package Class12;



public class Restaurant {

    public static void main(String[] args) {
        Restaurant r1 = new Restaurant("Golden Gate", 100);


        r1.seatsParty(60);
        r1.removeParty(30);
        r1.availableSeats(40);
        r1.restaurantSummary();
    }

    private String name;
    private int maxGuestCapacity;
    private int currentGuestCount;
    private int totalGuestsSoFar;
    private boolean availableSeats;
    private int numOfAvailableSeats;


    public Restaurant(String restaurantName, int maxCapacity) {
        name = restaurantName;
        maxGuestCapacity = maxCapacity;
        numOfAvailableSeats = maxCapacity;
    }

    public boolean availableSeats(int numOfAvailableSeats) {

        if (numOfAvailableSeats <= maxGuestCapacity - currentGuestCount && numOfAvailableSeats > 0) {
            System.out.println(numOfAvailableSeats + " seats are available in the restaurant");
        } else if (numOfAvailableSeats > maxGuestCapacity){
            System.out.println("Our restaurant is fully booked");
        } else {
            System.out.println(numOfAvailableSeats + " seats are not available at this moment");
        }
        return availableSeats;
    }

    public void seatsParty(int numOfPartyPeople) {
        if (numOfPartyPeople <= numOfAvailableSeats && numOfPartyPeople >= 0){
            totalGuestsSoFar += numOfPartyPeople;
            currentGuestCount += numOfPartyPeople;
            numOfAvailableSeats = maxGuestCapacity - currentGuestCount;
        } else {
            System.out.println("Our restaurant has only " + numOfAvailableSeats + " seats, we can't seat " + numOfPartyPeople + " guests");
        }
    }

    public void removeParty(int removePartyPeople) {
        if (removePartyPeople >= 0 && removePartyPeople <= currentGuestCount) {
            currentGuestCount -= removePartyPeople;
            numOfAvailableSeats += removePartyPeople;
        } else {
            System.out.println("All guests left our restaurant");
        }
    }

    public void restaurantSummary(){
        System.out.println("\nRestaurant Name: " + name +
                "\nRestaurant max capacity: " + maxGuestCapacity +
                "\nCurrent guest count: " + currentGuestCount +
                "\nTotal guests served so far: " + totalGuestsSoFar);
    }
}

