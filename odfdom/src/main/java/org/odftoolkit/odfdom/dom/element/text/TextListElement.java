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
import org.odftoolkit.odfdom.dom.attribute.text.TextStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextContinueNumberingAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextContinueListAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;

;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:list}.
 *
 */
public abstract class TextListElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "list" );


	/**
	 * Create the instance of <code>TextListElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextListElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:list}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStyleNameAttribute()
	{
		TextStyleNameAttribute attr = (TextStyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "style-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @param textStyleNameValue   The type is <code>String</code>
	 */
	public void setTextStyleNameAttribute( String textStyleNameValue )
	{
		TextStyleNameAttribute attr =  new TextStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextContinueNumberingAttribute</code> , See {@odf.attribute text:continue-numbering}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextContinueNumberingAttribute()
	{
		TextContinueNumberingAttribute attr = (TextContinueNumberingAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "continue-numbering" ) );
		if( attr != null ){
		 	return Boolean.valueOf( attr.getBooleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextContinueNumberingAttribute</code> , See {@odf.attribute text:continue-numbering}
	 *
	 * @param textContinueNumberingValue   The type is <code>Boolean</code>
	 */
	public void setTextContinueNumberingAttribute( Boolean textContinueNumberingValue )
	{
		TextContinueNumberingAttribute attr =  new TextContinueNumberingAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textContinueNumberingValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextContinueListAttribute</code> , See {@odf.attribute text:continue-list}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextContinueListAttribute()
	{
		TextContinueListAttribute attr = (TextContinueListAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TEXT), "continue-list" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextContinueListAttribute</code> , See {@odf.attribute text:continue-list}
	 *
	 * @param textContinueListValue   The type is <code>String</code>
	 */
	public void setTextContinueListAttribute( String textContinueListValue )
	{
		TextContinueListAttribute attr =  new TextContinueListAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textContinueListValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute()
	{
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.XML), "id" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute( String xmlIdValue )
	{
		XmlIdAttribute attr =  new XmlIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xmlIdValue );
	}

	/**
	 * Create child element {@odf.element text:list-header}.
	 *
	 * @return   return  the element {@odf.element text:list-header}
	 * DifferentQName 
	 */
	public TextListHeaderElement newTextListHeaderElement()
	{
		TextListHeaderElement  textListHeader = ((OdfFileDom)this.ownerDocument).newOdfElement(TextListHeaderElement.class);
		this.appendChild( textListHeader);
		return  textListHeader;
	}                   
               
	/**
	 * Create child element {@odf.element text:list-item}.
	 *
	 * @return   return  the element {@odf.element text:list-item}
	 * DifferentQName 
	 */
	public TextListItemElement newTextListItemElement()
	{
		TextListItemElement  textListItem = ((OdfFileDom)this.ownerDocument).newOdfElement(TextListItemElement.class);
		this.appendChild( textListItem);
		return  textListItem;
	}                   
               
}
