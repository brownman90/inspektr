/**
 * Licensed to Inspektr under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Inspektr licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.github.inspektr.audit.spi.support;

import java.util.ArrayList;
import java.util.List;

/**
 * Returns the parameters as an array of strings.
 *
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 1.0.0
 */
public class ParametersAsStringResourceResolver extends AbstractAuditResourceResolver {

    protected String[] createResource(final Object[] args) {
        final List<String> stringArgs = new ArrayList<String>();

        for (final Object arg : args) {
            stringArgs.add(arg.toString());
        }

        return stringArgs.toArray(new String[stringArgs.size()]);
    }
}
