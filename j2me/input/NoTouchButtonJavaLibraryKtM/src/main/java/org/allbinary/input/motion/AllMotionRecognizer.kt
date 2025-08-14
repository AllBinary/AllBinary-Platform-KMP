
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
        package org.allbinary.input.motion




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class AllMotionRecognizer
            : Object
         {
        

        companion object {
            
    private var index: Int = 0

        }
            
    private val id: Int
public constructor        ()
            : super()
        {this.id= index++
}


                @Throws(Exception::class)
            
open fun processStartMotionEvent(x: Int, y: Int, deviceId: Int, modifiers: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y


                    var deviceId = deviceId


                    var modifiers = modifiers
}


                @Throws(Exception::class)
            
open fun processEndMotionEvent(x: Int, y: Int, deviceId: Int, modifiers: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y


                    var deviceId = deviceId


                    var modifiers = modifiers
}


                @Throws(Exception::class)
            
open fun processDraggedMotionEvent(x: Int, y: Int, deviceId: Int, modifiers: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y


                    var deviceId = deviceId


                    var modifiers = modifiers
}


                @Throws(Exception::class)
            
open fun processMovedMotionEvent(x: Int, y: Int, deviceId: Int, modifiers: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y


                    var deviceId = deviceId


                    var modifiers = modifiers
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


}
                
            

