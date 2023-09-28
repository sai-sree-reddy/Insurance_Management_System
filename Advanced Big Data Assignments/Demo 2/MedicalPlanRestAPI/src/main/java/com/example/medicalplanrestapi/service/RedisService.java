package com.example.medicalplanrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalplanrestapi.repository.RedisRepository;

@Service
public class RedisService {

	@Autowired
	RedisRepository<String> redisDao;

	public String getValue(final String key) {
		return redisDao.getValue(key);
	}

	public void postValue(final String key, final String value) {
		redisDao.putValue(key, value);
	}

	public boolean deleteValue(final String key) {
		return redisDao.deleteValue(key);
	}
	
	public List<String> getAll() {
		return redisDao.findAll();
	}

}
