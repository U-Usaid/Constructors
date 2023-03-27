package src;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
							////Person////
		Person myPerson = new Person("Usaid");
		System.out.println("\n");
		
		
		
							////Rectangle////
		Rectangle myRectangle = new Rectangle(6, 10);
		System.out.println("\n");

		
		
		
							////Student model////		
		Student myStudent = new Student("Usaid", 25);
		System.out.println("\n");
		
		
		
		
		 					////Bank model////		
		BankAccount myBankAccount = new BankAccount("Usaid", 800);
			System.out.println("Initial balance: " + myBankAccount.getBalance());
			myBankAccount.deposit(200);
			System.out.println("After Deposit: " + myBankAccount.getBalance());
			myBankAccount.withdraw(2000);
			System.out.println("After Withdrawal: " + myBankAccount.getBalance());
			System.out.println("\n");
		
		
		
		
		
							////Car////
		Car myCar = new Car("Toyota", "Corolla", 2006);
		
			myCar.start();
			myCar.stop();
			myCar.stop();
			myCar.start();
			myCar.start();
			System.out.println("\n");
			
		
		
		
		
							////Employee////
		Employee myEmployee = new Employee("Usaid","software dev", 250);
		
			System.out.println("Employee Name: " + myEmployee.getEmpName());
			System.out.println("Job: " + myEmployee.getJobTitle());
			System.out.println("Salary: "+ myEmployee.getEmpSalary());
			System.out.println("\n");
		
		
		
		
							////Book////
		Book mybook = new Book("Food", "Need Food", 2023);
		
			System.out.println("Book Title: " + mybook.getTitle());
			System.out.println("Book Author: " + mybook.getAuthor());
			System.out.println("Publication Year: " + mybook.getPublicationYear());
			System.out.println("\n");
		
		
							////Bank////
		Bank myBank = new Bank("Oman", 110000);
		
			System.out.println("Bank: " + myBank.getBankName());
			System.out.println("Number of Assets: " + myBank.getTotalAssets());
			System.out.println("\n");
		
		
		
		
							////Dog////
		Dog myDog = new Dog("Tom", 10);
		
			System.out.println("Dog name: " + myDog.getDogName());
			System.out.println("Dog Age: " + myDog.getDogAge());
			System.out.println("\n");
		
		
		
		
							////Movie////
		Movie myMovie = new Movie("Amistad", "Steven Spielberg", 1997);
				
				System.out.println("Movie Title: " + myMovie.getTitle());
				System.out.println("Movie Director: " + myMovie.getDirector());
				System.out.println("Release Year: " + myMovie.getReleaseYear());
	}

}
