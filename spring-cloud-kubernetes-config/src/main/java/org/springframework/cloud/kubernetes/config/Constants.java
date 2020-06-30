/*
 * Copyright 2013-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.kubernetes.config;

final class Constants {

	static final String SPRING_APPLICATION_NAME = "spring.application.name";
	static final String FALLBACK_APPLICATION_NAME = "application";
	static final String PROPERTY_SOURCE_NAME_SEPARATOR = ".";
	static final String APP_VERSION = "info.app.version";

	private Constants() {
	}

}
