
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
        package org.allbinary.game.configuration.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.feature.Feature
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureUtil
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class BaseChangedGameFeatureListener
            : Object
        
                , GameFeatureListenerInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val gameFeatureUtil: GameFeatureUtil = GameFeatureUtil.getInstance()!!

    val list: BasicArrayList = BasicArrayList()

    private var changed: Boolean = true
override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject
ForcedLogUtil.log(CommonStrings.getInstance()!!.NOT_IMPLEMENTED, this)
}

override fun onGameFeatureChange(gameFeatureEvent: GameFeatureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var gameFeatureEvent = gameFeatureEvent
logUtil!!.put(StringMaker().
                            append(gameFeatureUtil!!.GAME_FEATURE_CHANGED)!!.append(gameFeatureEvent!!.getWhatChanged())!!.toString(), this, gameFeatureUtil!!.ON_GAME_FEATURE_CHANGE)
list.add(gameFeatureEvent!!.getGameOption())
setChanged(true)
}


open fun add(gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
{
var gameFeature = gameFeature
list.add(gameFeature)
}


open fun remove(gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
{
var gameFeature = gameFeature
list.remove(gameFeature)
}


open fun setChanged(initialized: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var initialized = initialized
this.changed= initialized

    
                        if(!this.isChanged())
                        
                                    {
                                    list.clear()

                                    }
                                
}


open fun isChanged(gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var gameFeature = gameFeature

    var isChanged: Boolean = list.contains(gameFeature)!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("GameFeature: ")
stringBuffer!!.append(StringUtil.getInstance()!!.toString(gameFeature))
stringBuffer!!.append(" isFeature: ")
stringBuffer!!.append(Features.getInstance()!!.isFeature(gameFeature))
stringBuffer!!.append(" isChanged: ")
stringBuffer!!.append(isChanged)
logUtil!!.put(stringBuffer!!.toString(), this, "isChanged")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isChanged
}


open fun isChanged()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.changed
}


}
                
            

