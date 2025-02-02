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
package org.l2x6.cq.maven;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PatternSet {

    private static final PatternSet EMPTY = new PatternSet(Collections.emptyList());

    public static PatternSet empty() {
        return EMPTY;
    }

    private final List<Pattern> patterns;

    PatternSet(Collection<String> rawPatterns) {
        this.patterns = rawPatterns.stream()
                .map(Pattern::compile)
                .collect(Collectors.toList());
    }

    public boolean matchesAny(String string) {
        if (patterns.isEmpty()) {
            return false;
        }
        return patterns.stream()
                .anyMatch(pat -> pat.matcher(string).matches());
    }
}
