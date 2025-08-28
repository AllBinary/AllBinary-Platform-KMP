
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
        package org.allbinary.game.graphics.hud




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class BasicHudFactory
            : Object
         {
        

        companion object {
            
    private val instance: BasicHudFactory = BasicHudFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicHudFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
}


    val DIRECTION_EXCEPTION: String = "Only Horizontal Direction is Allowed Currently"

    val VERTICAL: Int = 0

    val HORIZONTAL: Int = 1

    val BOTTOMLEFT: Int = 0

    val BOTTOMRIGHT: Int = 1

    val TOPLEFT: Int = 2

    val TOPRIGHT: Int = 3

    val BOTTOMCENTER: Int = 4

    val TOPCENTER: Int = 5

    val ABSOLUTE: Int = 6

}
                
            

