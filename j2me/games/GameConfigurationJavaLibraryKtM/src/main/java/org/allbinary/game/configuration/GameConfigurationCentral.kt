
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
import org.allbinary.game.configuration.persistance.GameConfigurationPersistanceSingleton
import org.allbinary.game.configuration.persistance.KeyValuePersistance
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class GameConfigurationCentral
            : Object
         {
        
companion object {
            
    private val SINGLETON: GameConfigurationCentral = GameConfigurationCentral()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameConfigurationCentral{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val SCALE: GameConfiguration

    val ORIENTATION: GameConfiguration

    val SENSOR_UPDATE_RATE: GameConfiguration

    val VIBRATION: GameConfiguration

    val CHALLENGE_LEVEL: GameConfiguration

    val COLLIDE_DAMAGE: GameConfiguration

    val DURABILITY_CHALLENGE_LEVEL: GameConfiguration

    val SPEED_CHALLENGE_LEVEL: GameConfiguration

    val ATTACK_CHALLENGE_LEVEL: GameConfiguration

    val CONTROL_LEVEL: GameConfiguration

    val PLAYER_INPUT_WAIT: GameConfiguration

    val SPEED: GameConfiguration

    val SOUND_VOLUME: GameConfiguration

    val MAX_GAME_OBJECTS: GameConfiguration

    val MAX_LAYERS: GameConfiguration

    private var gameControlFidelity: Int = 36
private constructor ()
            : super()
        {

    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!

this.SCALE= GameConfiguration("Scale", smallIntegerSingletonFactory!!.getAt(2), smallIntegerSingletonFactory!!.getAt(2), smallIntegerSingletonFactory!!.getAt(3))
this.ORIENTATION= GameConfiguration("Orientation", smallIntegerSingletonFactory!!.getAt(0), smallIntegerSingletonFactory!!.getAt(0), smallIntegerSingletonFactory!!.getAt(8))
this.SENSOR_UPDATE_RATE= GameConfiguration("Sensor Update Rate", smallIntegerSingletonFactory!!.getAt(0), smallIntegerSingletonFactory!!.getAt(0), smallIntegerSingletonFactory!!.getAt(3))
this.VIBRATION= GameConfiguration("Vibration", smallIntegerSingletonFactory!!.getAt(0), smallIntegerSingletonFactory!!.getAt(0), smallIntegerSingletonFactory!!.getAt(3))
this.CHALLENGE_LEVEL= GameConfiguration("Global Challenge Level", smallIntegerSingletonFactory!!.getAt(3), smallIntegerSingletonFactory!!.getAt(1), smallIntegerSingletonFactory!!.getAt(10))
this.COLLIDE_DAMAGE= GameConfiguration("Collide Damage Challenge Level", smallIntegerSingletonFactory!!.getAt(3), smallIntegerSingletonFactory!!.getAt(1), smallIntegerSingletonFactory!!.getAt(10))
this.DURABILITY_CHALLENGE_LEVEL= GameConfiguration("Enemy Durability Challenge Level", smallIntegerSingletonFactory!!.getAt(3), smallIntegerSingletonFactory!!.getAt(1), smallIntegerSingletonFactory!!.getAt(10))
this.SPEED_CHALLENGE_LEVEL= GameConfiguration("Enemy Speed Challenge Level", smallIntegerSingletonFactory!!.getAt(3), smallIntegerSingletonFactory!!.getAt(1), smallIntegerSingletonFactory!!.getAt(10))
this.ATTACK_CHALLENGE_LEVEL= GameConfiguration("Enemy Attack Challenge Level", smallIntegerSingletonFactory!!.getAt(3), smallIntegerSingletonFactory!!.getAt(1), smallIntegerSingletonFactory!!.getAt(10))
this.CONTROL_LEVEL= GameConfiguration("Control Fidelity", smallIntegerSingletonFactory!!.getAt(5), smallIntegerSingletonFactory!!.getAt(1), smallIntegerSingletonFactory!!.getAt(10))
this.PLAYER_INPUT_WAIT= GameConfiguration("Input Wait", smallIntegerSingletonFactory!!.getAt(5), smallIntegerSingletonFactory!!.getAt(1), smallIntegerSingletonFactory!!.getAt(10))
this.SPEED= GameConfiguration("Game Speed (Device Specific)", smallIntegerSingletonFactory!!.getAt(5), smallIntegerSingletonFactory!!.getAt(1), smallIntegerSingletonFactory!!.getAt(10))
this.SOUND_VOLUME= GameConfiguration("Sound Volume", smallIntegerSingletonFactory!!.getAt(6), smallIntegerSingletonFactory!!.getAt(0), smallIntegerSingletonFactory!!.getAt(10))
this.MAX_GAME_OBJECTS= GameConfiguration("Max Game Objects", smallIntegerSingletonFactory!!.getAt(20), smallIntegerSingletonFactory!!.getAt(1), smallIntegerSingletonFactory!!.getAt(50))
this.MAX_LAYERS= GameConfiguration("Max Layers", smallIntegerSingletonFactory!!.getAt(20), smallIntegerSingletonFactory!!.getAt(1), smallIntegerSingletonFactory!!.getAt(50))
}


    open fun load(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


        try {
            
    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!


    var keyValuePersistance: KeyValuePersistance = GameConfigurationPersistanceSingleton.getInstance()!!

keyValuePersistance!!.clear()
keyValuePersistance!!.loadAll(abeClientInformation)

    var list: BasicArrayList = keyValuePersistance!!.getIds()!!


    
                        if(list.size() > 0)
                        
                                    {
                                    
    var hashtable: Hashtable<Any, Any> = keyValuePersistance!!.get(0)!!


    var anyType: Any = this.SCALE.getName() as Object


    var value: String = hashtable.get(anyType as Object) as String

this.SCALE.setValue(smallIntegerSingletonFactory!!.getAt(Integer.valueOf(value)!!.toInt()))

                                    }
                                
                        else {
                            this.logUtil!!.putF("No Game Configuration To Load", this, commonStrings!!.LOAD)

                        }
                            
} catch(e: Exception)
            {
this.logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.LOAD, e)
}

}


    open fun setGameControlFidelity(gameControlFidelity: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameControlFidelity = gameControlFidelity
this.gameControlFidelity= gameControlFidelity
}


    open fun getGameControlFidelity()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.gameControlFidelity
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()


    var commonStrings: CommonSeps = CommonSeps.getInstance()!!

stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.SCALE.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.SCALE.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.ORIENTATION.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.ORIENTATION.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.SENSOR_UPDATE_RATE.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.SENSOR_UPDATE_RATE.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.VIBRATION.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.VIBRATION.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.CHALLENGE_LEVEL.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.CHALLENGE_LEVEL.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.COLLIDE_DAMAGE.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.COLLIDE_DAMAGE.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.DURABILITY_CHALLENGE_LEVEL.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.DURABILITY_CHALLENGE_LEVEL.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.SPEED_CHALLENGE_LEVEL.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.SPEED_CHALLENGE_LEVEL.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.ATTACK_CHALLENGE_LEVEL.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.ATTACK_CHALLENGE_LEVEL.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.CONTROL_LEVEL.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.CONTROL_LEVEL.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.SPEED.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.SPEED.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.MAX_GAME_OBJECTS.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.MAX_GAME_OBJECTS.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.MAX_LAYERS.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.appendint(this.MAX_LAYERS.getValue()!!.toInt())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

