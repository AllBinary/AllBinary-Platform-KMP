
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

SCALE= GameConfiguration("Scale", smallIntegerSingletonFactory!!.getInstance(2), smallIntegerSingletonFactory!!.getInstance(2), smallIntegerSingletonFactory!!.getInstance(3))
ORIENTATION= GameConfiguration("Orientation", smallIntegerSingletonFactory!!.getInstance(0), smallIntegerSingletonFactory!!.getInstance(0), smallIntegerSingletonFactory!!.getInstance(8))
SENSOR_UPDATE_RATE= GameConfiguration("Sensor Update Rate", smallIntegerSingletonFactory!!.getInstance(0), smallIntegerSingletonFactory!!.getInstance(0), smallIntegerSingletonFactory!!.getInstance(3))
VIBRATION= GameConfiguration("Vibration", smallIntegerSingletonFactory!!.getInstance(0), smallIntegerSingletonFactory!!.getInstance(0), smallIntegerSingletonFactory!!.getInstance(3))
CHALLENGE_LEVEL= GameConfiguration("Global Challenge Level", smallIntegerSingletonFactory!!.getInstance(3), smallIntegerSingletonFactory!!.getInstance(1), smallIntegerSingletonFactory!!.getInstance(10))
COLLIDE_DAMAGE= GameConfiguration("Collide Damage Challenge Level", smallIntegerSingletonFactory!!.getInstance(3), smallIntegerSingletonFactory!!.getInstance(1), smallIntegerSingletonFactory!!.getInstance(10))
DURABILITY_CHALLENGE_LEVEL= GameConfiguration("Enemy Durability Challenge Level", smallIntegerSingletonFactory!!.getInstance(3), smallIntegerSingletonFactory!!.getInstance(1), smallIntegerSingletonFactory!!.getInstance(10))
SPEED_CHALLENGE_LEVEL= GameConfiguration("Enemy Speed Challenge Level", smallIntegerSingletonFactory!!.getInstance(3), smallIntegerSingletonFactory!!.getInstance(1), smallIntegerSingletonFactory!!.getInstance(10))
ATTACK_CHALLENGE_LEVEL= GameConfiguration("Enemy Attack Challenge Level", smallIntegerSingletonFactory!!.getInstance(3), smallIntegerSingletonFactory!!.getInstance(1), smallIntegerSingletonFactory!!.getInstance(10))
CONTROL_LEVEL= GameConfiguration("Control Fidelity", smallIntegerSingletonFactory!!.getInstance(5), smallIntegerSingletonFactory!!.getInstance(1), smallIntegerSingletonFactory!!.getInstance(10))
PLAYER_INPUT_WAIT= GameConfiguration("Input Wait", smallIntegerSingletonFactory!!.getInstance(5), smallIntegerSingletonFactory!!.getInstance(1), smallIntegerSingletonFactory!!.getInstance(10))
SPEED= GameConfiguration("Game Speed (Device Specific)", smallIntegerSingletonFactory!!.getInstance(5), smallIntegerSingletonFactory!!.getInstance(1), smallIntegerSingletonFactory!!.getInstance(10))
SOUND_VOLUME= GameConfiguration("Sound Volume", smallIntegerSingletonFactory!!.getInstance(6), smallIntegerSingletonFactory!!.getInstance(0), smallIntegerSingletonFactory!!.getInstance(10))
MAX_GAME_OBJECTS= GameConfiguration("Max Game Objects", smallIntegerSingletonFactory!!.getInstance(20), smallIntegerSingletonFactory!!.getInstance(1), smallIntegerSingletonFactory!!.getInstance(50))
MAX_LAYERS= GameConfiguration("Max Layers", smallIntegerSingletonFactory!!.getInstance(20), smallIntegerSingletonFactory!!.getInstance(1), smallIntegerSingletonFactory!!.getInstance(50))
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

this.SCALE.setValue(smallIntegerSingletonFactory!!.getInstance(Integer.valueOf(value)!!.toInt()))

                                    }
                                
                        else {
                            logUtil!!.put("No Game Configuration To Load", this, commonStrings!!.LOAD)

                        }
                            
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.LOAD, e)
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
stringBuffer!!.append(this.SCALE.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.ORIENTATION.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.ORIENTATION.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.SENSOR_UPDATE_RATE.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.SENSOR_UPDATE_RATE.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.VIBRATION.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.VIBRATION.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.CHALLENGE_LEVEL.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.CHALLENGE_LEVEL.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.COLLIDE_DAMAGE.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.COLLIDE_DAMAGE.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.DURABILITY_CHALLENGE_LEVEL.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.DURABILITY_CHALLENGE_LEVEL.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.SPEED_CHALLENGE_LEVEL.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.SPEED_CHALLENGE_LEVEL.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.ATTACK_CHALLENGE_LEVEL.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.ATTACK_CHALLENGE_LEVEL.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.CONTROL_LEVEL.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.CONTROL_LEVEL.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.SPEED.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.SPEED.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.MAX_GAME_OBJECTS.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.MAX_GAME_OBJECTS.getValue()!!.toInt())
stringBuffer!!.append(commonStrings!!.COMMA_SEP)
stringBuffer!!.append(this.MAX_LAYERS.getName())
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(this.MAX_LAYERS.getValue()!!.toInt())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

