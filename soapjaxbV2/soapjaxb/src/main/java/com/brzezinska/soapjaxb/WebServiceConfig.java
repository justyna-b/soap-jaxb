package com.brzezinska.soapjaxb;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WebServiceConfig  {

        @Bean
        public Jaxb2Marshaller marshaller(){
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.setContextPath("com.brzezinska.soapgenjaxb");
            return marshaller;
        }

        @Bean
        public StudentClient studentClient(Jaxb2Marshaller marshaller){
            StudentClient client = new StudentClient();
            client.setDefaultUri("http://localhost:8088/mockApiPortSoap11");
            client.setMarshaller(marshaller);
            client.setUnmarshaller(marshaller);
            return client;
        }
}
