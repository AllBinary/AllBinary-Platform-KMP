
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
        
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.TextField
import org.allbinary.PostGameCommandFactory
import org.allbinary.game.GameInfo
import org.allbinary.game.score.HighScore
import org.allbinary.game.score.HighScoresFactoryInterface
import org.allbinary.game.score.HighScoresHelperBase
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.form.item.CustomTextBox
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.graphics.paint.SimpleTextPaintable
import org.allbinary.input.event.VirtualKeyboardEventHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.logic.system.os.OperatingSystemFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.InApplicationPurchaseFactory

open public class HighScoreTextBox : CustomTextBox {
        

    private val virtualKeyboardEventHandler: VirtualKeyboardEventHandler = VirtualKeyboardEventHandler.getInstance()!!

    private val highScoreUtil: HighScoreUtil

    private val pleaseWait: Paintable = SimpleTextPaintable(commonStrings!!.PLEASE_WAIT, BasicColorFactory.getInstance()!!.WHITE)

    private var paintable: Paintable = NullPaintable.getInstance()!!

    var submitted: Boolean = false
public constructor        (highScoresFactoryInterface: HighScoresFactoryInterface, highScoresHelper: HighScoresHelperBase, abeClientInformation: AbeClientInformationInterface, gameInfo: GameInfo, cmdListener: CommandListener, name: String, highScore: HighScore, backgrounBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(cmdListener, "New High Score Enter Name:", name, 12, TextField.ANY, backgrounBasicColor, foregroundBasicColor){
    //var highScoresFactoryInterface = highScoresFactoryInterface
    //var highScoresHelper = highScoresHelper
    //var abeClientInformation = abeClientInformation
    //var gameInfo = gameInfo
    //var cmdListener = cmdListener
    //var name = name
    //var highScore = highScore
    //var backgrounBasicColor = backgrounBasicColor
    //var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
highScoreUtil= HighScoreUtil(highScoresFactoryInterface, highScoresHelper, abeClientInformation, gameInfo, cmdListener, name, highScore)

    var operatingSystemInterface: GenericOperatingSystem = OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!


    
                        if(operatingSystemInterface!!.isOverScan())
                        
                                    {
                                    
    var username: String = InApplicationPurchaseFactory.getInstance()!!.getUserName()!!


    
                        if(username != 
                                    null
                                )
                        
                                    {
                                    this.getTextFieldItem()!!.setString(username)

                                    }
                                
                        else {
                            this.getTextFieldItem()!!.setString("NoGamerInfo")

                        }
                            

                                    }
                                
}

override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{
var cmdListener = cmdListener
this.removeAllCommands()
PostGameCommandFactory.getInstance()!!.addCommands(this)
this.addCommand(HighScoreUtil.SUBMIT_TEXTBOX_COMMAND)
this.setCommandListener(cmdListener)
}

override fun open()
        //nullable = true from not(false or (false and true)) = true
{
this.virtualKeyboardEventHandler!!.open()
this.paintable= NullPaintable.getInstance()
super.open()
}

override fun close()
        //nullable = true from not(false or (false and true)) = true
{
this.virtualKeyboardEventHandler!!.close()
this.paintable= this.pleaseWait
this.repaintBehavior!!.onChangeRepaint(this)
super.close()
this.removeCommand(HighScoreUtil.SUBMIT_TEXTBOX_COMMAND)
this.update()

    
                        if(this.submitted)
                        
                                    {
                                    this.highScoreUtil!!.saveHighScore()

                                    }
                                
                        else {
                            
                        }
                            
this.paintable= NullPaintable.getInstance()
this.repaintBehavior!!.onChangeRepaint(this)
}


                @Throws(Exception::class)
            override fun update()
        //nullable = true from not(false or (false and true)) = true
{

    var name: String = this.getTextFieldItem()!!.getString()!!

this.highScoreUtil!!.update(name)
super.update()
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
super.paint(graphics)
this.paintable.paint(graphics)
}


open fun saveHighScore()
        //nullable = true from not(false or (false and true)) = true
{
this.highScoreUtil!!.saveHighScore()
}

override fun submit()
        //nullable = true from not(false or (false and true)) = true
{
this.highScoreUtil!!.submit(this)
}


}
                
            

