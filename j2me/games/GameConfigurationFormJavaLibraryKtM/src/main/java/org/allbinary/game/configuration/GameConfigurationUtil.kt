
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
        
import javax.microedition.lcdui.Item
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class GameConfigurationUtil
            : Object
         {
        

        companion object {
            
    private val instance: GameConfigurationUtil = GameConfigurationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameConfigurationUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

                @Throws(Exception::class)
            
open fun change(gameOptionsForm: GameOptionsForm, gauge: GameConfigurationGauge)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameOptionsForm = gameOptionsForm


                    var gauge = gauge
this.update(gauge)

    var gameConfigurationSingleton: GameConfigurationSingleton = GameConfigurationSingleton.getInstance()!!


    var gameConfiguration: GameConfiguration = gameConfigurationSingleton!!.getInstance(gauge.getLabel())!!

this.updateChallange(gameOptionsForm, gameConfiguration)
}


    private val GAUGE_UPDATE: String = "Gauge Update: "

    private val FROM: String = " from: "

    private val TO: String = " to: "

                @Throws(Exception::class)
            
open fun update(gauge: GameConfigurationGauge)
        //nullable = true from not(false or (false and false)) = true
{

                    var gauge = gauge

    var gameConfigurationSingleton: GameConfigurationSingleton = GameConfigurationSingleton.getInstance()!!


    var gameConfiguration: GameConfiguration = gameConfigurationSingleton!!.getInstance(gauge.getLabel())!!


    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!


    var value: Integer = smallIntegerSingletonFactory!!.getInstance(gauge.getValue() +gameConfiguration!!.getMinValue()!!.toInt())!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(GAUGE_UPDATE)
stringBuffer!!.append(gameConfiguration!!.getName())
stringBuffer!!.append(FROM)
stringBuffer!!.append(gameConfiguration!!.getValue()!!.toInt())
stringBuffer!!.append(TO)
stringBuffer!!.append(value.toInt())
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.UPDATE)
gameConfiguration!!.setValue(value)
}


                @Throws(Exception::class)
            
open fun setDefault(gauge: GameConfigurationGauge)
        //nullable = true from not(false or (false and false)) = true
{

                    var gauge = gauge

    var gameConfigurationSingleton: GameConfigurationSingleton = GameConfigurationSingleton.getInstance()!!


    var gameConfiguration: GameConfiguration = gameConfigurationSingleton!!.getInstance(gauge.getLabel())!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Gauge Default: ")
stringBuffer!!.append(gameConfiguration!!.getName())
stringBuffer!!.append(TO)
stringBuffer!!.append(gameConfiguration!!.getDefaultValue()!!.toInt())
logUtil!!.put(stringBuffer!!.toString(), this, "setDefault")
gauge.setValue(gameConfiguration!!.getDefaultValue()!!.toInt() -gameConfiguration!!.getMinValue()!!.toInt())
gameConfiguration!!.setValue(gameConfiguration!!.getDefaultValue())
}


                @Throws(Exception::class)
            
open fun updateChallange(gameOptionsForm: GameOptionsForm, gameConfiguration: GameConfiguration)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameOptionsForm = gameOptionsForm


                    var gameConfiguration = gameConfiguration

    var gameConfigurationSingleton: GameConfigurationSingleton = GameConfigurationSingleton.getInstance()!!


    var gameConfigurationCentral: GameConfigurationCentral = GameConfigurationCentral.getInstance()!!


    
                        if(gameConfiguration == gameConfigurationCentral!!.CHALLENGE_LEVEL)
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, "updateChallange")
gameConfigurationCentral!!.COLLIDE_DAMAGE.setValue(gameConfiguration!!.getValue())
gameConfigurationCentral!!.ATTACK_CHALLENGE_LEVEL.setValue(gameConfiguration!!.getValue())
gameConfigurationCentral!!.DURABILITY_CHALLENGE_LEVEL.setValue(gameConfiguration!!.getValue())
gameConfigurationCentral!!.SPEED_CHALLENGE_LEVEL.setValue(gameConfiguration!!.getValue())




                        for (index in 0 until gameOptionsForm!!.size()!!)


        {
    var item: Item = gameOptionsForm!!.get(index)!!


    
                        if(item is GameConfigurationGauge)
                        
                                    {
                                    
    var gauge: GameConfigurationGauge = item as GameConfigurationGauge


    var name: String = item.getLabel()!!


    var nextGameConfiguration: GameConfiguration = gameConfigurationSingleton!!.getInstance(name)!!


    
                        if(nextGameConfiguration == gameConfigurationCentral!!.COLLIDE_DAMAGE)
                        
                                    {
                                    gauge.setValue(gameConfigurationCentral!!.COLLIDE_DAMAGE.getValue()!!.toInt() -gameConfiguration!!.getMinValue()!!.toInt())

                                    }
                                
                             else 
    
                        if(nextGameConfiguration == gameConfigurationCentral!!.DURABILITY_CHALLENGE_LEVEL)
                        
                                    {
                                    gauge.setValue(gameConfigurationCentral!!.DURABILITY_CHALLENGE_LEVEL.getValue()!!.toInt() -gameConfiguration!!.getMinValue()!!.toInt())

                                    }
                                
                             else 
    
                        if(nextGameConfiguration == gameConfigurationCentral!!.ATTACK_CHALLENGE_LEVEL)
                        
                                    {
                                    gauge.setValue(gameConfigurationCentral!!.ATTACK_CHALLENGE_LEVEL.getValue()!!.toInt() -gameConfiguration!!.getMinValue()!!.toInt())

                                    }
                                
                             else 
    
                        if(nextGameConfiguration == gameConfigurationCentral!!.SPEED_CHALLENGE_LEVEL)
                        
                                    {
                                    gauge.setValue(gameConfigurationCentral!!.SPEED_CHALLENGE_LEVEL.getValue()!!.toInt() -gameConfiguration!!.getMinValue()!!.toInt())

                                    }
                                

                                    }
                                
}


                                    }
                                
}


    private var COMPETITION_VALUE: Int = 1

open fun updateCompetitionValue()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, "updateCompetitionValue")

    var gameConfigurationCentral: GameConfigurationCentral = GameConfigurationCentral.getInstance()!!

COMPETITION_VALUE= gameConfigurationCentral!!.COLLIDE_DAMAGE.getValue()!!.toInt() +gameConfigurationCentral!!.ATTACK_CHALLENGE_LEVEL.getValue()!!.toInt() +gameConfigurationCentral!!.DURABILITY_CHALLENGE_LEVEL.getValue()!!.toInt() +gameConfigurationCentral!!.SPEED_CHALLENGE_LEVEL.getValue()!!.toInt()
COMPETITION_VALUE= (COMPETITION_VALUE shr 2)
}


open fun getCompetitionValue()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return COMPETITION_VALUE
}


}
                
            

