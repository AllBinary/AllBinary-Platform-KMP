
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
        
import org.allbinary.animation.Animation
import org.allbinary.game.combat.weapon.WeaponProperties
import org.allbinary.game.layer.weapon.WeaponLayer
import org.allbinary.game.layer.weapon.WeaponLayerCircularPool
import org.allbinary.game.score.ScoreableInterface
import org.allbinary.graphics.RelativeRelationship
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager

open public class BasicProjectileWeaponPart : BasicWeaponPart {
        

    private var weaponLayerCircularStaticPool: WeaponLayerCircularPool
public constructor        (animationInterface: Animation, weaponLayerCircularStaticPool: WeaponLayerCircularPool)                        

                            : super(animationInterface){
    //var animationInterface = animationInterface
    //var weaponLayerCircularStaticPool = weaponLayerCircularStaticPool


                            //For kotlin this is before the body of the constructor.
                    
this.weaponLayerCircularStaticPool= weaponLayerCircularStaticPool
}

public constructor        (animationInterface: Animation, sourceLayerInterface: AllBinaryLayer, weaponLayerCircularStaticPool: WeaponLayerCircularPool, weaponProperties: WeaponProperties, scoreableInterface: ScoreableInterface, relativeRelationship: RelativeRelationship)                        

                            : super(animationInterface, sourceLayerInterface, weaponProperties, scoreableInterface, relativeRelationship){
    //var animationInterface = animationInterface
    //var sourceLayerInterface = sourceLayerInterface
    //var weaponLayerCircularStaticPool = weaponLayerCircularStaticPool
    //var weaponProperties = weaponProperties
    //var scoreableInterface = scoreableInterface
    //var relativeRelationship = relativeRelationship


                            //For kotlin this is before the body of the constructor.
                    
this.weaponLayerCircularStaticPool= weaponLayerCircularStaticPool
}


                @Throws(Exception::class)
            override fun process(allbinaryLayerManager: AllBinaryLayerManager, angle: Short, otherAngle: Short, weaponProperties: WeaponProperties, scoreableInterface: ScoreableInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var allbinaryLayerManager = allbinaryLayerManager
    //var angle = angle
var otherAngle = otherAngle
    //var weaponProperties = weaponProperties
    //var scoreableInterface = scoreableInterface

    var weaponLayer: WeaponLayer = weaponLayerCircularStaticPool!!.getInstance(this.getOwnerLayerInterface(), this.relativeRelationship!!.getX(), this.relativeRelationship!!.getY(), this.relativeRelationship!!.getZ(), angle.toInt(), otherAngle.toInt(), weaponProperties, scoreableInterface)!!

allbinaryLayerManager!!.append(weaponLayer)
}


}
                
            

