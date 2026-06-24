
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
import org.allbinary.animation.IndexedAnimation
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class TextAnimation : IndexedAnimation
                , UpdateMyFontInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val updateMyFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    var myFontProcessor: MyFontProcessor = this.updateMyFontProcessor

    var textArrayP: Array<String?> = StringUtil.getInstance()!!.ONE_EMPTY_STRING_ARRAY

    private var anchor: Int = Anchor.TOP_LEFT

    private var fontHeight: Int = 0

    private var textChangeListener: TextChangeListener = TextChangeListener.getInstance()!!
public constructor (text: String, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){
    //var text = text
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.setText(text)
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!

this.fontHeight= font.getHeight()
this.textChangeListener!!.onMeasure()
this.textChangeListener= TextChangeListener.getInstance()
this.myFontProcessor= MyFontProcessor.getInstance()
}


                @Throws(Exception::class)
            
    override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun paintXY(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var x = x
var y = y
this.myFontProcessor!!.process(graphics)
this.paintXYNoUpdate(graphics, x, y)
}


    open fun paintXYNoUpdate(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var x = x
var y = y
this.basicSetColorUtil!!.setBasicColorP3(graphics, this.getBasicColorP(), this.getColor())

    var size: Int = this.textArrayP!!.size
                





                        for (index in 0 until size)

        {
graphics.drawString(this.textArrayP[index]!!, x, y +(index *this.fontHeight), this.anchor)
}

}


    open fun setTextWithOnMeasure(text: String, textChangeListener: TextChangeListener)
        //nullable = true from not(false or (false and false)) = true
{
    //var text = text
    //var textChangeListener = textChangeListener
this.setText(text)
this.textChangeListener= textChangeListener
}


    open fun setText(text: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var text = text

    var list: BasicArrayList = BasicArrayListD()


    
                        if(text != 
                                    null
                                 && text.length > 0)
                        
                                    {
                                    
    var index: Int = 0


    var startIndex: Int = 0


    var endIndex: Int = 0


        while(index >= 0)
        {
startIndex= index
index= text.indexOf('\n', startIndex)
endIndex= index

    
                        if(index < 0)
                        
                                    {
                                    endIndex= text.length

                                    }
                                
list.add(text.substring(startIndex, endIndex))

    
                        if(index < 0)
                        
                                    {
                                    break;

                    

                                    }
                                
index++
}


                                    }
                                

    
                        if(list.size() > 0)
                        
                                    {
                                    
    var textArray: Array<String?> = arrayOfNulls(list.size())


    var size: Int = list.size()!!





                        for (index in 0 until size)

        {
textArray[index]= list.get(index) as String
}

this.textArrayP= textArray

                                    }
                                
                        else {
                            this.textArrayP= StringUtil.getInstance()!!.ONE_EMPTY_STRING_ARRAY

                        }
                            
this.myFontProcessor= this.updateMyFontProcessor
}


    open fun getTextArray()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.textArrayP
}


    open fun getFontHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fontHeight
}


}
                
            

