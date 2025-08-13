
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.media.audio



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class NoSound : Sound {
        

        companion object {
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NoSound{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    private val instance: NoSound = NoSound()

        }
            private constructor        ()                        

                            : super(StringUtil.getInstance()!!.EMPTY_STRING){

                            //For kotlin this is before the body of the constructor.
                    
this.setPlayerP(NoPlayer.NO_PLAYER)
}


}
                
            

