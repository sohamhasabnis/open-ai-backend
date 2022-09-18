//package com.openai.openaicode.config;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.context.annotation.Description;
//import org.springframework.context.support.ResourceBundleMessageSource;
//import org.thymeleaf.spring5.SpringTemplateEngine;
//import org.thymeleaf.spring5.view.ThymeleafViewResolver;
//import org.thymeleaf.templatemode.TemplateMode;
//import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
//
//
//@Configuration
//public class ThymeleafConfig {
//
//    @Bean
//    @Description("Thymeleaf Template Resolver")
//    public ClassLoaderTemplateResolver templateResolver() {
//        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
//        templateResolver.setPrefix("templates/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setTemplateMode("HTML");
//        templateResolver.setOrder(1);
//        System.out.println("templateResolver.getPrefix() = " + templateResolver.getPrefix() + templateResolver.getName());
//        return templateResolver;
//    }
//
////    @Bean
////    public SpringResourceTemplateResolver templateResolver() {
////        // SpringResourceTemplateResolver automatically integrates with Spring's own
////        // resource resolution infrastructure, which is highly recommended.
////        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
////        templateResolver.setApplicationContext(new AnnotationConfigApplicationContext(this.getClass()));
////        templateResolver.setPrefix("templates/");
////        templateResolver.setSuffix(".html");
////        // HTML is the default value, added here for the sake of clarity.
////        templateResolver.setTemplateMode(TemplateMode.HTML);
////        // Template cache is true by default. Set to false if you want
////        // templates to be automatically updated when modified.
////        templateResolver.setCacheable(true);
////        return templateResolver;
////    }
//
////    @Bean
////    public SpringTemplateEngine templateEngine(){
////        // SpringTemplateEngine automatically applies SpringStandardDialect and
////        // enables Spring's own MessageSource message resolution mechanisms.
////        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
////        templateEngine.setTemplateResolver(templateResolver());
////        // Enabling the SpringEL compiler with Spring 4.2.4 or newer can
////        // speed up execution in most scenarios, but might be incompatible
////        // with specific cases when expressions in one template are reused
////        // across different data types, so this flag is "false" by default
////        // for safer backwards compatibility.
////        templateEngine.setEnableSpringELCompiler(true);
////        return templateEngine;
////    }
//
//    @Bean
//    @Description("Thymeleaf Template Engine")
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        templateEngine.setTemplateEngineMessageSource(messageSource());
//        return templateEngine;
//    }
//
//    @Bean
//    @Description("Thymeleaf View Resolver")
//    public ThymeleafViewResolver viewResolver() {
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(templateEngine());
//        viewResolver.setOrder(1);
//        return viewResolver;
//    }
//
//    @Bean
//    @Description("Spring Message Resolver")
//    public ResourceBundleMessageSource messageSource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename("messages");
//        return messageSource;
//    }
//
////    @Bean
////    public RestTemplate restTemplate() {
////        return new RestTemplate();
////    }
//}
