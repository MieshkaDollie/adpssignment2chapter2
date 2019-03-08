package ac.za.cput.assignment2foradpwithspring.configuration;


import ac.za.cput.assignment2foradpwithspring.Calculator;
import ac.za.cput.assignment2foradpwithspring.CalculatorInterface;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name = "calc")
    public CalculatorInterface getService() {
        return new Calculator();
    }
}