
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ImageAnalysisResults
            : Object
         {
        

    private var imageColorRangeResults: ImageColorRangeResults

    private var imageColorResults: ImageColorResults

    private var averageAmbientLevel: Float= 0.0f
public constructor        ()
            : super()
        {this.imageColorRangeResults= ImageColorRangeResults()
this.imageColorResults= ImageColorResults()
}


open fun getImageColorRangeResults()
        //nullable = true from not(false or (false and true)) = true
: ImageColorRangeResults{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageColorRangeResults
}


open fun setImageColorRangeResults(imageColorRangeResults: ImageColorRangeResults)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageColorRangeResults = imageColorRangeResults
this.imageColorRangeResults= imageColorRangeResults
}


open fun getAverageAmbientLevel()
        //nullable = true from not(false or (false and true)) = true
: Float{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return averageAmbientLevel
}


open fun setAverageAmbientLevel(averageAmbientLevel: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var averageAmbientLevel = averageAmbientLevel
this.averageAmbientLevel= averageAmbientLevel
}


open fun getImageColorResults()
        //nullable = true from not(false or (false and true)) = true
: ImageColorResults{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageColorResults
}


open fun setImageColorResults(imageColorResults: ImageColorResults)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageColorResults = imageColorResults
this.imageColorResults= imageColorResults
}


}
                
            

