package ac.cn.saya.doublekafka;

import ac.cn.saya.doublekafka.tools.KafkaProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DoubleKafkaApplicationTests {


	@Autowired
	private KafkaProducer kafkaProducer;

	@Test
	public void sendInner() {
		for (int i = 0; i < 1; i++) {
			kafkaProducer.primarySend("saya", "douzi" + i, "liyuehua" + i);
			kafkaProducer.duplicateSend("shmily", "douziout" + i, "fanbingbing" + i);
		}
	}

	@Test
	void contextLoads() {
	}

}
