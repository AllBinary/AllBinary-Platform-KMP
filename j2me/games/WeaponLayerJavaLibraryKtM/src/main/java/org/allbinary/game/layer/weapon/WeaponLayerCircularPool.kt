
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
        package org.allbinary.game.layer.weapon




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.combat.weapon.WeaponProperties
import org.allbinary.game.score.ScoreableInterface
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerCircularPool

open public class WeaponLayerCircularPool : AllBinaryLayerCircularPool {
        
public constructor        (){}


                @Throws(Exception::class)
            
open fun getInstance(sourceLayerInterface: AllBinaryLayer, x: Int, y: Int, z: Int, angle: Int, otherAngle: Int, weaponProperties: WeaponProperties, scoreable: ScoreableInterface)
        //nullable =  from not(true or (false and false)) = 
: WeaponLayer{

                    var sourceLayerInterface = sourceLayerInterface


                    var x = x


                    var y = y


                    var z = z


                    var angle = angle


                    var otherAngle = otherAngle


                    var weaponProperties = weaponProperties


                    var scoreable = scoreable

    var weaponLayer: WeaponLayer = super.getNextInstance() as WeaponLayer

weaponLayer!!.init(x, y, z)
weaponLayer!!.init(sourceLayerInterface, angle, otherAngle, weaponProperties, scoreable)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return weaponLayer
}


}
                
            

