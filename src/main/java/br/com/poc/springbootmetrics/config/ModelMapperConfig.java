package br.com.poc.springbootmetrics.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper metodoQueCriaUmModelMapper(){
        return new ModelMapper();

    }
}
