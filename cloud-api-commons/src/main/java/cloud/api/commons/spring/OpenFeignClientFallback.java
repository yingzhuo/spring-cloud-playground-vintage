package cloud.api.commons.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.TYPE,
        ElementType.METHOD
})
@Component
@Qualifier(value = "openFeignClientFallback")
public @interface OpenFeignClientFallback {
}
