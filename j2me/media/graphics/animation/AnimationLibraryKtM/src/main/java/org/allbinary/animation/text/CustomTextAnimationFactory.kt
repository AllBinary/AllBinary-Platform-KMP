
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.animation.text




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Font
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.ScaleProperties

open public class CustomTextAnimationFactory
            : Object
        
                , AnimationInterfaceFactoryInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val animationBehaviorFactory: AnimationBehaviorFactory

    var basicColor: BasicColor = BasicColorFactory.getInstance()!!.BLACK

    private var text: String

    private var initScaleHeight: Int

    var font: Font

    var scaleProperties: ScaleProperties
public constructor (text: String, fontSize: Int, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {
    //var text = text
    //var fontSize = fontSize
    //var animationBehaviorFactory = animationBehaviorFactory
this.scaleProperties= ScaleProperties()
this.text= text
this.scaleProperties!!.scaleHeight= fontSize.toInt() -(fontSize /4)
this.initScaleHeight= this.scaleProperties!!.scaleHeight
this.animationBehaviorFactory= animationBehaviorFactory
this.font= Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, this.initScaleHeight)
}


                @Throws(Exception::class)
            
    override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId

    var customTextAnimation: CustomTextAnimation

customTextAnimation= CustomTextAnimation(this.text, this.scaleProperties!!.scaleHeight, this.animationBehaviorFactory!!.getOrCreateInstance())
customTextAnimation!!.setBasicColorP(this.basicColor)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return customTextAnimation
}


    override fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{
    //var scaleProperties = scaleProperties
}


    open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.font.stringWidth(this.text)
}


    open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.font.getHeight()
}


}
                
            

