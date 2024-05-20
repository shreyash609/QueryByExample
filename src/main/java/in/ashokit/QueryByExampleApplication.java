package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Emp;
import in.ashokit.service.EmpService;

@SpringBootApplication
public class QueryByExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(QueryByExampleApplication.class, args);
		
		EmpService bean = ctxt.getBean(EmpService.class);
		
		List<Emp> byQbe = bean.getByQbe();
		byQbe.forEach(e->System.out.println(e));
	}

}
