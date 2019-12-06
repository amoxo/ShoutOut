
public class PaymentProcessing {
	
	public static float CalculatePayment(int MovieID){
		int MinimumPayment = 2;
		float PaymentAmount = 0;
		
		long TimeElapsed = System.currentTimeMillis() - RentalSystem.Time[MovieID];
		long TimeElapsedS = TimeElapsed / 1000;
		int TrueTime = Math.toIntExact(TimeElapsedS);
		
		//For the purposes of this program, 8 seconds will be 1 day, and the fee is 2 dollars per day after 5 days.
		
		if (TrueTime >= 10) {
			PaymentAmount = MinimumPayment + 2 *((TrueTime - 10) / 2);
		} else {
			PaymentAmount = MinimumPayment;
		}
		return PaymentAmount;
	}
	
	public static void ProcessPayment(UserID InsertUser, float CurrentPayment) {
		if (InsertUser.GetCash() > CurrentPayment) {
			InsertUser.SubtractCash(CurrentPayment);
			System.out.println("The user has paid for their current rental");
			User.space();
			
		} else {
			System.out.println("The user does not have the current funds to return this movie");
			User.space();
			
		}
	}
}
