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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableNumberRowsRepeatedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableDefaultCellStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableVisibilityAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;

;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:table-row}.
 *
 */
public abstract class TableTableRowElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "table-row" );


	/**
	 * Create the instance of <code>TableTableRowElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableTableRowElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME, OdfStyleFamily.TableRow, OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "style-name" )	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:table-row}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNumberRowsRepeatedAttribute</code> , See {@odf.attribute table:number-rows-repeated}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableNumberRowsRepeatedAttribute()
	{
		TableNumberRowsRepeatedAttribute attr = (TableNumberRowsRepeatedAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "number-rows-repeated" ) );
		if( attr != null ){
		 	return Integer.valueOf( attr.getIntValue() );
		}
		return Integer.valueOf( TableNumberRowsRepeatedAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNumberRowsRepeatedAttribute</code> , See {@odf.attribute table:number-rows-repeated}
	 *
	 * @param tableNumberRowsRepeatedValue   The type is <code>Integer</code>
	 */
	public void setTableNumberRowsRepeatedAttribute( Integer tableNumberRowsRepeatedValue )
	{
		TableNumberRowsRepeatedAttribute attr =  new TableNumberRowsRepeatedAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( tableNumberRowsRepeatedValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableStyleNameAttribute()
	{
		TableStyleNameAttribute attr = (TableStyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "style-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @param tableStyleNameValue   The type is <code>String</code>
	 */
	public void setTableStyleNameAttribute( String tableStyleNameValue )
	{
		TableStyleNameAttribute attr =  new TableStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableDefaultCellStyleNameAttribute</code> , See {@odf.attribute table:default-cell-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableDefaultCellStyleNameAttribute()
	{
		TableDefaultCellStyleNameAttribute attr = (TableDefaultCellStyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "default-cell-style-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableDefaultCellStyleNameAttribute</code> , See {@odf.attribute table:default-cell-style-name}
	 *
	 * @param tableDefaultCellStyleNameValue   The type is <code>String</code>
	 */
	public void setTableDefaultCellStyleNameAttribute( String tableDefaultCellStyleNameValue )
	{
		TableDefaultCellStyleNameAttribute attr =  new TableDefaultCellStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableDefaultCellStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableVisibilityAttribute</code> , See {@odf.attribute table:visibility}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableVisibilityAttribute()
	{
		TableVisibilityAttribute attr = (TableVisibilityAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "visibility" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return TableVisibilityAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableVisibilityAttribute</code> , See {@odf.attribute table:visibility}
	 *
	 * @param tableVisibilityValue   The type is <code>String</code>
	 */
	public void setTableVisibilityAttribute( String tableVisibilityValue )
	{
		TableVisibilityAttribute attr =  new TableVisibilityAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableVisibilityValue );
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
	 * Create child element {@odf.element table:table-cell}.
	 *
	 * @return   return  the element {@odf.element table:table-cell}
	 * DifferentQName 
	 */
	public TableTableCellElement newTableTableCellElement()
	{
		TableTableCellElement  tableTableCell = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTableCellElement.class);
		this.appendChild( tableTableCell);
		return  tableTableCell;
	}                   
               
	/**
	 * Create child element {@odf.element table:covered-table-cell}.
	 *
	 * @return   return  the element {@odf.element table:covered-table-cell}
	 * DifferentQName 
	 */
	public TableCoveredTableCellElement newTableCoveredTableCellElement()
	{
		TableCoveredTableCellElement  tableCoveredTableCell = ((OdfFileDom)this.ownerDocument).newOdfElement(TableCoveredTableCellElement.class);
		this.appendChild( tableCoveredTableCell);
		return  tableCoveredTableCell;
	}                   
               
}
