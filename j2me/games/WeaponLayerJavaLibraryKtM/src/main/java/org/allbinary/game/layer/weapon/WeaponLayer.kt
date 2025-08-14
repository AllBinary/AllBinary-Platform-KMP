
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
        
import javax.microedition.khronos.opengles.GL
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.animation.IndexedAnimation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.animation.NullIndexedAnimationFactory
import org.allbinary.game.collision.CollidableBaseBehavior
import org.allbinary.game.combat.damage.ExplosionResources
import org.allbinary.game.combat.destroy.DestroyedLayerProcessor
import org.allbinary.game.combat.weapon.WeaponProperties
import org.allbinary.game.configuration.GameConfigurationUtil
import org.allbinary.game.identification.BasicGroupFactory
import org.allbinary.game.multiplayer.layer.MultiPlayerGameLayer
import org.allbinary.game.multiplayer.layer.RemoteInfo
import org.allbinary.game.score.NoScoreable
import org.allbinary.game.score.ScoreableInterface
import org.allbinary.game.tick.TickableInterface
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.physics.movement.Movement
import org.allbinary.view.ViewPosition

open public class WeaponLayer : MultiPlayerGameLayer
                , TickableInterface {
        

        companion object {
            
open fun getStaticType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


        }
            
    private var animationInterface: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!
            

    var initAnimationInterface: Animation

    private var destroyedAnimationInterface: Animation

    private var sourceLayerInterface: AllBinaryLayer = AllBinaryLayer.NULL_ALLBINARY_LAYER

    var totalDamage: Int= 0

    private var initDamage: Int= 0

    private var destroyed: Boolean = true

    var scoreableInterface: ScoreableInterface = NoScoreable.getInstance()!!
            

    private var movement: Movement

    private var weaponProperties: WeaponProperties = WeaponProperties.NULL_WEAPON_PROPERTIES

    private val multiPlayerType: Int
protected constructor        (name: String, movement: Movement, animationInterface: Animation, rectangle: Rectangle, viewPosition: ViewPosition)                        

                            : this(name, movement, animationInterface, FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.getProcedural(ExplosionResources.getInstance()!!.THIRD_EXPLOSION_RESOURCE)!!.getInstance(NullIndexedAnimationFactory.getFactoryInstance()!!.getInstance(0)), rectangle, viewPosition){

                    var name = name


                    var movement = movement


                    var animationInterface = animationInterface


                    var rectangle = rectangle


                    var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}

protected constructor        (name: String, movement: Movement, animationInterface: Animation, destroyedAnimationInterface: Animation, rectangle: Rectangle, viewPosition: ViewPosition)                        

                            : this(name, RemoteInfo.REMOTE_INFO,  -1, movement, animationInterface, destroyedAnimationInterface, rectangle, viewPosition){

                    var name = name


                    var movement = movement


                    var animationInterface = animationInterface


                    var destroyedAnimationInterface = destroyedAnimationInterface


                    var rectangle = rectangle


                    var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
}

protected constructor        (name: String, remoteInfo: RemoteInfo, multiPlayerType: Int, movement: Movement, animationInterface: Animation, destroyedAnimationInterface: Animation, rectangle: Rectangle, viewPosition: ViewPosition)                        

                            : super(remoteInfo, BasicGroupFactory.getInstance()!!.NONE_ARRAY, name, rectangle, viewPosition){

                    var name = name


                    var remoteInfo = remoteInfo


                    var multiPlayerType = multiPlayerType


                    var movement = movement


                    var animationInterface = animationInterface


                    var destroyedAnimationInterface = destroyedAnimationInterface


                    var rectangle = rectangle


                    var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
this.initAnimationInterface= animationInterface
this.setAnimationInterface(animationInterface)
this.destroyedAnimationInterface= destroyedAnimationInterface
this.movement= movement
this.multiPlayerType= multiPlayerType
}


    private var collidableWeaponBehavior: CollidableWeaponBehavior = CollidableWeaponBehavior.NULL_COLLIDABLE_WEAPON_BEHAVIOR
override fun setCollidableInferface(collidableInferface: CollidableBaseBehavior)
        //nullable = true from not(false or (false and false)) = true
{

                    var collidableInferface = collidableInferface
super.setCollidableInferface(collidableInferface)
this.collidableWeaponBehavior= this.getCollidableInferface() as CollidableWeaponBehavior
}


                @Throws(Exception::class)
            
open fun init(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y


                    var z = z
this.x= x
this.y= y
this.z= z
}


                @Throws(Exception::class)
            
open fun init(sourceLayerInterface: AllBinaryLayer, angle: Int, otherAngle: Int, weaponProperties: WeaponProperties, scoreable: ScoreableInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var sourceLayerInterface = sourceLayerInterface


                    var angle = angle


                    var otherAngle = otherAngle


                    var weaponProperties = weaponProperties


                    var scoreable = scoreable
this.setWeaponPropertiesP(weaponProperties)
this.setReadyForExplosion(false)
this.setAnimationInterface(this.getInitAnimationInterfaceP())
this.setOwnerLayerInterface(sourceLayerInterface)
this.collidableWeaponBehavior!!.init(sourceLayerInterface)
this.setGroupInterface()

    
                        if(scoreable != 
                                    null
                                )
                        
                                    {
                                    this.scoreableInterface= scoreable

                                    }
                                
this.totalDamage= 0
this.initDamage= weaponProperties!!.getDamage()
this.setDestroyed(false)
this.movement.init(weaponProperties!!.getSpeed(), angle, otherAngle)
}


open fun setGroupInterface()
        //nullable = true from not(false or (false and true)) = true
{
    var basicGroupFactory: BasicGroupFactory = BasicGroupFactory.getInstance()!!
            


    
                        if(sourceLayerInterface!!.getGroupInterface()[0] == basicGroupFactory!!.ENEMY)
                        
                                    {
                                    this.setGroupInterface(basicGroupFactory!!.ENEMY_ARRAY)

                                    }
                                
                        else {
                            this.setGroupInterface(sourceLayerInterface!!.getGroupInterface())

                        }
                            
}


                @Throws(Exception::class)
            override fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager

    
                        if(this.isExhausted() && !this.isDestroyed())
                        
                                    {
                                    
    
                        if(this.isReadyForExplosion())
                        
                                    {
                                    
    var indexedAnimationInterface: IndexedAnimation = this.getAnimationInterface() as IndexedAnimation


    var currentFrame: Int = indexedAnimationInterface!!.getFrame()!!
            


    
                        if(currentFrame < indexedAnimationInterface!!.getAnimationSize() -1)
                        
                                    {
                                    indexedAnimationInterface!!.nextFrame()

                                    }
                                
                        else {
                            this.setDestroyed(true)

                        }
                            

                                    }
                                
                        else {
                            
    var collidableWeaponBehavior: CollidableWeaponBehavior = this.getCollidableInferface() as CollidableWeaponBehavior


    
                        if(collidableWeaponBehavior!!.isCollided())
                        
                                    {
                                    this.setAnimationInterface(this.destroyedAnimationInterface)
this.getMovement()!!.stop()
this.setReadyForExplosion(true)

                                    }
                                
                        else {
                            this.setDestroyed(true)

                        }
                            

                        }
                            

                                    }
                                
this.movement.process(this)
this.totalDamage += this.weaponProperties!!.getDissipation()
}

override fun isDestroyed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.destroyed
}

override fun damage(damage: Int, damageType: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var damage = damage


                    var damageType = damageType
this.totalDamage += damage *damage
}


open fun givePoints(total: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var total = total
scoreableInterface!!.addPoints(GameConfigurationUtil.getInstance()!!.getCompetitionValue() *total)
}


open fun isExhausted()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.totalDamage > this.getInitDamage() || this.totalDamage < 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun getDamage(damageType: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var damageType = damageType

    
                        if(!this.isExhausted())
                        
                                    {
                                    
    var total: Int = this.getInitDamage() -this.totalDamage

this.givePoints(total)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return total

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var destroyed = destroyed
this.destroyed= destroyed

    
                        if(this.isDestroyed())
                        
                                    {
                                    this.scoreableInterface= NoScoreable.getInstance()
DestroyedLayerProcessor.getInstance()!!.add(this)

                                    }
                                
}


open fun getInitDamage()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initDamage
}


open fun setAnimationInterface(animationInterface: Animation)
        //nullable = true from not(false or (false and false)) = true
{

                    var animationInterface = animationInterface
this.animationInterface= animationInterface
}


open fun getAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: Animation{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterface
}


open fun getInitAnimationInterfaceP()
        //nullable = true from not(false or (false and true)) = true
: Animation{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initAnimationInterface
}


open fun setInitAnimationInterfaceP(initAnimationInterface: Animation)
        //nullable = true from not(false or (false and false)) = true
{

                    var initAnimationInterface = initAnimationInterface
this.initAnimationInterface= initAnimationInterface
}


open fun getDestroyedAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: Animation{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return destroyedAnimationInterface
}


open fun getOwnerLayerInterface()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryLayer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return sourceLayerInterface
}


open fun setOwnerLayerInterface(sourceLayerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var sourceLayerInterface = sourceLayerInterface
this.sourceLayerInterface= sourceLayerInterface
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var viewPosition: ViewPosition = this.getViewPosition()!!
            

this.animationInterface!!.paint(graphics, viewPosition!!.getX() -this.getHalfWidth(), viewPosition!!.getY() -this.getHalfHeight())
}

override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var viewPosition: ViewPosition = this.getViewPosition()!!
            

this.animationInterface!!.paintThreed(graphics, viewPosition!!.getX() -this.getHalfWidth(), viewPosition!!.getY() -this.getHalfHeight(), viewPosition!!.getZ() -this.getHalfDepth())
}


open fun getMovement()
        //nullable = true from not(false or (false and true)) = true
: Movement{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return movement
}


open fun setMovement(movement: Movement)
        //nullable = true from not(false or (false and false)) = true
{

                    var movement = movement
this.movement= movement
}

override fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getStaticType()
}

override fun getMultiPlayerType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return multiPlayerType
}


open fun setWeaponPropertiesP(weaponProperties: WeaponProperties)
        //nullable = true from not(false or (false and false)) = true
{

                    var weaponProperties = weaponProperties
this.weaponProperties= weaponProperties
}


open fun getWeaponPropertiesP()
        //nullable = true from not(false or (false and true)) = true
: WeaponProperties{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return weaponProperties
}

override fun implmentsTickableInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            override fun set(gl: GL)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl
this.initAnimationInterface!!.set(gl)
}


}
                
            

