
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
        package org.allbinary.game.paint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.AppletUtil
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.paint.Paintable
import org.allbinary.input.motion.button.TouchScreenFactory
import org.allbinary.logic.string.StringUtil
import org.allbinary.time.TimeDelayHelper

open public class PressStartMenuPaintable : Paintable {
        

    private var startString: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var timeDelayHelper: TimeDelayHelper = TimeDelayHelper(1100)

    private var flash: Boolean= false

    private val PRESS_START: String = "Press Screen To Start"

    private val KEY_START: String = "Press or Click F2 To Begin"

    private val MENU_START: String = "Press Start From The Menu To Begin"
public constructor        (){
    
                        if(TouchScreenFactory.getInstance()!!.isTouch())
                        
                                    {
                                    startString= PRESS_START

                                    }
                                
                             else 
    
                        if(AppletUtil.isAppletLoader(this))
                        
                                    {
                                    startString= KEY_START

                                    }
                                
                        else {
                            startString= MENU_START

                        }
                            
}


    private var anchor: Int = Anchor.TOP_LEFT
override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    
                        if(timeDelayHelper!!.isTime())
                        
                                    {
                                    
    
                        if(this.isFlash())
                        
                                    {
                                    this.setFlash(false)

                                    }
                                
                        else {
                            this.setFlash(true)

                        }
                            

                                    }
                                

    
                        if(this.isFlash())
                        
                                    {
                                    
    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    var beginWidth: Int = (graphics.getFont()!!.stringWidth(startString) shr 1)


    var myFont: MyFont = MyFont.getInstance()!!


    var line: Int = (4 *myFont!!.DEFAULT_CHAR_HEIGHT) +(myFont!!.DEFAULT_CHAR_HEIGHT shr 1)

graphics.drawString(startString, displayInfo!!.getLastHalfWidth() -beginWidth, displayInfo!!.getLastHeight() -line, anchor)

                                    }
                                
}


open fun setFlash(flash: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var flash = flash
this.flash= flash
}


open fun isFlash()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return flash
}


}
                
            

