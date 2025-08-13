
        /* Generated Code Do Not Modify */
        package org.allbinary.game.input.analog



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.CustomGPoint

open public class AnalogLocationInput
            : Object
         {
        

        companion object {
            
    val NULL_ANALOG_LOCATION_INPUT: AnalogLocationInput = AnalogLocationInput( -1)

        }
            
    private val playerId: Int

    private val customGPoint: CustomGPoint

    private var rz: Int= 0

    private var rightTrigger: Int= 0

    private var leftTrigger: Int= 0
 constructor        (playerId: Int)
            : super()
        {

                    var playerId = playerId
this.playerId= playerId
this.customGPoint= CustomGPoint(0, 0, 0)
}


open fun getPlayerId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return playerId
}


open fun getCustomGPoint()
        //nullable = true from not(false or (false and true)) = true
: CustomGPoint{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return customGPoint
}


open fun getRz()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rz
}


open fun setRz(rz: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var rz = rz
this.rz= rz
}


open fun getRightTrigger()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rightTrigger
}


open fun setRightTrigger(rightTrigger: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var rightTrigger = rightTrigger
this.rightTrigger= rightTrigger
}


open fun getLeftTrigger()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return leftTrigger
}


open fun setLeftTrigger(leftTrigger: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var leftTrigger = leftTrigger
this.leftTrigger= leftTrigger
}


}
                
            

