
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
        package org.allbinary.game.layer.waypoint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.ProceduralAnimationInterfaceFactoryInterface
import org.allbinary.game.health.Health
import org.allbinary.game.identification.Group
import org.allbinary.game.input.form.NullRTSFormInputFactory
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.game.multiplayer.layer.RemoteInfo
import org.allbinary.media.audio.AttackSound

open public class WaypointLayer : AdvancedRTSGameLayer {
        
companion object {
            
    open fun getStaticType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 4
}


        }
            protected constructor (remoteInfo: RemoteInfo, parentLayer: PathFindingLayerInterface, groupInterface: Array<Group?>, rootName: String, name: String, animationInterfaceFactoryInterface: AnimationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface: ProceduralAnimationInterfaceFactoryInterface, rectangle: Rectangle, x: Int, y: Int)                        

                            : super(remoteInfo, parentLayer, groupInterface, rootName, name, Health(1000), NullRTSFormInputFactory.getInstance(), animationInterfaceFactoryInterface, animationInterfaceFactoryInterface, animationInterfaceFactoryInterface, animationInterfaceFactoryInterface, animationInterfaceFactoryInterface, proceduralAnimationInterfaceFactoryInterface, rectangle, x, y){
    //var remoteInfo = remoteInfo
    //var parentLayer = parentLayer
    //var groupInterface = groupInterface
    //var rootName = rootName
    //var name = name
    //var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface
    //var proceduralAnimationInterfaceFactoryInterface = proceduralAnimationInterfaceFactoryInterface
    //var rectangle = rectangle
    //var x = x
    //var y = y


                            //For kotlin this is before the body of the constructor.
                    
this.setCollidableInferface(CollidableWaypointBehavior(this, true))
this.getWaypointBehavior()!!.setWaypoint(Waypoint(this, AttackSound.getInstance()))
this.setAnimationInterface(this.indexedButShouldBeRotationAnimationInterface)
}


    override fun construct(rtsPlayerLayerInterface: RTSPlayerLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var rtsPlayerLayerInterface = rtsPlayerLayerInterface
this.percentCompleteP= 100
this.initVisibility(rtsPlayerLayerInterface)
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    
                        if(this.isVisible())
                        
                                    {
                                    super.paint(graphics)

                                    }
                                
}


    override fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager

        try {
            this.indexedButShouldBeRotationAnimationInterface!!.nextFrame()
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "processTick", e)
}

}


    override fun damage(damage: Int, damageType: Int)
        //nullable = true from not(false or (false and false)) = true
{
var damage = damage
var damageType = damageType
}


                @Throws(Exception::class)
            
    override fun getDamage(damageType: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var damageType = damageType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


                @Throws(Exception::class)
            
    override fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var destroyed = destroyed
super.setDestroyed(destroyed)

    
                        if(this.isDestroyed())
                        
                                    {
                                    WaypointCellPositionHistory.getInstance()!!.remove(this)

                                    }
                                
}


    override fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getStaticType()
}


    override fun isSelfUpgradeable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

