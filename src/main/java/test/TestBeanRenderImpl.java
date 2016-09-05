package test;

import org.springframework.stereotype.Service;

/**
 * Created by Vitalii on 4/12/2016.
 */
@Service("testBeanRender")
public class TestBeanRenderImpl implements TestBeanRender {

    private     TestBean testBean;
    public void setTestBean(TestBean testBean) {
     this.testBean = testBean;
    }

    public TestBean getTestBean(TestBean testBean) {
        return testBean;
    }

}
