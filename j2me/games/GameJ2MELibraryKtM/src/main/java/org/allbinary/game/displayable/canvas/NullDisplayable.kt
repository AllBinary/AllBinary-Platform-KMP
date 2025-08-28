
        /* Generated Code Do Not Modify */
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Graphics
import org.allbinary.canvas.BaseGameStatistics
import org.allbinary.canvas.GameStatisticsFactory

open public class NullDisplayable : Canvas {
        

        companion object {
            
    private val SINGLETON: NullDisplayable = NullDisplayable()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NullDisplayable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            private constructor        (){
}


    private val baseGameStatistics: BaseGameStatistics = GameStatisticsFactory.getInstance()!!
override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
baseGameStatistics!!.nextRefresh()
}


}
                
            

