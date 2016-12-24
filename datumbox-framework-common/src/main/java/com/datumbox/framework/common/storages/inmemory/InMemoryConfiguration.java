/**
 * Copyright (C) 2013-2016 Vasilis Vryniotis <bbriniotis@datumbox.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datumbox.framework.common.storages.inmemory;

import com.datumbox.framework.common.storages.abstracts.AbstractFileStorageConfiguration;
import com.datumbox.framework.common.storages.interfaces.StorageConnector;

import java.util.Properties;

/**
 * The InMemoryConfiguration class is used to configure the InMemory storage
 * and generate new storage connections. InMemory storage loads all the
 * data in memory and stores them in serialized files.
 * 
 * @author Vasilis Vryniotis <bbriniotis@datumbox.com>
 */
public class InMemoryConfiguration extends AbstractFileStorageConfiguration {

    /** {@inheritDoc} */
    @Override
    public StorageConnector getStorageConnector(String storageName) {
        return new InMemoryConnector(storageName, this);
    }

    /** {@inheritDoc} */
    @Override
    public void load(Properties properties) {
        outputDirectory = properties.getProperty("storageConfiguration.InMemoryConfiguration.outputDirectory");
    }

}