
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class SimpleWeaponProperties
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var damage: Int= 0

    private var dissipation: Short= 0

    private var range: Int= 0

    open fun set(simpleWeaponProperties: SimpleWeaponProperties)
        //nullable = true from not(false or (false and false)) = true
{
var simpleWeaponProperties = simpleWeaponProperties
this.setDamage(simpleWeaponProperties!!.getDamage())
this.setDissipation(simpleWeaponProperties!!.getDissipation())
this.setRange(simpleWeaponProperties!!.getRange())
}


    open fun setDamage(damage: Int)
        //nullable = true from not(false or (false and false)) = true
{
var damage = damage
this.damage= damage
}


    open fun getDamage()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return damage
}


    open fun setDissipation(dissipation: Short)
        //nullable = true from not(false or (false and false)) = true
{
var dissipation = dissipation
this.dissipation= dissipation
}


    open fun getDissipation()
        //nullable = true from not(false or (false and true)) = true
: Short{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dissipation
}


    open fun getRange()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return range
}


    open fun setRange(range: Int)
        //nullable = true from not(false or (false and false)) = true
{
var range = range
this.range= range
}


}
                
            

