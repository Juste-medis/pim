package Countries.FRANCIA;

import General.Address;

public class FRANCIAddress extends Address {
    public FRANCIAddress(String street, String city, String region) {
        super(street, city, region);
    }

    private static final String COUNTRY = "UNITED STATES";
    private static final String COMMA = ",";

    public String getCountry() {
        return COUNTRY;
    }

    public String getFullAddress() {

        return getStreet() + EOL_STRING +

                getCity() + COMMA + SPACE + getRegion() +

                SPACE + getPostalCode() + EOL_STRING +

                COUNTRY + EOL_STRING;

    }
}