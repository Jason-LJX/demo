package jason.demo.swagger.example.model;

public class User {

	/** ID */
	private Integer id;

	/** 姓名 */
	private String name;

	/** 年龄 */
	private Integer age;

	/** 手机号 */
	private String phoneNumber;

	public User() {
		
	}
	
	public User(Integer id, String name, Integer age, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
