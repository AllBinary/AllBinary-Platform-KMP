
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.GameInfo
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.logic.string.StringUtil

open public class EndGameInfo
            : Object
         {
        

    private val NORMAL_GAME_OVER: String = "Game Over"

    val NORMAL_GAME_OVER_WIN: String = "You Won"

    private var gameOverStr: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var winStr: String = this.gameOverStr
public constructor        ()
            : super()
        {}


open fun update(gameInfo: GameInfo, myCanvas: MyCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameInfo = gameInfo


                    var myCanvas = myCanvas
this.setGameOverStr(this.NORMAL_GAME_OVER)
this.setWinStr(this.NORMAL_GAME_OVER_WIN)
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
                
            

