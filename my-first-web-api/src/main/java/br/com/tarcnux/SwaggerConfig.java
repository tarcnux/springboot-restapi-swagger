package br.com.tarcnux;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	private Contact contato() {
		return new Contact("Tarcísio Nunes", "http://www.tarcnux.com.br", "tata@gmail.com");
	}
	
	
	private ApiInfoBuilder informacoesApi() {
		var apiInfoBuilder = new ApiInfoBuilder();
		
		apiInfoBuilder.title("REST API do Tatá");
		apiInfoBuilder.description("Descrição exemplo documentado com o Swagger");
		apiInfoBuilder.version("1.0");
		apiInfoBuilder.contact(this.contato());
		
		return apiInfoBuilder;
	}
	
	@Bean
	public Docket detalheApi() {
		var docket = new Docket(DocumentationType.SWAGGER_2);
		
		docket.
			select()
			.apis(RequestHandlerSelectors.basePackage("br.com.tarcnux.controller"))
			.paths(PathSelectors.any())
			.build()
			.apiInfo(this.informacoesApi().build())
			.consumes(new HashSet<String>(Arrays.asList("application/json")))
			.produces(new HashSet<String>(Arrays.asList("application/json")));
		
		return docket;
	}
	

}
