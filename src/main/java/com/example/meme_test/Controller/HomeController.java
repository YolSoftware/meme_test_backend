package com.example.meme_test.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String home() { return "home"; }

    @GetMapping("/index")
    public String index() { return "index"; }
}
