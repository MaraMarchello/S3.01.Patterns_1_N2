package interfaces;

import classes.Address;
import classes.PhoneNumber;

public interface AddressFactory {
	Address createAddress(String street, String city, String postalCode, String region);

	PhoneNumber createPhoneNumber(String areaCode, String number);

	String getCountryName();
}
