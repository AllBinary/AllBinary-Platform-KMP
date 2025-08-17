
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
        
import java.util.Hashtable
import javax.microedition.lcdui.Choice
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Item
import javax.microedition.lcdui.TextField
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.configuration.feature.GameFeatureChoiceGroups
import org.allbinary.game.configuration.feature.GameFeatureFormUtil
import org.allbinary.game.configuration.feature.GameFeatureItemCommandListener
import org.allbinary.game.configuration.feature.GameFeatureItemStateListener
import org.allbinary.game.configuration.feature.SensorFeatureFactory
import org.allbinary.game.configuration.persistance.GameConfigurationPersistanceSingleton
import org.allbinary.game.configuration.persistance.KeyValuePersistance
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.command.MyCommandsFactory
import org.allbinary.graphics.displayable.screen.CommandForm
import org.allbinary.input.gyro.OrientationData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.util.BasicArrayList
import org.allbinary.util.HashtableUtil

open public class GameOptionsForm : CommandForm {
        
public constructor        (commandListener: CommandListener, title: String, backgrounBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(commandListener, title, backgrounBasicColor, foregroundBasicColor){

                    var commandListener = commandListener


                    var title = title


                    var backgrounBasicColor = backgrounBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.addConfiguration()

    var gameFeatureFormUtil: GameFeatureFormUtil = GameFeatureFormUtil.getInstance()!!
            

gameFeatureFormUtil!!.addChoiceGroup(this, GameFeatureChoiceGroups.getExclusiveInstance()!!.get(), Choice.EXCLUSIVE)
gameFeatureFormUtil!!.addChoiceGroup(this, GameFeatureChoiceGroups.getMultipleInstance()!!.get(), Choice.MULTIPLE)
this.initCommands(commandListener)
this.setItemStateListener(GameFeatureItemStateListener(this))
this.addTextFieldsIfSimulated()
}


open fun close(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation
super.close()
this.save(abeClientInformation)
}


open fun addTextFieldsIfSimulated()
        //nullable = true from not(false or (false and true)) = true
{
    var key: String = OrientationData.getInstance()!!.ORIENTATION_SENSOR_INPUT


    var hashtable: Hashtable<Any, Any> = GameFeatureChoiceGroups.getExclusiveInstance()!!.get()!!
            


    
                        if(hashtable != 
                                    null
                                )
                        
                                    {
                                    
    var list: BasicArrayList = hashtable.get(key as Object) as BasicArrayList


    
                        if(list != 
                                    null
                                 && list.contains(SensorFeatureFactory.getInstance()!!.SIMULATED_ORIENTATION_SENSORS))
                        
                                    {
                                    this.addTextFields()

                                    }
                                

                                    }
                                
}


open fun addTextFields()
        //nullable = true from not(false or (false and true)) = true
{
    var hashtable: Hashtable<Any, Any> = GameConfigurationTextInput.getHashtable()!!
            


    var size: Int = hashtable.size!!
            


    var objectArray: Array<Any?> = HashtableUtil.getInstance()!!.getKeysAsArray(hashtable)!!
            





                        for (index in 0 until size)


        {
    var gameConfigurationTextInput: GameConfigurationTextInput = hashtable.get(objectArray[index]!! as Object) as GameConfigurationTextInput


    var textField: TextField = TextField(gameConfigurationTextInput!!.getLabel(), gameConfigurationTextInput!!.getText(), 30, TextField.ANY)

this.append(textField)
}

}


open fun addConfiguration()
        //nullable = true from not(false or (false and true)) = true
{
    var METHOD_NAME: String = "addConfiguration"


    var NAME: String = "Name: "


    var list: BasicArrayList = GameConfigurationSingleton.getInstance()!!.getOptionsBasicArrayList()!!
            


    var GAUGE_CHANGE: Command = MyCommandsFactory.getInstance()!!.GAUGE_CHANGE


    var size: Int = list.size()!!
            





                        for (index in 0 until size)


        {
    var gameConfiguration: GameConfiguration = list.objectArray[index]!! as GameConfiguration

logUtil!!.put(StringMaker().
                            append(NAME)!!.append(gameConfiguration!!.toString())!!.toString(), this, METHOD_NAME)

    var gauge: GameConfigurationGauge = GameConfigurationGauge(gameConfiguration)

gauge.setDefaultCommand(GAUGE_CHANGE)
gauge.setItemCommandListener(GameFeatureItemCommandListener(this))
this.append(gauge)
}

}


open fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener

    var gameCommandsFactory: GameCommandsFactory = GameCommandsFactory.getInstance()!!
            

this.removeAllCommands()
this.addCommand(gameCommandsFactory!!.CLOSE_OPTIONS)
this.addCommand(gameCommandsFactory!!.DEFAULT_OPTIONS)
this.setCommandListener(cmdListener)
}


                @Throws(Exception::class)
            
open fun save(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation




                        for (index in 0 until this.size()!!)


        {
    var item: Item = this.get(index)!!
            


    
                        if(item is GameConfigurationGauge)
                        
                                    {
                                    GameConfigurationUtil.getInstance()!!.update(item as GameConfigurationGauge)

                                    }
                                
                             else 
    
                        if(item is TextField)
                        
                                    {
                                    GameConfigurationTextInput.update(item as TextField)

                                    }
                                
}

GameConfigurationUtil.getInstance()!!.updateCompetitionValue()

    var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()


    var SCALE: GameConfiguration = GameConfigurationCentral.getInstance()!!.SCALE

hashtable.put(SCALE.getName(), SCALE.getValue()!!.toString())

    var keyValuePersistance: KeyValuePersistance = GameConfigurationPersistanceSingleton.getInstance()!!
            

keyValuePersistance!!.clear()
keyValuePersistance!!.loadAll(abeClientInformation)

    var list: BasicArrayList = keyValuePersistance!!.getIds()!!
            

keyValuePersistance!!.save(abeClientInformation, hashtable)




                        for (index in 0 until list.size()!!)


        {
    var integer: Integer = list.objectArray[index]!! as Integer

keyValuePersistance!!.delete(abeClientInformation, integer.toInt())
}

}


}
                
            

