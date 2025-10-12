
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
        package org.allbinary.game.layer.special




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL
import javax.microedition.lcdui.Graphics
import org.allbinary.game.combat.damage.DamageableInterface
import org.allbinary.game.combat.destroy.DestroyableInterface
import org.allbinary.game.combat.destroy.event.DestroyedEvent
import org.allbinary.game.identification.BasicGroupFactory
import org.allbinary.game.identification.Group
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.game.layer.pickup.PickedUpLayerInterfaceFactoryInterface
import org.allbinary.game.layer.pickup.PickupBehavior
import org.allbinary.game.layer.pickup.PickupCompositeInterface
import org.allbinary.game.part.PartInterface
import org.allbinary.game.part.PartInterfaceUtil
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.RectangleFactory
import org.allbinary.image.opengles.OpenGLSurfaceChangedInterface
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.string.StringMaker
import org.allbinary.math.PositionStrings
import org.allbinary.string.CommonSeps
import org.allbinary.view.ViewPosition

open public class CollidableDestroyableDamageableLayer : CollidableCompositeLayer
                , DestroyableInterface
                , DamageableInterface
                , PickupCompositeInterface
                , SpecialGameInputInterface {
        
companion object {
            
    val NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER: CollidableDestroyableDamageableLayer = CollidableDestroyableDamageableLayer(BasicGroupFactory.getInstance()!!.NONE_ARRAY, RectangleFactory.SINGLETON, ViewPosition.NULL_VIEW_POSITION)

    private val READYFOREXPLOSION: String = "ReadyForExplosion: "

        }
            
    private var groupInterface: Array<Group?>

    private var readyForExplosion: Boolean= false

    private var initWidth: Int

    private var initHeight: Int

    private var initX: Int= 0

    private var initY: Int= 0

    private var initZ: Int= 0

    var partInterfaceArrayP: Array<PartInterface?> = PartInterfaceUtil.getZeroArray()!!

    private var pickupBehavior: PickupBehavior

    var allBinaryGameLayerManagerP: AllBinaryGameLayerManager = AllBinaryGameLayerManager.NULL_ALLBINARY_LAYER_MANAGER
public constructor (groupInterface: Array<Group?>, layerInfo: Rectangle, viewPosition: ViewPosition)                        

                            : super(layerInfo, viewPosition){
    //var groupInterface = groupInterface
    //var layerInfo = layerInfo
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
this.initWidth= layerInfo!!.getWidth()
this.initHeight= layerInfo!!.getHeight()
this.groupInterface= groupInterface
this.pickupBehavior= PickupBehavior.NULL_PICKUP_BEHAVIOR
}

public constructor (groupInterface: Array<Group?>, name: String, layerInfo: Rectangle, viewPosition: ViewPosition)                        

                            : super(name, layerInfo, viewPosition){
    //var groupInterface = groupInterface
    //var name = name
    //var layerInfo = layerInfo
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
this.initWidth= layerInfo!!.getWidth()
this.initHeight= layerInfo!!.getHeight()
this.groupInterface= groupInterface
this.pickupBehavior= PickupBehavior.NULL_PICKUP_BEHAVIOR
}


                @Throws(Exception::class)
            
    open fun initPosition()
        //nullable = true from not(false or (false and true)) = true
{
this.setPosition(this.initX, this.initY, this.initZ)
}


                @Throws(Exception::class)
            
    open fun initPosition(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var x = x
    //var y = y
    //var z = z
this.initX= x
this.initY= y
this.initZ= z
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
super.paint(graphics)
}


                @Throws(Exception::class)
            
    override fun damage(damage: Int, damageType: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var damage = damage
    //var damageType = damageType



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
    override fun getDamage(damageType: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var damageType = damageType



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
    override fun isDestroyed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


    override fun getGroupInterface()
        //nullable = true from not(false or (false and true)) = true
: Array<Group?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return groupInterface
}


    open fun setGroupInterface(teamInterface: Array<Group?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var teamInterface = teamInterface
this.groupInterface= teamInterface
}


                @Throws(Exception::class)
            
    open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameLayerManager = allBinaryGameLayerManager
this.allBinaryGameLayerManagerP= allBinaryGameLayerManager

    
                        if(this.allBinaryGameLayerManagerP == 
                                    null
                                )
                        
                                    {
                                    


                            throw RuntimeException()

                                    }
                                
}


    open fun isReadyForExplosion()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return readyForExplosion
}


    open fun setReadyForExplosion(isReadyForExplosion: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var isReadyForExplosion = isReadyForExplosion
this.readyForExplosion= isReadyForExplosion
}


    open fun getInitWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.initWidth
}


    open fun getInitHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.initHeight
}


    open fun getInitX()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initX
}


    open fun getInitY()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initY
}


                @Throws(Exception::class)
            
    override fun up()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    override fun down()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    override fun right()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    override fun left()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    override fun strafeLeft()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    override fun strafeRight()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    override fun fire(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
    //var gameKeyEvent = gameKeyEvent
}


                @Throws(Exception::class)
            
    override fun special1(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
    //var gameKeyEvent = gameKeyEvent
}


                @Throws(Exception::class)
            
    override fun special2(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
    //var gameKeyEvent = gameKeyEvent
}


                @Throws(Exception::class)
            
    override fun special3(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
    //var gameKeyEvent = gameKeyEvent
}


                @Throws(Exception::class)
            
    override fun special4(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
    //var gameKeyEvent = gameKeyEvent
}


                @Throws(Exception::class)
            
    override fun special5(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
    //var gameKeyEvent = gameKeyEvent
}


                @Throws(Exception::class)
            
    open fun up(yAnalogValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var yAnalogValue = yAnalogValue
}


                @Throws(Exception::class)
            
    open fun down(yAnalogValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var yAnalogValue = yAnalogValue
}


                @Throws(Exception::class)
            
    open fun right(xAnalogValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var xAnalogValue = xAnalogValue
}


                @Throws(Exception::class)
            
    open fun left(xAnalogValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var xAnalogValue = xAnalogValue
}


                @Throws(Exception::class)
            
    open fun rightTrigger(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent, xAnalogValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
    //var gameKeyEvent = gameKeyEvent
    //var xAnalogValue = xAnalogValue
}


                @Throws(Exception::class)
            
    open fun leftTrigger(layerManager: AllBinaryLayerManager, gameKeyEvent: GameKeyEvent, xAnalogValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
    //var gameKeyEvent = gameKeyEvent
    //var xAnalogValue = xAnalogValue
}


    open fun onDestroyed(destroyedEvent: DestroyedEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var destroyedEvent = destroyedEvent
}


    override fun getPickupBehavior()
        //nullable = true from not(false or (false and true)) = true
: PickupBehavior{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pickupBehavior
}


    override fun setPickupBehavior(pickupBehavior: PickupBehavior)
        //nullable = true from not(false or (false and false)) = true
{
    //var pickupBehavior = pickupBehavior
this.pickupBehavior= pickupBehavior
}


                @Throws(Exception::class)
            
    open fun addPart(pickedUpLayerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var pickedUpLayerInterfaceFactoryInterface = pickedUpLayerInterfaceFactoryInterface
}


    open fun setPartInterfaceArray(partInterfaceArray: Array<PartInterface?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var partInterfaceArray = partInterfaceArray
this.partInterfaceArrayP= partInterfaceArray
}


    open fun getPartInterfaceArray()
        //nullable = true from not(false or (false and true)) = true
: Array<PartInterface?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return partInterfaceArrayP
}


    override fun toString(stringBuffer: StringMaker)
        //nullable = true from not(false or (true and false)) = true
{
    //var stringBuffer = stringBuffer

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var positionStrings: PositionStrings = PositionStrings.getInstance()!!

super.toString(stringBuffer)
stringBuffer!!.append(commonSeps!!.NEW_LINE)

    var groupInterfaceArray: Array<Group?> = this.getGroupInterface()!!


    var size: Int = groupInterfaceArray!!.size
                





                        for (index in 0 until size)

        {
stringBuffer!!.append(groupInterfaceArray[index]!!.toString())
stringBuffer!!.append(commonSeps!!.COMMA)
}


    var pickupBehavior: PickupBehavior = this.getPickupBehavior()!!


    
                        if(pickupBehavior != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(pickupBehavior!!.toString())

                                    }
                                
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(READYFOREXPLOSION)
stringBuffer!!.append(readyForExplosion)
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(commonStrings!!.INIT)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.X_LABEL)
stringBuffer!!.append(initX)
stringBuffer!!.append(positionStrings!!.Y_LABEL)
stringBuffer!!.append(initX)
stringBuffer!!.append(positionStrings!!.Z_LABEL)
stringBuffer!!.append(initZ)
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

this.toString(stringBuffer)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

