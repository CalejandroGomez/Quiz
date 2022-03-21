package GameTest;

public class Users {
	
	
	private String user;
	private String password; 
	private int score;
	
	public Users(String user, String password, int score) {
		
		this.user = user;
		this.password = password;
		this.score = score;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}	
	
	
	
}
