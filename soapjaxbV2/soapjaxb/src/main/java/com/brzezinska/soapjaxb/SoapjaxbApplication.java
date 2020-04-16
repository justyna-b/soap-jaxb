package com.brzezinska.soapjaxb;

import com.brzezinska.soapgenjaxb.RegisterCallResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapjaxbApplication {

    @Bean
    CommandLineRunner lookup(StudentClient studentClient) {
        return args -> {
            String studentName = "";

            if (args.length > 0) {
                studentName = args[0];
            }
            RegisterCallResponse response = studentClient.getRegisterCall(studentName);
            System.err.println(response.getExercise().getName());
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SoapjaxbApplication.class, args);


    }


}
