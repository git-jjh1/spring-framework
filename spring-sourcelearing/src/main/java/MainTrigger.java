import com.sourcelearning.service.TestTriggerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTrigger {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(ScanConfig.class);
		//context.addBeanFactoryPostProcessor();
		TestTriggerService triggerService = context.getBean(TestTriggerService.class);
		triggerService.test();
	}

}
