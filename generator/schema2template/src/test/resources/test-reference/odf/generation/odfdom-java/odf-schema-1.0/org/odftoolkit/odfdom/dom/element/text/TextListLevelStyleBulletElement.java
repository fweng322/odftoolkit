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
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.style.StyleListLevelPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTextPropertiesElement;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumPrefixAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumSuffixAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextBulletCharAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextBulletRelativeSizeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextStyleNameAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:list-level-style-bullet}.
 *
 */
public class TextListLevelStyleBulletElement extends TextListLevelStyleElementBase {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "list-level-style-bullet");

	/**
	 * Create the instance of <code>TextListLevelStyleBulletElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextListLevelStyleBulletElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:list-level-style-bullet}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumPrefixAttribute</code> , See {@odf.attribute style:num-prefix}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNumPrefixAttribute() {
		StyleNumPrefixAttribute attr = (StyleNumPrefixAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "num-prefix");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumPrefixAttribute</code> , See {@odf.attribute style:num-prefix}
	 *
	 * @param styleNumPrefixValue   The type is <code>String</code>
	 */
	public void setStyleNumPrefixAttribute(String styleNumPrefixValue) {
		StyleNumPrefixAttribute attr = new StyleNumPrefixAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleNumPrefixValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumSuffixAttribute</code> , See {@odf.attribute style:num-suffix}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNumSuffixAttribute() {
		StyleNumSuffixAttribute attr = (StyleNumSuffixAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "num-suffix");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumSuffixAttribute</code> , See {@odf.attribute style:num-suffix}
	 *
	 * @param styleNumSuffixValue   The type is <code>String</code>
	 */
	public void setStyleNumSuffixAttribute(String styleNumSuffixValue) {
		StyleNumSuffixAttribute attr = new StyleNumSuffixAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleNumSuffixValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextBulletCharAttribute</code> , See {@odf.attribute text:bullet-char}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextBulletCharAttribute() {
		TextBulletCharAttribute attr = (TextBulletCharAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "bullet-char");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextBulletCharAttribute</code> , See {@odf.attribute text:bullet-char}
	 *
	 * @param textBulletCharValue   The type is <code>String</code>
	 */
	public void setTextBulletCharAttribute(String textBulletCharValue) {
		TextBulletCharAttribute attr = new TextBulletCharAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textBulletCharValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextBulletRelativeSizeAttribute</code> , See {@odf.attribute text:bullet-relative-size}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextBulletRelativeSizeAttribute() {
		TextBulletRelativeSizeAttribute attr = (TextBulletRelativeSizeAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "bullet-relative-size");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextBulletRelativeSizeAttribute</code> , See {@odf.attribute text:bullet-relative-size}
	 *
	 * @param textBulletRelativeSizeValue   The type is <code>String</code>
	 */
	public void setTextBulletRelativeSizeAttribute(String textBulletRelativeSizeValue) {
		TextBulletRelativeSizeAttribute attr = new TextBulletRelativeSizeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textBulletRelativeSizeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStyleNameAttribute() {
		TextStyleNameAttribute attr = (TextStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @param textStyleNameValue   The type is <code>String</code>
	 */
	public void setTextStyleNameAttribute(String textStyleNameValue) {
		TextStyleNameAttribute attr = new TextStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textStyleNameValue);
	}

	/**
	 * Create child element {@odf.element style:list-level-properties}.
	 *
	 * @return the element {@odf.element style:list-level-properties}
	 */
	public StyleListLevelPropertiesElement newStyleListLevelPropertiesElement() {
		StyleListLevelPropertiesElement styleListLevelProperties = ((OdfFileDom) this.ownerDocument).newOdfElement(StyleListLevelPropertiesElement.class);
		this.appendChild(styleListLevelProperties);
		return styleListLevelProperties;
	}

	/**
	 * Create child element {@odf.element style:text-properties}.
	 *
	 * @return the element {@odf.element style:text-properties}
	 */
	public StyleTextPropertiesElement newStyleTextPropertiesElement() {
		StyleTextPropertiesElement styleTextProperties = ((OdfFileDom) this.ownerDocument).newOdfElement(StyleTextPropertiesElement.class);
		this.appendChild(styleTextProperties);
		return styleTextProperties;
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
