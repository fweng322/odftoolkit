/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
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

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextMasterPageNameAttribute;

;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:page}.
 *
 */
public abstract class TextPageElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "page" );


	/**
	 * Create the instance of <code>TextPageElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextPageElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:page}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextPageElement}
	 *
     * @param textMasterPageNameAttributeValue  The mandatory attribute {@odf.attribute  text:master-page-name}"
     *
	 */
	public void init(String textMasterPageNameAttributeValue)
	{
		setTextMasterPageNameAttribute( textMasterPageNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextMasterPageNameAttribute</code> , See {@odf.attribute text:master-page-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextMasterPageNameAttribute()
	{
		TextMasterPageNameAttribute attr = (TextMasterPageNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "master-page-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextMasterPageNameAttribute</code> , See {@odf.attribute text:master-page-name}
	 *
	 * @param textMasterPageNameValue   The type is <code>String</code>
	 */
	public void setTextMasterPageNameAttribute( String textMasterPageNameValue )
	{
		TextMasterPageNameAttribute attr =  new TextMasterPageNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textMasterPageNameValue );
	}

}
