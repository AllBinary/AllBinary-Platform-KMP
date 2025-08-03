
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.osgi.framework



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringUtil

open public class NullServiceReference
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getProperty(key: String)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var key = key



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_OBJECT
}


open fun getPropertyKeys()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.getArrayInstance()
}


open fun compareTo(o: Any)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var o = o



                            throw RuntimeException()
}


}
                
            

