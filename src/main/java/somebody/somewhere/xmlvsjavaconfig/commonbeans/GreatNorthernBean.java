package somebody.somewhere.xmlvsjavaconfig.commonbeans;

import org.springframework.beans.*;
import org.springframework.beans.factory.config.*;

public class GreatNorthernBean implements CommonBean, BeanPostProcessor {
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("Post processing factory " + getClass().getCanonicalName());
    return bean;
  }
}