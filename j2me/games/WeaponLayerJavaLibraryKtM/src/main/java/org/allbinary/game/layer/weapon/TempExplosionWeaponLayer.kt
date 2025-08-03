
        /* Generated Code Do Not Modify */
        package org.allbinary.game.layer.weapon



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.Animation
import org.allbinary.game.combat.weapon.WeaponProperties
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.physics.movement.Movement
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper
import org.allbinary.view.ViewPosition

open public class TempExplosionWeaponLayer : SimpleWeaponLayer {
        

    val weaponProperties: WeaponProperties = WeaponProperties(0, 1000, 0.toShort())

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(0)
public constructor        (name: String, movement: Movement, animationInterface: Animation, rectangle: Rectangle, viewPosition: ViewPosition, timeDelay: Int)                        

                            : super(name, movement, animationInterface, rectangle, viewPosition){

                    var name = name


                    var movement = movement


                    var animationInterface = animationInterface


                    var rectangle = rectangle


                    var viewPosition = viewPosition


                    var timeDelay = timeDelay


                            //For kotlin this is before the body of the constructor.
                    
this.timeDelayHelper!!.delay= timeDelay
}


                @Throws(Exception::class)
            override fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager

    
                        if(timeDelayHelper!!.isTime(GameTickTimeDelayHelperFactory.getInstance()!!.startTime))
                        
                                    {
                                    this.getCollidableInferface()!!.collide(this)
this.totalDamage= this.getInitDamage() +1

                                    }
                                
super.processTick(allBinaryLayerManager)
}


}
                
            

