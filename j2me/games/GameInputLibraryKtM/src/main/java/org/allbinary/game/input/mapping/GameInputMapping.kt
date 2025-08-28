
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
        package org.allbinary.game.input.mapping




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.GameKey
import org.allbinary.logic.string.StringUtil

open public class GameInputMapping
            : Object
         {
        

    private var name: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var gameKey: GameKey = GameKey.NULL_GAME_KEY
public constructor        (name: String, gameKey: GameKey)
            : super()
        

        Updates for KMP build        
        {
var name = name
var gameKey = gameKey
this.setName(name)
this.setGameKey(gameKey)
}


open fun setGameKey(gameKey: GameKey)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var gameKey = gameKey
this.gameKey= gameKey
}


open fun getGameKey()
        //nullable = true from not(false or (false and true)) = true
: GameKey

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameKey
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var name = name
this.name= name
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


}
                
            

