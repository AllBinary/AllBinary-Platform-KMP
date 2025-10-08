
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
        package org.allbinary.logic.string




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps

open public class SpecialCharacterUtil
            : Object
         {
        
companion object {
            
    open fun getHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

    var commonPhoneStrings: CommonPhoneStrings = CommonPhoneStrings.getInstance()!!


    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put("!", stringUtil!!.EMPTY_STRING)
hashMap!!.put("@", stringUtil!!.EMPTY_STRING)
hashMap!!.put(commonPhoneStrings!!.POUND, stringUtil!!.EMPTY_STRING)
hashMap!!.put("$", stringUtil!!.EMPTY_STRING)
hashMap!!.put("%", stringUtil!!.EMPTY_STRING)
hashMap!!.put("^", stringUtil!!.EMPTY_STRING)
hashMap!!.put(CommonSeps.getInstance()!!.AMP, stringUtil!!.EMPTY_STRING)
hashMap!!.put(commonPhoneStrings!!.STAR, stringUtil!!.EMPTY_STRING)
hashMap!!.put("(", stringUtil!!.EMPTY_STRING)
hashMap!!.put(")", stringUtil!!.EMPTY_STRING)
hashMap!!.put("-", stringUtil!!.EMPTY_STRING)
hashMap!!.put("_", stringUtil!!.EMPTY_STRING)
hashMap!!.put("+", stringUtil!!.EMPTY_STRING)
hashMap!!.put("=", stringUtil!!.EMPTY_STRING)
hashMap!!.put("\\", stringUtil!!.EMPTY_STRING)
hashMap!!.put("|", stringUtil!!.EMPTY_STRING)
hashMap!!.put(AbPathData.getInstance()!!.EXTENSION_SEP, stringUtil!!.EMPTY_STRING)
hashMap!!.put(",", stringUtil!!.EMPTY_STRING)
hashMap!!.put("<", stringUtil!!.EMPTY_STRING)
hashMap!!.put(">", stringUtil!!.EMPTY_STRING)
hashMap!!.put("?", stringUtil!!.EMPTY_STRING)
hashMap!!.put(AbPathData.getInstance()!!.SEPARATOR, stringUtil!!.EMPTY_STRING)
hashMap!!.put("~", stringUtil!!.EMPTY_STRING)
hashMap!!.put("`", stringUtil!!.EMPTY_STRING)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

