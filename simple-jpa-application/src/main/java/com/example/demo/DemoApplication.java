package com.example.demo;

import com.example.demo.config.DevBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
//        InvokerController controller = (InvokerController) ctx.getBean("invokerController");
//        controller.hello();
//        VehicleComponent component = (VehicleComponent) ctx.getBean("vComp");
//        component.service();
        ctx.getEnvironment().setActiveProfiles("dev");
        DevBean bean = ctx.getBean(DevBean.class);
        bean.setup();
    }
}
