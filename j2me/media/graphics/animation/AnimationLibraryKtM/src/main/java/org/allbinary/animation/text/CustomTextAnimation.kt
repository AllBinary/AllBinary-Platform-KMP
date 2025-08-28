
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
        package org.allbinary.animation.text




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.AnimationBehavior
import org.allbinary.graphics.font.FontDebugFactory
import org.allbinary.logic.string.StringUtil

open public class CustomTextAnimation : TextAnimation {
        

    val fontDebugFactory: FontDebugFactory = FontDebugFactory.getInstance()!!

    val fontSize: Int

    var font: Font

    private var lastText: String = StringUtil.getInstance()!!.EMPTY_STRING

    var hasChanged: Boolean = true
public constructor        (text: String, fontSize: Int, animationBehavior: AnimationBehavior)                        

                            : super(text, animationBehavior){
    //var text = text
    //var fontSize = fontSize
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.fontSize= fontSize
this.font= Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, fontSize)
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var x = x
    //var y = y

    var existingFont: Font = graphics.getFont()!!

fontDebugFactory!!.setFont(this.font, graphics)
super.paint(graphics, x, y)
fontDebugFactory!!.setFont(existingFont, graphics)
}

override fun setScale(scaleX: Float, scaleY: Float)
        //nullable = true from not(false or (false and false)) = true
{
    //var scaleX = scaleX
    //var scaleY = scaleY

    
                        if(scaleX != scaleY)
                        
                                    {
                                    


                            throw RuntimeException()

                                    }
                                
this.hasChanged= true
this.font= Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, (fontSize *scaleX).toInt())
}

override fun setText(text: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var text = text

    
                        if(this.lastText != text)
                        
                                    {
                                    this.hasChanged= true
this.lastText= text
super.setText(text)

                                    }
                                
}


    private var textWidth: Int= 0
override fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{

    
                        if(this.hasChanged)
                        
                                    {
                                    this.textWidth= this.font.stringWidth(this.textArray[0]!!)
this.hasChanged= false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.textWidth
}

override fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.font.getHeight()
}


}
                
            

