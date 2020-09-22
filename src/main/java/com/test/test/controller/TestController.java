package com.test.test.controller;

import com.test.test.domain.Menu;
import com.test.test.repository.TestRepository;
import com.test.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @Autowired
    TestRepository testRepository;

    @GetMapping("/test")
    public String test(Model model) throws Exception {
        Menu date = testRepository.getDual();
        model.addAttribute("date", date.getMenu());
        System.out.println("count" + date.getMenu());
        return "test";
    }
}
