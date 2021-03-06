/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.ext.preferences.shared.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

/**
 * Annotation used to qualify preference beans.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface WorkbenchPreference {

    /**
     * Defines if a preference is a root preference, which means it will appear in the first
     * level of the hierarchic structure printed in the configuration screen.
     * @return True if it is a root preference, and false otherwise.
     */
    boolean root() default true;

    /**
     * Defines a bundle key that will be used to internationalize the property's label wherever
     * its necessary. It's expected that the TranslationService will have access to the key
     * translation.
     * @return The preference bundle key.
     */
    String bundleKey() default "";
}
