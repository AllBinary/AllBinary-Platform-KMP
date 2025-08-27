
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
        package org.allbinary.media.graphics.geography.map.racetrack




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class FinalPositionRaceTrackFactory
            : Object
         {
        

        companion object {
            
    val FIRST_POSITION: Int = 1

    private var index: Int = FIRST_POSITION
@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index++
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun reset()
        //nullable = true from not(false or (false and true)) = true
{index= FIRST_POSITION
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

