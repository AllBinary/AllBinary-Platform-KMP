
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
        package org.allbinary.game.layer.pickup




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.game.collision.CollidableAlwaysPickupNeverCollideBehaviorFactory
import org.allbinary.game.combat.destroy.DestroyedLayerProcessor
import org.allbinary.game.identification.BasicGroupFactory
import org.allbinary.game.multiplayer.layer.MultiPlayerGameLayer
import org.allbinary.game.multiplayer.layer.RemoteInfo
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.image.opengles.OpenGLSurfaceChangedInterface
import org.allbinary.view.ViewPosition

open public class PickupLayer : MultiPlayerGameLayer
                , PickedUpLayerInterface
                , PickupableInterface {
        

    private var pickedUpLayerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface = CountedPickedUpLayerInterfaceFactory.NULL_COUNTED_PICKUP_LAYER_FACTORY

    private var destroyed: Boolean= false

    private var animationInterface: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!
public constructor (name: String, remoteInfo: RemoteInfo, viewPosition: ViewPosition)                        

                            : super(remoteInfo, BasicGroupFactory.getInstance()!!.NONE_ARRAY, name, Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, 0, 0), viewPosition){
    //var name = name
    //var remoteInfo = remoteInfo
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
this.setCollidableInferface(CollidableAlwaysPickupNeverCollideBehaviorFactory.getInstance())
this.setLayerWidth(10)
this.setLayerHeight(10)
}

public constructor (name: String, remoteInfo: RemoteInfo, total: Int, pickedUpLayerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface, animationInterface: Animation, rectangle: Rectangle, viewPosition: ViewPosition)                        

                            : super(remoteInfo, BasicGroupFactory.getInstance()!!.NONE_ARRAY, name, rectangle, viewPosition){
    //var name = name
    //var remoteInfo = remoteInfo
    //var total = total
    //var pickedUpLayerInterfaceFactoryInterface = pickedUpLayerInterfaceFactoryInterface
    //var animationInterface = animationInterface
    //var rectangle = rectangle
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
this.setCollidableInferface(CollidableAlwaysPickupNeverCollideBehaviorFactory.getInstance())
this.setLayerWidth(10)
this.setLayerHeight(10)
this.init(pickedUpLayerInterfaceFactoryInterface, animationInterface)
}

public constructor (name: String, viewPosition: ViewPosition)                        

                            : this(name, RemoteInfo.REMOTE_INFO, viewPosition){
    //var name = name
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (name: String, total: Int, pickedUpLayerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface, animationInterface: Animation, rectangle: Rectangle, viewPosition: ViewPosition)                        

                            : this(name, RemoteInfo.REMOTE_INFO, total, pickedUpLayerInterfaceFactoryInterface, animationInterface, rectangle, viewPosition){
    //var name = name
    //var total = total
    //var pickedUpLayerInterfaceFactoryInterface = pickedUpLayerInterfaceFactoryInterface
    //var animationInterface = animationInterface
    //var rectangle = rectangle
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun init(pickedUpLayerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface, animationInterface: Animation)
        //nullable = true from not(false or (false and false)) = true
{
    //var pickedUpLayerInterfaceFactoryInterface = pickedUpLayerInterfaceFactoryInterface
    //var animationInterface = animationInterface
this.pickedUpLayerInterfaceFactoryInterface= pickedUpLayerInterfaceFactoryInterface
this.animationInterface= animationInterface
this.setDestroyed(false)
}


    open fun init(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var z = z
this.setPosition(x, y, z)
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    var viewPosition: ViewPosition = this.getViewPosition()!!


    var viewX: Int = viewPosition!!.getX()!!


    var viewY: Int = viewPosition!!.getY()!!

this.animationInterface!!.paint(graphics, viewX, viewY)
}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    var viewPosition: ViewPosition = this.getViewPosition()!!


    var viewX: Int = viewPosition!!.getX()!!


    var viewY: Int = viewPosition!!.getY()!!

this.animationInterface!!.paintThreed(graphics, viewX, viewY, 3)
}


    override fun getPickedUpLayerInterfaceFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: PickedUpLayerInterfaceFactoryInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.pickedUpLayerInterfaceFactoryInterface
}


    override fun setPickedUp()
        //nullable = true from not(false or (false and true)) = true
{
this.setDestroyed(true)
}


    override fun isDestroyed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return destroyed
}


    open fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var destroyed = destroyed
this.destroyed= destroyed

    
                        if(this.isDestroyed())
                        
                                    {
                                    DestroyedLayerProcessor.getInstance()!!.add(this)

                                    }
                                
}


    override fun damage(damage: Int, damageType: Int)
        //nullable = true from not(false or (false and false)) = true
{
var damage = damage
var damageType = damageType
}


    override fun getDamage(damageType: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var damageType = damageType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


                @Throws(Exception::class)
            
    override fun set(gl: GL)
        //nullable = true from not(false or (false and false)) = true
{
var gl = gl

    var openGLSurfaceChangedInterface: OpenGLSurfaceChangedInterface = this.animationInterface as OpenGLSurfaceChangedInterface

openGLSurfaceChangedInterface!!.set(gl)
}


}
                
            

