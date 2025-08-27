
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
        package org.allbinary.input.automation.module.generic




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfile
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfileDataWorkerType
import org.allbinary.input.automation.module.generic.configuration.profile.SavedCaptureGenericProfileDataWorkerType
import org.allbinary.input.media.image.capture.CaptureWorkerInterface
import org.allbinary.input.media.image.capture.ScreenCaptureImagesWorker

open public class GenericProfileCaptureWorkerFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(genericProfile: GenericProfile)
        //nullable =  from not(true or (false and false)) = 
: CaptureWorkerInterface{

                    var genericProfile = genericProfile

    var vector: Vector = genericProfile!!.getGenericProfileDataWorkerTypeVector()!!


    var size: Int = vector.size!!





                        for (index in 0 until size)

        {
    var genericProfileDataWorkerType: GenericProfileDataWorkerType = vector.get(index) as GenericProfileDataWorkerType


    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.SCREEN_CAPTURE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ScreenCaptureImagesWorker()

                                    }
                                
                             else 
    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.SAVED_CAPTURE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SavedCaptureImagesWorker(genericProfileDataWorkerType as SavedCaptureGenericProfileDataWorkerType)

                                    }
                                
}




                            throw Exception("No CaptureWorkerInterface specified in GenericProfile")
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

