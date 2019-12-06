
public class RentalSystem {
	static String[] Movies = new String[] {"John Quick", "Man Spider", "Morning Light", "Panthism of the Monarchs", "Fly High"};
	static String[] Genre = new String[] {"Action", "Action", "Comedy", "Action", "Comedy"};
	static String[] Tags = new String[] {"Superhero","Superhero","Historical","Historical","Superhero"};
	static Boolean[] IsRented = new Boolean[] {false, false, false, false, false};
	static long[] Time = new long[5];
	
	static UserID Users;
	
	public static void RentMovie(int Selection) {
		if (IsRented[Selection] == false && IsRented[Selection] != null) {
			IsRented[Selection] = true;
			Time[Selection] = System.currentTimeMillis();
			System.out.println("We have rented sucessfully");
			System.out.println(IsRented[Selection]);
		}
		else if (IsRented[Selection] == true || IsRented[Selection] == null) {
			System.out.println("The movie was already rented/could not be found");
			System.out.println(IsRented[Selection]);
		}
	}
	
	public static void ReturnMovie(int Selection) {
		if (IsRented[Selection] == true && IsRented[Selection] != null) {
			IsRented[Selection] = false;
			Time[Selection] = 0;
			System.out.println("We have returned sucessfully");
			System.out.println(IsRented[Selection]);
		}
		else if (IsRented[Selection] == false || IsRented[Selection] == null) {
			System.out.println("The movie wasn't checked out/could not be found");
			System.out.println(IsRented[Selection]);
		}
	}
	
	public static void ViewMovies() {
		for (int i = 0; i < Movies.length; i ++) {
			System.out.println(Movies[i]);
		}
	}
	
	public static void ViewFullMovies() {
		for (int i = 0; i < Movies.length; i ++) {
			System.out.println("Title: " + Movies[i] + "/ Genre: " + Genre[i] + "/ Tags: " + Tags[i]);
		}
	}
}