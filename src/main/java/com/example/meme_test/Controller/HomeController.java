package com.example.meme_test.Controller;

import com.example.meme_test.Data.RequestTest;
import com.example.meme_test.Data.TestObjectList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
    private TestObjectList testObjectList;
    private ObjectMapper mapper;

    public HomeController()
    {
        testObjectList = new TestObjectList();
        mapper = new ObjectMapper();
    }

    @GetMapping("/")
    public String home() { return "home"; }

    @GetMapping("/index")
    public String index() { return "index"; }

    @ResponseBody
    @GetMapping("/requestTest")
    public String test() throws JsonProcessingException
    {
        System.out.println("requestTest");
        String txt = mapper.writeValueAsString(testObjectList.testObjectArray[1]);
        return txt;
    }

    @GetMapping("/requestTest2")
    public String sendTest(Model model)
    {
        model.addAttribute("TestList", testObjectList.testObjectArray);
        return "testIndex";
    }

    // 문제 번호와 답 번호를 받아서 정답인지 확인하고 보내줌
    @ResponseBody
    @PostMapping("/responseTest")
    public String checkAnswer(@RequestBody @Validated RequestTest requestTest)
    {
        System.out.println("받아온 문제 번호 : " + requestTest.testId + ", 체크 번호 : " + requestTest.checkId);
        if(testObjectList.testObjectArray[Integer.parseInt(requestTest.testId)].answerId.equals(requestTest.checkId))
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }
}
