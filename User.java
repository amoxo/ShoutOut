

public class User {
	
	static RentalSystem Rentals;
	
	public static void main(String[] args) throws InterruptedException {

		UserID Test1 = new UserID();
		UserID Test2 = new UserID();
		
		Test1.SetUsername("David");
		Test2.SetUsername("Jobba");
		
		UserRentMovie(Test1, 0);
		UserRentMovie(Test1, 1);
		
		Thread.sleep(17000);
		
		Recommendation.RecommendByGenre(Test1);
		Recommendation.RecommendByTags(Test1);
		
		UserRentMovie(Test2, 2);
		UserRentMovie(Test2, 3);
		
		UserReturnMovie(Test1, 0);
		UserReturnMovie(Test1, 1);
		
		UserReturnMovie(Test2, 0);
		UserReturnMovie(Test2, 1);
		
	}
	
	public static void UserRentMovie(UserID InsertUser, int MovieID) {
		if (MovieID >= RentalSystem.Movies.length) {
			MovieID = RentalSystem.Movies.length - 1;
		}
		
		if (InsertUser.GetFirstRental() == -1 && RentalSystem.IsRented[MovieID] == false) {
			InsertUser.SetFirstRental(MovieID);
			RentalSystem.RentMovie(MovieID);
			System.out.println(InsertUser.GetUsername() + " Rented: " + RentalSystem.Movies[MovieID] + " in your first slot");
			space();
			
		} else if (InsertUser.GetSecondRental() == -1 && RentalSystem.IsRented[MovieID] == false) {
			InsertUser.SetSecondRental(MovieID);
			RentalSystem.RentMovie(MovieID);
			System.out.println(InsertUser.GetUsername() + " Rented: " + RentalSystem.Movies[MovieID] + " in your second slot");
			space();
			
		} else if (InsertUser.GetThirdRental() == -1 && RentalSystem.IsRented[MovieID] == false) {
			InsertUser.SetThirdRental(MovieID);
			RentalSystem.RentMovie(MovieID);
			System.out.println(InsertUser.GetUsername() + " Rented: " + RentalSystem.Movies[MovieID] + " in your third slot");
			space();
			
		} else {
			System.out.println("Either you have 3 movies checked out, or this movie is already checked out");
			space();
		}
	}
	
	public static void UserReturnMovie(UserID InsertUser, int MovieSlot) {
		
		if (MovieSlot != 0 && MovieSlot != 1 && MovieSlot != 2) {
			System.out.println("Invalid user input, or ");
			space();
		}

		if (InsertUser.GetFirstRental() != -1 && MovieSlot == 0) {
			float Payment = PaymentProcessing.CalculatePayment(InsertUser.GetFirstRental());
			System.out.println(Payment);
			PaymentProcessing.ProcessPayment(InsertUser, Payment);
			RentalSystem.ReturnMovie(InsertUser.GetFirstRental());
			InsertUser.SetFirstRental(-1);
			System.out.println(InsertUser.GetUsername() + " Returned the movie in slot 1");
			space();
			
		} else if (InsertUser.GetSecondRental() != -1 && MovieSlot == 1) {
			float Payment = PaymentProcessing.CalculatePayment(InsertUser.GetSecondRental());
			PaymentProcessing.ProcessPayment(InsertUser, Payment);
			System.out.println(Payment);
			RentalSystem.ReturnMovie(InsertUser.GetSecondRental());
			InsertUser.SetSecondRental(-1);
			System.out.println(InsertUser.GetUsername() + " Returned the movie in slot 2");
			space();
			
		} else if (InsertUser.GetThirdRental() != -1 && MovieSlot == 2) {
			float Payment = PaymentProcessing.CalculatePayment(InsertUser.GetFirstRental());
			System.out.println(Payment);
			PaymentProcessing.ProcessPayment(InsertUser, Payment);
			RentalSystem.ReturnMovie(InsertUser.GetThirdRental());
			InsertUser.SetThirdRental(-1);
			System.out.println(InsertUser.GetUsername() + " Returned the movie in slot 3");
			space();
			
		} else {
			System.out.println("You do not have a movie to return in this slot");
			space();
		}
	}
	
	public static void space() {
		System.out.println("");
	}
}
