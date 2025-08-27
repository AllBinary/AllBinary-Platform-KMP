
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
import javax.microedition.lcdui.StringItem
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.configuration.persistance.GamePersistanceSingleton
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.screen.CommandForm
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.util.BasicArrayList

open public class LoadGameForm : CommandForm {
        

    private var areChoices: Boolean= false
public constructor        (commandListener: CommandListener, title: String, backgrounBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(commandListener, title, backgrounBasicColor, foregroundBasicColor){

                    var commandListener = commandListener


                    var title = title


                    var backgrounBasicColor = backgrounBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.update()
this.initCommands(commandListener)
}

override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener

    var gameCommandsFactory: GameCommandsFactory = GameCommandsFactory.getInstance()!!

this.removeAllCommands()
this.addCommand(gameCommandsFactory!!.LOAD_FILE)
this.addCommand(gameCommandsFactory!!.DELETE_FILE)
this.addCommand(gameCommandsFactory!!.CLOSE_AND_SHOW_GAME_CANVAS)
this.setCommandListener(cmdListener)
}


                @Throws(Exception::class)
            override fun update()
        //nullable = true from not(false or (false and true)) = true
{
    var list: BasicArrayList = GamePersistanceSingleton.getInstance()!!.getIds()!!

this.deleteAll()

    
                        if(list.size() > 0)
                        
                                    {
                                    this.add(list, "Select A Saved Game", Choice.EXCLUSIVE)
this.areChoices= true

                                    }
                                
                        else {
                            this.append(StringItem("No Saved Games", StringUtil.getInstance()!!.EMPTY_STRING))
this.areChoices= false

                        }
                            
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

    var METHOD_NAME: String = "getChoiceGroup"


    var choiceGroup: ChoiceGroup = ChoiceGroup(name, option)


    var size: Int = list.size()!!





                        for (index in 0 until size)

        {
    var anyType: Any = list.objectArray[index]!!

logUtil!!.put(StringMaker().
                            append("Adding Choice: ")!!.append(anyType!!.toString())!!.toString(), this, METHOD_NAME)
choiceGroup!!.append(anyType!!.toString(), NullCanvas.NULL_IMAGE)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return choiceGroup
}


open fun getSelectedId()
        //nullable = true from not(false or (false and true)) = true
: Int{
    
                        if(this.areChoices)
                        
                                    {
                                    
    var choiceGroup: ChoiceGroup = this.get(0) as ChoiceGroup




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return choiceGroup!!.getSelectedIndex()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1

                        }
                            
}


open fun getSelectedText()
        //nullable = true from not(false or (false and true)) = true
: Int{
    
                        if(this.areChoices)
                        
                                    {
                                    
    var choiceGroup: ChoiceGroup = this.get(0) as ChoiceGroup


    var value: Int = Integer.valueOf(choiceGroup!!.getString(choiceGroup!!.getSelectedIndex()))!!.toInt()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1

                        }
                            
}


}
                
            

