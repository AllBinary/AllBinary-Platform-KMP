
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.GameInfo
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.logic.string.StringUtil

open public class EndGameInfo
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val NORMAL_GAME_OVER_WIN: String = "You Won"

    private val TEASER_DEMO_GAME_END_LAST_LEVEL: String = "End of Demo."

    private val TEASER_DEMO_GAME_END: String = "Demo Game Over."

    private var gameOverStr: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var winStr: String = this.gameOverStr

open fun update(gameInfo: GameInfo, myCanvas: MyCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameInfo = gameInfo
    //var myCanvas = myCanvas

    
                        if(gameInfo!!.isLastLevel())
                        
                                    {
                                    this.setWinStr(TEASER_DEMO_GAME_END_LAST_LEVEL)
this.setGameOverStr(TEASER_DEMO_GAME_END_LAST_LEVEL)

                                    }
                                
                        else {
                            this.setWinStr(NORMAL_GAME_OVER_WIN)
this.setGameOverStr(TEASER_DEMO_GAME_END)

                        }
                            
}


open fun getGameOverStr()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameOverStr
}


open fun setGameOverStr(gameOverStr: String)
        //nullable = true from not(false or (false and false)) = true
{
var gameOverStr = gameOverStr
this.gameOverStr= gameOverStr
}


open fun getWinStr()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return winStr
}


open fun setWinStr(winStr: String)
        //nullable = true from not(false or (false and false)) = true
{
var winStr = winStr
this.winStr= winStr
}


}
                
            

