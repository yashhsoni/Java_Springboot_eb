package org.example;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
     public static void main( String[] args ) {

         Vehicle vehicle = new Vehicle();
         vehicle.setName("Soni Motors");
         System.out.println("non-spring context" + vehicle.getName());


         ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
         Vehicle veh = context.getBean(Vehicle.class);

         System.out.println("Vehicle name from spring context" + veh.getName());

         String hello = context.getBean(String.class);
         System.out.println(hello);

         Integer num = context.getBean(Integer.class);
         System.out.println(num);
     }
}
