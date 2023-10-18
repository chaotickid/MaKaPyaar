package com.maakapyaar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MaakapyaarApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaakapyaarApplication.class, args);
		log.debug("\"********************* MaKaPyar *********************\\n\";\n" +
				"\"* Application running on port:             [ OK ]*\\n\";\n" +
				"\"* Couchbase connectionString:              [ OK ]*\\n\";\n" +
				"\"****************************************************\"");
	}

}
