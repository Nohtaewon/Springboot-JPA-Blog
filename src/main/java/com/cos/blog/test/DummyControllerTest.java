package com.cos.blog.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;

@RestController
public class DummyControllerTest {

	@Autowired // 의존성주입(DI)
	private UserRepository userRepository;
	// http://localhost:8888/blog/dummy/join (요청)
	// http의body에 username, password, email 데이터를 가지고 (요청)
	@PostMapping("/dummy/join")
	public String join(User user) {
		// String username, String password, String email
		// key=value(약속된 규칙)
		// x-www-form-urlencoded 전송되는 데이터는 키밸류로오는데
		// 스프링이 알아서 함수의 파라미터로 파싱해서 집어넣어줌
//		System.out.println("username:"+username);
//		System.out.println("password:"+password);
//		System.out.println("email:"+email);
//		System.out.println("username:"+user.getUsername());
//		System.out.println("password:"+user.getPassword());
//		System.out.println("email:"+user.getEmail());
		user.setRole(RoleType.USER);
		userRepository.save(user);
		return "회원가입이 완료되었습니다.";
	}
}
