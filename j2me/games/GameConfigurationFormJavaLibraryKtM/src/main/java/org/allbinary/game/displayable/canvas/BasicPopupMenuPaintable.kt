
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
        package org.allbinary.game.displayable.canvas



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.AndroidUtil
import org.allbinary.J2MEUtil
import org.allbinary.animation.Animation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.animation.vector.RectangleFilledAnimation
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.game.layer.SWTUtil
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.BasicColorSetUtil
import org.allbinary.graphics.draw.DrawStringUtil
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.graphics.opengles.OpenGLFeatureUtil
import org.allbinary.graphics.paint.Paintable

open public class BasicPopupMenuPaintable : Paintable {
        

        companion object {


    private val NAME: String = "MENU"


        }
            
    val basicSetColorUtil: BasicColorSetUtil = BasicColorSetUtil.getInstance()!!
            

    private val label: String

    private val BORDER: Int

    private val foregroundBasicColor: BasicColor

    private var rectangle: Rectangle

    private var offset: Int= 0

    private var animationInterface: Animation
public constructor        (rectangle: Rectangle, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor){

                    var rectangle = rectangle


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor
this.foregroundBasicColor= foregroundBasicColor
label= NAME
this.rectangle= rectangle

    var features: Features = Features.getInstance()!!
            


    var isHTML: Boolean = features.isDefault(HTMLFeatureFactory.getInstance()!!.HTML)!!
            


    var isOpenGL: Boolean = features.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL)!!
            


    var BORDER: Int = 0


    
                        if(isHTML || (AndroidUtil.isAndroid() && isOpenGL))
                        
                                    {
                                    BORDER= MyFont.getInstance()!!.charWidth() /2

                                    }
                                
                             else 
    
                        if(AndroidUtil.isAndroid() || J2MEUtil.isJ2SE() || SWTUtil.isSWT)
                        
                                    {
                                    BORDER= MyFont.getInstance()!!.charWidth()

                                    }
                                
                        else {
                            BORDER= MyFont.getInstance()!!.charWidth() *2

                        }
                            
this.BORDER= BORDER

    
                        if(J2MEUtil.isJ2ME())
                        
                                    {
                                    this.animationInterface= NullAnimationFactory.getFactoryInstance()!!.getInstance(0)

                                    }
                                
                        else {
                            this.animationInterface= RectangleFilledAnimation(this.rectangle.getWidth(), this.rectangle.getHeight(), BasicColorFactory.getInstance()!!.TRANSPARENT_GREY)

                        }
                            
this.init(rectangle)
}


                @Throws(Exception::class)
            
open fun init(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
{

                    var rectangle = rectangle
this.rectangle= rectangle

    var myFont: MyFont = MyFont.getInstance()!!
            


    var heightOffset: Int = rectangle.getHeight() -(myFont!!.DEFAULT_CHAR_HEIGHT *NAME.length)


    
                        if(OpenGLFeatureUtil.getInstance()!!.isAnyThreed())
                        
                                    {
                                    heightOffset -= myFont!!.DEFAULT_CHAR_HEIGHT +2

    
                        if(AndroidUtil.isAndroid())
                        
                                    {
                                    heightOffset= myFont!!.DEFAULT_CHAR_HEIGHT

                                    }
                                
                        else {
                            heightOffset -= myFont!!.DEFAULT_CHAR_HEIGHT +2

                        }
                            

                                    }
                                
this.offset= (heightOffset shr 1)

    var width: Int = this.rectangle.getWidth()!!
            


    var height: Int = this.rectangle.getHeight()!!
            


    
                        if(J2MEUtil.isJ2ME())
                        
                                    {
                                    
                                    }
                                
                        else {
                            
    var rectangleFilledAnimation: RectangleFilledAnimation = this.animationInterface as RectangleFilledAnimation

rectangleFilledAnimation!!.setWidth(width)
rectangleFilledAnimation!!.setHeight(height)

                        }
                            
}


    private val drawStringUtil: DrawStringUtil = DrawStringUtil.getInstance()!!
            
override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var point: GPoint = this.rectangle.getPoint()!!
            


    var x: Int = point.getX()!!
            


    var y: Int = point.getY()!!
            


    var width: Int = this.rectangle.getWidth()!!
            


    var height: Int = this.rectangle.getHeight()!!
            

this.animationInterface!!.paint(graphics, x, y)
this.basicSetColorUtil!!.setBasicColorP(graphics, this.foregroundBasicColor)
drawStringUtil!!.paintVerticle(graphics, label, x +BORDER, y +offset, 0)
graphics.drawRect(x, y, width, height)
}


}
                
            

