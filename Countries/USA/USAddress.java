package Countries.USA;

import General.Address;

public class USAddress extends Address {

    public USAddress() {
        super(null, null, null);
    }

    public USAddress(String street, String city, String region) {
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