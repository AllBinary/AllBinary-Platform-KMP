
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
        package org.allbinary.math




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class FrameUtil
            : Object
         {
        

        companion object {
            
    private val instance: FrameUtil = FrameUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FrameUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


open fun getFrameForAngle(angle: Short, angleIncrement: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var angle = angle


                    var angleIncrement = angleIncrement



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.adjustAngleToFrameAngle(angle.toInt()) /angleIncrement
}


open fun getFrameAngle(frame: Int, angleIncrement: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var frame = frame


                    var angleIncrement = angleIncrement

    var frameAngle: Int = angleIncrement *frame -90




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.adjustAngleToFrameAngle(frameAngle)
}


open fun adjustAngleToFrameAngle(currentAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var currentAngle = currentAngle

    var angleFactory: AngleFactory = AngleFactory.getInstance()!!
            


    
                        if(currentAngle > 359)
                        
                                    {
                                    currentAngle= (currentAngle -angleFactory!!.TOTAL_ANGLE)

        while(currentAngle > 359)
        {currentAngle= (currentAngle -angleFactory!!.TOTAL_ANGLE)
}


                                    }
                                

    
                        if(currentAngle < 0)
                        
                                    {
                                    currentAngle= (currentAngle +angleFactory!!.TOTAL_ANGLE)

        while(currentAngle < 0)
        {currentAngle= (currentAngle +angleFactory!!.TOTAL_ANGLE)
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentAngle
}


}
                
            

