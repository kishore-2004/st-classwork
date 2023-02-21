package com.example.demo;

import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class messageController {
@GetMapping("/check")
public String checkApi() throws JsonProcessingException{
	ApiResponse response = new ApiResponse("Hello Welcomme to this page");
	ObjectMapper obj=new ObjectMapper();
	return obj.writeValueAsString(response);

}
}
