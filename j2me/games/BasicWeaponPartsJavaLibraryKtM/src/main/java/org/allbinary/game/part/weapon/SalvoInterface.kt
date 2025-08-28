
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
import org.allbinary.layer.AllBinaryLayerManager
interface SalvoInterface {
        

                @Throws(Exception::class)
            
open fun process(allbinaryLayerManager: AllBinaryLayerManager, angle: Short, otherAngle: Short)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun process(allbinaryLayerManager: AllBinaryLayerManager, angle: Short, otherAngle: Short, weaponProperties: WeaponProperties, scoreableInterface: ScoreableInterface)
        //nullable = true from not(false or (false and false)) = true


}
                
            

