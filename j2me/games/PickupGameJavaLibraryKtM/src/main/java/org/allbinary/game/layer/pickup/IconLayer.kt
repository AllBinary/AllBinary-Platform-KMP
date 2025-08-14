
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
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.view.ViewPosition

open public class IconLayer : AllBinaryLayer {
        

        companion object {
            
    val NULL_ICON_LAYER: IconLayer = IconLayer(NullAnimationFactory.getFactoryInstance()!!.getInstance(0), 0, 0)

        }
            
    private var animationInterface: Animation
public constructor        (animationInterface: Animation, width: Int, height: Int)                        

                            : super(Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, width, height), ViewPosition()){

                    var animationInterface = animationInterface


                    var width = width


                    var height = height


                            //For kotlin this is before the body of the constructor.
                    
this.animationInterface= animationInterface
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.animationInterface!!.paint(graphics, x, y)
}

override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.animationInterface!!.paintThreed(graphics, x, y, z)
}


open fun getAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: Animation{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationInterface
}


}
                
            

