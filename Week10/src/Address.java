/* Superclass for address information */
public class Address {
/* Variable declaration */
	String address1;
	String address2;
	String address3;
	String city;
	String state;
	String zipCode;
	String country;

/* Default constructor */
public Address() {}

/* Variable constructor */
public Address(String _address1, String _address2, String _address3,
		String _city, String _state, String _zipCode, String country)
	{
		address1 = _address1;
		address2 = _address2;
		address3 = _address3;
		city = _city;
		state = _state;
		zipCode = _zipCode;		
	}


}


