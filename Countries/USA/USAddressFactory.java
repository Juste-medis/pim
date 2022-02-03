package Countries.USA;

import General.Address;
import General.AddressFactory;
import General.PhoneNumber;

public class USAddressFactory implements AddressFactory {
    // pas de paramètre si c'etait le premier gros point
    public Address createAddress(String street, String city, String region) {
        return new USAddress();
    }

    // pas de paramètre si c'etait le premier gros point
    public PhoneNumber createPhoneNumber(String phone) {
        return new USPhoneNumber();

    }
}