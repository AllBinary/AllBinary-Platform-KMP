
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
        
import java.util.Hashtable
import org.allbinary.game.GameInfo
import org.allbinary.game.GameInfoData
import org.allbinary.game.configuration.GameConfigurationCentral
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.xmlrpc.XmlRpcAbeClient
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.system.security.crypt.jcehelper.NoCrypt
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings
import org.allbinary.util.HashtableUtil

open public class RemoteHighScoresProcessor
            : Object
        
                , RemoteHighScoresProcessorInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val noCrypt: NoCrypt = NoCrypt()
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun process(remoteHighScores: RemoteHighScores, abeClientInformation: AbeClientInformationInterface, gameInfo: GameInfo)
        //nullable = true from not(false or (false and false)) = true
{

                    var remoteHighScores = remoteHighScores


                    var abeClientInformation = abeClientInformation


                    var gameInfo = gameInfo
logUtil!!.put("Begin Remote HighScores Retrieval", this, commonStrings!!.PROCESS)

    var gameInfoData: GameInfoData = GameInfoData.getInstance()!!


    var hashtable: Hashtable<Any, Any> = abeClientInformation!!.toHashtable()!!

HashtableUtil.getInstance()!!.putAll(gameInfo!!.toHashtable(), hashtable)
hashtable.put(gameInfoData!!.SOFTWARE_INFORMATION, remoteHighScores!!.getSoftwareInformation()!!.toString())
hashtable.put(remoteHighScores!!.ASCENDING, remoteHighScores!!.getAscending()!!.toString())

    var displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

hashtable.put(displayInfoSingleton!!.ORIENTATION, BooleanFactory.getInstance()!!.toString(displayInfoSingleton!!.isPortrait()))
hashtable.put(RemoteHighScoresData.getInstance()!!.GAME_CONFIGURATION, GameConfigurationCentral.getInstance()!!.toString())

    
                        if(XmlRpcAbeClient.isOnline)
                        
                                    {
                                    
    var resultHashtable: Hashtable<Any, Any> = XmlRpcRemoteHighScoresClient(abeClientInformation, "highscoresservicessl.php", "HighScoresService.process").
                            get(hashtable, noCrypt) as Hashtable<Any, Any>

remoteHighScores!!.update(resultHashtable)

                                    }
                                
}


}
                
            

