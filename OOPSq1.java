import java.util.*;

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getregNo() {
        return regNo;
    }

    public String getpackageType() {
        return packageType;
    }

    public int getprice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public String getAgencyName() {
        return agencyName;
    }
}

public class OOPSq1 {

    static int findAgencyWithHighestPackage(TravelAgencies[] arr) {
        int max = 0;

        for (TravelAgencies agency : arr) {
            if (agency.getprice() > max) {
                max = agency.getprice();
            }
        }

        return max;
    }

    static TravelAgencies agencyDetailsforGivenIdAndType(
            TravelAgencies[] arr, int regNo, String packageType) {

        for (TravelAgencies agency : arr) {
            if (agency.isFlightFacility()
                    && agency.getregNo() == regNo
                    && agency.getpackageType().equalsIgnoreCase(packageType)) {

                return agency;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // IMPORTANT (clears buffer)

        TravelAgencies[] arr = new TravelAgencies[n];

        for (int i = 0; i < n; i++) {

            int regNo = sc.nextInt();
            sc.nextLine(); // clear buffer

            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();

            int price = sc.nextInt();
            boolean fl = sc.nextBoolean();
            sc.nextLine(); // clear buffer

            arr[i] = new TravelAgencies(regNo, agencyName, packageType, price, fl);
        }

        int regNo = sc.nextInt();
        sc.nextLine(); // clear buffer
        String packageType = sc.nextLine();

        int highestprice = findAgencyWithHighestPackage(arr);
        TravelAgencies agency = agencyDetailsforGivenIdAndType(arr, regNo, packageType);

        System.out.println(highestprice);

        if (agency != null) {
            System.out.println(agency.getAgencyName() + ":" + agency.getprice());
        } else {
            System.out.println("No Agency Found");
        }

        sc.close();
    }
}