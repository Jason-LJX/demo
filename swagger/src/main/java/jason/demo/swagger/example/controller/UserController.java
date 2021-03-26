package jason.demo.swagger.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import jason.demo.swagger.example.controller.request.UserRequest;
import jason.demo.swagger.example.controller.response.UserResponse;
import jason.demo.swagger.example.service.UserService;

@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "检索用户信息")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "检索成功", response = UserResponse.class)
	})
	@GetMapping("/get")
	public UserResponse getUser(@RequestParam(name = "id") Integer id) {
		return this.userService.getUser(id);
	}

	@ApiOperation(value = "更新或添加用户")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "更新成功", response = UserResponse.class)
	})
	@PostMapping("/updateOrAddUser")
	public UserResponse updateOrAddUser(@RequestBody UserRequest userRequest) {
		return this.userService.updateOrAddUser(userRequest);
	}
}
