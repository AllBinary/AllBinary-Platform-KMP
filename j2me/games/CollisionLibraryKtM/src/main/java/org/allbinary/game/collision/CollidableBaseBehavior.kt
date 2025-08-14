
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
            

    private var collidable: Boolean = true

    val ownerLayer: CollidableCompositeLayer
public constructor        (ownerLayer: CollidableCompositeLayer, collidable: Boolean)
            : super()
        {

                    var ownerLayer = ownerLayer


                    var collidable = collidable
this.ownerLayer= ownerLayer
this.collidable= collidable
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{}

override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this::class.qualifiedName!!
}


open fun setCollidable(collidable: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var collidable = collidable
this.collidable= collidable
}

override fun isCollidable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.collidable
}


                @Throws(Exception::class)
            override fun collide(allbinaryCollidableLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryCollidableLayer = allbinaryCollidableLayer



                            throw Exception(StringMaker().
                            append(commonStrings!!.NOT_IMPLEMENTED)!!.append(CommonLabels.getInstance()!!.COLON_SEP)!!.append(this::class.qualifiedName!!)!!.toString())
}


    private val layerCollisionUtil: LayerCollisionUtil = LayerCollisionUtil.getInstance()!!
            
override fun isCollision(collisionLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var collisionLayer = collisionLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return layerCollisionUtil!!.isCollision(this.ownerLayer, collisionLayer)
}


open fun isCollision(collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return layerCollisionUtil!!.isCollision(ownerLayer, collidableInterfaceCompositeInterface as AllBinaryLayer)
}


                @Throws(Exception::class)
            
open fun collide(collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}

override fun getCollisionTypeWith(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: CollisionType{

                    var layerInterface = layerInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CollisionTypeFactory.getInstance()!!.NONE
}


}
                
            

