package ac.cn.saya.doublekafka.tools;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Title: KafkaConsumer
 * @ProjectName kafka-utils
 * @Description: TODO
 * @Author liunengkai
 * @Date: 6/13/21 23:52
 * @Description: kafka监听器
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics={"saya"})
    public void primaryListener(ConsumerRecord<String, String> record) {
        System.out.println("primary kafka receive #key=" + record.key() + "#value=" + record.value());
    }

    @KafkaListener(topics={"shmily"})
    public void duplicateListener(ConsumerRecord<String, String> record) {
        System.out.println("duplicate kafka receive #key=" + record.key() + "#value=" + record.value());
    }

}
