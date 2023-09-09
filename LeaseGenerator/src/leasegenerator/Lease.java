//Name: Diego Gallardo
//Class: CMSY-167-N090
//Description: A program which purpose is to get information from an user in order to
//generate a lease for the new tenants coming to the new properties with the use of a stringbuilder
//to generate and display the lease.
package leasegenerator;
import java.util.concurrent.ThreadLocalRandom;

//Main "Lease" class
 class Lease {
	
	private String tenantName;
	private int aptNumb;
	private int bedNumb;
	private int aptSize;
	private double bathNumb;
	StringBuilder genLease = new StringBuilder();;
	
	//variables use to calculate the rent
	final double baseRent = 1.5;
	final int bedAdd = 300;
	final int bathAdd = 150;
	
	final int min = 100;
	final int max = 500;
	
	public static void main(String[] args) {
	//Lease default constructor
	Lease dc = new Lease();	
	}

	 //member functions to get generate and return the lease 
	 public void GetLease(String string, int aptSize, int bedNumb, double bathNumb)
	 {
			 
		 //calculate the rent on an apartment based of the tenant information.	 
		double totalRent = (aptSize * baseRent) + (bedNumb * bedAdd) + (bathNumb * bathAdd);
		
		//A code that generates a random number for the apartment
		int randomRoom = ThreadLocalRandom.current().nextInt(min, max);
		setAptNumb(randomRoom);
		 
		 //Use the stringbuilder in order to generate and return the lease information to the tenant
		 genLease.append(System.getProperty("line.separator"))
		 		 .append(string)
		 		 .append("\n\nWe are excited to have you join Fictional Apartments in Downtown Columbia. Your lease is now ready for you to review and sign.\r\n"
		 		 		+ "\r\n"
		 		 		+ "Please reach out to our office with any questions or concerns.\n\r")
		 		 .append("\nApartment: " + getAptNumb())
		 		 .append(System.getProperty("line.separator"))
		 		 .append("\nSize: " + aptSize + " sqft")
		 		 .append(System.getProperty("line.separator"))
		 		 .append("\nBedrooms: " + bedNumb)
		 		 .append(System.getProperty("line.separator"))
		 		 .append("\nBaths: " + bathNumb)
		 		 .append(System.getProperty("line.separator"))
		 		 .append("\nRent is due at the 1st of each month, parties are not allowed, etcetera.")
		 		 .append(System.getProperty("line.separator"))
		 		 .append("\nMonthly cost: $" + String.format("%.2f", totalRent))
		 		 .append(System.getProperty("line.separator"))
		 		 .append("\n\nSign here: ________________\r\n")
		 		 .append("Fictional Apartments");
 
		 System.out.println(genLease.toString());//print String Builder
		 
	 }//end of member function GetLease


	//setter and getters
	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String string) {
		this.tenantName = string;
	}

	public int getAptNumb() {
		return aptNumb;
	}

	public void setAptNumb(int aptNumb) {
		this.aptNumb = aptNumb;
	}

	public int getBedNumb() {
		return bedNumb;
	}

	public void setBedNumb(int bedNumb) {
		this.bedNumb = bedNumb;
	}

	public int getAptSize() {
		return aptSize;
	}

	public void setAptSize(int aptSIze) {
		this.aptSize = aptSIze;
	}

	public double getBathNumb() {
		return bathNumb;
	}

	public void setBathNumb(double bathNumb) {
		this.bathNumb = bathNumb;
	}
	//end of setter and getters
	
}//end of the Lease class



