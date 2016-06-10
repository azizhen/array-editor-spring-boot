package hendricks.za.co.config;

import hendricks.za.co.arrayutils.CropUtil;
import hendricks.za.co.arrayutils.FillUtil;
import hendricks.za.co.arrayutils.ReplaceUtil;
import hendricks.za.co.arrayutils.SmoothUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Spring Config
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
@Configuration
public class Config {

    @Bean
    public CropUtil cropUtil() {
        return new CropUtil();
    }

    @Bean
    public FillUtil fillUtil() {
        return new FillUtil();
    }

    @Bean
    public ReplaceUtil replaceUtil() {
        return new ReplaceUtil();
    }

    @Bean
    public SmoothUtil smoothUtil() {
        return new SmoothUtil();
    }
}