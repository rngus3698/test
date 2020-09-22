package com.test.test.service;

import com.test.test.domain.Menu;
import com.test.test.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public Menu getDual() throws Exception{
        return testRepository.getDual();
    }
}
