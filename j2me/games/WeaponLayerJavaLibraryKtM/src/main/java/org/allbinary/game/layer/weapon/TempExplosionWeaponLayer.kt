
        /* Generated Code Do Not Modify */
        package org.allbinary.game.layer.weapon




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.Animation
import org.allbinary.game.combat.weapon.WeaponProperties
import org.allbinary.game.multiplayer.layer.RemoteInfo
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.physics.movement.Movement
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper
import org.allbinary.view.ViewPosition

open public class TempExplosionWeaponLayer : SimpleWeaponLayer {
        

    val weaponProperties: WeaponProperties = WeaponProperties( -1L,  -1L, 0, 1000, 0.toShort())

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(0)
public constructor (name: String, movement: Movement, animationInterface: Animation, rectangle: Rectangle, viewPosition: ViewPosition, timeDelay: Int)                        

                            : super(name, RemoteInfo.REMOTE_INFO,  -1, movement, animationInterface, SimpleWeaponLayer.createDestroyed(), rectangle, viewPosition){
    //var name = name
    //var movement = movement
    //var animationInterface = animationInterface
    //var rectangle = rectangle
    //var viewPosition = viewPosition
    //var timeDelay = timeDelay


                            //For kotlin this is before the body of the constructor.
                    
this.timeDelayHelper!!.delay= timeDelay
}


                @Throws(Exception::class)
            
    override fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager

    
                        if(this.timeDelayHelper!!.isTime(GameTickTimeDelayHelperFactory.getInstance()!!.startTime))
                        
                                    {
                                    this.getCollidableInferface()!!.collide(this)
this.totalDamage= this.getInitDamage() +1

                                    }
                                
super.processTick(allBinaryLayerManager)
}


}
                
            

