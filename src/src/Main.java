package src;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
							////Person model////
		System.out.println("====Person Model====");
		Person myPerson = new Person("Usaid");
		System.out.println("====================");
			System.out.println("\n");
		
		
		
							////Rectangle model////
		System.out.println("====Rectangle Model====");
		Rectangle myRectangle = new Rectangle(6, 10);
		System.out.println("=======================");
			System.out.println("\n");

		
		
		
							////Student model////	
		System.out.println("====Student Model====");
		Student myStudent = new Student("Usaid", 25);
		System.out.println("=====================");
			System.out.println("\n");
		
		
		
		
		 					////Bank model////		
		System.out.println("====Bank Model====");
		BankAccount myBankAccount = new BankAccount("Usaid", 800);
			System.out.println("Initial balance: " + myBankAccount.getBalance());
			myBankAccount.deposit(200);
			System.out.println("After Deposit: " + myBankAccount.getBalance());
			myBankAccount.withdraw(2000);
			System.out.println("After Withdrawal: " + myBankAccount.getBalance());
		System.out.println("===================");
			System.out.println("\n");
		
		
		
		
		
							////Car model////
			System.out.println("====Car Model====");
		Car myCar = new Car("Toyota", "Corolla", 2006);
		
			myCar.start();
			myCar.stop();
			myCar.stop();
			myCar.start();
			myCar.start();
			System.out.println("==================");
			System.out.println("\n");
			
		
		
		
		
							////Employee model////
			System.out.println("====Employee Model====");
		Employee myEmployee = new Employee("Usaid","software dev", 250);
		
			System.out.println("Employee Name: " + myEmployee.getEmpName());
			System.out.println("Job: " + myEmployee.getJobTitle());
			System.out.println("Salary: "+ myEmployee.getEmpSalary());
			System.out.println("======================");
			System.out.println("\n");
		
		
		
		
							////Book model////
			System.out.println("====Book Model====");
		Book mybook = new Book("Food", "Need Food", 2023);
		
			System.out.println("Book Title: " + mybook.getTitle());
			System.out.println("Book Author: " + mybook.getAuthor());
			System.out.println("Publication Year: " + mybook.getPublicationYear());
			System.out.println("==================");
			System.out.println("\n");
		
		
							////Bank model////
			System.out.println("====Bank Model====");
		Bank myBank = new Bank("Oman", 110000);
		
			System.out.println("Bank: " + myBank.getBankName());
			System.out.println("Number of Assets: " + myBank.getTotalAssets());
			System.out.println("==================");
			System.out.println("\n");
		
		
		
		
							////Dog model////
			System.out.println("====Dog Model====");
		Dog myDog = new Dog("Tom", 10);
		
			System.out.println("Dog name: " + myDog.getDogName());
			System.out.println("Dog Age: " + myDog.getDogAge());
			System.out.println("=================");
			System.out.println("\n");
		
		
		
		
							////Movie model////
			System.out.println("====Movie Model====");
		Movie myMovie = new Movie("Amistad", "Steven Spielberg", 1997);
				
				System.out.println("Movie Title: " + myMovie.getTitle());
				System.out.println("Movie Director: " + myMovie.getDirector());
				System.out.println("Release Year: " + myMovie.getReleaseYear());
			System.out.println("===================");
				System.out.println("\n");
				
				
				
							////Address model////
				System.out.println("====Address Model====");
		Address myAddress = new Address("Mazoun", "Muscat", "Al Seeb", 135);
		
				System.out.println("Street Address :" + myAddress.getStreetAddress());
				System.out.println("City :" + myAddress.getCity());
				System.out.println("State :" + myAddress.getState());
				System.out.println("ZIP Code :" + myAddress.getZipCode());
				System.out.println("=====================");
				System.out.println("\n");
				
				
				
				
							////Product model////
		System.out.println("====Address Model====");
		Product myProduct = new Product("Redbull", 1);
		System.out.println("Product Name :" + myProduct.getName());
		System.out.println("Product Price :" + myProduct.getPrice() + " OMR");
		System.out.println("=====================");
	}

}
