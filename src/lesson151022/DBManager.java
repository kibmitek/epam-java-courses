package lesson151022;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {

	private static Connection connection;
	
	static{
		System.out.println("Init DB connection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/Students","root","");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	
	Runtime.getRuntime().addShutdownHook(new Thread(){
		@Override
		public void run(){
			System.out.println("shotdown connection");
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	
	}
	
	public static <T> T get (Class<T> clazz, int id){
		String tableName = clazz.getSimpleName().toLowerCase();
		try {
			PreparedStatement st = connection.prepareStatement(
					"select * from " + tableName + " where id = ?");
			st.setInt(1, id);
			
			ResultSet rs = st.executeQuery();
			
			T t = load(rs, clazz);
			return t;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static <T> T load(ResultSet rs, Class<T> clazz) throws SQLException {
		rs.next();
		try {
			T t = clazz.newInstance();
		
			ResultSetMetaData metaData = rs.getMetaData();
			for (int i = 1; i < metaData.getColumnCount(); i++){
				String name = metaData.getColumnName(i);
				String setterName = "set" + Character.toUpperCase(name.charAt(0)) + name.substring(1);
				Method setter = clazz.getMethod(setterName, String.class);
				setter.invoke(t, rs.getString(i));
				
				
			}
		
			//wrong decision
//		for (Method method : clazz.getMethods()) {
//				
//			String name = method.getName();
//			if(!name.startsWith("get")){
//				continue;
//			}
//			String propertyName = name.substring(3);
//			Class<?> returnType = method.getReturnType();
//			
//			Method setter = clazz.getMethod("set" + propertyName, returnType);
//			String value = rs.getString(propertyName.toLowerCase());
//			
//			setter.invoke(t, value);
//		}
		
		return t;
		
			} catch (InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}

		return null;
	}

	public static Student get(int id){
		System.out.println("get");
	
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from student where id = " + id);
			Student student = getStudent(rs);
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	
	}
	
	private static Student getStudent(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Student st = new Student();
		if(!rs.next()){
			return null;
		}
		st.id = rs.getString(1);
		st.name = rs.getString(2);
		st.stip = rs.getString(3);
		return st;
	}

	public static <T> void save(T t){
		System.out.println("save");
	}
	
}
