package com.fundamentos.sprigboot.fundamentos;

import com.fundamentos.sprigboot.fundamentos.bean.MyBean;
import com.fundamentos.sprigboot.fundamentos.bean.MyBeanWithDependecy;
import com.fundamentos.sprigboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.sprigboot.fundamentos.component.ComponentDependency;
import com.fundamentos.sprigboot.fundamentos.entity.User;
import com.fundamentos.sprigboot.fundamentos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	//Inyectar dependencia
	private ComponentDependency componentDependency;
	private MyBean myBean;

	private MyBeanWithDependecy myBeanWithDependecy;

	private MyBeanWithProperties myBeanWithProperties;

	private UserRepository userRepository;
	public FundamentosApplication(@Qualifier("componentTwoImpl") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependecy myBeanWithDependecy, MyBeanWithProperties myBeanWithProperties, UserRepository userRepository){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependecy = myBeanWithDependecy;
		this.myBeanWithProperties = myBeanWithProperties;
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		//Inicializa toda la arquitectura y la  configuracion del proyecto
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ejemplosAnteriores();
		saveUsersInDataBase();

	}

	private void saveUsersInDataBase(){
		User user = new User("John", "correo@gmail.com", LocalDate.of(2021, 03, 12));

		List<User> list = Arrays.asList(user);
		list.stream().forEach(userRepository::save);//registro a DB
	}

	private void ejemplosAnteriores(){
		//implementacion del metodo
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependecy.printWithDependency();
		System.out.println(myBeanWithProperties.funtion());
	}
}
