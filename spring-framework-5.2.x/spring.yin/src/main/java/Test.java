import com.demo.app.Config;
import com.demo.service.Aservice;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext("BService");
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		ac.getBean(Aservice.class).send();
//		GenericBeanDefinition beanDefinition  = new GenericBeanDefinition();







//##########################################################################################################################








		 new Thread(()->{}).start();
		 Thread t1 = new Thread();
		 Thread.currentThread().interrupt();

//		Executors.newSingleThreadExecutor()

		ReentrantLock lock = new ReentrantLock();
	}
}
