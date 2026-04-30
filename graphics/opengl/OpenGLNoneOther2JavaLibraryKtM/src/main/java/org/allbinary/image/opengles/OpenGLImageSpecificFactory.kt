
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
        package org.allbinary.image.opengles




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class OpenGLImageSpecificFactory
            : Object
         {
        
companion object {
            
    private val instance: OpenGLImageSpecificFactory = OpenGLImageSpecificFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLImageSpecificFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OpenGLImageSpecificFactory.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var updating: Boolean = false

}
                
            

