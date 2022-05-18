package pipilu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pipilu.dao")
public class LuApplication {
	public static void main(String[] args) {
		SpringApplication.run(LuApplication.class, args);
	}
}
