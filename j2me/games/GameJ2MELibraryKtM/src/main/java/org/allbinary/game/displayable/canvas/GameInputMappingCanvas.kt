
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
        
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.input.GameKey
import org.allbinary.game.input.GameKeyFactory
import org.allbinary.game.input.Input
import org.allbinary.game.input.InputFactory
import org.allbinary.game.input.PlatformInputMappingFactory
import org.allbinary.game.input.mapping.InputMappingInterface
import org.allbinary.game.input.mapping.InputToGameKeyMapping
import org.allbinary.game.input.mapping.PersistentInputMapping
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.paint.ColorFillBasePaintable
import org.allbinary.game.paint.ColorFillPaintableFactory
import org.allbinary.game.paint.help.HelpPaintable
import org.allbinary.game.paint.help.InputMappingHelpPaintable
import org.allbinary.graphics.paint.ProcessPaintable
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.util.BasicArrayList

open public class GameInputMappingCanvas : GameCommandCanvas
                , InputMappingInterface {
        

        companion object {


    val NAME: String = "GameInputMappingCanvas"

    val DISPLAY: Command = Command(
                            "Controls", Command.SCREEN, 2)

    val DEFAULT: Command = Command(
                            "Default", Command.SCREEN, 2)


        }
            
    private val paintable: ProcessPaintable

    private val helpPaintable: InputMappingHelpPaintable

    val colorFillPaintable: ColorFillBasePaintable

    private val inputMapping: PersistentInputMapping

    private val inputToGameKeyMapping: InputToGameKeyMapping = PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()!!.getInputMapping()!!
            

    private val NONE: GameKey = GameKeyFactory.getInstance()!!.NONE

    private val abeClientInformation: AbeClientInformationInterface

    private var selectedGameKey: GameKey = NONE

    private var selectedInput: Input = NONE
public constructor        (abeClientInformation: AbeClientInformationInterface, commandListener: CommandListener, allBinaryGameLayerManager: AllBinaryGameLayerManager, helpPaintable: HelpPaintable)                        

                            : super(commandListener, NAME, allBinaryGameLayerManager!!.getBackgroundBasicColor(), allBinaryGameLayerManager!!.getForegroundBasicColor()){

                    var abeClientInformation = abeClientInformation


                    var commandListener = commandListener


                    var allBinaryGameLayerManager = allBinaryGameLayerManager


                    var helpPaintable = helpPaintable


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

    
                        if(helpPaintable == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception(
                            "Help Paintable Exception")

                                    }
                                
this.abeClientInformation= abeClientInformation
this.helpPaintable= helpPaintable as InputMappingHelpPaintable
this.inputMapping= PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()
this.paintable= ProcessPaintable()
this.colorFillPaintable= ColorFillPaintableFactory.getInstance()!!.getInstance(allBinaryGameLayerManager!!.getBackgroundBasicColor(), false)
}


                @Throws(Exception::class)
            override fun close()
        //nullable = true from not(false or (false and true)) = true
{super.close()
this.paintable.process()
this.selectedGameKey= NONE
this.selectedInput= NONE
this.update()
}

override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener
this.removeAllCommands()
this.addCommand(GameCommandsFactory.getInstance()!!.CLOSE_AND_SHOW_GAME_CANVAS)
this.addCommand(GameInputMappingCanvas.DEFAULT)
this.addCommand(GameInputMappingInstructionsCanvas.DISPLAY)
this.setCommandListener(cmdListener)
}

override fun keyPressed(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode
this.keyPressed(keyCode, 0)
}

override fun keyReleased(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode
this.keyReleased(keyCode, 0)
}

override fun keyRepeated(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode
this.keyRepeated(keyCode, 0)
}

override fun keyPressed(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId
this.addGameKeyEvent(keyCode, false)
super.keyPressed(keyCode, 0)
}


    private val inputFactory: InputFactory = InputFactory.getInstance()!!
            

open fun addGameKeyEvent(keyCode: Int, repeated: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var repeated = repeated

        try {
            logUtil!!.put(StringMaker().
                            append(
                            "Raw Device Key Code: ")!!.append(Integer.toHexString(keyCode))!!.toString(), this, this.gameInputStrings!!.ADD_KEY_EVENT)

    var gameKey: GameKey = this.inputToGameKeyMapping!!.getInstance(this, keyCode)!!
            


    var input: Input = inputFactory!!.getInstance(keyCode)!!
            

this.process(gameKey, input)
} catch(e: Exception)
            {logUtil!!.put(
                            "Key Event Error", this, this.gameInputStrings!!.ADD_KEY_EVENT, e)
}

}


                @Throws(Exception::class)
            override fun process(gameKey: GameKey, input: Input)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKey = gameKey


                    var input = input

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Start Passed GameKey: ")
stringBuffer!!.append(this.stringUtil!!.toString(gameKey))
stringBuffer!!.append(
                            " Input: ")
stringBuffer!!.append(this.stringUtil!!.toString(input))
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.PROCESS)

    
                        if(this.selectedGameKey != NONE)
                        
                                    {
                                    this.gameActionCrud(gameKey, input)

                                    }
                                
                        else {
                            this.setSelectedAction(gameKey)

                        }
                            
}


open fun setSelectedAction(gameKey: GameKey)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKey = gameKey
logUtil!!.put(StringMaker().
                            append(
                            "Selected GameKey: ")!!.append(this.stringUtil!!.toString(gameKey))!!.toString(), this, 
                            "setSelectedAction")
this.selectedGameKey= gameKey
this.selectedInput= NONE
this.helpPaintable!!.update(this.selectedGameKey, this.selectedInput)
this.repaintBehavior!!.onChangeRepaint(this)
}


                @Throws(Exception::class)
            
open fun gameActionCrud(gameKey: GameKey, input: Input)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKey = gameKey


                    var input = input

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Start GameKey: ")
stringBuffer!!.append(this.stringUtil!!.toString(this.selectedGameKey))
stringBuffer!!.append(
                            " Input: ")
stringBuffer!!.append(this.stringUtil!!.toString(this.selectedInput))
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "gameActionCrud")

    
                        if(this.selectedInput == NONE)
                        
                                    {
                                    
    var list: BasicArrayList = inputMapping!!.getInputMapping()!!.getMappedInput(this.selectedGameKey)!!
            


    var isInputAlreadyMappedToSelectedAction: Boolean = list.contains(input)!!
            


    
                        if(isInputAlreadyMappedToSelectedAction)
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append(
                            "Already Mapped Input: ")!!.append(this.stringUtil!!.toString(input))!!.toString(), this, 
                            "gameActionCrud")
this.selectedInput= input
this.helpPaintable!!.update(this.selectedGameKey, this.selectedInput)
this.repaintBehavior!!.onChangeRepaint(this)

                                    }
                                
                        else {
                            this.addNewMapping(gameKey, input)

                        }
                            

                                    }
                                
                             else 
    
                        if(this.inputMapping!!.isDelete(input))
                        
                                    {
                                    this.deleteCurrentMapping()

                                    }
                                
                        else {
                            this.setSelectedAction(gameKey)

                        }
                            
}


                @Throws(Exception::class)
            
open fun addNewMapping(gameKey: GameKey, input: Input)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKey = gameKey


                    var input = input

    var METHOD_NAME: String = "addNewMapping"

logUtil!!.put(commonStrings!!.START, this, METHOD_NAME)

    var isInputAlreadyMapped: Boolean = inputMapping!!.getInputMapping()!!.isMapped(input)!!
            


    
                        if(!isInputAlreadyMapped && !this.inputMapping!!.isSystemInput(input))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Add Key Mapping : GameKey: ")
stringBuffer!!.append(this.stringUtil!!.toString(this.selectedGameKey))
stringBuffer!!.append(
                            " Input: ")
stringBuffer!!.append(this.stringUtil!!.toString(this.selectedInput))
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_NAME)
inputMapping!!.getInputMapping()!!.add(this.selectedGameKey, input)
this.selectedInput= input
this.update()

                                    }
                                
                        else {
                            logUtil!!.put(
                            "Unable to add Mapping since one already exists or is MENU, HOME, or BACK key and setting selected action to what it is already mapped to", this, METHOD_NAME)
this.setSelectedAction(gameKey)

                        }
                            
}


                @Throws(Exception::class)
            
open fun deleteCurrentMapping()
        //nullable = true from not(false or (false and true)) = true
{
    var METHOD_NAME: String = "deleteCurrentMapping"


    var list: BasicArrayList = inputMapping!!.getInputMapping()!!.getMappedInput(this.selectedGameKey)!!
            


    
                        if(list.size() > 1)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Start GameKey: ")
stringBuffer!!.append(
                            "Remove Key Mapping: GameKey: ")
stringBuffer!!.append(stringUtil!!.toString(this.selectedGameKey))
stringBuffer!!.append(
                            " Input: ")
stringBuffer!!.append(stringUtil!!.toString(this.selectedInput))
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_NAME)
inputMapping!!.getInputMapping()!!.remove(this.selectedGameKey, this.selectedInput)
this.selectedInput= NONE
this.update()

                                    }
                                
                        else {
                            logUtil!!.put(
                            "Can't Remove Last Key Mapping", this, METHOD_NAME)

                        }
                            
}


                @Throws(Exception::class)
            
open fun setDefault()
        //nullable = true from not(false or (false and true)) = true
{inputMapping!!.setDefault(abeClientInformation)
this.helpPaintable!!.update(NONE, NONE)
this.repaintBehavior!!.onChangeRepaint(this)
}


                @Throws(Exception::class)
            override fun update()
        //nullable = true from not(false or (false and true)) = true
{inputMapping!!.update(abeClientInformation)
this.helpPaintable!!.update(this.selectedGameKey, this.selectedInput)
this.repaintBehavior!!.onChangeRepaint(this)
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.colorFillPaintable!!.paint(graphics)
this.helpPaintable!!.paint(graphics)
this.paintable.paint(graphics)
super.paint(graphics)
}


}
                
            

