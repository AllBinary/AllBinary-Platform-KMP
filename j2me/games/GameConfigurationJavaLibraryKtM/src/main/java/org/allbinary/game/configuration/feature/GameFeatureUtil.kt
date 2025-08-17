
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
        
import java.util.Enumeration
import java.util.Hashtable
import javax.microedition.lcdui.ChoiceGroup
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.util.BasicArrayList
import org.allbinary.util.HashtableUtil

open public class GameFeatureUtil
            : Object
         {
        

        companion object {
            
    private val instance: GameFeatureUtil = GameFeatureUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameFeatureUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val ON_GAME_FEATURE_CHANGE: String = "onGameFeatureChange"

    val GAME_FEATURE_CHANGED: String = "Game Feature Changed: "

                @Throws(Exception::class)
            
open fun setDefault(choiceGroup: ChoiceGroup)
        //nullable = true from not(false or (false and false)) = true
{

                    var choiceGroup = choiceGroup

    var stringBuffer: StringMaker = StringMaker()


    var METHOD_NAME: String = "setDefault"


    var SELECTED_ARRAY_RETURN: String = "selectedArray_return["


    var SELECTED_SEP: String = "] = "


    var selectedArray_return: BooleanArray = BooleanArray(choiceGroup!!.size())


    var total: Int = choiceGroup!!.getSelectedFlags(selectedArray_return)!!
            

stringBuffer!!.append("Multiple Total Choices: ")
stringBuffer!!.append(total)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_NAME)

    var features: Features = Features.getInstance()!!
            





                        for (index in 0 until selectedArray_return!!.size)


        {
    var isSelected: Boolean = selectedArray_return[index]!!

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(SELECTED_ARRAY_RETURN)
stringBuffer!!.append(index)
stringBuffer!!.append(SELECTED_SEP)
stringBuffer!!.append(isSelected)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_NAME)

    var selectedChoiceLabel: String = choiceGroup!!.getString(index)!!
            


    var gameFeature: Feature = Feature.getInstance(selectedChoiceLabel)!!
            


    
                        if(features.isDefault(gameFeature))
                        
                                    {
                                    features.add(gameFeature)
choiceGroup!!.setSelectedIndex(index, true)

                                    }
                                
                        else {
                            features.remove(gameFeature)
choiceGroup!!.setSelectedIndex(index, false)

                        }
                            
}

}


                @Throws(Exception::class)
            
open fun updateMultiple(choiceGroup: ChoiceGroup)
        //nullable = true from not(false or (false and false)) = true
{

                    var choiceGroup = choiceGroup

    var stringBuffer: StringMaker = StringMaker()


    var METHOD_NAME: String = "updateMultiple"


    var SELECTED_ARRAY_RETURN: String = "selectedArray_return["


    var SELECTED_SEP: String = "] = "


    var selectedArray_return: BooleanArray = BooleanArray(choiceGroup!!.size())


    var total: Int = choiceGroup!!.getSelectedFlags(selectedArray_return)!!
            

stringBuffer!!.append("Multiple Total Choices: ")
stringBuffer!!.append(total)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_NAME)

    var features: Features = Features.getInstance()!!
            





                        for (index in 0 until selectedArray_return!!.size)


        {
    var isSelected: Boolean = selectedArray_return[index]!!

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(SELECTED_ARRAY_RETURN)
stringBuffer!!.append(index)
stringBuffer!!.append(SELECTED_SEP)
stringBuffer!!.append(isSelected)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_NAME)

    var selectedChoiceLabel: String = choiceGroup!!.getString(index)!!
            


    var gameFeature: Feature = Feature.getInstance(selectedChoiceLabel)!!
            


    
                        if(!isSelected && features.isFeature(gameFeature))
                        
                                    {
                                    features.remove(gameFeature)

                                    }
                                
                             else 
    
                        if(isSelected && !features.isFeature(gameFeature))
                        
                                    {
                                    features.add(gameFeature)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun updateExclusive(choiceGroup: ChoiceGroup)
        //nullable = true from not(false or (false and false)) = true
{

                    var choiceGroup = choiceGroup

    var stringBuffer: StringMaker = StringMaker()


    var METHOD_NAME: String = "updateExclusive"


    var SELECTED_ARRAY_RETURN: String = "selectedArray_return["


    var SELECTED_SEP: String = "] = "


    var selectedArray_return: BooleanArray = BooleanArray(choiceGroup!!.size())


    var total: Int = choiceGroup!!.getSelectedFlags(selectedArray_return)!!
            

stringBuffer!!.append("Exclusive Total Choices: 1==")
stringBuffer!!.append(total)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_NAME)




                        for (index in 0 until selectedArray_return!!.size)


        {
    var isSelected: Boolean = selectedArray_return[index]!!

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(SELECTED_ARRAY_RETURN)
stringBuffer!!.append(index)
stringBuffer!!.append(SELECTED_SEP)
stringBuffer!!.append(isSelected)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_NAME)

    
                        if(isSelected)
                        
                                    {
                                    
    var selectedChoiceLabel: String = choiceGroup!!.getString(index)!!
            

updateExclusive(selectedChoiceLabel)

                                    }
                                
}

}


open fun isExclusive(itemLabel: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var itemLabel = itemLabel

    var enumeration: Enumeration<Any?> = GameFeatureChoiceGroups.getExclusiveInstance()!!.get()!!.keys()!!
            


        while(enumeration.hasMoreElements())
        {
    var name: String = enumeration.nextElement()!! as String


    
                        if(itemLabel!!.compareTo(name) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun updateExclusive(selectedChoiceLabel: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var selectedChoiceLabel = selectedChoiceLabel
logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.ITEM_LABEL)!!.append(selectedChoiceLabel)!!.toString(), this, "updateExclusive")

    var gameFeature: Feature = Feature.getInstance(selectedChoiceLabel)!!
            


    var hashtable: Hashtable<Any, Any> = GameFeatureChoiceGroups.getExclusiveInstance()!!.get()!!
            


    var objectArray: Array<Any?> = HashtableUtil.getInstance()!!.getKeysAsArray(hashtable)!!
            


    var basicArrayList: BasicArrayList


    var anyType: Any


    var size: Int = objectArray!!.size
                





                        for (index in 0 until size)


        {anyType= objectArray[index]!! as Object
basicArrayList= hashtable.get(anyType as Object) as BasicArrayList
updateExclusive(gameFeature, basicArrayList)
}

}


                @Throws(Exception::class)
            
open fun updateExclusive(gameFeature: Feature, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameFeature = gameFeature


                    var list = list

    
                        if(list.contains(gameFeature))
                        
                                    {
                                    
    var features: Features = Features.getInstance()!!
            


    var addIndex: Int = list.indexOf(gameFeature)!!
            


    var size: Int = list.size()!!
            





                        for (index in 0 until size)


        {
    
                        if(addIndex != index)
                        
                                    {
                                    features.remove(list.objectArray[index]!! as Feature)

                                    }
                                
                        else {
                            features.add(list.objectArray[index]!! as Feature)

                        }
                            
}


                                    }
                                
}


}
                
            

