
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
        package org.allbinary.game.collision




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings

open public class CollidableBaseBehavior
            : Object
        
                , CollidableInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val layerCollisionUtil: LayerCollisionUtil = LayerCollisionUtil.getInstance()!!

    private var collidable: Boolean = true
public constructor (collidable: Boolean)
            : super()
        {
    //var collidable = collidable
this.collidable= collidable
}


    open fun update()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this::class.toString()!!
}


    open fun setCollidable(collidable: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var collidable = collidable
this.collidable= collidable
}


    override fun isCollidable(ownerLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var ownerLayer = ownerLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.collidable
}


                @Throws(Exception::class)
            
    override fun collide(ownerLayer: CollidableCompositeLayer, allbinaryCollidableLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var ownerLayer = ownerLayer
    //var allbinaryCollidableLayer = allbinaryCollidableLayer



                            throw Exception(StringMaker().
                            append(this.commonStrings!!.NOT_IMPLEMENTED)!!.append(CommonLabels.getInstance()!!.COLON_SEP)!!.append(this::class.toString()!!)!!.toString())
}


    override fun isCollision(ownerLayer: CollidableCompositeLayer, collisionLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var ownerLayer = ownerLayer
    //var collisionLayer = collisionLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.layerCollisionUtil!!.isCollision(ownerLayer, collisionLayer)
}


    open fun isCollisionInterface(ownerLayer: CollidableCompositeLayer, collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var ownerLayer = ownerLayer
    //var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.layerCollisionUtil!!.isCollision(ownerLayer, collidableInterfaceCompositeInterface as AllBinaryLayer)
}


                @Throws(Exception::class)
            
    open fun collideInterface(ownerLayer: CollidableCompositeLayer, collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var ownerLayer = ownerLayer
    //var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface



                            throw Exception(this.commonStrings!!.NOT_IMPLEMENTED)
}


    open fun paint(ownerLayer: CollidableCompositeLayer, graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var ownerLayer = ownerLayer
    //var graphics = graphics
}


    override fun getCollisionTypeWith(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: CollisionType{
var layerInterface = layerInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CollisionTypeFactory.getInstance()!!.NONE
}


}
                
            

