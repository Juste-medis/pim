package Countries.FRANCIA;

import General.Address;
import General.AddressFactory;
import General.PhoneNumber;

public class FRANCIAddressFactory implements AddressFactory {

    public Address createAddress(String street, String city, String region) {
        return new FRANCIAddress(street, city, region);
    }

    public PhoneNumber createPhoneNumber(String phone) {
        return new FRANCIAPhoneNumber(phone);

    }
}