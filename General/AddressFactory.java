package General;

public interface AddressFactory {
    public Address createAddress(String street, String city, String region);

    public PhoneNumber createPhoneNumber(String phone);
}
