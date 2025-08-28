
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        package org.allbinary.game.input.form




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.identification.BasicGroupFactory

open public class NullRTSFormInputFactory
            : Object
         {
        

        companion object {
            
    private val SINGLETON: RTSFormInput = RTSFormInput(BasicGroupFactory.getInstance()!!.NONE_ARRAY)

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RTSFormInput{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

