package spring9;

public class Contact
{
	int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	String name;
	String phone;
	String address;

	public Contact()
	{
	}

	public Contact(String name, String phone, String address)
	{
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
}

