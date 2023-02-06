package hello.core;

import hello.core.javaStudy.Collect;
import hello.core.javaStudy.Optional;
import hello.core.javaStudy.StreamTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
public class CoreApplication {
	public static void main(String[] args) {
		StreamTest st = new StreamTest();
		Optional op = new Optional();
		Collect co = new Collect();

		SpringApplication.run(CoreApplication.class, args);
		long heapSize = Runtime.getRuntime().totalMemory();
		System.out.println("HEAP Size(M) : "+ heapSize / (1024*1024) + " MB");

//		st.stream();
//		op.opTest();
		co.collectTest();



	}

}
