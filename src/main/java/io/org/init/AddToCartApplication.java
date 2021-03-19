package io.org.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
//@EnableJpaRepositories("io.org.addtocart.dao")
//@Import({ AddToCartConfig.class })
public class AddToCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddToCartApplication.class, args);
		System.out.println("Application is up");

		display();
	}

	/**PersoonRepository
	 * This is display method which is the part of
	 * {@link AddToCartApplication#main(String[])}
	 */
	public static void display() {
		System.out.println("I am display method");
	}
}
