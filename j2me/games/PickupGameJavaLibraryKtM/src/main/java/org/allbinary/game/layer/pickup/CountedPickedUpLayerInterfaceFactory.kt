
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
        
import java.util.Hashtable
import org.allbinary.animation.Animation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class CountedPickedUpLayerInterfaceFactory : PickedUpLayerInterfaceFactory
                , CountedPickedUpLayerInterfaceFactoryInterface {
        

        companion object {
            
    val NULL_COUNTED_PICKUP_LAYER_FACTORY: CountedPickedUpLayerInterfaceFactory = CountedPickedUpLayerInterfaceFactory(PickedUpLayerTypeFactory.getInstance()!!.NONE, IconLayer.NULL_ICON_LAYER, NullAnimationFactory.getFactoryInstance()!!.getInstance(0))

        }
            
    private val id: Int
public constructor        (pickeUpLayerType: PickedUpLayerType, iconLayer: IconLayer, animationInterface: Animation)                        

                            : super(pickeUpLayerType, iconLayer, animationInterface)

        Updates for KMP build        
        {
var pickeUpLayerType = pickeUpLayerType
var iconLayer = iconLayer
var animationInterface = animationInterface


                            //For kotlin this is before the body of the constructor.
                    

    var list: BasicArrayList = CountedPickedUpLayerInterfaceFactoryPool.getInstance()!!.getList()!!

this.id= list.size()
list.add(this)
}


                @Throws(Exception::class)
            override fun getInstance(hashtable: Hashtable<Any, Any>, x: Int, y: Int, z: Int)
        //nullable =  from not(true or (false and false)) = 
: AllBinaryLayer

        Updates for KMP build        
        {
var hashtable = hashtable
var x = x
var y = y
var z = z



                            throw Exception(CommonStrings.getInstance()!!.NOT_IMPLEMENTED)
}

override fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}

override fun getId()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


}
                
            

