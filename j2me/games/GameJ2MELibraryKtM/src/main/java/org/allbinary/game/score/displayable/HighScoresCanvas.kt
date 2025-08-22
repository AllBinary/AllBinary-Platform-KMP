
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
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import org.allbinary.game.GameInfo
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.game.displayable.canvas.GameCommandCanvas
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.paint.ColorFillBasePaintable
import org.allbinary.game.paint.ColorFillPaintableFactory
import org.allbinary.game.score.HighScoreCommandsFactory
import org.allbinary.game.score.HighScores
import org.allbinary.game.score.HighScoresCanvasInputProcessor
import org.allbinary.game.score.HighScoresCanvasInputProcessorFactoryInterface
import org.allbinary.game.score.HighScoresCanvasNoInputProcessorFactory
import org.allbinary.game.score.HighScoresFactoryInterface
import org.allbinary.game.score.HighScoresHelperBase
import org.allbinary.game.score.HighScoresPaintable
import org.allbinary.game.score.HighScoresResultsListener
import org.allbinary.game.score.NoHighScoresFactory
import org.allbinary.game.score.NullHighScoresSingletonFactory
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.graphics.paint.SimpleTextPaintable
import org.allbinary.logic.string.StringMaker
import org.allbinary.thread.NullRunnable
import org.allbinary.thread.SecondaryThreadPool

open public class HighScoresCanvas : GameCommandCanvas
                , HighScoresResultsListener {
        

        companion object {
            
    val NAME: String = "HighScoresCanvas"

        }
            
    private var paintable: Paintable = NullPaintable.getInstance()!!

    private val highScoreCommandsFactory: HighScoreCommandsFactory = HighScoreCommandsFactory.getInstance()!!

    private val waitPaintable: SimpleTextPaintable = SimpleTextPaintable(commonStrings!!.PLEASE_WAIT_FOR_SERVER, BasicColorFactory.getInstance()!!.WHITE)

    private val highScoresPaintable: HighScoresPaintable

    private val highScoresFactoryInterface: HighScoresFactoryInterface

    var colorFillPaintable: ColorFillBasePaintable

    private val highScoresHelper: HighScoresHelperBase = HighScoresHelperBase()

    private val gameInfo: GameInfo

    private val highScoresCanvasInputProcessor: HighScoresCanvasInputProcessor

    private var currentCommand: Command = highScoreCommandsFactory!!.HIGH_SCORE_COMMANDS[0]!!
public constructor        (commandListener: CommandListener, allBinaryGameLayerManager: AllBinaryGameLayerManager, paintable: HighScoresPaintable, highScoresFactoryInterface: HighScoresFactoryInterface)                        

                            : this(commandListener, allBinaryGameLayerManager, allBinaryGameLayerManager!!.getGameInfo(), paintable, highScoresFactoryInterface, HighScoresCanvasNoInputProcessorFactory()){

                    var commandListener = commandListener


                    var allBinaryGameLayerManager = allBinaryGameLayerManager


                    var paintable = paintable


                    var highScoresFactoryInterface = highScoresFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (commandListener: CommandListener, allBinaryGameLayerManager: AllBinaryGameLayerManager, gameInfo: GameInfo, paintable: HighScoresPaintable, highScoresFactoryInterface: HighScoresFactoryInterface, highScoresCanvasInputProcessorFactoryInterface: HighScoresCanvasInputProcessorFactoryInterface)                        

                            : super(commandListener, HighScoresCanvas.NAME, allBinaryGameLayerManager!!.getBackgroundBasicColor(), allBinaryGameLayerManager!!.getForegroundBasicColor()){

                    var commandListener = commandListener


                    var allBinaryGameLayerManager = allBinaryGameLayerManager


                    var gameInfo = gameInfo


                    var paintable = paintable


                    var highScoresFactoryInterface = highScoresFactoryInterface


                    var highScoresCanvasInputProcessorFactoryInterface = highScoresCanvasInputProcessorFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.highScoresPaintable= paintable
this.highScoresFactoryInterface= highScoresFactoryInterface
this.highScoresCanvasInputProcessor= highScoresCanvasInputProcessorFactoryInterface!!.getInstance(this)
this.gameInfo= gameInfo
this.waitPaintable!!.setBasicColorP(allBinaryGameLayerManager!!.getForegroundBasicColor())
this.getHighScoresPaintable()!!.setBasicColorP(allBinaryGameLayerManager!!.getForegroundBasicColor())
this.colorFillPaintable= ColorFillPaintableFactory.getInstance()!!.getInstance(allBinaryGameLayerManager!!.getBackgroundBasicColor(), false)

    
                        if(this.highScoresHelper!!.getHighScoresArray() == NoHighScoresFactory.getInstance()!!.NO_HIGH_SCORES)
                        
                                    {
                                    this.setPaintable(this.waitPaintable)

                                    }
                                
                        else {
                            logUtil!!.put("Show HighScores that are already loaded", this, commonStrings!!.CONSTRUCTOR)
this.updateCommand(this.currentCommand)
this.setPaintable(this.getHighScoresPaintable())

                        }
                            

    var features: Features = Features.getInstance()!!


    var isHTML: Boolean = features.isDefault(HTMLFeatureFactory.getInstance()!!.HTML)!!

SecondaryThreadPool.getInstance()!!.runTask(object: NullRunnable()
                                {
                                override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    
                        if(!isHTML)
                        
                                    {
                                    
        while(!hasPainted)
        {}

hasPainted= false

                                    }
                                

    var stringMaker: StringMaker = StringMaker()

logUtil!!.put(stringMaker!!.append("HighScoresCanvas - Request repaint to be sure: ")!!.append(System.currentTimeMillis())!!.toString(), this, commonStrings!!.RUN)
repaintBehavior!!.onChangeRepaint(this@HighScoresCanvas)

    
                        if(!isHTML)
                        
                                    {
                                    
        while(!hasPainted)
        {}


                                    }
                                
stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append("HighScoresCanvas - Now that the canvas has completed repaint go ahead and fetch the scores: ")!!.append(System.currentTimeMillis())!!.toString(), this, commonStrings!!.RUN)
executeUpdate()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            )
}

override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener
this.removeAllCommands()
this.addCommand(GameCommandsFactory.getInstance()!!.CLOSE_AND_SHOW_GAME_CANVAS)
this.setCommandListener(cmdListener)
}

override fun open()
        //nullable = true from not(false or (false and true)) = true
{super.open()
this.highScoresCanvasInputProcessor!!.open()
}

override fun close()
        //nullable = true from not(false or (false and true)) = true
{super.close()
this.highScoresCanvasInputProcessor!!.close()
}


    var hasPainted: Boolean = false
override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.colorFillPaintable!!.paint(graphics)
this.paintable.paint(graphics)

    
                        if(this.waitPaintable != this.paintable)
                        
                                    {
                                    this.highScoresCanvasInputProcessor!!.paint(graphics)

                                    }
                                
super.paint(graphics)
hasPainted= true
}


open fun executeUpdate()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.highScoresFactoryInterface!!.fetchHighScores(this.getGameInfo(), this)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.UPDATE, e)
}

}


open fun getHighScoresPaintable()
        //nullable = true from not(false or (false and true)) = true
: HighScoresPaintable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return highScoresPaintable
}

override fun setHighScoresArray(highScoresArray: Array<HighScores?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var highScoresArray = highScoresArray

        try {
            
    
                        if(highScoresArray != 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append(commonStrings!!.START)!!.append(highScoresArray!!.size)!!.toString(), this, "setHighScoresArray")

                                    }
                                
                        else {
                            logUtil!!.put(commonStrings!!.START, this, "setHighScoresArray")

                        }
                            
this.highScoresHelper!!.setHighScoresArray(highScoresArray)
this.updateCommand(this.currentCommand)
this.setPaintable(this.getHighScoresPaintable())
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.UPDATE, e)
}

}


                @Throws(Exception::class)
            
open fun updateCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command
logUtil!!.put(StringMaker().
                            append(commonStrings!!.START)!!.append(this.stringUtil!!.toString(command))!!.toString(), this, commonStrings!!.UPDATE)

    var gameCommandsFactory: GameCommandsFactory = GameCommandsFactory.getInstance()!!


    
                        if(highScoreCommandsFactory!!.isHighScoreCommand(command))
                        
                                    {
                                    
    var index: Int = highScoreCommandsFactory!!.getIndex(command)!!


    var nextIndex: Int = index +1


    var highScoresArray: Array<HighScores?> = this.highScoresHelper!!.getHighScoresArray()!!


    
                        if(nextIndex >= highScoresArray!!.size)
                        
                                    {
                                    nextIndex= 0

                                    }
                                

    
                        if(highScoresArray!!.size > 0)
                        
                                    {
                                    this.getHighScoresPaintable()!!.setHighScores(highScoresArray[index]!!)

                                    }
                                
                        else {
                            this.getHighScoresPaintable()!!.setHighScores(NullHighScoresSingletonFactory.getInstance())

                        }
                            

    
                        if(index != nextIndex)
                        
                                    {
                                    this.removeAllCommands()
this.addCommand(gameCommandsFactory!!.CLOSE_AND_SHOW_GAME_CANVAS)
this.addCommand(highScoreCommandsFactory!!.HIGH_SCORE_COMMANDS[nextIndex]!!)

                                    }
                                

                                    }
                                
this.currentCommand= command
this.close()
super.initMenu()
this.open()
this.repaintBehavior!!.onChangeRepaint(this)
}


open fun getGameInfo()
        //nullable = true from not(false or (false and true)) = true
: GameInfo{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameInfo
}


open fun setPaintable(paintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{

                    var paintable = paintable
this.paintable= paintable
this.repaintBehavior!!.onChangeRepaint(this)
}


}
                
            

