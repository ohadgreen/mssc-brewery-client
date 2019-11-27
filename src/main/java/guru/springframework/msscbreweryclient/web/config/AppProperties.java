package guru.springframework.msscbreweryclient.web.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "httpclient")
@Component
public class AppProperties {
    private Integer maxTotal;
    private Integer maxPerRoute;
    private Integer requestTimeout;
    private Integer socketTimeout;
}
