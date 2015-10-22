package lesson151022;

public class UseDB {

	public static void main(String[] args) {
		Student t = DBManager.get(Student.class, 1);
		int id = 1;
		if(t == null){
			System.out.println("no student with id = " + id);
		}else{
			System.out.println(t.name);
		}
		
		System.out.println(t.name);
		Student t2 = new Student();
		DBManager.save(t2);
		
	}
	
}
