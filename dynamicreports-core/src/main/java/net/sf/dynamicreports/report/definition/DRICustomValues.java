/**
 * DynamicReports - Free Java reporting library for creating reports dynamically
 *
 * Copyright (C) 2010 - 2012 Ricardo Mariaca
 * http://dynamicreports.sourceforge.net
 *
 * This file is part of DynamicReports.
 *
 * DynamicReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DynamicReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.dynamicreports.report.definition;

import java.util.List;

import net.sf.dynamicreports.jasper.base.tableofcontents.JasperTocHeading;

/**
 * @author Ricardo Mariaca (dynamicreports@gmail.com)
 */
public interface DRICustomValues {
	public static final String NAME = "CUSTOM_VALUES";

	public void setSystemValue(String name, Object value);

	public void addTocHeading(int level, String id, String text);

	public List<JasperTocHeading> getTocHeadings();

	public void setTocHeadings(List<JasperTocHeading> tocHeadings);
}
