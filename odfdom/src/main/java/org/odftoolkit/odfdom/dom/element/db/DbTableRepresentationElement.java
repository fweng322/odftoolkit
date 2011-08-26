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

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.db.DbNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbCatalogNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbSchemaNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbDescriptionAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbDefaultRowStyleNameAttribute;

import org.odftoolkit.odfdom.dom.attribute.db.DbCommandAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbCommandAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element db:table-representation}.
 *
 */
public abstract class DbTableRepresentationElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "table-representation" );


	/**
	 * Create the instance of <code>DbTableRepresentationElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbTableRepresentationElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:table-representation}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DbTableRepresentationElement}
	 *
     * @param dbNameAttributeValue  The mandatory attribute {@odf.attribute  db:name}"
     *
	 */
	public void init(String dbNameAttributeValue)
	{
		setDbNameAttribute( dbNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbNameAttribute()
	{
		DbNameAttribute attr = (DbNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * @param dbNameValue   The type is <code>String</code>
	 */
	public void setDbNameAttribute( String dbNameValue )
	{
		DbNameAttribute attr =  new DbNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbCatalogNameAttribute</code> , See {@odf.attribute db:catalog-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbCatalogNameAttribute()
	{
		DbCatalogNameAttribute attr = (DbCatalogNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "catalog-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbCatalogNameAttribute</code> , See {@odf.attribute db:catalog-name}
	 *
	 * @param dbCatalogNameValue   The type is <code>String</code>
	 */
	public void setDbCatalogNameAttribute( String dbCatalogNameValue )
	{
		DbCatalogNameAttribute attr =  new DbCatalogNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbCatalogNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbSchemaNameAttribute</code> , See {@odf.attribute db:schema-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbSchemaNameAttribute()
	{
		DbSchemaNameAttribute attr = (DbSchemaNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "schema-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbSchemaNameAttribute</code> , See {@odf.attribute db:schema-name}
	 *
	 * @param dbSchemaNameValue   The type is <code>String</code>
	 */
	public void setDbSchemaNameAttribute( String dbSchemaNameValue )
	{
		DbSchemaNameAttribute attr =  new DbSchemaNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbSchemaNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbTitleAttribute</code> , See {@odf.attribute db:title}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbTitleAttribute()
	{
		DbTitleAttribute attr = (DbTitleAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "title" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbTitleAttribute</code> , See {@odf.attribute db:title}
	 *
	 * @param dbTitleValue   The type is <code>String</code>
	 */
	public void setDbTitleAttribute( String dbTitleValue )
	{
		DbTitleAttribute attr =  new DbTitleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbTitleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbDescriptionAttribute</code> , See {@odf.attribute db:description}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbDescriptionAttribute()
	{
		DbDescriptionAttribute attr = (DbDescriptionAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "description" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbDescriptionAttribute</code> , See {@odf.attribute db:description}
	 *
	 * @param dbDescriptionValue   The type is <code>String</code>
	 */
	public void setDbDescriptionAttribute( String dbDescriptionValue )
	{
		DbDescriptionAttribute attr =  new DbDescriptionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbDescriptionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbStyleNameAttribute</code> , See {@odf.attribute db:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbStyleNameAttribute()
	{
		DbStyleNameAttribute attr = (DbStyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "style-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbStyleNameAttribute</code> , See {@odf.attribute db:style-name}
	 *
	 * @param dbStyleNameValue   The type is <code>String</code>
	 */
	public void setDbStyleNameAttribute( String dbStyleNameValue )
	{
		DbStyleNameAttribute attr =  new DbStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbDefaultRowStyleNameAttribute</code> , See {@odf.attribute db:default-row-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbDefaultRowStyleNameAttribute()
	{
		DbDefaultRowStyleNameAttribute attr = (DbDefaultRowStyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.DB), "default-row-style-name" ) );
		if( attr != null ){
		 	return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbDefaultRowStyleNameAttribute</code> , See {@odf.attribute db:default-row-style-name}
	 *
	 * @param dbDefaultRowStyleNameValue   The type is <code>String</code>
	 */
	public void setDbDefaultRowStyleNameAttribute( String dbDefaultRowStyleNameValue )
	{
		DbDefaultRowStyleNameAttribute attr =  new DbDefaultRowStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbDefaultRowStyleNameValue );
	}

	/**
	 * Create child element {@odf.element db:order-statement}.
	 *
     * @param dbCommandAttributeValue  the <code>String</code> value of <code>DbCommandAttribute</code>, see {@odf.attribute  db:command} at specification
	 * @return   return  the element {@odf.element db:order-statement}
	 * DifferentQName 
	 */
    
	public DbOrderStatementElement newDbOrderStatementElement(String dbCommandAttributeValue)
	{
		DbOrderStatementElement  dbOrderStatement = ((OdfFileDom)this.ownerDocument).newOdfElement(DbOrderStatementElement.class);
		dbOrderStatement.setDbCommandAttribute( dbCommandAttributeValue );
		this.appendChild( dbOrderStatement);
		return  dbOrderStatement;      
	}
    
	/**
	 * Create child element {@odf.element db:filter-statement}.
	 *
     * @param dbCommandAttributeValue  the <code>String</code> value of <code>DbCommandAttribute</code>, see {@odf.attribute  db:command} at specification
	 * @return   return  the element {@odf.element db:filter-statement}
	 * DifferentQName 
	 */
    
	public DbFilterStatementElement newDbFilterStatementElement(String dbCommandAttributeValue)
	{
		DbFilterStatementElement  dbFilterStatement = ((OdfFileDom)this.ownerDocument).newOdfElement(DbFilterStatementElement.class);
		dbFilterStatement.setDbCommandAttribute( dbCommandAttributeValue );
		this.appendChild( dbFilterStatement);
		return  dbFilterStatement;      
	}
    
	/**
	 * Create child element {@odf.element db:columns}.
	 *
	 * @return   return  the element {@odf.element db:columns}
	 * DifferentQName 
	 */
	public DbColumnsElement newDbColumnsElement()
	{
		DbColumnsElement  dbColumns = ((OdfFileDom)this.ownerDocument).newOdfElement(DbColumnsElement.class);
		this.appendChild( dbColumns);
		return  dbColumns;
	}                   
               
}
