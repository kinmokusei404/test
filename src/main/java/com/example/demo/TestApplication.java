package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

  public static void main(String[] args) {
    SpringApplication.run(TestApplication.class, args);
    System.out.println("test");
    // komennto
    // 別の変更
    int a=0;
    int b=1;
    System.out.println(a+b);
  }

}
