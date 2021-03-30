package com.example.uploader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@SpringBootApplication
@RestController
public class SimpleUploaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleUploaderApplication.class, args);
	}

	@PostMapping("/fileUpload")
	public String upload(MultipartFile file) {
		return String.format("File %s uploaded successfully!", file.getOriginalFilename());
	}
}
