package com.equisoft.mailservice.sdk.invoker;

import io.micronaut.core.annotation.NonNull;
import javax.annotation.meta.TypeQualifierDefault;
import java.lang.annotation.*;

/**
 * A common annotation to declare that fields are to be considered as
 * non-nullable by default for a given package.
 * <p>Leverages JSR-305 meta-annotations to indicate nullability in Java to common
 * tools with JSR-305 support and used by Kotlin to infer nullability of the API.
 * <p>Should be used at package level in association with {@link Nullable}
 * annotations at field level.
 * <p>
 * NOTE: This file has been copied from {@code org.springframework.lang}.
 *
 * @see NonNullApi
 * @see Nullable
 * @see NonNull
 */
@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@NonNull
@TypeQualifierDefault(ElementType.FIELD)
public @interface NonNullFields {
}
