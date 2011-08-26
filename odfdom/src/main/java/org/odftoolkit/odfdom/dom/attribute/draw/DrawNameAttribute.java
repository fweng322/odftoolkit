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
package org.odftoolkit.odfdom.dom.attribute.draw;

import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfAttribute;
import org.odftoolkit.odfdom.OdfElement;import org.odftoolkit.odfdom.dom.element.draw.DrawCaptionElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCircleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawConnectorElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawControlElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCustomShapeElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawEllipseElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawEquationElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawFillImageElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawFrameElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawGElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawGradientElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawHatchElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawLayerElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawLineElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawMarkerElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawMeasureElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawOpacityElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPageElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPageThumbnailElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawParamElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPathElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolylineElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRectElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRegularPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawStrokeDashElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeAnnotationElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgLinearGradientElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgRadialGradientElement;
     
/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute draw:name}.
 *
 */
public class DrawNameAttribute extends OdfAttribute {

	public static final OdfName ATTRIBUTE_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.DRAW), "name" );

	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute draw:name}.
	 * 
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public DrawNameAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}
	
	/**
	 * Returns the attribute name.
	 * 
	 * @return the <code>OdfName</code> for {@odf.attribute draw:name}.
	 */
	@Override
	public OdfName getOdfName() {
		return ATTRIBUTE_NAME;
	}
	
	/**
	 * @return Returns the name of this attribute.
	 */
	@Override
	public String getName() {
		return ATTRIBUTE_NAME.getLocalName();
	}

	/**
	 * @param attrValue The <code>String</code> value of the attribute.
	 */
	@Override
	public void setValue(String attrValue) {
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof DrawCaptionElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawCircleElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawConnectorElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawControlElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawCustomShapeElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawEllipseElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawEquationElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawFillImageElement ){
					//2DO: need validate value against StyleName
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawFrameElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawGElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawGradientElement ){
					//2DO: need validate value against StyleName
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawHatchElement ){
					//2DO: need validate value against StyleName
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawLayerElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawLineElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawMarkerElement ){
					//2DO: need validate value against StyleName
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawMeasureElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawOpacityElement ){
					//2DO: need validate value against StyleName
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawPageElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawPageThumbnailElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawParamElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawPathElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawPolygonElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawPolylineElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawRectElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawRegularPolygonElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawStrokeDashElement ){
					//2DO: need validate value against StyleName
					super.setValue(attrValue);
				}else if( parentElement instanceof OfficeAnnotationElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof SvgLinearGradientElement ){
					//2DO: need validate value against StyleName
					super.setValue(attrValue);
				}else if( parentElement instanceof SvgRadialGradientElement ){
					//2DO: need validate value against StyleName
					super.setValue(attrValue);
				}			
			} catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw (e);
			}
		}else{
			//2DO:what should do when the owner element is null?
			super.setValue(attrValue);
		}
	}
    
	/**
	 * @return Returns the <code>String</code> value of the attribute
	 */
	@Override
	public String getValue(){
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof DrawCaptionElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawCircleElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawConnectorElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawControlElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawCustomShapeElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawEllipseElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawEquationElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawFillImageElement ){
					//2DO: need validate value against StyleName
					return super.getValue();
				}else if( parentElement instanceof DrawFrameElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawGElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawGradientElement ){
					//2DO: need validate value against StyleName
					return super.getValue();
				}else if( parentElement instanceof DrawHatchElement ){
					//2DO: need validate value against StyleName
					return super.getValue();
				}else if( parentElement instanceof DrawLayerElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawLineElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawMarkerElement ){
					//2DO: need validate value against StyleName
					return super.getValue();
				}else if( parentElement instanceof DrawMeasureElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawOpacityElement ){
					//2DO: need validate value against StyleName
					return super.getValue();
				}else if( parentElement instanceof DrawPageElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawPageThumbnailElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawParamElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawPathElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawPolygonElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawPolylineElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawRectElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawRegularPolygonElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawStrokeDashElement ){
					//2DO: need validate value against StyleName
					return super.getValue();
				}else if( parentElement instanceof OfficeAnnotationElement ){
					return super.getValue();
				}else if( parentElement instanceof SvgLinearGradientElement ){
					//2DO: need validate value against StyleName
					return super.getValue();
				}else if( parentElement instanceof SvgRadialGradientElement ){
					//2DO: need validate value against StyleName
					return super.getValue();
				}			
			} catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw new NumberFormatException("the value of draw:name is not valid");
			}
		}else{
			//2DO:what should do when the owner element is null?
			return super.getValue();
		}
		return null;
	}
	
	/**
	 * Returns the default value of {@odf.attribute draw:name}.
	 * 
	 * @return the default value as <code>String</code> dependent of its element name
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		return null;
	}
	
	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 * 
	 * @return <code>true</code> if draw:name has an element parent 
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return false;
	}
	
	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
    
	}
}
