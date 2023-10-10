package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Users;
import com.user.repository.UserRepository;
import com.user.vo.Department;
import com.user.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Users saveUser(Users user) {
		log.info("Inside saveUser of UserService");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(long userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Users user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);

		vo.setUser(user);
		vo.setDepartment(department);

		return vo;
	}

}
