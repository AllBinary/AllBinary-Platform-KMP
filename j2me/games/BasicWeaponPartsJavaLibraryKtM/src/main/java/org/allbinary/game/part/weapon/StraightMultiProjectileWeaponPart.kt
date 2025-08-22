
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
import org.allbinary.math.NoDecimalTrigTable

open public class StraightMultiProjectileWeaponPart : BasicWeaponPart {
        

    private val weaponLayerCircularStaticPool: WeaponLayerCircularPool

    private val total: Int
public constructor        (animationInterface: Animation, weaponLayerCircularStaticPool: WeaponLayerCircularPool)                        

                            : super(animationInterface){

                    var animationInterface = animationInterface


                    var weaponLayerCircularStaticPool = weaponLayerCircularStaticPool


                            //For kotlin this is before the body of the constructor.
                    
this.total= 2
this.weaponLayerCircularStaticPool= weaponLayerCircularStaticPool
}

public constructor        (animationInterface: Animation, sourceLayerInterface: AllBinaryLayer, weaponLayerCircularStaticPool: WeaponLayerCircularPool, total: Int, weaponProperties: WeaponProperties, scoreableInterface: ScoreableInterface, relativeRelationship: RelativeRelationship)                        

                            : super(animationInterface, sourceLayerInterface, weaponProperties, scoreableInterface, relativeRelationship){

                    var animationInterface = animationInterface


                    var sourceLayerInterface = sourceLayerInterface


                    var weaponLayerCircularStaticPool = weaponLayerCircularStaticPool


                    var total = total


                    var weaponProperties = weaponProperties


                    var scoreableInterface = scoreableInterface


                    var relativeRelationship = relativeRelationship


                            //For kotlin this is before the body of the constructor.
                    
this.total= total
this.weaponLayerCircularStaticPool= weaponLayerCircularStaticPool
}


    private val noDecimalTrigTable: NoDecimalTrigTable = NoDecimalTrigTable.getInstance()!!

                @Throws(Exception::class)
            override fun process(allbinaryLayerManager: AllBinaryLayerManager, angle: Short, otherAngle: Short, weaponProperties: WeaponProperties, scoreableInterface: ScoreableInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayerManager = allbinaryLayerManager


                    var angle = angle


                    var otherAngle = otherAngle


                    var weaponProperties = weaponProperties


                    var scoreableInterface = scoreableInterface

    var sourceLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!


    var reducedWidth: Int = (sourceLayerInterface!!.getWidth() *8 /10)


    var halfWidth: Int = (reducedWidth shr 1)


    var x: Int = this.relativeRelationship!!.getX()!!


    var y: Int = this.relativeRelationship!!.getY()!!


    var sine: Long= 0


    var beamX: Int= 0


    var cosine: Long= 0


    var beamY: Int= 0


    var weaponLayer: WeaponLayer


    var increment: Int = reducedWidth /(this.total -1)


    var next: Int =  -halfWidth





                        for (index in 0 until total)


        {sine= (next *noDecimalTrigTable!!.sin(angle.toInt())).toLong()
beamX= (sine /noDecimalTrigTable!!.SCALE).toInt()
cosine= (next *noDecimalTrigTable!!.cos(angle.toInt())).toLong()
beamY=  -(cosine /noDecimalTrigTable!!.SCALE).toInt()
weaponLayer= weaponLayerCircularStaticPool!!.getInstance(sourceLayerInterface, x +beamX, y +beamY, 0, angle.toInt(), otherAngle.toInt(), weaponProperties, scoreableInterface)
allbinaryLayerManager!!.append(weaponLayer)
next += increment
}

}


}
                
            

