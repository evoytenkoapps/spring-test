package Beans;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    public String getSong() {
        return "ClassicalMusic";
    }
}
