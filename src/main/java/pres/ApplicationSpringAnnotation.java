package pres;

import metiers.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationSpringAnnotation {
    public static void mai(String[] args){
        ApplicationContext context=
                new AnnotationConfigApplicationContext("dao","metiers");
        IMetier metier=context.getBean(IMetier.class);
    }
}
