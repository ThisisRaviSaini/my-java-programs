package org.logical.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindPassengerGoingToSameDestinationSeatClassStoredAsEnum {
    enum SeatClass {
        ECONOMY, BUSINESS, FIRST
    }

    public static void main(String[] args) {

        ArrayList<HashMap<String, Object>> listOfPassengers = new ArrayList<>();

        HashMap<String, Object> passenger = new HashMap<>();
        passenger.put("Name", "Ravi");
        passenger.put("FlightNo", 123);
        passenger.put("Class", SeatClass.ECONOMY);
        passenger.put("Destination", "Bangalore");

        HashMap<String, Object> passenger2 = new HashMap<>();
        passenger2.put("Name", "Taruna");
        passenger2.put("FlightNo", 1212);
        passenger2.put("Class", SeatClass.ECONOMY);
        passenger2.put("Destination", "Bangalore");

        HashMap<String, Object> passenger3 = new HashMap<>();
        passenger3.put("Name", "Rahul");
        passenger3.put("FlightNo", 1214);
        passenger3.put("Class", SeatClass.ECONOMY);
        passenger3.put("Destination", "Pune");

        listOfPassengers.add(passenger);
        listOfPassengers.add(passenger2);
        listOfPassengers.add(passenger3);

        Iterator<HashMap<String, Object>> itr = listOfPassengers.iterator();

        while (itr.hasNext()) {
            HashMap<String, Object> hm = itr.next();
            for (Map.Entry<String, Object> m : hm.entrySet()) {
                if (m.getValue().equals("Bangalore")) {
                    System.out.println(hm);
                }
            }
        }
    }
}
