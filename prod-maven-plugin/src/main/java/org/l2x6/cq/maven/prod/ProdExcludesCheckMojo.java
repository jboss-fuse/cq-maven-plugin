/**
 * Copyright (c) 2020 CQ Maven Plugin
 * project contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.l2x6.cq.maven.prod;

import org.apache.maven.plugins.annotations.Mojo;

/**
 */
@Mojo(name = "prod-excludes-check", threadSafe = true, requiresProject = false, inheritByDefault = false)
public class ProdExcludesCheckMojo extends ProdExcludesMojo {

    /**
     * @return {@code always true}
     */
    @Override
    protected boolean isChecking() {
        return true;
    }

}
