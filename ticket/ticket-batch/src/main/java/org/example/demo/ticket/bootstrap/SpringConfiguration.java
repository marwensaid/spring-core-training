package org.example.demo.ticket.bootstrap;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("org.example.demo.ticket")
@ImportResource("classpath:/org.example.demo.ticket.batch/batchContext.xml")
public class SpringConfiguration {

}