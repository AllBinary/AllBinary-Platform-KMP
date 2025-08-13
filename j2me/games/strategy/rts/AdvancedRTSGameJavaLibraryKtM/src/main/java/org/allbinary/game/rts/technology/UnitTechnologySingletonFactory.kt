
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.rts.technology



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class UnitTechnologySingletonFactory
            : Object
         {
        

        companion object {
            
    private val instance: UnitTechnologySingletonFactory = UnitTechnologySingletonFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: UnitTechnologySingletonFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private var damage: Int= 0

    private var health: Int= 0

    private var reload: Int= 0

    private var repair: Int= 0

    private var speed: Int= 0
private constructor        ()
            : super()
        {}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{this.setDamage(0)
this.setHealth(0)
this.setReload(0)
this.setRepair(0)
this.setSpeed(0)
}


open fun getDamage()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return damage
}


open fun setDamage(damage: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var damage = damage
this.damage= damage
}


open fun getHealth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return health
}


open fun setHealth(health: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var health = health
this.health= health
}


open fun getReload()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return reload
}


open fun setReload(reload: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var reload = reload
this.reload= reload
}


open fun getRepair()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return repair
}


open fun setRepair(repair: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var repair = repair
this.repair= repair
}


open fun getSpeed()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return speed
}


open fun setSpeed(speed: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var speed = speed
this.speed= speed
}


}
                
            

