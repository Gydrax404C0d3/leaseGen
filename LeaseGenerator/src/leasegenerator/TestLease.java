package leasegenerator;
import java.util.Scanner;

public class TestLease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner for user input
		Scanner input = new Scanner(System.in);

		Lease leaseObj = new Lease();//Lease class object 
		
		//get the lease information from user input
		System.out.print("Enter your name: \r");
		leaseObj.setTenantName(input.nextLine());
			
		System.out.print("Enter the size of the apartment (in square feet): \r");
		leaseObj.setAptSize(input.nextInt());
		
		System.out.print("Enter the number of bedrooms: \r");
		leaseObj.setBedNumb(input.nextInt());
		
		System.out.print("Enter the number of bathrooms: \r");
		leaseObj.setBathNumb(input.nextDouble());
		
		//call the GetLease function to generate and display the lease.
		leaseObj.GetLease(leaseObj.getTenantName(), leaseObj.getAptSize(), leaseObj.getBedNumb(), leaseObj.getBathNumb());
		
		input.close();// close scanner
		
	}//end of main function

}//end of TestLease class
