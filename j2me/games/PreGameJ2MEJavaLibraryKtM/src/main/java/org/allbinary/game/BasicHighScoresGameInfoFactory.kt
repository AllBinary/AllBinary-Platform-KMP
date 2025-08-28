
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
        

open public class BasicHighScoresGameInfoFactory
            : Object
         {
        

        companion object {
            
    private val SINGLETON: BasicHighScoresGameInfoFactory = BasicHighScoresGameInfoFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicHighScoresGameInfoFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val MULTI_PLAYER_SERVER: GameInfo = GameInfo(GameTypeFactory.getInstance()!!.MULTI_PLAYER, GameMode.SERVER, 0, 0)

    val SINGLE_PLAYER_SERVER: GameInfo = GameInfo(GameTypeFactory.getInstance()!!.SINGLE_PLAYER, GameMode.SERVER, 0, 0)

}
                
            

