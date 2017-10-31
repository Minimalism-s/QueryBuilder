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

package com.itfsw.query.builder.supports.builder;

import com.itfsw.query.builder.exception.ParserNotFoundException;
import com.itfsw.query.builder.supports.filter.IRuleFilter;
import com.itfsw.query.builder.supports.parser.IGroupParser;
import com.itfsw.query.builder.supports.parser.IRuleParser;

import java.io.IOException;
import java.util.List;

/**
 * ---------------------------------------------------------------------------
 * sql 构造
 * ---------------------------------------------------------------------------
 * @author: hewei
 * @time:2017/10/30 15:44
 * ---------------------------------------------------------------------------
 */
public class SqlBuilder extends AbstractBuilder {

    /**
     * 构造函数
     * @param queryStr
     * @param filters
     * @param ruleParsers
     * @param groupParser
     */
    public SqlBuilder(String queryStr, List<IRuleFilter> filters, List<IRuleParser> ruleParsers, IGroupParser groupParser) {
        super(queryStr, filters, ruleParsers, groupParser);
    }

    public boolean build() throws IOException, ParserNotFoundException {
        return false;
    }
}