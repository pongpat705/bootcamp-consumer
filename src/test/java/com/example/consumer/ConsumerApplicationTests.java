package com.example.consumer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

class ConsumerApplicationTests {



    @Test
    public void testRandomZeroOne(){
         Random random = new Random();

        // Generate a random boolean (true or false)
        boolean randomBoolean = random.nextBoolean();

        // Convert the boolean to an integer (0 or 1)
        int randomZeroOrOne = randomBoolean ? 1 : 0;

        // Print the result
        System.out.println("Random 0 or 1: " + randomZeroOrOne);
    }
}
