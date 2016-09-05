package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import sun.nio.ch.sctp.SctpChannelImpl;

/**
 * Created by Vitalii on 4/12/2016.
 */
public class Main {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        //GenericXmlApplicationContext context = new GenericXmlApplicationContext("spring-context.xml");
        TestBeanInterface testBeanInterface = (TestBeanInterface) context.getBean("testBeanInterface");

        String name = testBeanInterface.getBeanName(new TestBean("Wetal"));
        System.out.print(name);
    }
}
