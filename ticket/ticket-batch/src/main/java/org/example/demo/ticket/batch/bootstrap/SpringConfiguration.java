package org.example.demo.ticket.batch.bootstrap;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by ciara on 12/12/2018.
 */
@Configuration
@ComponentScan("org.example.demo.batch")
@ImportResource("classpath:/bootstrapContext.xml")
public class SpringConfiguration {

}
