/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.formatting2.regionaccess;

/**
 * <p>Represents a comment.</p>
 * 
 * <p>For Xtext languages extending common.Terminals, these are tokens parsed with the terminal rules 'ML_COMMENT' and
 * 'SL_COMMENT'.</p>
 * 
 * @author Moritz Eysholdt - Initial contribution and API
 * 
 * @see IWhitespace
 * @see IHiddenRegionPart
 * 
 * @since 2.8
 */
public interface IComment extends IHiddenRegionPart {

}