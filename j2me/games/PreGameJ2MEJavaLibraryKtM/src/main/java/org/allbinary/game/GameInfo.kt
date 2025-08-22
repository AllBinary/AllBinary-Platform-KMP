
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps

open public class GameInfo
            : Object
         {
        

        companion object {
            
    val NONE: GameInfo = GameInfo(GameTypeFactory.getInstance()!!.NONE, GameMode.NONE,  -1,  -1)

    val LEVEL_NAME: String = "LEVEL"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val gameInfoData: GameInfoData = GameInfoData.getInstance()!!

    private val gameType: GameType

    private val gameMode: GameMode

    private val playerType: PlayerType

    private var highestLevel: Int= 0

    private var currentLevel: Int
public constructor        (gameType: GameType, gameMode: GameMode, highestLevel: Int, currentLevel: Int)
            : super()
        {

                    var gameType = gameType


                    var gameMode = gameMode


                    var highestLevel = highestLevel


                    var currentLevel = currentLevel
this.gameType= gameType
this.gameMode= gameMode
this.setHighestLevel(highestLevel)
this.currentLevel= currentLevel
this.playerType= PlayerTypesFactory.getInstance()!!.PLAYER_TYPE_ONE
}

public constructor        (gameType: GameType, gameMode: GameMode, playerType: PlayerType, highestLevel: Int, currentLevel: Int)
            : super()
        {

                    var gameType = gameType


                    var gameMode = gameMode


                    var playerType = playerType


                    var highestLevel = highestLevel


                    var currentLevel = currentLevel
this.gameType= gameType
this.gameMode= gameMode
this.setHighestLevel(highestLevel)
this.currentLevel= currentLevel
this.playerType= playerType
}


open fun getGameType()
        //nullable = true from not(false or (false and true)) = true
: GameType{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameType
}


open fun getGameMode()
        //nullable = true from not(false or (false and true)) = true
: GameMode{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameMode
}


open fun getPlayerType()
        //nullable = true from not(false or (false and true)) = true
: PlayerType{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return playerType
}


open fun getHighestLevel()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return highestLevel
}


open fun setHighestLevel(highestLevel: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var highestLevel = highestLevel
this.highestLevel= highestLevel
}


open fun getCurrentLevel()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentLevel
}


    private val NEW_LEVEL: String = "New Level: "

    private val SET_CURRENT_LEVEL: String = "setCurrentLevel"

open fun setCurrentLevel(currentLevel: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var currentLevel = currentLevel
this.currentLevel= currentLevel
logUtil!!.put(StringMaker().
                            append(NEW_LEVEL)!!.append(this.getCurrentLevel())!!.toString(), this, SET_CURRENT_LEVEL)
}


    private val NEXT: String = "Next "

    private val NEXT_GAME_LEVEL: String = "nextGameLevel"

open fun nextGameLevel()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.getCurrentLevel() < this.getHighestLevel())
                        
                                    {
                                    this.currentLevel++

                                    }
                                
logUtil!!.put(StringMaker().
                            append(NEXT)!!.append(NEW_LEVEL)!!.append(this.getCurrentLevel())!!.toString(), this, NEXT_GAME_LEVEL)
}


open fun previousGameLevel()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.getCurrentLevel() > 1)
                        this.currentLevel--
}


open fun isLastLevel()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.getCurrentLevel() >= this.getHighestLevel())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun toHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{
    var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

hashtable.put(this.gameInfoData!!.GAME_TYPE, this.getGameType()!!.toString())
hashtable.put(this.gameInfoData!!.GAME_MODE, this.gameMode!!.toString())
hashtable.put(this.gameInfoData!!.PLAYER_TYPE, this.playerType!!.toString())
hashtable.put(this.gameInfoData!!.HIGHEST_LEVEL, Integer.toString(this.getHighestLevel()))
hashtable.put(this.gameInfoData!!.CURRENT_LEVEL, this.currentLevel.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!

stringBuffer!!.append(this.gameInfoData!!.GAME_TYPE)
stringBuffer!!.append(commonSeps!!.EQUALS)
stringBuffer!!.append(this.getGameType()!!.toString())
stringBuffer!!.append(commonSeps!!.COMMA_SEP)
stringBuffer!!.append(this.gameInfoData!!.GAME_MODE)
stringBuffer!!.append(commonSeps!!.EQUALS)
stringBuffer!!.append(this.gameMode!!.toString())
stringBuffer!!.append(commonSeps!!.COMMA_SEP)
stringBuffer!!.append(this.gameInfoData!!.PLAYER_TYPE)
stringBuffer!!.append(commonSeps!!.EQUALS)
stringBuffer!!.append(StringUtil.getInstance()!!.toString(this.playerType))
stringBuffer!!.append(commonSeps!!.COMMA_SEP)
stringBuffer!!.append(this.gameInfoData!!.HIGHEST_LEVEL)
stringBuffer!!.append(commonSeps!!.EQUALS)
stringBuffer!!.append(this.getHighestLevel())
stringBuffer!!.append(commonSeps!!.COMMA_SEP)
stringBuffer!!.append(this.gameInfoData!!.CURRENT_LEVEL)
stringBuffer!!.append(commonSeps!!.EQUALS)
stringBuffer!!.append(this.currentLevel)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

