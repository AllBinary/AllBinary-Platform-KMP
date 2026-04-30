
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
                        return GameConfigurationUtil.instance
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


    var gameConfiguration: GameConfiguration = gameConfigurationSingleton!!.getInstanceByName(gauge.getLabel())!!

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


    var gameConfiguration: GameConfiguration = gameConfigurationSingleton!!.getInstanceByName(gauge.getLabel())!!


    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!


    var value: Integer = smallIntegerSingletonFactory!!.getAt(gauge.getValue() +gameConfiguration!!.getMinValue()!!.toInt())!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.GAUGE_UPDATE)
stringBuffer!!.append(gameConfiguration!!.getName())
stringBuffer!!.append(this.FROM)
stringBuffer!!.appendint(gameConfiguration!!.getValue()!!.toInt())
stringBuffer!!.append(this.TO)
stringBuffer!!.appendint(value.toInt())
this.logUtil!!.putF(stringBuffer!!.toString(), this, commonStrings!!.UPDATE)
gameConfiguration!!.setValue(value)
}


                @Throws(Exception::class)
            
    open fun setDefault(gauge: GameConfigurationGauge)
        //nullable = true from not(false or (false and false)) = true
{
var gauge = gauge

    var gameConfigurationSingleton: GameConfigurationSingleton = GameConfigurationSingleton.getInstance()!!


    var gameConfiguration: GameConfiguration = gameConfigurationSingleton!!.getInstanceByName(gauge.getLabel())!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Gauge Default: ")
stringBuffer!!.append(gameConfiguration!!.getName())
stringBuffer!!.append(this.TO)
stringBuffer!!.appendint(gameConfiguration!!.getDefaultValue()!!.toInt())
this.logUtil!!.putF(stringBuffer!!.toString(), this, "setDefault")
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
                                    this.logUtil!!.putF(this.commonStrings!!.START, this, "updateChallange")
gameConfigurationCentral!!.COLLIDE_DAMAGE.setValue(gameConfiguration!!.getValue())
gameConfigurationCentral!!.ATTACK_CHALLENGE_LEVEL.setValue(gameConfiguration!!.getValue())
gameConfigurationCentral!!.DURABILITY_CHALLENGE_LEVEL.setValue(gameConfiguration!!.getValue())
gameConfigurationCentral!!.SPEED_CHALLENGE_LEVEL.setValue(gameConfiguration!!.getValue())

    var size: Int = gameOptionsForm!!.size()!!





                        for (index in 0 until size)

        {

    var item: Item = gameOptionsForm!!.get(index)!!


    
                        if(item is GameConfigurationGauge)
                        
                                    {
                                    
    var gauge: GameConfigurationGauge = item as GameConfigurationGauge


    var name: String = item.getLabel()!!


    var nextGameConfiguration: GameConfiguration = gameConfigurationSingleton!!.getInstanceByName(name)!!


    
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
{
this.logUtil!!.putF(this.commonStrings!!.START, this, "updateCompetitionValue")

    var gameConfigurationCentral: GameConfigurationCentral = GameConfigurationCentral.getInstance()!!

this.COMPETITION_VALUE= gameConfigurationCentral!!.COLLIDE_DAMAGE.getValue()!!.toInt() +gameConfigurationCentral!!.ATTACK_CHALLENGE_LEVEL.getValue()!!.toInt() +gameConfigurationCentral!!.DURABILITY_CHALLENGE_LEVEL.getValue()!!.toInt() +gameConfigurationCentral!!.SPEED_CHALLENGE_LEVEL.getValue()!!.toInt()
this.COMPETITION_VALUE= (this.COMPETITION_VALUE shr 2)
}


    open fun getCompetitionValue()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.COMPETITION_VALUE
}


}
                
            

