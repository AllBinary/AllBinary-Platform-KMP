
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
        package org.allbinary.graphics.form.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.J2MEUtil
import org.allbinary.game.displayable.canvas.GameCommandCanvas
import org.allbinary.game.input.Input
import org.allbinary.game.input.InputFactory
import org.allbinary.game.input.PlatformKeyFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.form.item.validation.TextItemVisitor
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps

open public class CustomTextBox : GameCommandCanvas {
        

    private val textFieldItem: TextFieldItem
public constructor (cmdListener: CommandListener, label: String, text: String, maxSize: Int, constraints: Int, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : this(cmdListener, label, text, maxSize, constraints, Font.getDefaultFont(), backgroundBasicColor, foregroundBasicColor){
    //var cmdListener = cmdListener
    //var label = label
    //var text = text
    //var maxSize = maxSize
    //var constraints = constraints
    //var backgroundBasicColor = backgroundBasicColor
    //var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (cmdListener: CommandListener, label: String, text: String, maxSize: Int, constraints: Int, font: Font, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(cmdListener, label, backgroundBasicColor, foregroundBasicColor){
    //var cmdListener = cmdListener
    //var label = label
    //var text = text
    //var maxSize = maxSize
    //var constraints = constraints
    //var font = font
    //var backgroundBasicColor = backgroundBasicColor
    //var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    

    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var textFieldItem: TextFieldItem = TextFieldItem(this, TextItemVisitor(), stringUtil!!.EMPTY_STRING, stringUtil!!.EMPTY_STRING, maxSize, 0, stringUtil!!.EMPTY_STRING, font, backgroundBasicColor, foregroundBasicColor)

textFieldItem!!.setString(text)
this.textFieldItem= textFieldItem
this.setTitle(label)
}


    open fun submit()
        //nullable = true from not(false or (false and true)) = true
{
}


    private val inputFactory: InputFactory = InputFactory.getInstance()!!

    open fun onEvent(keyCode: Int, deviceId: Int, repeated: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var keyCode = keyCode
    //var deviceId = deviceId
    //var repeated = repeated
logUtil!!.put(StringMaker().
                            append(commonStrings!!.START)!!.append(keyCode)!!.toString(), this, "onEvent")
this.keyPressed(keyCode, deviceId)
}


    override fun keyPressed(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var keyCode = keyCode
this.keyPressed(keyCode, 0)
}


    override fun keyReleased(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var keyCode = keyCode
this.keyReleased(keyCode, 0)
}


    override fun keyRepeated(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var keyCode = keyCode
this.keyRepeated(keyCode, 0)
}


    override fun keyPressed(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var keyCode = keyCode
    //var deviceId = deviceId

        try {
            logUtil!!.put(StringMaker().
                            append(CommonSeps.getInstance()!!.SPACE)!!.append(keyCode)!!.toString(), this, gameInputStrings!!.KEY_PRESSED)

    var platformKeyFactory: PlatformKeyFactory = PlatformKeyFactory.getInstance()!!


    var input: Input = inputFactory!!.getInstance(keyCode)!!


    
                        if(platformKeyFactory!!.isSubmission(input))
                        
                                    {
                                    this.submit()

                                    }
                                
                        else {
                            this.textFieldItem!!.keyPressed(keyCode)

                        }
                            
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, gameInputStrings!!.KEY_PRESSED, e)
}

}


    override fun keyReleased(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var keyCode = keyCode
    //var deviceId = deviceId
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
graphics.setColor(this.backgroundColor)
graphics.fillRect(0, 0, this.displayInfoSingleton!!.getLastWidth(), this.displayInfoSingleton!!.getLastHeight())
graphics.setColor(this.foregroundColor)

    
                        if(!J2MEUtil.isJ2ME())
                        
                                    {
                                    graphics.drawString(this.getTitle(), 8, 1, 0)

                                    }
                                
this.paint(graphics, 8, graphics.getFont()!!.getHeight() +2)
super.paint(graphics)
}


    open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var x = x
    //var y = y
textFieldItem!!.paint(graphics, x, y)
}


    open fun getTextFieldItem()
        //nullable = true from not(false or (false and true)) = true
: TextFieldItem{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return textFieldItem
}


}
                
            

