package jason.demo.swagger.example.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户响应")
public class UserResponse {

	/** ID */
	@ApiModelProperty(value = "ID")
	private Integer id;

	/** 姓名 */
	@ApiModelProperty(value = "姓名")
	private String name;

	/** 年龄 */
	@ApiModelProperty(value = "年龄")
	private Integer age;

	/** 手机号 */
	@ApiModelProperty(value = "手机号")
	private String phoneNumber;

	@Override
	public String toString() {
		return "UserResponse [id=" + id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
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
