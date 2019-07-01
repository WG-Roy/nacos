/*
 * Copyright (C) 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.nacos.address.constant;

import com.alibaba.nacos.naming.misc.UtilsAndCommons;

/**
 * Uniform constant parameter naming for address servers and default values ​​for related parameters
 *
 * @author pbting
 * @date 2019-06-17 7:23 PM
 */
public interface AddressServerConstants {


    /**
     *
     */
    int DEFAULT_SERVER_PORT = 8848;

    /**
     *
     */
    boolean SKIP_CLIENT_BEAT_CHECK_TASK = true;

    /**
     *
     */
    String DEFAULT_PRODUCT = "nacos";
    /**
     *
     */
    String IP_PORT_SEPARATOR = ":";

    /**
     *
     */
    String GROUP_SERVICE_NAME_SEP = "@@";

    /**
     *
     */
    String DEFAULT_GROUP = "DEFAULT_GROUP";

    /**
     *
     */
    String DEFAULT_NAMESPACE = "public";

    /**
     *
     */
    String DEFAULT_GET_CLUSTER = "serverlist";

    /**
     *
     */
    String MULTI_IPS_SEPARATOR = ";";

    /**
     * the default product name when deploy nacos with naming and config
     */
    String ALIWARE_NACOS_DEFAULT_PRODUCT_NAME = "aliware.nacos.dom";

    /**
     * when the config and naming will separate deploy,then must specify product name by the client。
     */
    String ALIWARE_NACOS_PRODUCT_DOM_TEMPLATE = "aliware.%s.dom";

    /**
     *
     */
    String ADDRESS_SERVER_REQUEST_URL =
            UtilsAndCommons.NACOS_SERVER_CONTEXT + UtilsAndCommons.NACOS_SERVER_VERSION + "/as";

    /**
     *
     */
    String ADDRESS_SERVER_REQUEST_URL_WITH_NONE_PREFIX = UtilsAndCommons.NACOS_SERVER_VERSION + "/as";
}