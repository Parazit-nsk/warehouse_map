package sk.fulfillment.warehouseMap;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import sk.fulfillment.warehouseMap.config.SpringConfig;
import sk.fulfillment.warehouseMap.config.WebConfig;

public class MainWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
