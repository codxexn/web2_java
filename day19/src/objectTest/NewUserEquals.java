package objectTest;

public class NewUserEquals {
	
	int userNumber;
	String userName;
	
	public NewUserEquals() {
		// TODO Auto-generated constructor stub
	}

	public NewUserEquals(int userNumber, String userName) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "NewUserEquals [userNumber=" + userNumber + ", userName=" + userName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + userNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewUserEquals other = (NewUserEquals) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userNumber != other.userNumber)
			return false;
		return true;
	}
	
	
	
	
}
