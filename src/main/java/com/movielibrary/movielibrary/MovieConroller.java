package com.movielibrary.movielibrary;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestConrolller
public class MovieConroller {
    @GetMapping("/test")
    public int test(){
        return 1;
    }
}
