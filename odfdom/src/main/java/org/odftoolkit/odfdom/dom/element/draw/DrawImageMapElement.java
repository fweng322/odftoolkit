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

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;


/**
 * DOM implementation of OpenDocument element  {@odf.element draw:image-map}.
 *
 */
public abstract class DrawImageMapElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.DRAW), "image-map" );


	/**
	 * Create the instance of <code>DrawImageMapElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawImageMapElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:image-map}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}


	/**
	 * Create child element {@odf.element draw:area-rectangle}.
	 *
     * @param svgHeightAttributeValue  the <code>String</code> value of <code>SvgHeightAttribute</code>, see {@odf.attribute  svg:height} at specification
	 * @param svgWidthAttributeValue  the <code>String</code> value of <code>SvgWidthAttribute</code>, see {@odf.attribute  svg:width} at specification
	 * @param svgXAttributeValue  the <code>String</code> value of <code>SvgXAttribute</code>, see {@odf.attribute  svg:x} at specification
	 * @param svgYAttributeValue  the <code>String</code> value of <code>SvgYAttribute</code>, see {@odf.attribute  svg:y} at specification
	 * @return   return  the element {@odf.element draw:area-rectangle}
	 * DifferentQName 
	 */
    
	public DrawAreaRectangleElement newDrawAreaRectangleElement(String svgHeightAttributeValue, String svgWidthAttributeValue, String svgXAttributeValue, String svgYAttributeValue)
	{
		DrawAreaRectangleElement  drawAreaRectangle = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawAreaRectangleElement.class);
		drawAreaRectangle.setSvgHeightAttribute( svgHeightAttributeValue );
		drawAreaRectangle.setSvgWidthAttribute( svgWidthAttributeValue );
		drawAreaRectangle.setSvgXAttribute( svgXAttributeValue );
		drawAreaRectangle.setSvgYAttribute( svgYAttributeValue );
		this.appendChild( drawAreaRectangle);
		return  drawAreaRectangle;      
	}
    
	/**
	 * Create child element {@odf.element draw:area-circle}.
	 *
     * @param svgCxAttributeValue  the <code>String</code> value of <code>SvgCxAttribute</code>, see {@odf.attribute  svg:cx} at specification
	 * @param svgCyAttributeValue  the <code>String</code> value of <code>SvgCyAttribute</code>, see {@odf.attribute  svg:cy} at specification
	 * @param svgRAttributeValue  the <code>String</code> value of <code>SvgRAttribute</code>, see {@odf.attribute  svg:r} at specification
	 * @return   return  the element {@odf.element draw:area-circle}
	 * DifferentQName 
	 */
    
	public DrawAreaCircleElement newDrawAreaCircleElement(String svgCxAttributeValue, String svgCyAttributeValue, String svgRAttributeValue)
	{
		DrawAreaCircleElement  drawAreaCircle = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawAreaCircleElement.class);
		drawAreaCircle.setSvgCxAttribute( svgCxAttributeValue );
		drawAreaCircle.setSvgCyAttribute( svgCyAttributeValue );
		drawAreaCircle.setSvgRAttribute( svgRAttributeValue );
		this.appendChild( drawAreaCircle);
		return  drawAreaCircle;      
	}
    
	/**
	 * Create child element {@odf.element draw:area-polygon}.
	 *
     * @param drawPointsAttributeValue  the <code>String</code> value of <code>DrawPointsAttribute</code>, see {@odf.attribute  draw:points} at specification
	 * @param svgHeightAttributeValue  the <code>String</code> value of <code>SvgHeightAttribute</code>, see {@odf.attribute  svg:height} at specification
	 * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @param svgWidthAttributeValue  the <code>String</code> value of <code>SvgWidthAttribute</code>, see {@odf.attribute  svg:width} at specification
	 * @param svgXAttributeValue  the <code>String</code> value of <code>SvgXAttribute</code>, see {@odf.attribute  svg:x} at specification
	 * @param svgYAttributeValue  the <code>String</code> value of <code>SvgYAttribute</code>, see {@odf.attribute  svg:y} at specification
	 * @return   return  the element {@odf.element draw:area-polygon}
	 * DifferentQName 
	 */
    
	public DrawAreaPolygonElement newDrawAreaPolygonElement(String drawPointsAttributeValue, String svgHeightAttributeValue, String svgViewBoxAttributeValue, String svgWidthAttributeValue, String svgXAttributeValue, String svgYAttributeValue)
	{
		DrawAreaPolygonElement  drawAreaPolygon = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawAreaPolygonElement.class);
		drawAreaPolygon.setDrawPointsAttribute( drawPointsAttributeValue );
		drawAreaPolygon.setSvgHeightAttribute( svgHeightAttributeValue );
		drawAreaPolygon.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		drawAreaPolygon.setSvgWidthAttribute( svgWidthAttributeValue );
		drawAreaPolygon.setSvgXAttribute( svgXAttributeValue );
		drawAreaPolygon.setSvgYAttribute( svgYAttributeValue );
		this.appendChild( drawAreaPolygon);
		return  drawAreaPolygon;      
	}
    
}