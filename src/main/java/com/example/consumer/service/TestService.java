package com.example.consumer.service;

import com.example.consumer.model.ApiModel;
import com.example.consumer.model.InventoryModel;
import com.example.consumer.model.RegistrationModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



@Slf4j
@Service
public class TestService {
    public void dosomethingMethod(String message) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());

            InventoryModel x = mapper.readValue(message, InventoryModel.class);

            System.out.println( x.getItemName());

        } catch (Exception e) {
            e.printStackTrace();
            log.info("dosomethingMethod error {}", e.getMessage());
//            produce message -> topic error
        }

    }
}
