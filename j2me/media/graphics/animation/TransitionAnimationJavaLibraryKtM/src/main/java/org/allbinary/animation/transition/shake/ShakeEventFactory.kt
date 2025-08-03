
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
        package org.allbinary.animation.transition.shake



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ShakeEventFactory
            : Object
         {
        

        companion object {


    private val instance: ShakeEventFactory = ShakeEventFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ShakeEventFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var MICRO: ShakeEvent = ShakeEvent()

    var SMALL: ShakeEvent = ShakeEvent()

    var MEDIUM: ShakeEvent = ShakeEvent()

    var LARGE: ShakeEvent = ShakeEvent()

open fun init()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            

