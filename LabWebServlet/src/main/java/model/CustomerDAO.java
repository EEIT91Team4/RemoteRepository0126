package model;


public interface CustomerDAO {
	public abstract CustomerBean select(String custid);
	public abstract boolean update(byte[] password, String email,
			java.util.Date birth, String custid);
//github.com/EEIT91Team4/RemoteRepository0126
}