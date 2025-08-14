
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class GameKey : Input {
        

        companion object {
            
    val NULL_GAME_KEY: GameKey = GameKey( -1, StringUtil.getInstance()!!.NULL_STRING)

        }
             constructor        (key: Int, name: String)                        

                            : super(key, name){

                    var key = key


                    var name = name


                            //For kotlin this is before the body of the constructor.
                    
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(
                            "GameKey ")!!.append(super.toString())!!.toString()
}


}
                
            

