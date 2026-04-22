
        /* Generated Code Do Not Modify */
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo
import org.allbinary.util.CircularIndexUtil

open public class NullRotationAnimation : RotationAnimation {
        
companion object {
            
    open fun createTotalAngle(angleInfo: AngleInfo, totalAngle: Short, animationBehavior: AnimationBehavior)
        //nullable = true from not(false or (false and false)) = true
: NullRotationAnimation{
    //var angleInfo = angleInfo
    //var totalAngle = totalAngle
    //var animationBehavior = animationBehavior



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullRotationAnimation(angleInfo, CircularIndexUtil.getInstance(totalAngle /angleInfo!!.getAngleIncrementInfo()!!.getAngleIncrement()), animationBehavior)
}


    open fun createQuarter(animationBehavior: AnimationBehavior)
        //nullable = true from not(false or (false and false)) = true
: NullRotationAnimation{
    //var animationBehavior = animationBehavior



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullRotationAnimation(AngleInfo.getInstance(AngleFactory.getInstance()!!.QUARTER_TOTAL_ANGLE), CircularIndexUtil.getInstance(4), animationBehavior)
}


        }
            protected constructor (angleInfo: AngleInfo, circularIndexUtil: CircularIndexUtil, animationBehavior: AnimationBehavior)                        

                            : super(angleInfo, circularIndexUtil, animationBehavior){
    //var angleInfo = angleInfo
    //var circularIndexUtil = circularIndexUtil
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    override fun getAnimationSize()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


}
                
            

