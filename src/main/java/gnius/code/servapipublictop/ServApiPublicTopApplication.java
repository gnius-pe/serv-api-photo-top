package gnius.code.servapipublictop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServApiPublicTopApplication {

	private static Logger logger = LoggerFactory.getLogger(ServApiPublicTopApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ServApiPublicTopApplication.class, args);
		logger.debug("Hola esta app esta corriendo bien");
	}

}
