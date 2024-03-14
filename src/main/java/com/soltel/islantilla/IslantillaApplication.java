package com.soltel.islantilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IslantillaApplication {
	
	@RequestMapping (Value="/")
	public Sting index() {
		return "<h1>Bienvenido a Islantilla!</h1>";
		

	@RequestMapping (Value="/")
	public Sting index() {
		return "<h1>Menu Principal</h1>";
		}
	
	@RequestMapping (Value="/")
	public Sting index() {
		return "<h1>Menu Principal</h1>";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(IslantillaApplication.class, args);
		
	}

}
