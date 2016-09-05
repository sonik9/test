package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Vitalii on 4/12/2016.
 */
@Service("testBeanInterface")
public class TestBeanImpl implements TestBeanInterface{

    private String name;
    @Autowired
    public TestBeanImpl(@Value("test") String name){
        this.name = name;
    }

    @Autowired
    TestBeanRender testBeanRender = new TestBeanRenderImpl();

    public String getBeanName(TestBean testBean) {
        return testBeanRender.getTestBean(testBean).getName();
    }

    public String getName() {
        return name;
    }
}
