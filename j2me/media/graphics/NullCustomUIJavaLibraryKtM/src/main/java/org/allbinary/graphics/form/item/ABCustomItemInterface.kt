
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.form.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics

interface ABCustomItemInterface {
        

    open fun getMinimumWidth()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getMinimumHeight()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getLabel()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun paintXY(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun paintUnselected(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


}
                
            

