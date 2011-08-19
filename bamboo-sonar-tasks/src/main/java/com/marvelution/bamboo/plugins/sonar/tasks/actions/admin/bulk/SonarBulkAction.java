/*
 * Licensed to Marvelution under one or more contributor license 
 * agreements.  See the NOTICE file distributed with this work 
 * for additional information regarding copyright ownership.
 * Marvelution licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.marvelution.bamboo.plugins.sonar.tasks.actions.admin.bulk;

import java.util.Map;

import com.atlassian.bamboo.collections.ActionParametersMap;
import com.atlassian.bamboo.utils.error.ErrorCollection;
import com.atlassian.bamboo.ww2.actions.admin.bulk.BulkAction;
import com.marvelution.bamboo.plugins.sonar.tasks.configuration.SonarTaskConfigurator;

/**
 * Sonar specific {@link BulkAction} implementation
 * 
 * @author <a href="mailto:markrekveld@marvelution.com">Mark Rekveld</a>
 */
public interface SonarBulkAction extends BulkAction {

	/**
	 * Method to validate the new Task Configuration using the {@link SonarTaskConfigurator}
	 * 
	 * @param taskConfigurator the {@link SonarTaskConfigurator}
	 */
	void validateTaskConfiguration(SonarTaskConfigurator taskConfigurator, ActionParametersMap params,
					ErrorCollection errorCollection);

	/**
	 * Get the Task Configuration {@link Map} of items that this Bulk Action handles
	 * 
	 * @param params {@link Map} of action context parameters
	 * @return the {@link Map} of configuration items, may not be <code>null</code>
	 */
	Map<String, String> getTaskConfigurationMap(Map<String, String[]> params);

}
