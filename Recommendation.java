public class Recommendation {
	
	public static void RecommendByGenre(UserID InsertUser) {
		
		int Increment = 2;
		
		System.out.println("Function Started RecommendByGenre");
		while (Increment > -1) {
			
			System.out.println("Looping");
			if (InsertUser.Rented[Increment] != -1) {
				String RecentWatchedG = RentalSystem.Genre[InsertUser.Rented[Increment]];

				for (int i = 0; i < RentalSystem.Genre.length; i ++) {
					if (RecentWatchedG == RentalSystem.Genre[i] && RentalSystem.Movies[InsertUser.Rented[Increment]] != RentalSystem.Movies[i]) {
						System.out.println(RentalSystem.Genre[i] + " " + RentalSystem.Movies[i]);
					}
				}
				break;
			}
			Increment = Increment- 1;
		}
		System.out.println("Loop Finished");
	}
	
	public static void RecommendByTags(UserID InsertUser) {
		int Increment = 2;
		
		System.out.println("Function Started RecommendByTags");
		while (Increment > -1) {
			
			System.out.println("Looping");
			if (InsertUser.Rented[Increment] != -1) {
				String RecentWatchedG = RentalSystem.Tags[InsertUser.Rented[Increment]];

				for (int i = 0; i < RentalSystem.Tags.length; i ++) {
					if (RecentWatchedG == RentalSystem.Tags[i] && RentalSystem.Movies[InsertUser.Rented[Increment]] != RentalSystem.Movies[i]) {
						System.out.println(RentalSystem.Tags[i] + " " + RentalSystem.Movies[i]);
					}
				}
				break;
			} 
			Increment = Increment - 1;
		}
		System.out.println("Loop Finished");
	}
}
