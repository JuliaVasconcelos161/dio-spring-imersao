package com.juliavasconceloscr161.imersaospringboot.repository;



import com.juliavasconceloscr161.imersaospringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Integer> {

}
