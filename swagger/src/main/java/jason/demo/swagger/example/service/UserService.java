package jason.demo.swagger.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jason.demo.swagger.example.controller.request.UserRequest;
import jason.demo.swagger.example.controller.response.UserResponse;
import jason.demo.swagger.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public UserResponse getUser(Integer id) {
		return this.userRepository.getUser(id);
	}
	
	public UserResponse updateOrAddUser(UserRequest userRequest) {
		return this.userRepository.updateOrAddUser(userRequest);
	}

}
