package jason.demo.swagger.example.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import jason.demo.swagger.example.controller.request.UserRequest;
import jason.demo.swagger.example.controller.response.UserResponse;
import jason.demo.swagger.example.model.User;

@Repository
public class UserRepository {

	private static Map<String, User> users;

	static {
		users = new HashMap<>();

		IntStream.range(0, 10).forEach(i -> {
			users.put(String.valueOf(i),
					new User(i, "jason".concat(String.valueOf(i)), 10 + i, "123456".concat(String.valueOf(i))));
		});
	}

	public UserResponse getUser(Integer id) {

		User user = Optional.ofNullable(users.get(id.toString())).orElse(new User());

		UserResponse userResponse = new UserResponse();
		BeanUtils.copyProperties(user, userResponse);

		return userResponse;
	}

	public UserResponse updateOrAddUser(UserRequest userRequest) {

		String id = userRequest.getId().toString();
		User user = users.containsKey(id) ? users.get(id) : new User();
		BeanUtils.copyProperties(userRequest, user);
		users.put(id, user);

		UserResponse userResponse = new UserResponse();
		BeanUtils.copyProperties(user, userResponse);

		return userResponse;
	}

}
