/* 
 * Copyright (C) 2010---2014 星星(wuweixing)<349446658@qq.com>
 * 
 * This file is part of Wabacus 
 * 
 * Wabacus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.wabacus.config.component.application.report.extendconfig;

import java.util.List;

import com.wabacus.config.component.application.report.SqlBean;
import com.wabacus.config.xml.XmlElementBean;

public interface ISqlExtendConfigLoad
{
    /*<sql/>标签*/
    public int beforeSqlLoading(SqlBean sqlbean,List<XmlElementBean> lstEleSqlBeans);

    public int afterSqlLoading(SqlBean sqlbean,List<XmlElementBean> lstEleSqlBeans);
}
