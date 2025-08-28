
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
        package org.allbinary.media.image.analysis




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ImageColorRangeResults
            : Object
         {
        

    private var colorRangeInterface: ColorRangeInterface

    private var matchingPixelsChecked: Long= 0

    private var totalPixelsChecked: Long= 0
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
this.setColorRangeInterface(ColorRange() as ColorRangeInterface)
}


open fun getColorRangeInterface()
        //nullable = true from not(false or (false and true)) = true
: ColorRangeInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorRangeInterface
}


open fun setColorRangeInterface(colorRangeInterface: ColorRangeInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var colorRangeInterface = colorRangeInterface
this.colorRangeInterface= colorRangeInterface
}


open fun getMatchingPixelsChecked()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return matchingPixelsChecked
}


open fun setMatchingPixelsChecked(matchingPixelsChecked: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var matchingPixelsChecked = matchingPixelsChecked
this.matchingPixelsChecked= matchingPixelsChecked
}


open fun addMatchingPixelsChecked()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.matchingPixelsChecked++
}


open fun getTotalPixelsChecked()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return totalPixelsChecked
}


open fun addTotalPixelsChecked()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
totalPixelsChecked++
}


open fun setTotalPixelsChecked(totalPixelsChecked: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var totalPixelsChecked = totalPixelsChecked
this.totalPixelsChecked= totalPixelsChecked
}


open fun getPercent()
        //nullable = true from not(false or (false and true)) = true
: Float

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.getMatchingPixelsChecked().toFloat() /this.getTotalPixelsChecked())
}


}
                
            

