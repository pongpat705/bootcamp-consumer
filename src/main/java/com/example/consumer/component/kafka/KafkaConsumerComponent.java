package com.example.consumer.component.kafka;


import com.example.consumer.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumerComponent {


    private TestService testService;

    public KafkaConsumerComponent(TestService testService) {
        this.testService = testService;
    }


    @KafkaListener(topics = "${app.kafka.topics.regist}", groupId = "${app.kafka.groupid.regist}")
    public void consumeMessage(@Payload String message) {
       log.info("factory got messa got {}", message);

//       this.testService.dosomethingMethod(message);
    }


}
