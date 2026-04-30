
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
        package org.allbinary.game.score.displayable




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import org.allbinary.game.GameInfo
import org.allbinary.game.score.HighScore
import org.allbinary.game.score.HighScoreNamePersistanceSingleton
import org.allbinary.game.score.HighScores
import org.allbinary.game.score.HighScoresFactoryInterface
import org.allbinary.game.score.HighScoresHelperBase
import org.allbinary.game.score.HighScoresResultsListener
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings

open public class HighScoreUtil
            : Object
        
                , HighScoresResultsListener {
        
companion object {
            
    val SUBMIT_TEXTBOX_COMMAND: Command = Command("Submit", Command.SCREEN, 1)

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val highScoresFactoryInterface: HighScoresFactoryInterface

    private var highScoresArray: Array<HighScores?>

    private val highScore: HighScore

    private val abeClientInformation: AbeClientInformationInterface

    private val gameInfo: GameInfo

    private val highScoresHelper: HighScoresHelperBase

    private var firstTime: Boolean = true
public constructor (highScoresFactoryInterface: HighScoresFactoryInterface, highScoresHelper: HighScoresHelperBase, abeClientInformation: AbeClientInformationInterface, gameInfo: GameInfo, cmdListener: CommandListener, name: String, highScore: HighScore)
            : super()
        {
    //var highScoresFactoryInterface = highScoresFactoryInterface
    //var highScoresHelper = highScoresHelper
    //var abeClientInformation = abeClientInformation
    //var gameInfo = gameInfo
    //var cmdListener = cmdListener
    //var name = name
    //var highScore = highScore
this.highScoresFactoryInterface= highScoresFactoryInterface
this.highScoresHelper= highScoresHelper
this.highScoresArray= this.highScoresHelper!!.getHighScoresArray()
this.highScore= highScore
this.abeClientInformation= abeClientInformation
this.gameInfo= gameInfo
}


    override fun setHighScoresArray(highScoresArray: Array<HighScores?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var highScoresArray = highScoresArray
this.highScoresArray= highScoresArray
this.firstTime= false
this.saveHighScore()
}


    open fun update(name: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var name = name
HighScoreNamePersistanceSingleton.getInstance()!!.save(this.abeClientInformation, this.gameInfo, name)
this.highScore!!.setName(name)
}


    open fun saveHighScore()
        //nullable = true from not(false or (false and true)) = true
{
this.logUtil!!.putF(StringMaker().
                            append(this.commonStrings!!.START)!!.append(StringUtil.getInstance()!!.toString(this.highScore))!!.toString(), this, "saveHighScore")

    var size: Int = this.highScoresArray!!.size
                


    
                        if(this.firstTime && size == 0)
                        
                                    {
                                    this.logUtil!!.putF("Games canvas did not give us any HighScores", this, "saveHighScore")
this.highScoresFactoryInterface!!.fetchHighScores(this.gameInfo, this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var highScores: HighScores


    var highScoresAsString: String





                        for (index in 0 until size)

        {
highScores= this.highScoresArray[index]!!
highScores!!.addHighScore(this.highScore)
highScoresAsString= highScores!!.toString()
this.logUtil!!.putF(StringMaker().
                            append("Added/Adding Score: ")!!.append(highScoresAsString)!!.toString(), this, "saveHighScore")
}

this.highScoresHelper!!.setHighScoresArray(this.highScoresArray)
}


    open fun submit(myCanvas: MyCanvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var myCanvas = myCanvas

    var commandListener: CommandListener = myCanvas!!.getCustomCommandListener()!!

commandListener!!.commandAction(SUBMIT_TEXTBOX_COMMAND, myCanvas)
}


}
                
            

