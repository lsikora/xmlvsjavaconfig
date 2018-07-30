package somebody.somewhere.xmlvsjavaconfig.commonbeans;

import org.springframework.beans.*;
import org.springframework.beans.factory.config.*;

public class KidneyBean implements CommonBean, BeanFactoryPostProcessor {
  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    System.out.println("Post processing factory " + getClass().getCanonicalName());
  }
}
