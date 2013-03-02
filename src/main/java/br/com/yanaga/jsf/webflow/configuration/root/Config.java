package br.com.yanaga.jsf.webflow.configuration.root;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@ComponentScan(basePackages = "br.com.yanaga.jsf.webflow.configuration.root", excludeFilters = @Filter(Controller.class), useDefaultFilters = true)
@Configuration
public class Config {
}
