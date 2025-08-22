
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
        package org.allbinary.game.score




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.GameInfo
import org.allbinary.logic.communication.log.LogUtil

open public class NoHighScoresFactory : HighScoresBase {
        

        companion object {
            
    private val instance: NoHighScoresFactory = NoHighScoresFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NoHighScoresFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val NO_HIGH_SCORES: Array<HighScores?> = arrayOfNulls(0)
private constructor        (){}

override fun fetchHighScores(gameInfo: GameInfo, highScoresResultsListener: HighScoresResultsListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameInfo = gameInfo


                    var highScoresResultsListener = highScoresResultsListener
logUtil!!.put("Getting No HighScores", this, "fetchHighScores")
highScoresResultsListener!!.setHighScoresArray(NO_HIGH_SCORES)
}

override fun createHighScoresHelper()
        //nullable = true from not(false or (false and true)) = true
: HighScoresHelperBase{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HighScoresHelperBase()
}


}
                
            

