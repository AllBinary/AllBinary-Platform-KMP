
        /* Generated Code Do Not Modify */
        package org.allbinary.game.configuration.feature




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.game.commands.GameCommandsFactory

open public class MultiPlayerGameFeatureFactory
            : Object
         {
        

        companion object {
            
    private val instance: MultiPlayerGameFeatureFactory = MultiPlayerGameFeatureFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MultiPlayerGameFeatureFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


open fun addCommands(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var anyType = anyType

    var gameCommandsFactory: GameCommandsFactory = GameCommandsFactory.getInstance()!!


    var canvas: Canvas = anyType as Canvas

canvas.addCommand(gameCommandsFactory!!.QUIT_COMMAND)
}


}
                
            

