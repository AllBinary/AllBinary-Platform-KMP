
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
        package org.allbinary.game.configuration




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Choice
import javax.microedition.lcdui.ChoiceGroup
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.NullCanvas
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.configuration.persistance.GameDifficultyFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.screen.CommandForm
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList

open public class GameDifficultyOptions : CommandForm {
        

    private val list: BasicArrayList
public constructor        (commandListener: CommandListener, title: String, list: BasicArrayList, backgrounBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(commandListener, title, backgrounBasicColor, foregroundBasicColor){

                    var commandListener = commandListener


                    var title = title


                    var list = list


                    var backgrounBasicColor = backgrounBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.list= list
this.update()
this.initCommands(commandListener)

    var gameDifficultyFactory: GameDifficultyFactory = GameDifficultyFactory.getInstance()!!

this.setSelectedId(gameDifficultyFactory!!.getLevel())
}

override fun open()
        //nullable = true from not(false or (false and true)) = true
{super.open()
}

override fun close()
        //nullable = true from not(false or (false and true)) = true
{super.close()
this.save()
}


                @Throws(Exception::class)
            
open fun save()
        //nullable = true from not(false or (false and true)) = true
{
    var gameDifficultyFactory: GameDifficultyFactory = GameDifficultyFactory.getInstance()!!

gameDifficultyFactory!!.setLevel(this.getSelectedId())
}

override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener

    var gameCommandsFactory: GameCommandsFactory = GameCommandsFactory.getInstance()!!

this.removeAllCommands()
this.addCommand(gameCommandsFactory!!.CLOSE_AND_SHOW_GAME_CANVAS)
this.setCommandListener(cmdListener)
}


                @Throws(Exception::class)
            override fun update()
        //nullable = true from not(false or (false and true)) = true
{this.deleteAll()
this.add(list, "Difficulty", Choice.EXCLUSIVE)
super.update()
}


open fun add(list: BasicArrayList, name: String, option: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list


                    var name = name


                    var option = option

    var choiceGroup: ChoiceGroup = this.getChoiceGroup(list, name, option)!!


    
                        if(list.size() > 0)
                        
                                    {
                                    choiceGroup!!.setSelectedIndex(0, true)

                                    }
                                
this.append(choiceGroup)
}


open fun getChoiceGroup(list: BasicArrayList, name: String, option: Int)
        //nullable = true from not(false or (false and false)) = true
: ChoiceGroup{

                    var list = list


                    var name = name


                    var option = option

    var METHOD_NAME: String = "addChoiceGroup"


    var NAME: String = "Adding Choice: "


    var choiceGroup: ChoiceGroup = ChoiceGroup(name, option)


    var size: Int = list.size()!!





                        for (index in 0 until size)


        {
    var anyType: Any = list.objectArray[index]!!

logUtil!!.put(StringMaker().
                            append(NAME)!!.append(anyType!!.toString())!!.toString(), this, METHOD_NAME)
choiceGroup!!.append(anyType!!.toString(), NullCanvas.NULL_IMAGE)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return choiceGroup
}


open fun setSelectedId(id: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var id = id

    var choiceGroup: ChoiceGroup = this.get(0) as ChoiceGroup

choiceGroup!!.setSelectedIndex(id, true)
}


open fun getSelectedId()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var choiceGroup: ChoiceGroup = this.get(0) as ChoiceGroup




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return choiceGroup!!.getSelectedIndex()
}


open fun getSelectedText()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var choiceGroup: ChoiceGroup = this.get(0) as ChoiceGroup


    var value: Int = Integer.valueOf(choiceGroup!!.getString(choiceGroup!!.getSelectedIndex()))!!.toInt()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value
}


}
                
            

