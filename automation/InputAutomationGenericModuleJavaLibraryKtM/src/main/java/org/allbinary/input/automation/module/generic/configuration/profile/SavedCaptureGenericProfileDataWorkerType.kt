
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
        package org.allbinary.input.automation.module.generic.configuration.profile




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.media.image.InputImageType

open public class SavedCaptureGenericProfileDataWorkerType : GenericProfileDataWorkerType {
        

        companion object {
            
    var SAVED_CAPTURE: SavedCaptureGenericProfileDataWorkerType = SavedCaptureGenericProfileDataWorkerType("Saved " +InputImageType.CAPTURE.getName(), "c:\\share\\captures\\2\\", 100)

        }
            
    private var path: String

    private var lastFrame: Int= 0
public constructor        (name: String, path: String, lastFrame: Int)                        

                            : super(name)

        Updates for KMP build        
        {
var name = name
var path = path
var lastFrame = lastFrame


                            //For kotlin this is before the body of the constructor.
                    
this.setPath(path)
this.setLastFrame(lastFrame)
}


open fun getPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return path
}


open fun setPath(path: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var path = path
this.path= path
}


open fun getLastFrame()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return lastFrame
}


open fun setLastFrame(lastFrame: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var lastFrame = lastFrame
this.lastFrame= lastFrame
}


}
                
            

