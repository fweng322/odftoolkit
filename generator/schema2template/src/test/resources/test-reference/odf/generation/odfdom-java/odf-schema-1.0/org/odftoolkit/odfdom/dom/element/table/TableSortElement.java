/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.table.TableAlgorithmAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableBindStylesToContentAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableCaseSensitiveAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableCountryAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableLanguageAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTargetRangeAddressAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:sort}.
 *
 */
public class TableSortElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "sort");

	/**
	 * Create the instance of <code>TableSortElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableSortElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:sort}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableAlgorithmAttribute</code> , See {@odf.attribute table:algorithm}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableAlgorithmAttribute() {
		TableAlgorithmAttribute attr = (TableAlgorithmAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "algorithm");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableAlgorithmAttribute</code> , See {@odf.attribute table:algorithm}
	 *
	 * @param tableAlgorithmValue   The type is <code>String</code>
	 */
	public void setTableAlgorithmAttribute(String tableAlgorithmValue) {
		TableAlgorithmAttribute attr = new TableAlgorithmAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableAlgorithmValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableBindStylesToContentAttribute</code> , See {@odf.attribute table:bind-styles-to-content}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableBindStylesToContentAttribute() {
		TableBindStylesToContentAttribute attr = (TableBindStylesToContentAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "bind-styles-to-content");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableBindStylesToContentAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableBindStylesToContentAttribute</code> , See {@odf.attribute table:bind-styles-to-content}
	 *
	 * @param tableBindStylesToContentValue   The type is <code>Boolean</code>
	 */
	public void setTableBindStylesToContentAttribute(Boolean tableBindStylesToContentValue) {
		TableBindStylesToContentAttribute attr = new TableBindStylesToContentAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableBindStylesToContentValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableCaseSensitiveAttribute</code> , See {@odf.attribute table:case-sensitive}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableCaseSensitiveAttribute() {
		TableCaseSensitiveAttribute attr = (TableCaseSensitiveAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "case-sensitive");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return TableCaseSensitiveAttribute.DEFAULT_VALUE_FALSE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableCaseSensitiveAttribute</code> , See {@odf.attribute table:case-sensitive}
	 *
	 * @param tableCaseSensitiveValue   The type is <code>String</code>
	 */
	public void setTableCaseSensitiveAttribute(String tableCaseSensitiveValue) {
		TableCaseSensitiveAttribute attr = new TableCaseSensitiveAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableCaseSensitiveValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableCountryAttribute</code> , See {@odf.attribute table:country}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableCountryAttribute() {
		TableCountryAttribute attr = (TableCountryAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "country");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableCountryAttribute</code> , See {@odf.attribute table:country}
	 *
	 * @param tableCountryValue   The type is <code>String</code>
	 */
	public void setTableCountryAttribute(String tableCountryValue) {
		TableCountryAttribute attr = new TableCountryAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableCountryValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableLanguageAttribute</code> , See {@odf.attribute table:language}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableLanguageAttribute() {
		TableLanguageAttribute attr = (TableLanguageAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "language");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableLanguageAttribute</code> , See {@odf.attribute table:language}
	 *
	 * @param tableLanguageValue   The type is <code>String</code>
	 */
	public void setTableLanguageAttribute(String tableLanguageValue) {
		TableLanguageAttribute attr = new TableLanguageAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableLanguageValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTargetRangeAddressAttribute</code> , See {@odf.attribute table:target-range-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableTargetRangeAddressAttribute() {
		TableTargetRangeAddressAttribute attr = (TableTargetRangeAddressAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "target-range-address");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTargetRangeAddressAttribute</code> , See {@odf.attribute table:target-range-address}
	 *
	 * @param tableTargetRangeAddressValue   The type is <code>String</code>
	 */
	public void setTableTargetRangeAddressAttribute(String tableTargetRangeAddressValue) {
		TableTargetRangeAddressAttribute attr = new TableTargetRangeAddressAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableTargetRangeAddressValue);
	}

	/**
	 * Create child element {@odf.element table:sort-by}.
	 *
	 * @param tableFieldNumberValue  the <code>Integer</code> value of <code>TableFieldNumberAttribute</code>, see {@odf.attribute  table:field-number} at specification
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element table:sort-by}
	 */
	 public TableSortByElement newTableSortByElement(int tableFieldNumberValue) {
		TableSortByElement tableSortBy = ((OdfFileDom) this.ownerDocument).newOdfElement(TableSortByElement.class);
		tableSortBy.setTableFieldNumberAttribute(tableFieldNumberValue);
		this.appendChild(tableSortBy);
		return tableSortBy;
	}

  /**
   * Accept an visitor instance to allow the visitor to do some operations. Refer to visitor design
   * pattern to get a better understanding.
   *
   * @param visitor an instance of DefaultElementVisitor
   */
	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}
