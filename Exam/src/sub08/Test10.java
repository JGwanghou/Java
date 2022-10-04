package sub08;

import java.sql.DriverManager;
import java.sql.SQLException;

class User {
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return uid + "," + name + "," + hp + "," +age;
	}
}
public class Test10 {
	private static String host = "jdbc:mysql://127.0.0.1:3306/java2";
	private static String user = "root";
	private static String pass = "1234";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(host, user, pass);
	}
}
