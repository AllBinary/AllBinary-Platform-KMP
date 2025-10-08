
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
        package org.allbinary.game




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class PlayerTypesFactory
            : Object
         {
        
companion object {
            
    private val SINGLETON: PlayerTypesFactory = PlayerTypesFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PlayerTypesFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val PLAYER_TYPE_ONE: PlayerType = PlayerType("Player Type One", 0)

    val PLAYER_TYPE_TWO: PlayerType = PlayerType("Player Type Two", 1)

    val PLAYER_TYPE_THREE: PlayerType = PlayerType("Player Type Three", 2)

}
                
            

