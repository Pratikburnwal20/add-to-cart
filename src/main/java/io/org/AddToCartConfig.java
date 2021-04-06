/**
 * 
 */
package io.org;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 91875
 *	
 */
@Configuration
@ComponentScan("io.org.addtocart")
@ComponentScan(basePackages = {"io.org.addtocart.cofig"})
public class AddToCartConfig {

}
