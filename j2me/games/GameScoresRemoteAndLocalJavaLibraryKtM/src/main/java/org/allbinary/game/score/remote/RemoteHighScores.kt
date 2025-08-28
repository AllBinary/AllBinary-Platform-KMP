
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
        package org.allbinary.game.score.remote




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Enumeration
import java.util.Hashtable
import java.util.Vector
import org.allbinary.game.GameInfo
import org.allbinary.game.score.HighScore
import org.allbinary.game.score.HighScores
import org.allbinary.game.score.RemoteErrorHighScoresSingletonFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.SoftwareInformation
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings

open public class RemoteHighScores : HighScores {
        

        companion object {
            
    private val hashTable: Hashtable<Any, Any> = Hashtable<Any, Any>()
@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getInstance(abeClientInformation: AbeClientInformationInterface, softwareInformation: SoftwareInformation, gameInfo: GameInfo, heading: String, columnTwoHeading: String, isAscending: Boolean)
        //nullable =  from not(true or (false and false)) = 
: HighScores

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation
    //var softwareInformation = softwareInformation
    //var gameInfo = gameInfo
    //var heading = heading
    //var columnTwoHeading = columnTwoHeading
    //var isAscending = isAscending



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return RemoteHighScores.getInstance(abeClientInformation, softwareInformation, gameInfo, heading, columnTwoHeading, isAscending, true)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getInstance(abeClientInformation: AbeClientInformationInterface, softwareInformation: SoftwareInformation, gameInfo: GameInfo, heading: String, columnTwoHeading: String, isAscending: Boolean, preload: Boolean)
        //nullable =  from not(true or (false and false)) = 
: HighScores

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation
    //var softwareInformation = softwareInformation
    //var gameInfo = gameInfo
    //var heading = heading
    //var columnTwoHeading = columnTwoHeading
    //var isAscending = isAscending
    //var preload = preload

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var highScores: HighScores = hashTable!!.get(gameInfo) as HighScores


    
                        if(highScores == 
                                    null
                                )
                        
                                    {
                                    highScores= RemoteHighScores(abeClientInformation, softwareInformation, gameInfo, heading, columnTwoHeading, isAscending, preload)
hashTable!!.put(gameInfo, highScores)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return highScores
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, RemoteErrorHighScoresSingletonFactory.getInstance(), commonStrings!!.GET_INSTANCE, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return RemoteErrorHighScoresSingletonFactory.getInstance()
}

}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val abeClientInformation: AbeClientInformationInterface

    private val softwareInformation: SoftwareInformation

    private var ascending: Boolean

    val ASCENDING: String = "ASCENDING"
private constructor        (abeClientInformation: AbeClientInformationInterface, softwareInformation: SoftwareInformation, gameInfo: GameInfo, heading: String, columnTwoHeading: String, ascending: Boolean, preload: Boolean)                        

                            : super(gameInfo!!.toString(), heading, columnTwoHeading)

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation
    //var softwareInformation = softwareInformation
    //var gameInfo = gameInfo
    //var heading = heading
    //var columnTwoHeading = columnTwoHeading
    //var ascending = ascending
    //var preload = preload


                            //For kotlin this is before the body of the constructor.
                    
this.abeClientInformation= abeClientInformation
this.softwareInformation= softwareInformation
this.setAscending(ascending)

    
                        if(preload)
                        
                                    {
                                    RemoteHighScoresProcessorFactory.getInstance()!!.process(this, this.abeClientInformation, gameInfo)

                                    }
                                
}


open fun addHighScore(newHighScore: HighScore)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var newHighScore = newHighScore
RemoteHighScoresSubmissionProcessorFactory.getInstance()!!.process(this, this.abeClientInformation, newHighScore)
}


open fun update(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var hashtable = hashtable
this.getList()!!.clear()

    var vector: Vector = hashtable.get(RemoteHighScoresData.getInstance()!!.HIGH_SCORES as Object) as Vector


    
                        if(vector != 
                                    null
                                )
                        
                                    {
                                    
    var size: Int = vector.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var highScoreVector: Vector = vector.elementAt(index) as Vector


    var displayName: String = highScoreVector!!.elementAt(0) as String


    var score: String = highScoreVector!!.elementAt(1) as String


    var longScore: Long = Long.parseLong(score)!!


    var highScore: HighScore = HighScore( -1, displayName, 
                            null, longScore)

this.getList()!!.add(highScore)
}


                                    }
                                
                        else {
                            
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var enumeration: Enumeration<Any?> = hashtable.elements()!!


    var nextElement: Any


        while(enumeration.hasMoreElements())
        

        Updates for KMP build        
        {
nextElement= enumeration.nextElement()!!
logUtil!!.put("NextElement: " +nextElement, this, commonStrings!!.PROCESS)
}


                        }
                            
}


open fun setAscending(ascending: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var ascending = ascending
this.ascending= ascending
}


open fun getAscending()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ascending
}


open fun getSoftwareInformation()
        //nullable = true from not(false or (false and true)) = true
: SoftwareInformation

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return softwareInformation
}


}
                
            

