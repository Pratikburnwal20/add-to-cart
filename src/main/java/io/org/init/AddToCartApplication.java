package io.org.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import ch.qos.logback.core.net.SyslogOutputStream;
import io.org.addtocart.AddToCartConfig;

@SpringBootApplication
@Import({ AddToCartConfig.class })
public class AddToCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddToCartApplication.class, args);
		System.out.println("Application is up");

		display();
	}

	/**
	 * This is display method which is the part of
	 * {@link AddToCartApplication#main(String[])}
	 */
	public static void display() {
		System.out.println("I am display method");
	}
}
