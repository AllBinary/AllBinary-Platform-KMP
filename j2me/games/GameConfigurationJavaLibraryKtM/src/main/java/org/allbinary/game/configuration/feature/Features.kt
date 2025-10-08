
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
        
import org.allbinary.game.configuration.event.GameFeatureEvent
import org.allbinary.game.configuration.event.GameFeatureEventHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.logic.system.os.OperatingSystemFactory
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class Features
            : Object
         {
        
companion object {
            
    private val SINGLETON: Features = Features()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: Features{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val list: BasicArrayList

    private val defaultList: BasicArrayList
private constructor ()
            : super()
        {
list= BasicArrayList()
defaultList= BasicArrayList()
this.init()
}


                @Throws(Exception::class)
            
    open fun addDefault(gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameFeature = gameFeature
this.add(gameFeature)

    
                        if(!defaultList!!.contains(gameFeature))
                        
                                    {
                                    defaultList!!.add(gameFeature)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun add(gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameFeature = gameFeature

    
                        if(!list.contains(gameFeature))
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(gameFeature!!.toString())!!.toString(), this, commonStrings!!.ADD)
list.add(gameFeature)
GameFeatureEventHandler.getInstance()!!.fireEvent(GameFeatureEvent(gameFeature, gameFeature!!.toString()))

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun removeDefault(gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameFeature = gameFeature
logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(gameFeature!!.toString())!!.toString(), this, "removeDefault")
this.remove(gameFeature)
defaultList!!.remove(gameFeature)
}


                @Throws(Exception::class)
            
    open fun remove(gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameFeature = gameFeature

    
                        if(list.contains(gameFeature))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, commonStrings!!.REMOVE)
list.remove(gameFeature)
GameFeatureEventHandler.getInstance()!!.fireEvent(GameFeatureEvent(gameFeature, gameFeature!!.toString()))

                                    }
                                
}


    open fun init()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var gameFeatureFactory: GameFeatureFactory = GameFeatureFactory.getInstance()!!


    var inputFeatureFactory: InputFeatureFactory = InputFeatureFactory.getInstance()!!


    var sensorFeatureFactory: SensorFeatureFactory = SensorFeatureFactory.getInstance()!!


    var touchFeatureFactory: TouchFeatureFactory = TouchFeatureFactory.getInstance()!!

this.addDefault(gameFeatureFactory!!.ARTIFICIAL_INTELLEGENCE_PROCESSOR)
this.addDefault(gameFeatureFactory!!.COLLIDABLE_INTERFACE_LAYER_PROCESSOR)
this.addDefault(gameFeatureFactory!!.GAME_INPUT_LAYER_PROCESSOR)
this.addDefault(gameFeatureFactory!!.TICKABLE_LAYER_PROCESSOR)
this.addDefault(inputFeatureFactory!!.MULTI_KEY_PRESS)
this.addDefault(inputFeatureFactory!!.REMOVE_DUPLICATE_KEY_PRESSES)
this.addDefault(gameFeatureFactory!!.SCREEN_SHAKE)
this.addDefault(gameFeatureFactory!!.POST_IMAGE_LOADING_MODIFICATION)

    var operatingSystemInterface: GenericOperatingSystem = OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!


    
                        if(operatingSystemInterface!!.isOverScan())
                        
                                    {
                                    this.addDefault(sensorFeatureFactory!!.NO_ORIENTATION)
this.addDefault(touchFeatureFactory!!.HIDE_SCREEN_BUTTONS)

                                    }
                                
                        else {
                            this.addDefault(sensorFeatureFactory!!.ORIENTATION_SENSORS)
this.addDefault(touchFeatureFactory!!.AUTO_HIDE_SHOW_SCREEN_BUTTONS)

                        }
                            
this.addDefault(touchFeatureFactory!!.TOUCH_ENABLED)
this.addDefault(MainFeatureFactory.getInstance()!!.FULL_SCREEN)
this.addDefault(MainFeatureFactory.getInstance()!!.LOAD_ONDEMAND)
} catch(e: Exception)
            {
PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, e)
}

}


    open fun isDefault(gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var gameFeature = gameFeature



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultList!!.contains(gameFeature)
}


    open fun isFeature(gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var gameFeature = gameFeature



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.contains(gameFeature)
}


                @Throws(Exception::class)
            
    open fun toggle(gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
{
var gameFeature = gameFeature

    
                        if(this.isFeature(gameFeature))
                        
                                    {
                                    this.remove(gameFeature)

                                    }
                                
                        else {
                            this.add(gameFeature)

                        }
                            
}


}
                
            

