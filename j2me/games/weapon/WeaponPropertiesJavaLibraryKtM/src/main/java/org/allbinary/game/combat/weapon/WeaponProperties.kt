
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
        package org.allbinary.game.combat.weapon



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.math.BasicDecimal
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class WeaponProperties : SimpleWeaponProperties {
        

        companion object {


    val NULL_WEAPON_PROPERTIES: WeaponProperties = WeaponProperties(0L, 0L, 0L, 0, 0.toShort())

    private var messageSent: Boolean = false

    private val DAMAGE: String = "Damage: "

    private val RANGE: String = "Range: "

    private val RELOAD: String = "Reload: "


        }
            
    private var reloadTime: Long= 0

    private var targetingTime: Long= 0

    private var speed: BasicDecimal = BasicDecimal.ZERO_BIGDECIMAL

    private val MAX: Long = 10240L

    private val ZERO: Short = 0
public constructor        (reloadTime: Long, targetingTime: Long, speed: Long, damage: Int, dissipation: Short){

                    var reloadTime = reloadTime


                    var targetingTime = targetingTime


                    var speed = speed


                    var damage = damage


                    var dissipation = dissipation

    
                        if(speed < MAX && speed != 0L && !messageSent)
                        
                                    {
                                    
    var MESSAGE: String = "Danger Danger Danger: Speed probably to slow if using 1 degree calculations as velocity for a single axis could be below 1024: "


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(StringMaker().
                            append(MESSAGE)!!.append(speed)!!.toString(), this, commonStrings!!.CONSTRUCTOR)
messageSent= true

                                    }
                                
this.setReloadTime(reloadTime)
this.setTargetingTime(targetingTime)
this.setDamage(damage)
this.setDissipation(dissipation)
this.setSpeed(BasicDecimal(speed))

    
                        if(dissipation != ZERO)
                        
                                    {
                                    
    var unscaledDamage: Long = this.speed!!.getUnscaled() *damage


    var scaledDissipation: Int = dissipation *this.speed!!.getScaledFactorValue()


    var value: Long = (unscaledDamage /scaledDissipation)

this.setRange((value *9).toInt() /10)

                                    }
                                
}

public constructor        (speed: Long, damage: Int, dissipation: Short)                        

                            : this( -1L,  -1L, speed, damage, dissipation){

                    var speed = speed


                    var damage = damage


                    var dissipation = dissipation


                            //For kotlin this is before the body of the constructor.
                    
}


open fun setReloadTime(reloadTime: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var reloadTime = reloadTime
this.reloadTime= reloadTime
}


open fun getReloadTime()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return reloadTime
}


open fun setTargetingTime(targetingTime: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var targetingTime = targetingTime
this.targetingTime= targetingTime
}


open fun getTargetingTime()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return targetingTime
}


open fun getSpeed()
        //nullable = true from not(false or (false and true)) = true
: BasicDecimal{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return speed
}


open fun setSpeed(speed: BasicDecimal)
        //nullable = true from not(false or (false and false)) = true
{

                    var speed = speed
this.speed= speed
}


open fun getDamage(range: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var range = range



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getDamage() -((this.getDissipation() *range) /this.speed!!.getScaled())
}


open fun toStringArray()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{
    var index: Int = 0


    var stringArray: Array<String?> = arrayOfNulls(3)


    var stringBuffer: StringMaker = StringMaker()

stringArray[index++]= stringBuffer!!.append(DAMAGE)!!.append(this.getDamage())!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringArray[index++]= stringBuffer!!.append(RANGE)!!.append(this.getRange())!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringArray[index++]= stringBuffer!!.append(RELOAD)!!.append(this.getReloadTime())!!.toString()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringArray
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(DAMAGE)!!.append(this.getDamage())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(RANGE)!!.append(this.getRange())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(RELOAD)!!.append(this.getReloadTime())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

