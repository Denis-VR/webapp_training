package rest.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		//указываем null, т.к. у нас не будет файлов root конфигурации
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//указываем java файл с конфигурацией
		return new Class[]{MyConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		//указываем url
		return new String[]{"/"};
	}
}
