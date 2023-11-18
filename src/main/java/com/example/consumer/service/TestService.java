package com.example.consumer.service;

import com.example.consumer.component.util.PasswordEncoderUtil;
import com.example.consumer.model.InventoryModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class TestService {
    private ObjectMapper mapper;

    public TestService(@Qualifier("initObjectMapper") ObjectMapper initObjectMapper) {
        this.mapper = mapper;
    }

    public String setup(){
        return "repository.get()";
    }

    public void dosomethingMethod(String message) {
        try {

            PasswordEncoderUtil.getInstance().encodePassword();

            List<InventoryModel> x = mapper.readValue(message, new TypeReference<List<InventoryModel>>() {});


            System.out.println( x.size());

        } catch (Exception e) {
            e.printStackTrace();
            log.info("dosomethingMethod error {}", e.getMessage());
//            produce message -> topic error
        }

    }
}
