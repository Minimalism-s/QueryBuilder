/*
 * Copyright (c) 2017.
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

package com.itfsw.query.builder.support.filter;

import com.itfsw.query.builder.exception.FilterException;
import com.itfsw.query.builder.support.model.IRule;
import com.itfsw.query.builder.support.model.JsonRule;

/**
 * ---------------------------------------------------------------------------
 *
 * ---------------------------------------------------------------------------
 * @author: hewei
 * @time:2017/11/2 10:03
 * ---------------------------------------------------------------------------
 */
public class ValueConvertFilter implements IRuleFilter {
    @Override
    public void doFilter(JsonRule jsonRule) throws FilterException {
        if (!jsonRule.isGroup()) {
            IRule rule = jsonRule.toRule();


        }
    }
}