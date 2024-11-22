package exampl.controller;

import exampl.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducer producer;

    @PostMapping("kafka/send")
    public String sendMessage(@RequestBody String message) {

        producer.sendMessage(message);

        return "success";
    }

}
