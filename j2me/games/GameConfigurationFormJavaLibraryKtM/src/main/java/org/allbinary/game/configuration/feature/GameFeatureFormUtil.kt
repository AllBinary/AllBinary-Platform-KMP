
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
        package org.allbinary.game.configuration.feature




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.ChoiceGroup
import javax.microedition.lcdui.Item
import javax.microedition.lcdui.NullCanvas
import org.allbinary.game.configuration.GameConfigurationGauge
import org.allbinary.game.configuration.GameConfigurationUtil
import org.allbinary.graphics.displayable.screen.CommandForm
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList
import org.allbinary.util.HashtableUtil

open public class GameFeatureFormUtil
            : Object
         {
        

        companion object {
            
    private val instance: GameFeatureFormUtil = GameFeatureFormUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameFeatureFormUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

open fun getChoiceGroup(hashtable: Hashtable<Any, Any>, name: String, option: Int)
        //nullable = true from not(false or (false and false)) = true
: ChoiceGroup{

                    var hashtable = hashtable


                    var name = name


                    var option = option

    var stringMaker: StringMaker = StringMaker()


    var choiceGroup: ChoiceGroup = ChoiceGroup(name, option)


    var list: BasicArrayList = hashtable.get(name as Object) as BasicArrayList


    var features: Features = Features.getInstance()!!


    var ADD_CHOICE: String = ": Adding Choice: "


    var GET_CHOICE_GROUP: String = "getChoiceGroup"


    var size: Int = list.size()!!





                        for (index in 0 until size)


        {
    var gameFeature: Feature = list.objectArray[index]!! as Feature

stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append(name)!!.append(ADD_CHOICE)!!.append(gameFeature!!.toString())!!.toString(), this, GET_CHOICE_GROUP)
choiceGroup!!.append(gameFeature!!.toString(), NullCanvas.NULL_IMAGE)

    
                        if(features.isFeature(gameFeature))
                        
                                    {
                                    choiceGroup!!.setSelectedIndex(index, true)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return choiceGroup
}


open fun addChoiceGroup(form: CommandForm, hashtable: Hashtable<Any, Any>, option: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var form = form


                    var hashtable = hashtable


                    var option = option

    var stringMaker: StringMaker = StringMaker()


    var ADDING_CHOICE_GROUP: String = "Adding Choice Group: "


    var ADD_CHOICE_GROUP: String = "addChoiceGroup"


    var size: Int = hashtable.size!!


    var objectArray: Array<Any?> = HashtableUtil.getInstance()!!.getKeysAsArray(hashtable)!!





                        for (index in 0 until size)


        {
    var name: String = objectArray[index]!! as String

stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append(ADDING_CHOICE_GROUP)!!.append(name)!!.toString(), this, ADD_CHOICE_GROUP)
form.append(this.getChoiceGroup(hashtable, name, option))
}

}


                @Throws(Exception::class)
            
open fun setDefault(form: CommandForm)
        //nullable = true from not(false or (false and false)) = true
{

                    var form = form




                        for (index in 0 until form.size()!!)


        {
    var item: Item = form.get(index)!!


    
                        if(item is GameConfigurationGauge)
                        
                                    {
                                    GameConfigurationUtil.getInstance()!!.setDefault(item as GameConfigurationGauge)

                                    }
                                
                             else 
    
                        if(item is ChoiceGroup)
                        
                                    {
                                    GameFeatureUtil.getInstance()!!.setDefault(item as ChoiceGroup)

                                    }
                                
}

}


}
                
            

