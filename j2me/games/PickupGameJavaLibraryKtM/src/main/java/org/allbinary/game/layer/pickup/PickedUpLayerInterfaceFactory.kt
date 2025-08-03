
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.Animation
import org.allbinary.layer.AllBinaryLayer

open public class PickedUpLayerInterfaceFactory
            : Object
        
                , PickedUpLayerInterfaceFactoryInterface {
        

    private val pickedUpLayerType: PickedUpLayerType

    private val iconLayer: IconLayer

    private val animationInterface: Animation
protected constructor        (pickeUpLayerType: PickedUpLayerType, iconLayer: IconLayer, animationInterface: Animation)
            : super()
        {

                    var pickeUpLayerType = pickeUpLayerType


                    var iconLayer = iconLayer


                    var animationInterface = animationInterface
this.pickedUpLayerType= pickeUpLayerType
this.animationInterface= animationInterface
this.iconLayer= iconLayer
}

override fun getIconLayer()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryLayer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return iconLayer
}

override fun getAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: Animation{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterface
}

override fun getPickedUpLayerType()
        //nullable = true from not(false or (false and true)) = true
: PickedUpLayerType{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pickedUpLayerType
}


}
                
            

