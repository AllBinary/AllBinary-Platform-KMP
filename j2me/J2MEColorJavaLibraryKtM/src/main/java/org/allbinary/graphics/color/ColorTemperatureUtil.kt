
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
        package org.allbinary.graphics.color




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ColorTemperatureUtil
            : Object
         {
        

        companion object {
            
    private val instance: ColorTemperatureUtil = ColorTemperatureUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ColorTemperatureUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!

open fun getBasicColor(thirdTemp: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicColor{
var thirdTemp = thirdTemp

    var basicColor: BasicColor = basicColorFactory!!.RED


    
                        if(thirdTemp > 3700)
                        
                                    {
                                    basicColor= basicColorFactory!!.PURPLE

                                    }
                                
                             else 
    
                        if(thirdTemp > 3200)
                        
                                    {
                                    basicColor= basicColorFactory!!.BLUE

                                    }
                                
                             else 
    
                        if(thirdTemp > 2700)
                        
                                    {
                                    basicColor= basicColorFactory!!.PUCE

                                    }
                                
                             else 
    
                        if(thirdTemp > 2200)
                        
                                    {
                                    basicColor= basicColorFactory!!.WHITE

                                    }
                                
                             else 
    
                        if(thirdTemp > 1700)
                        
                                    {
                                    basicColor= basicColorFactory!!.GREEN

                                    }
                                
                             else 
    
                        if(thirdTemp > 1200)
                        
                                    {
                                    basicColor= basicColorFactory!!.YELLOW

                                    }
                                
                             else 
    
                        if(thirdTemp > 700)
                        
                                    {
                                    basicColor= basicColorFactory!!.ORANGE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColor
}


}
                
            

