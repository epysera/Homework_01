package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SimpleCustomerLogger simpleCustomerLogger = context.getBean(SimpleCustomerLogger.class);

        simpleCustomerLogger.log();

        Customer customer = new Customer(4,"Emil","Pe");
        Customer customer2 = new Customer(2,"Emilio","Pesos");
        MemoryCustomerRepository mCr = new MemoryCustomerRepository(simpleCustomerLogger);

        mCr.addCustomer(1,customer);
        mCr.addCustomer(2,customer2);


        context.close();



    }
}
