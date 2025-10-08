
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
        
import org.allbinary.thread.ARunnable
import org.allbinary.game.BasicHighScoresGameInfoFactory
import org.allbinary.game.GameInfo
import org.allbinary.game.GameType
import org.allbinary.game.GameTypeFactory
import org.allbinary.game.score.remote.RemoteHighScores
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.system.SoftwareInformation
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.thread.SecondaryThreadPool

open public class BasicHighScoresFactory : HighScoresBase {
        
companion object {
            
    open fun loaded(index2: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var index2 = index2

    
                        if(index2 >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val abeClientInformation: AbeClientInformationInterface

    private val softwareInformation: SoftwareInformation
public constructor (abeClientInformation: AbeClientInformationInterface, softwareInformation: SoftwareInformation){
    //var abeClientInformation = abeClientInformation
    //var softwareInformation = softwareInformation
this.abeClientInformation= abeClientInformation
this.softwareInformation= softwareInformation
}


    private val highScoresArray: Array<HighScores?> = arrayOfNulls(2)

    private val TOP: String = "Top"

    private val SCORES: String = "Scores"

    private val PERSONAL_HIGH_SCORES: String = "Personal Top Scores"

    private val WORLD_TOP_SCORES: String = "World Top Scores"

    private val FETCH: String = "fetchHighScores"

    open fun fetchHighScores(gameInfo: GameInfo, highScoresResultsListener: HighScoresResultsListener)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameInfo = gameInfo
    //var highScoresResultsListener = highScoresResultsListener
logUtil!!.put("Getting Remote/Local HighScores", this, FETCH)
this.fetchHighScores(gameInfo, highScoresResultsListener, true)
}


    open fun fetchHighScores(gameInfo: GameInfo, highScoresResultsListener: HighScoresResultsListener, preload: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameInfo = gameInfo
    //var highScoresResultsListener = highScoresResultsListener
    //var preload = preload
SecondaryThreadPool.getInstance()!!.runTask(object: ARunnable()
                                {
                                
    open fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            logUtil!!.put(commonStrings!!.START, this, FETCH)
highScoresArray[0]= RecordStoreHighScores.getInstance(abeClientInformation, gameInfo, TOP, PERSONAL_HIGH_SCORES, SCORES, ScoreComparator(true))

    var gameType: GameType = gameInfo!!.getGameType()!!


    var gameTypeFactory: GameTypeFactory = GameTypeFactory.getInstance()!!


    var gameInfo2: GameInfo = gameInfo


    
                        if(gameType == gameTypeFactory!!.SINGLE_PLAYER || gameType == gameTypeFactory!!.BOT)
                        
                                    {
                                    gameInfo2= BasicHighScoresGameInfoFactory.getInstance()!!.SINGLE_PLAYER_SERVER

                                    }
                                
                             else 
    
                        if(gameType == gameTypeFactory!!.MULTI_PLAYER)
                        
                                    {
                                    gameInfo2= BasicHighScoresGameInfoFactory.getInstance()!!.MULTI_PLAYER_SERVER

                                    }
                                
highScoresArray[1]= RemoteHighScores.getInstance(abeClientInformation, softwareInformation, gameInfo2, WORLD_TOP_SCORES, SCORES, BooleanFactory.getInstance()!!.FALSE, preload)
logUtil!!.put(commonStrings!!.END, this, FETCH)
LastFetchHighScoresFactory.getInstance()!!.highScoresArray= highScoresArray
highScoresResultsListener!!.setHighScoresArray(highScoresArray)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, FETCH, e)
}

}

                                }
                            )
}


    open fun createHighScoresHelper()
        //nullable = true from not(false or (false and true)) = true
: HighScoresHelperBase{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HighScoresHelper2()
}


}
                
            

