package io.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An aggregation of all security definitions.
 */
@Target (ElementType.ANNOTATION_TYPE)
@Retention (RetentionPolicy.RUNTIME)
public @interface SecurityDefinition {

    /**
     * OAuth security definition objects
     *
     * @return OAuth security definition objects
     */
    OAuth2Definition[] oAuth2Definitions() default {};

    /**
     * API Key security definition objects
     *
     * @return API Key security definition objects
     */
    ApiKeyAuthDefinition[] apiKeyAuthDefintions() default {};

    /**
     * Basic auth security definition objects
     *
     * @return basic auth security definition objects
     */
    BasicAuthDefinition[] basicAuthDefinions() default {};
}
