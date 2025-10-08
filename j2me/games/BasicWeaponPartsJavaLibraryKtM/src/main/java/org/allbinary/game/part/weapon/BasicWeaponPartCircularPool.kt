
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
        package org.allbinary.game.part.weapon




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.combat.weapon.WeaponProperties
import org.allbinary.game.score.ScoreableInterface
import org.allbinary.graphics.RelativeRelationship
import org.allbinary.layer.AllBinaryLayer

open public class BasicWeaponPartCircularPool
            : Object
         {
        
companion object {
            
    val NULL_BASIC_WEAPON_PART_CIRCULAR_POOL: BasicWeaponPartCircularPool = BasicWeaponPartCircularPool()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var basicWeaponPart: BasicWeaponPart = BasicWeaponPart.NULL_BASIC_WEAPON_PART

                @Throws(Exception::class)
            
    open fun init(basicWeaponPartFactoryInterface: BasicWeaponPartFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var basicWeaponPartFactoryInterface = basicWeaponPartFactoryInterface
basicWeaponPart= basicWeaponPartFactoryInterface!!.getInstance()
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun getInstance(sourceLayerInterface: AllBinaryLayer, weaponProperties: WeaponProperties, scoreableInterface: ScoreableInterface, relativeRelationship: RelativeRelationship)
        //nullable =  from not(true or (false and false)) = 
: BasicWeaponPart{
    //var sourceLayerInterface = sourceLayerInterface
    //var weaponProperties = weaponProperties
    //var scoreableInterface = scoreableInterface
    //var relativeRelationship = relativeRelationship
basicWeaponPart!!.init(sourceLayerInterface, weaponProperties, scoreableInterface, relativeRelationship)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicWeaponPart
}


}
                
            

