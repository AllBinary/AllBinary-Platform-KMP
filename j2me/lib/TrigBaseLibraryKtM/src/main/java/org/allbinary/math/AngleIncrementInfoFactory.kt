
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
        

open public class AngleIncrementInfoFactory
            : Object
         {
        

        companion object {
            
    private val instance: AngleIncrementInfoFactory = AngleIncrementInfoFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AngleIncrementInfoFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val angleIncrementInfoArray: Array<AngleIncrementInfo?> = arrayOfNulls(AngleFactory.getInstance()!!.TOTAL_ANGLE.toInt())

open fun getInstance(angleIncrement: Short)
        //nullable =  from not(true or (false and false)) = 
: AngleIncrementInfo{

                    var angleIncrement = angleIncrement

    var halfAngleIncrement: Int = (angleIncrement.toInt() shr 1)


    var angleIncrementInfo: AngleIncrementInfo = angleIncrementInfoArray[halfAngleIncrement]!!


    
                        if(angleIncrementInfo == 
                                    null
                                )
                        
                                    {
                                    angleIncrementInfo= AngleIncrementInfo(angleIncrement)
angleIncrementInfoArray[halfAngleIncrement]= angleIncrementInfo

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return angleIncrementInfo
}


}
                
            

