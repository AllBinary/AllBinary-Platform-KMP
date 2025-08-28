
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
        package org.allbinary.input.automation.module




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.media.image.capture.ScreenCaptureImagesWorker
import org.allbinary.media.image.comparison.ImageComparisonWorker
import org.allbinary.media.image.comparison.SaveImageComparisonWorker
import org.allbinary.media.image.comparison.motion.MotionRectanglesWorker
import org.allbinary.media.image.comparison.motion.SaveMotionRectanglesResultsWorker
import org.allbinary.media.image.comparison.motion.TestInputForMotionRectanglesResultsWorker

open public class TestInputAutomationWorker
            : Object
         {
        

    private var captureWorker: ScreenCaptureImagesWorker

    private var imageComparisonWorker: ImageComparisonWorker

    private var motionRectanglesWorker: MotionRectanglesWorker

    private var changedPixelsImageComparisonResultsWorker: SaveImageComparisonWorker

    private var saveMotionRectanglesAsImagesWorker: SaveMotionRectanglesResultsWorker

    private var moveMouseToFirstMotionRectanglesResultsWorker: TestInputForMotionRectanglesResultsWorker
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
this.captureWorker= ScreenCaptureImagesWorker()
this.changedPixelsImageComparisonResultsWorker= SaveImageComparisonWorker()
this.saveMotionRectanglesAsImagesWorker= SaveMotionRectanglesResultsWorker()
this.moveMouseToFirstMotionRectanglesResultsWorker= TestInputForMotionRectanglesResultsWorker()
this.motionRectanglesWorker!!.addListener(this.saveMotionRectanglesAsImagesWorker)
this.motionRectanglesWorker!!.addListener(this.moveMouseToFirstMotionRectanglesResultsWorker)
this.imageComparisonWorker!!.addListener(this.changedPixelsImageComparisonResultsWorker)
this.imageComparisonWorker!!.addListener(this.motionRectanglesWorker)
this.captureWorker!!.addListener(this.imageComparisonWorker)
}


}
                
            

