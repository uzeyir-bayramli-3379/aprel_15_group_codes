package az.developia.rest;

public class Greeting {
	private final long id;
	private final String content;
	private int age;
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Greeting(long id, String content,int age) {
		this.id = id;
		this.content = content;
		this.age=age;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
