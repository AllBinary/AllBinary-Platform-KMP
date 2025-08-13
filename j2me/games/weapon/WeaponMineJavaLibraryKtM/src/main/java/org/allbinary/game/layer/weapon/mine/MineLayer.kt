
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
        package org.allbinary.game.layer.weapon.mine



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.game.layer.weapon.SimpleWeaponLayer
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.audio.SecondaryPlayerQueueFactory
import org.allbinary.physics.movement.NoMovementFactory
import org.allbinary.view.ViewPosition
import org.allbinary.view.event.ViewPositionEventHandler
import org.allbinary.weapon.media.audio.DropWeaponSound

open public class MineLayer : SimpleWeaponLayer {
        

        companion object {
            
    private val NAME: String = "MineLayer"

        }
            public constructor        (viewPosition: ViewPosition)                        

                            : super(NAME, NoMovementFactory.getInstance()!!.getMovmentInstance(), FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.get(MineWeaponResources.getInstance()!!.RESOURCE)!!.getInstance(0), Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, 10, 10), viewPosition){

                    var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}


    private val viewPositionEventHandler: ViewPositionEventHandler = ViewPositionEventHandler.getInstance()!!
            
override fun init(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y


                    var z = z
this.setPosition(x +5, y +5, z)
this.viewPositionEventHandler!!.addListener(this as AllBinaryLayer)
SecondaryPlayerQueueFactory.getInstance()!!.add(DropWeaponSound.getInstance())
}

override fun damage(damage: Int, damageType: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var damage = damage


                    var damageType = damageType
this.totalDamage= this.getInitDamage() +1
}

override fun getDamage(damageType: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var damageType = damageType
super.getDamage(damageType)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInitDamage()
}

override fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var destroyed = destroyed
super.setDestroyed(destroyed)

    
                        if(this.isDestroyed())
                        
                                    {
                                    this.viewPositionEventHandler!!.removeListener(this)

                                    }
                                
}


}
                
            

