package ac.cn.saya.doublekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
// https://www.cnblogs.com/personsiglewine/p/13182617.html
public class DoubleKafkaApplication {

	/**
	 * bin/zookeeper-server-start.sh -daemon config/zookeeper.properties
	 *
	 * bin/zookeeper-server-stop.sh -daemon config/zookeeper.properties
	 *
	 * bin/kafka-server-start.sh -daemon config/server.properties
	 *
	 * bin/kafka-server-stop.sh config/server.properties
	 *
	 * https://www.bilibili.com/read/cv9978811/
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DoubleKafkaApplication.class, args);
	}

}
