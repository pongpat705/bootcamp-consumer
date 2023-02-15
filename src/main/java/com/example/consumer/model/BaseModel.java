package com.example.consumer.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseModel {


//    @JsonDeserialize(using = DateTimeDeserializer.class)
//    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime createDate;
    private String createBy;

//    @JsonDeserialize(using = DateTimeDeserializer.class)
//    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime updateDate;
    private String updateBy;
    private String isDelete;
}
