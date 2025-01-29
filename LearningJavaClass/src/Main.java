import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String zoneInput = input.nextLine();
        String stateInput = input.nextLine();

        for (GeoPoliticalZones zone : GeoPoliticalZones.values() ) {
            // output => NORTHEAST NORTHWEST SOUTHEAST ...
            for (String state : zone.getGeoZones()) {
                // output => "Benue", "FCT" ... "Ogun", "Oyo"
//                if (zone.name().equals(zoneInput)) {
//                    System.out.println(state);
//                }
                if(state.equals(stateInput)) {
                    System.out.println(zone);
                }
            }
        }
    }
}