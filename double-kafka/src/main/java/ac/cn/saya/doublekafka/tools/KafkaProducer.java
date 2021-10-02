package ac.cn.saya.doublekafka.tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
/**
 * @Title: KafkaProducer
 * @ProjectName kafka-utils
 * @Description: TODO
 * @Author liunengkai
 * @Date: 6/13/21 23:46
 * @Description:
 */
@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, String> kafkaOutTemplate;

    /**
     * 使用主kafka通道
     * @param topic
     * @param key
     * @param json
     * @return
     */
    public ListenableFuture<SendResult<String, String>> primarySend(String topic, String key, String json) {
        ListenableFuture<SendResult<String, String>> result = kafkaTemplate.send(topic, key, json);
        System.out.println("inner kafka send #topic=" + topic + "#key=" + key + "#json=" + json + "#推送成功===========");
        return result;
    }

    /**
     * 使用副本kafka通道
     * @param topic
     * @param key
     * @param json
     * @return
     */
    public ListenableFuture<SendResult<String, String>> duplicateSend(String topic, String key, String json) {
        ListenableFuture<SendResult<String, String>> result = kafkaOutTemplate.send(topic, key, json);
        System.out.println("out kafka send #topic=" + topic + "#key=" + key + "#json=" + json + "#推送成功===========");
        return result;
    }

}
