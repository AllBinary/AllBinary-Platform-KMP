
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
        

open public class ImageColorResults
            : Object
         {
        

    private var colorRange: ColorRange

    private var colorAverage: ColorAverage
public constructor        ()
            : super()
        {
this.setColorRange(ColorRange())
this.getColorRange()!!.setMaxRed( -1)
this.getColorRange()!!.setMaxGreen( -1)
this.getColorRange()!!.setMaxBlue( -1)
this.getColorRange()!!.setMinRed(256)
this.getColorRange()!!.setMinGreen(256)
this.getColorRange()!!.setMinBlue(256)
this.setColorAverage(ColorAverage())
}


open fun getColorRange()
        //nullable = true from not(false or (false and true)) = true
: ColorRange{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorRange
}


open fun setColorRange(colorRange: ColorRange)
        //nullable = true from not(false or (false and false)) = true
{
var colorRange = colorRange
this.colorRange= colorRange
}


open fun getColorAverage()
        //nullable = true from not(false or (false and true)) = true
: ColorAverage{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorAverage
}


open fun setColorAverage(colorAverage: ColorAverage)
        //nullable = true from not(false or (false and false)) = true
{
var colorAverage = colorAverage
this.colorAverage= colorAverage
}


}
                
            

