
        /* Generated Code Do Not Modify */
        package org.allbinary.game.score




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.GameInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.SoftwareInformation
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

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
public constructor        (abeClientInformation: AbeClientInformationInterface, softwareInformation: SoftwareInformation){
    //var abeClientInformation = abeClientInformation
    //var softwareInformation = softwareInformation
this.abeClientInformation= abeClientInformation
}


    private val highScoresArray: Array<HighScores?> = arrayOfNulls(1)

    private val TOP: String = "Top"

    private val SCORES: String = "Scores"

    private val PERSONAL_HIGH_SCORES: String = "Personal Top Scores"

    private val FETCH: String = "fetchHighScores"
override fun fetchHighScores(gameInfo: GameInfo, highScoresResultsListener: HighScoresResultsListener)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameInfo = gameInfo
    //var highScoresResultsListener = highScoresResultsListener
logUtil!!.put("Getting Local HighScores", this, FETCH)
this.fetchHighScores(gameInfo, highScoresResultsListener, true)
}

override fun fetchHighScores(gameInfo: GameInfo, highScoresResultsListener: HighScoresResultsListener, preload: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameInfo = gameInfo
    //var highScoresResultsListener = highScoresResultsListener
    //var preload = preload

        try {
            highScoresArray[0]= RecordStoreHighScores.getInstance(abeClientInformation, gameInfo, TOP, PERSONAL_HIGH_SCORES, SCORES, ScoreComparator(true))
highScoresResultsListener!!.setHighScoresArray(highScoresArray)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, FETCH, e)
}

}

override fun createHighScoresHelper()
        //nullable = true from not(false or (false and true)) = true
: HighScoresHelperBase{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HighScoresHelper2()
}


}
                
            

