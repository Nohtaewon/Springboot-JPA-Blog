package com.cos.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.User;

// DAO
// 자동으로 bean 등록이 된다.
// @Repository 생략 가능
public interface UserRepository extends JpaRepository<User, Integer>{ 

	// select * from user where username = 1?;
	Optional<User> findByUsername(String username);
	
	
}



// 해당 JpaRepository 는 User 테이블이 관리하는 Repository 야
// 그리고 user 테이블의 pk는 Integer이야

// JPA Naming 전략
// select * from user where username=? and password=?;
//User findByUsernameAndPassword(String username, String password);

//	@Query(value="select * from user where username=?1 and password=?2", nativeQuery = true)
//	User login(String username, String password);