
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
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.IndexedAnimation
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.font.MyFont
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.util.BasicArrayList

open public class TextAnimation : IndexedAnimation {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    var textArray: Array<String?> = StringUtil.getInstance()!!.ONE_EMPTY_STRING_ARRAY

    private var anchor: Int = Anchor.TOP_LEFT
public constructor        (animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){

                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (text: String, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){

                    var text = text


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.setText(text)
}


                @Throws(Exception::class)
            override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
this.basicSetColorUtil!!.setBasicColorP(graphics, this.getBasicColorP(), this.getColor())

    var height: Int = this.getHeight()!!


    var size: Int = textArray!!.size
                





                        for (index in 0 until size)

        {graphics.drawString(textArray[index]!!, x, y +(index *height), anchor)
}

}


open fun setText(text: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var text = text

    var list: BasicArrayList = BasicArrayList()


    
                        if(text != 
                                    null
                                )
                        
                                    {
                                    
    var index: Int = 0


    var startIndex: Int = 0


    var endIndex: Int = 0


        while(index >= 0)
        {startIndex= index
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

        {textArray[index]= list.get(index) as String
}

this.textArray= list.toArray() as Array<String?>

                                    }
                                
                        else {
                            this.textArray= StringUtil.getInstance()!!.ONE_EMPTY_STRING_ARRAY

                        }
                            
}


open fun getText()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return textArray
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var myFont: MyFont = MyFont.getInstance()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return myFont!!.DEFAULT_CHAR_HEIGHT
}


}
                
            

