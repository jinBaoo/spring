import com.demo.app.Config;
import com.demo.service.Aservice;
import com.demo.service.BService;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext("BService");
		//通过new 实例化spring容器
		/**
		 * 1.实例化spring容器
		 * 2.扫描符合springbean规则的class放到集合
		 * 3.遍历这个集合当中的类->封装成一个bd对象->put到 beanDefinitionMap
		 * 4.遍历beanDefinitionMap->得到bd对象
		 * 5，解析->validate
		 * 6.通过->bd->class
		 * 7,得到所有的构造方法->通过算法推断出合理的构造方法
		 * 8，通过这个合理的构造方法反射实例化一个对象
		 * 9，合并bd
		 * 10，提前暴露工厂 ->循环依赖
		 * 11，注入属性->判断是否需要完成属性填充
		 * 12，执行部分Aware接口
		 * 13.执行部分Aware接口->lifecycle callback annotation
		 * 14,lifecycle callback  interface
		 * 15.完成aop 事件分发
		 * 16，put singletonObjects
		 */
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		ac.getBean(BService.class);
//		GenericBeanDefinition beanDefinition  = new GenericBeanDefinition();


//		ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("");




//##########################################################################################################################








		 new Thread(()->{}).start();
		 Thread t1 = new Thread();
		 Thread.currentThread().interrupt();

//		Executors.newSingleThreadExecutor()

		ReentrantLock lock = new ReentrantLock();
	}
}
