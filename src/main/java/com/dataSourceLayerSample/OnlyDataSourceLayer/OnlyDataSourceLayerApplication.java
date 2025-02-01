package com.dataSourceLayerSample.OnlyDataSourceLayer;

import com.dataSourceLayerSample.OnlyDataSourceLayer.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;
@SpringBootApplication
public class OnlyDataSourceLayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlyDataSourceLayerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ApplicationContext context){
		return args ->{
			UserService userService = context.getBean((UserService.class));
//			userService.saveUser("Ricardo Collado", "ricardo@collado.com");
//			userService.saveUser("Lucas Collado", "Lucas@gmail.com");
//			userService.saveUser("Katherine Collado", "Katherine@gmail.com");

			Scanner in = new Scanner(System.in);
			while(true){
				System.out.println("Menu de opciones:");
				System.out.println("1. Agregar un usuario");
				System.out.println("2. Listar usuarios");
				System.out.println("3. Salir");
				var opcion = in.nextLine();

					switch(opcion){
						case "1":
							System.out.println("Coloque el nombre del usuario:");
							var name = in.nextLine();
							System.out.println("Coloque el email del usuario:");
							var email = in.nextLine();
							userService.saveUser(name, email);

							break;
						case "2":
							System.out.println("\\uD83D\uDCDCUser list:");
							userService.listUsers();
							break;

						case "3":
							System.out.println("👋 Saliendo del programa...");
							in.close();
							return;
					}
			}
		};
	}

}
