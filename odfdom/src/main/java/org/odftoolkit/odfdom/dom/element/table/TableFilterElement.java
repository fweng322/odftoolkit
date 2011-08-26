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
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableTargetRangeAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableConditionSourceAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableConditionSourceRangeAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableDisplayDuplicatesAttribute;

import org.odftoolkit.odfdom.dom.attribute.table.TableFieldNumberAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableOperatorAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableValueAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:filter}.
 *
 */
public abstract class TableFilterElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "filter" );


	/**
	 * Create the instance of <code>TableFilterElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableFilterElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:filter}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTargetRangeAddressAttribute</code> , See {@odf.attribute table:target-range-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableTargetRangeAddressAttribute()
	{
		TableTargetRangeAddressAttribute attr = (TableTargetRangeAddressAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "target-range-address" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTargetRangeAddressAttribute</code> , See {@odf.attribute table:target-range-address}
	 *
	 * @param tableTargetRangeAddressValue   The type is <code>String</code>
	 */
	public void setTableTargetRangeAddressAttribute( String tableTargetRangeAddressValue )
	{
		TableTargetRangeAddressAttribute attr =  new TableTargetRangeAddressAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableTargetRangeAddressValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableConditionSourceAttribute</code> , See {@odf.attribute table:condition-source}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableConditionSourceAttribute()
	{
		TableConditionSourceAttribute attr = (TableConditionSourceAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "condition-source" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return TableConditionSourceAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableConditionSourceAttribute</code> , See {@odf.attribute table:condition-source}
	 *
	 * @param tableConditionSourceValue   The type is <code>String</code>
	 */
	public void setTableConditionSourceAttribute( String tableConditionSourceValue )
	{
		TableConditionSourceAttribute attr =  new TableConditionSourceAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableConditionSourceValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableConditionSourceRangeAddressAttribute</code> , See {@odf.attribute table:condition-source-range-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableConditionSourceRangeAddressAttribute()
	{
		TableConditionSourceRangeAddressAttribute attr = (TableConditionSourceRangeAddressAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "condition-source-range-address" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableConditionSourceRangeAddressAttribute</code> , See {@odf.attribute table:condition-source-range-address}
	 *
	 * @param tableConditionSourceRangeAddressValue   The type is <code>String</code>
	 */
	public void setTableConditionSourceRangeAddressAttribute( String tableConditionSourceRangeAddressValue )
	{
		TableConditionSourceRangeAddressAttribute attr =  new TableConditionSourceRangeAddressAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableConditionSourceRangeAddressValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableDisplayDuplicatesAttribute</code> , See {@odf.attribute table:display-duplicates}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableDisplayDuplicatesAttribute()
	{
		TableDisplayDuplicatesAttribute attr = (TableDisplayDuplicatesAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "display-duplicates" ) );
		if( attr != null ){
		 	return Boolean.valueOf( attr.getBooleanValue() );
		}
		return Boolean.valueOf( TableDisplayDuplicatesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableDisplayDuplicatesAttribute</code> , See {@odf.attribute table:display-duplicates}
	 *
	 * @param tableDisplayDuplicatesValue   The type is <code>Boolean</code>
	 */
	public void setTableDisplayDuplicatesAttribute( Boolean tableDisplayDuplicatesValue )
	{
		TableDisplayDuplicatesAttribute attr =  new TableDisplayDuplicatesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableDisplayDuplicatesValue.booleanValue() );
	}

	/**
	 * Create child element {@odf.element table:filter-condition}.
	 *
     * @param tableFieldNumberAttributeValue  the <code>int</code> value of <code>TableFieldNumberAttribute</code>, see {@odf.attribute  table:field-number} at specification
	 * @param tableOperatorAttributeValue  the <code>String</code> value of <code>TableOperatorAttribute</code>, see {@odf.attribute  table:operator} at specification
	 * @param tableValueAttributeValue  the <code>String</code> value of <code>TableValueAttribute</code>, see {@odf.attribute  table:value} at specification
	 * @return   return  the element {@odf.element table:filter-condition}
	 * DifferentQName 
	 */
    
	public TableFilterConditionElement newTableFilterConditionElement(int tableFieldNumberAttributeValue, String tableOperatorAttributeValue, String tableValueAttributeValue)
	{
		TableFilterConditionElement  tableFilterCondition = ((OdfFileDom)this.ownerDocument).newOdfElement(TableFilterConditionElement.class);
		tableFilterCondition.setTableFieldNumberAttribute( Integer.valueOf(tableFieldNumberAttributeValue) );
		tableFilterCondition.setTableOperatorAttribute( tableOperatorAttributeValue );
		tableFilterCondition.setTableValueAttribute( tableValueAttributeValue );
		this.appendChild( tableFilterCondition);
		return  tableFilterCondition;      
	}
    
	/**
	 * Create child element {@odf.element table:filter-and}.
	 *
	 * @return   return  the element {@odf.element table:filter-and}
	 * DifferentQName 
	 */
	public TableFilterAndElement newTableFilterAndElement()
	{
		TableFilterAndElement  tableFilterAnd = ((OdfFileDom)this.ownerDocument).newOdfElement(TableFilterAndElement.class);
		this.appendChild( tableFilterAnd);
		return  tableFilterAnd;
	}                   
               
	/**
	 * Create child element {@odf.element table:filter-or}.
	 *
	 * @return   return  the element {@odf.element table:filter-or}
	 * DifferentQName 
	 */
	public TableFilterOrElement newTableFilterOrElement()
	{
		TableFilterOrElement  tableFilterOr = ((OdfFileDom)this.ownerDocument).newOdfElement(TableFilterOrElement.class);
		this.appendChild( tableFilterOr);
		return  tableFilterOr;
	}                   
               
}
