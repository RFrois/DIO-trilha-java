//package br.com.api.projeto_api_web.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//
//import java.util.Arrays;
//import java.util.HashSet;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    private Contact contato(){
//        return new Contact("Rafael Frois","https://www.linkedin.com/in/rafael-frois-10358748/","rafael.frois1");
//    }
//
//    private ApiInfoBuilder informacoesApi(){
//
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//
//        apiInfoBuilder.title("Title - Rest API");
//        apiInfoBuilder.description("API exemplo Spring boot e Swagger");
//        apiInfoBuilder.version("1.0");
//        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
//        apiInfoBuilder.license("RFrois");
//        apiInfoBuilder.licenseUrl("https://www.linkedin.com/in/rafael-frois-10358748/");
//        apiInfoBuilder.contact(this.contato());
//
//        return apiInfoBuilder;
//    }
//@Bean
//    public Docket docketApi(){
//
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//
//        docket
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("br.com.api.projeto_api_web.Controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(this.informacoesApi().build())
//                .consumes(new HashSet<String>(Arrays.asList("application/json")))
//                .produces(new HashSet<String>(Arrays.asList("application/json")));
//
//        return docket;
//    }
//}
