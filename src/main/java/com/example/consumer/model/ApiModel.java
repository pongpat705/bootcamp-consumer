package com.example.consumer.model;

import lombok.Data;

@Data
public class ApiModel<T> {
    private String code;
    private String description;
    private T data;
}
