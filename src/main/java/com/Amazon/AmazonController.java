package com.Amazon;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonController {
	@Autowired
	AmazonOrderRepo r;
	@PostMapping("/post")
	public String post(@RequestBody AmazonOrderEntity a) {            //object we have to pass as input in json
		r.save(a);
		return "posted";
	}
	@GetMapping("/get")
	public List<AmazonOrderEntity> get() {
		List<AmazonOrderEntity> s=  r.findAll();
		return s;
	}
	@GetMapping("/getbyquery")
	public List<Object> getbyquery(){
		 List<Object> s=r.getbyquery();
		 return s;
		
	}
	

}
