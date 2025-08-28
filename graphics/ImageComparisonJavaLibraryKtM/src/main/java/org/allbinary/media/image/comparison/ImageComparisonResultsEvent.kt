
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
        package org.allbinary.media.image.comparison




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class ImageComparisonResultsEvent : AllBinaryEventObject {
        

    private var imageComparisonResult: ImageComparisonResult
public constructor        (anyType: Any, imageComparisonInfo: ImageComparisonResult)                        

                            : super(anyType){
var anyType = anyType
var imageComparisonInfo = imageComparisonInfo


                            //For kotlin this is before the body of the constructor.
                    
this.setImageComparisonResult(imageComparisonInfo)
}


open fun getImageComparisonResult()
        //nullable = true from not(false or (false and true)) = true
: ImageComparisonResult{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageComparisonResult
}


open fun setImageComparisonResult(imageComparisonResult: ImageComparisonResult)
        //nullable = true from not(false or (false and false)) = true
{
var imageComparisonResult = imageComparisonResult
this.imageComparisonResult= imageComparisonResult
}


}
                
            

