/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2026 AllBinary
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
package org.allbinary.logic.io.file

import java.lang.Object

open public class CommonDataFileStrings : Object {

    companion object {

        private val instance: CommonDataFileStrings = CommonDataFileStrings()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : CommonDataFileStrings {

            // if statement needs to be on the same line and ternary does not work the same way.
            return instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    val XML: String = "xml"

    val _XML: String = ".xml"

    val JSON: String = "json"

    val _JSON: String = ".json"

    val XSL: String = "xsl"

    val _XSL: String = ".xsl"

    val JAVA: String = "java"

    val _JAVA: String = ".java"

    val KT: String = "kt"

    val _KT: String = ".kt"

    val TS: String = "ts"

    val _TS: String = ".ts"

    val JS: String = "js"

    val _JS: String = ".js"

    val UNCRYPTED_EXTENSION: String = this.XML

    val ENCRYPTED_EXTENSION: String = "abd"
}
