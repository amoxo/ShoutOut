package defaultPackage;

public class UserID {
	/*
	 UserID(String InsertUser) {
		 Username = "";
		 Rented[1] = 0;
		 Rented[2] = 0;
		 Rented[3] = 0;
	}
	*/
	 
	String Username = "";
	int[] Rented = new int[] {-1,-1,-1};
	float Cash = 2000;
	
	public String GetUsername() {
		return Username;
	}
	
	public void SetUsername(String InsertName) {
		Username = InsertName;
	}
	
	public float GetCash() {
		return Cash;
	}
	
	public void SubtractCash(float amount) {
		Cash = Cash - amount;
	}
	
	public void AddCash(float amount) {
		 Cash = Cash + amount;
	}
	 
	public int GetFirstRental() {
		return Rented[0];
	}
	
	public void SetFirstRental( int Rental_no) {
		Rented[0] = Rental_no;
	}
	
	public int GetSecondRental() {
		return Rented[1];
	}
	
	public void SetSecondRental( int Rental_no) {
		Rented[1] = Rental_no;
	}
	
	public int GetThirdRental() {
		return Rented[2];
	}
	
	public void SetThirdRental(int Rental_no) {
		Rented[2] = Rental_no;
	}
}
