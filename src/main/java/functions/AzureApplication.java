package functions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

import static org.springframework.util.StringUtils.isEmpty;

@SpringBootApplication
public class AzureApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureApplication.class, args);
    }

    @Bean
    public Function<Foo, Bar> greetings() {
        return foo -> isEmpty(foo.getValue()) ? new Bar("Bad input") : new Bar(String.format("Hello %s", foo.getValue()));
    }
}

class Foo {

    private String value;

    Foo() {
    }

    public String lowercase() {
        return value.toLowerCase();
    }

    public Foo(String value) {
        this.value = value;
    }

    public String uppercase() {
        return value.toUpperCase();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Bar {

    private String value;

    Bar() {
    }

    public Bar(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}