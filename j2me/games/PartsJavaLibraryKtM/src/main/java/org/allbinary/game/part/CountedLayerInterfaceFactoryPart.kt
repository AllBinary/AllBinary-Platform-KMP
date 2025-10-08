
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
        package org.allbinary.game.part




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.game.layer.pickup.CountedPickedUpLayerInterfaceFactory
import org.allbinary.graphics.font.MyFont
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.NullUtil
import org.allbinary.logic.math.PrimitiveLongUtil

open public class CountedLayerInterfaceFactoryPart
            : Object
        
                , PartInterface {
        
companion object {
            
    val NULL_COUNTED_LAYER_INTERFACE_FACTORY: CountedLayerInterfaceFactoryPart = CountedLayerInterfaceFactoryPart(0, CountedPickedUpLayerInterfaceFactory.NULL_COUNTED_PICKUP_LAYER_FACTORY)

        }
            
    private var animationInterface: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!

    private var total: Int= 0

    private var totalString: CharArray = NullUtil.getInstance()!!.NULL_CHAR_ARRAY

    private var xOffset: Int= 0

    private var countedPickedUpLayerInterfaceFactory: CountedPickedUpLayerInterfaceFactory = CountedPickedUpLayerInterfaceFactory.NULL_COUNTED_PICKUP_LAYER_FACTORY

    private val primitiveLongUtil: PrimitiveLongUtil
public constructor (total: Int, countedPickedUpLayerInterfaceFactory: CountedPickedUpLayerInterfaceFactory)
            : super()
        {
var total = total
var countedPickedUpLayerInterfaceFactory = countedPickedUpLayerInterfaceFactory
this.primitiveLongUtil= PrimitiveLongUtil(1000)
this.init(total, countedPickedUpLayerInterfaceFactory)
}


    open fun init(total: Int, countedPickedUpLayerInterfaceFactory: CountedPickedUpLayerInterfaceFactory)
        //nullable = true from not(false or (false and false)) = true
{
var total = total
var countedPickedUpLayerInterfaceFactory = countedPickedUpLayerInterfaceFactory
this.setCountedPickedUpLayerInterfaceFactory(countedPickedUpLayerInterfaceFactory)
this.total= total
}


                @Throws(Exception::class)
            
    open fun getInstance(hashtable: Hashtable<Any, Any>, x: Int, y: Int, z: Int)
        //nullable =  from not(true or (false and false)) = 
: AllBinaryLayer{
var hashtable = hashtable
var x = x
var y = y
var z = z

    
                        if(this.total > 0)
                        
                                    {
                                    this.setTotal(this.total -1)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getCountedPickedUpLayerInterfaceFactory()!!.getInstance(hashtable, x, y, z)

                                    }
                                
                        else {
                            


                            throw Exception("No more left. Could use a listener to automatically remove")

                        }
                            
}


    open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return total
}


    open fun setTotal(total: Int)
        //nullable = true from not(false or (false and false)) = true
{
var total = total
this.total= total
this.totalString= this.primitiveLongUtil!!.getCharArray(total)

    var font: MyFont = MyFont.getInstance()!!

this.setXOffset(font.charsWidth(totalString, 0, this.primitiveLongUtil!!.getCurrentTotalDigits()) +(font.getSize() shr 1))
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}


    override fun getAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: Animation{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterface
}


    open fun setAnimationInterface(animationInterface: Animation)
        //nullable = true from not(false or (false and false)) = true
{
var animationInterface = animationInterface
this.animationInterface= animationInterface
}


    open fun getXOffset()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return xOffset
}


    open fun setXOffset(totalStringWidth: Int)
        //nullable = true from not(false or (false and false)) = true
{
var totalStringWidth = totalStringWidth
this.xOffset= totalStringWidth
}


    open fun getTotalString()
        //nullable = true from not(false or (false and true)) = true
: CharArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return totalString
}


    open fun getCountedPickedUpLayerInterfaceFactory()
        //nullable = true from not(false or (false and true)) = true
: CountedPickedUpLayerInterfaceFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return countedPickedUpLayerInterfaceFactory
}


    open fun setCountedPickedUpLayerInterfaceFactory(countedPickedUpLayerInterfaceFactory: CountedPickedUpLayerInterfaceFactory)
        //nullable = true from not(false or (false and false)) = true
{
var countedPickedUpLayerInterfaceFactory = countedPickedUpLayerInterfaceFactory
this.countedPickedUpLayerInterfaceFactory= countedPickedUpLayerInterfaceFactory
}


}
                
            

