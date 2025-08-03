
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
        package org.allbinary.game.health



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class Health
            : Object
        
                , HealthInterface {
        

        companion object {


    val NAME: String = "Health Resource"

    private val HEALTH_LABEL: String = "Health: "

    private val MAX_HEALTH_LABEL: String = " Max: "


        }
            
    private var health: Int= 0

    private var maxHealth: Int= 0

    private var healthListenerInterface: HealthListenerInterface = NullHealthListener.NULL_HEALTH_LISTENER
public constructor        (maxHealth: Int)
            : super()
        {

                    var maxHealth = maxHealth
this.setMaxHealth(maxHealth)
this.setHealth(maxHealth)
}

override fun heal(ahealth: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var ahealth = ahealth

    var newHealth: Int = this.getHealth() +ahealth


    
                        if(newHealth > this.getMaxHealth())
                        
                                    {
                                    this.setHealth(this.getMaxHealth())

                                    }
                                
                        else {
                            this.setHealth(newHealth)

                        }
                            
}

override fun heal()
        //nullable = true from not(false or (false and true)) = true
{this.setHealth(this.getMaxHealth())
}


open fun isDamaged()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.getHealth() != this.getMaxHealth())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun damage(ahealth: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var ahealth = ahealth

    
                        if(ahealth < 0)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "******* Trying to heal when damaging. Damage: ")
stringBuffer!!.append(ahealth)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(this.toString())
ForcedLogUtil.log(stringBuffer!!.toString(), this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var health: Int = this.getHealth() -ahealth

this.setHealth(health)
}

override fun isAlive()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.getHealth() <= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}

override fun getMaxHealth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxHealth
}

override fun setMaxHealth(maxHealth: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxHealth = maxHealth
this.maxHealth= maxHealth
}


open fun setHealth(health: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var health = health

    
                        if(health > this.getMaxHealth())
                        
                                    {
                                    this.health= this.getMaxHealth()

                                    }
                                
                             else 
    
                        if(health < 0)
                        
                                    {
                                    this.health= 0

                                    }
                                
                        else {
                            this.health= health

                        }
                            

    
                        if(this.healthListenerInterface != 
                                    null
                                )
                        
                                    {
                                    this.healthListenerInterface!!.onHealthChange()

                                    }
                                
}

override fun getHealth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return health
}

override fun addListener(healthGraphic: HealthListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var healthGraphic = healthGraphic
this.healthListenerInterface= healthGraphic
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(Health.HEALTH_LABEL)
stringBuffer!!.append(this.health)
stringBuffer!!.append(Health.MAX_HEALTH_LABEL)
stringBuffer!!.append(this.maxHealth)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

