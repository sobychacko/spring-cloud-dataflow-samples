/*
 * Copyright 2020 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.spring.taskapp;

import org.junit.Rule;
import org.junit.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.system.OutputCaptureRule;

import static org.assertj.core.api.Assertions.assertThat;

public class TaskappApplicationTests {

	@Rule
	public OutputCaptureRule outputCapture = new OutputCaptureRule();

	@Test
	public void contextLoads() {
		String[] args = {"--taskapp.exitMessage=FOO"};
		SpringApplication.run(TaskappApplication.class, args);

		String output = this.outputCapture.toString();
		assertThat(output).contains(" exitMessage='FOO', errorMessage='null'");
	}

}