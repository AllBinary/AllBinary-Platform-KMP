
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
        import kotlin.reflect.KClass
        

open public class ResizableListenerHandler
            : Object
         {
        

        companion object {
            
    private val instance: ResizableListenerHandler = ResizableListenerHandler()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ResizableListenerHandler{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun setListener(resizableListenerInterface: ResizableListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var resizableListenerInterface = resizableListenerInterface
}


open fun fire(isFullScreen: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var isFullScreen = isFullScreen
}


                @Throws(Exception::class)
            
open fun fireEvent(value: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
}


}
                
            

