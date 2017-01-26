package model;


public interface CustomerDAO {
	public abstract CustomerBean select(String custid);
	public abstract boolean update(byte[] password, String email,
			java.util.Date birth, String custid);
	//System.out.println("Whatever's clever!");
	//Trying this thing again gets old really really fast~~~

}
