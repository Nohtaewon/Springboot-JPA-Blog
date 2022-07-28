package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.User;

// DAO
// 자동으로 bean 등록이 된다.
// @Repository 생략 가능
public interface UserRepository extends JpaRepository<User, Integer>{ 
	// 해당 JpaRepository 는 User 테이블이 관리하는 Repository 야
	// 그리고 user 테이블의 pk는 Integer이야

}
