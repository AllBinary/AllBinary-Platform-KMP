
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
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.color.BasicColor
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper

open public class TimedVectorAnimation : VectorAnimation {
        

    private var timeElapsedHelper: TimeDelayHelper = TimeDelayHelper(200)
public constructor        (currentPoints: Array<Array<IntArray?>?>, basicColor: BasicColor, animationBehavior: AnimationBehavior)                        

                            : super(currentPoints, basicColor, animationBehavior){

                    var currentPoints = currentPoints


                    var basicColor = basicColor


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (currentPoints: Array<IntArray?>, basicColor: BasicColor, animationBehavior: AnimationBehavior)                        

                            : super(currentPoints, basicColor, animationBehavior){

                    var currentPoints = currentPoints


                    var basicColor = basicColor


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}

override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.timeElapsedHelper!!.isTime(GameTickTimeDelayHelperFactory.getInstance()!!.startTime))
                        
                                    {
                                    super.nextFrame()

                                    }
                                
}


}
                
            

