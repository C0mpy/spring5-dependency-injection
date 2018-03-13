package compi.springframework.config;

import compi.springframework.beans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${compi.username}")
    String user;

    @Value("${compi.password}")
    String passwrod;

    @Value("${compi.url}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(passwrod);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

}
