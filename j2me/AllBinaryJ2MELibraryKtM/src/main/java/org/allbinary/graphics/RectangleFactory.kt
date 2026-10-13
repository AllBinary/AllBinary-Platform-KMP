/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2011 AllBinary
 *
 *  By agreeing to this license you and any business entity you represent are
 *  legally bound to the AllBinary Open License Version 1 legal agreement.
 *
 *  You may obtain the AllBinary Open License Version 1 legal agreement from
 *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
 *
 *  Created By: Travis Berthelot
 */

/* Generated Code Do Not Modify */
package org.allbinary.graphics

import java.lang.Object
import kotlin.Array

open public class RectangleFactory : Object {

    companion object {

        val SINGLETON: Rectangle = Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, 0, 0)

        val ARRAY_OF_ARRAYS: Array<Array<Rectangle?>?> = Array(0) { arrayOfNulls<Rectangle?>(0) }
    }

    // Auto Generated
    public constructor() : super() {}
}
