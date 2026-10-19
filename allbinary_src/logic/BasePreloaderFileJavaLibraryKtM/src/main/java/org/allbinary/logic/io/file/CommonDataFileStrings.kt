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
            return CommonDataFileStrings.instance
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

    val CPP: String = "cpp"

    val _CPP: String = ".cpp"

    val H: String = "h"

    val _H: String = ".h"

    val PY: String = "py"

    val _PY: String = ".py"

    val GO: String = "go"

    val _GO: String = ".go"

    val CS: String = "cs"

    val _CS: String = ".cs"

    val ADB: String = "adb"

    val _ADB: String = ".adb"

    val ADS: String = "ads"

    val _ADS: String = ".ads"

    val ADA: String = "ada"

    val _ADA: String = ".ada"

    val RUST: String = "rs"

    val _RUST: String = ".rs"

    val C: String = "c"

    val _C: String = ".c"

    val CSHARP: String = "cs"

    val _CSHARP: String = ".cs"

    val ERL: String = "erl"

    val _ERL: String = ".erl"

    val HS: String = "hs"

    val _HS: String = ".hs"

    val HX: String = "hx"

    val _HX: String = ".hx"

    val LUA: String = "lua"

    val _LUA: String = ".lua"

    val PAS: String = "pas"

    val _PAS: String = ".pas"

    val ML: String = "ml"

    val _ML: String = ".ml"

    val PL: String = "pl"

    val _PL: String = ".pl"

    val RB: String = "rb"

    val _RB: String = ".rb"

    val ZIG: String = "zig"

    val _ZIG: String = ".zig"

    val UNCRYPTED_EXTENSION: String = this.XML

    val ENCRYPTED_EXTENSION: String = "abd"
}
