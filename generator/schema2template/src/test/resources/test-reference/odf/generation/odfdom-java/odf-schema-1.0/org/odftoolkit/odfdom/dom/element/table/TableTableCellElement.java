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

import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.table.TableNumberColumnsSpannedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNumberMatrixColumnsSpannedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNumberMatrixRowsSpannedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNumberRowsSpannedAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:table-cell}.
 *
 */
public class TableTableCellElement extends TableTableCellElementBase {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "table-cell");

	/**
	 * Create the instance of <code>TableTableCellElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableTableCellElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME, OdfStyleFamily.TableCell, OdfName.newName(OdfDocumentNamespace.TABLE, "style-name"));
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:table-cell}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNumberColumnsSpannedAttribute</code> , See {@odf.attribute table:number-columns-spanned}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableNumberColumnsSpannedAttribute() {
		TableNumberColumnsSpannedAttribute attr = (TableNumberColumnsSpannedAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "number-columns-spanned");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return Integer.valueOf(TableNumberColumnsSpannedAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNumberColumnsSpannedAttribute</code> , See {@odf.attribute table:number-columns-spanned}
	 *
	 * @param tableNumberColumnsSpannedValue   The type is <code>Integer</code>
	 */
	public void setTableNumberColumnsSpannedAttribute(Integer tableNumberColumnsSpannedValue) {
		TableNumberColumnsSpannedAttribute attr = new TableNumberColumnsSpannedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableNumberColumnsSpannedValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNumberMatrixColumnsSpannedAttribute</code> , See {@odf.attribute table:number-matrix-columns-spanned}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableNumberMatrixColumnsSpannedAttribute() {
		TableNumberMatrixColumnsSpannedAttribute attr = (TableNumberMatrixColumnsSpannedAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "number-matrix-columns-spanned");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNumberMatrixColumnsSpannedAttribute</code> , See {@odf.attribute table:number-matrix-columns-spanned}
	 *
	 * @param tableNumberMatrixColumnsSpannedValue   The type is <code>Integer</code>
	 */
	public void setTableNumberMatrixColumnsSpannedAttribute(Integer tableNumberMatrixColumnsSpannedValue) {
		TableNumberMatrixColumnsSpannedAttribute attr = new TableNumberMatrixColumnsSpannedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableNumberMatrixColumnsSpannedValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNumberMatrixRowsSpannedAttribute</code> , See {@odf.attribute table:number-matrix-rows-spanned}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableNumberMatrixRowsSpannedAttribute() {
		TableNumberMatrixRowsSpannedAttribute attr = (TableNumberMatrixRowsSpannedAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "number-matrix-rows-spanned");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNumberMatrixRowsSpannedAttribute</code> , See {@odf.attribute table:number-matrix-rows-spanned}
	 *
	 * @param tableNumberMatrixRowsSpannedValue   The type is <code>Integer</code>
	 */
	public void setTableNumberMatrixRowsSpannedAttribute(Integer tableNumberMatrixRowsSpannedValue) {
		TableNumberMatrixRowsSpannedAttribute attr = new TableNumberMatrixRowsSpannedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableNumberMatrixRowsSpannedValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNumberRowsSpannedAttribute</code> , See {@odf.attribute table:number-rows-spanned}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableNumberRowsSpannedAttribute() {
		TableNumberRowsSpannedAttribute attr = (TableNumberRowsSpannedAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "number-rows-spanned");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return Integer.valueOf(TableNumberRowsSpannedAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNumberRowsSpannedAttribute</code> , See {@odf.attribute table:number-rows-spanned}
	 *
	 * @param tableNumberRowsSpannedValue   The type is <code>Integer</code>
	 */
	public void setTableNumberRowsSpannedAttribute(Integer tableNumberRowsSpannedValue) {
		TableNumberRowsSpannedAttribute attr = new TableNumberRowsSpannedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableNumberRowsSpannedValue.intValue());
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

  @Override
  public boolean isComponentRoot() {
    return true;
  }

}
