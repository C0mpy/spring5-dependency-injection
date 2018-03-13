package compi.springframework.config;

import compi.springframework.beans.FakeDataSource;
import compi.springframework.beans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
// @PropertySource({"classpath:datasource.properties", "classpath:jms.properties"}) this way, or:
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${compi.username}")
    String user;

    @Value("${compi.password}")
    String passwrod;

    @Value("${compi.dburl}")
    String url;

    @Value("${compi.jms.username}")
    String jmsUsername;

    @Value("${compi.jms.password}")
    String jmsPassword;

    @Value("${compi.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(passwrod);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    // this is what handles the properties files and allows us to use @Value
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
