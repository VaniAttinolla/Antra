package oops;

public class Store {
	 private String name;
	 private String address;
	 public Store(String theName, String theAddress)
	 {
	 this.name = theName;
	 this.address = theAddress;
	 }
	 
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() { return this.name + "\n" + this.address; }
	 public static void main(String[] args)
	 {
	 Store myStore = new Store("Barb's Store ", " 333 Main St.");
	 System.out.print(myStore);
	 myStore.setName("Barbara's Store");
	 myStore.setAddress("555 Pine St.");
	 System.out.println(myStore);
	 }
	}
	


