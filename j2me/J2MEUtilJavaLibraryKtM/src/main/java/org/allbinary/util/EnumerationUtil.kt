
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
        package org.allbinary.util




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Enumeration

open public class EnumerationUtil
            : Object
         {
        
companion object {
            
    private val instance: EnumerationUtil = EnumerationUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: EnumerationUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EnumerationUtil.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun hasMoreElements(enumeration: Enumeration<Any?>)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var enumeration = enumeration



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return enumeration.hasMoreElements()
}


    open fun nextElement(enumeration: Enumeration<Any?>)
        //nullable = true from not(false or (false and false)) = true
: Any{
    //var enumeration = enumeration



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return enumeration.hasMoreElements()
}


}
                
            

