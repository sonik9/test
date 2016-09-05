package test;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by Vitalii on 4/12/2016.
 */
public class TestBean {
    private  String name;

    public TestBean(String name) {
        this.name = name;
    }

    public TestBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
