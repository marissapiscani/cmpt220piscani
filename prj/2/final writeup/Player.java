package madlibs;



public class Player {
	private String name;
	private int age;
   public Player(String Name, int Age) {
	   name=Name;
	   age=Age;
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
