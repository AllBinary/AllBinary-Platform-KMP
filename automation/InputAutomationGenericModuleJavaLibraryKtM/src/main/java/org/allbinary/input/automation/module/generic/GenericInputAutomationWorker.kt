
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
        
import java.util.HashMap
import java.util.Set
import java.util.Vector
import org.allbinary.input.automation.module.AbstractInputAutomationWorker
import org.allbinary.input.automation.module.InputAutomationActionInterface
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfile
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfileDataWorkerType
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileAction
import org.allbinary.input.automation.module.generic.configuration.profile.actions.script.GenericProfileActionScript
import org.allbinary.input.media.image.capture.CapturedBufferedImagesCacheSingleton
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.cache.J2SECacheInterface
import org.allbinary.media.image.comparison.ImageComparatorConstraintsInterface
import org.allbinary.media.image.comparison.ImageComparisonWorker
import org.allbinary.media.image.comparison.motion.MotionRectangleConstraintsInterface
import org.allbinary.media.image.comparison.motion.MotionRectanglesWorker

open public class GenericInputAutomationWorker : AbstractInputAutomationWorker {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val PROCESS_DATA_WORKER_RESULTS: String = "processDataWorkerResults"

    private var lastFrame: Long =  -1 as Long

    private var frame: Long

    private var genericProfile: GenericProfile
public constructor        (inputAutomationActionInterface: InputAutomationActionInterface, genericProfile: GenericProfile, motionRectangleConstraintsInterface: MotionRectangleConstraintsInterface, imageComparatorConstraintsInterface: ImageComparatorConstraintsInterface)                        

                            : super(inputAutomationActionInterface)

        Updates for KMP build        
        {
    //var inputAutomationActionInterface = inputAutomationActionInterface
    //var genericProfile = genericProfile
    //var motionRectangleConstraintsInterface = motionRectangleConstraintsInterface
    //var imageComparatorConstraintsInterface = imageComparatorConstraintsInterface


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
this.setCaptureWorker(GenericProfileCaptureWorkerFactory.getInstance(genericProfile))
this.setInputAutomationActionInterface(inputAutomationActionInterface)
this.setImageComparisonWorker(ImageComparisonWorker(imageComparatorConstraintsInterface))
this.setMotionRectanglesWorker(MotionRectanglesWorker(motionRectangleConstraintsInterface))
this.setGenericProfile(genericProfile)

    var vector: Vector = this.getGenericProfile()!!.getGenericProfileDataWorkerTypeVector()!!


    var size: Int = vector.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var genericProfileDataWorkerType: GenericProfileDataWorkerType = vector.get(index) as GenericProfileDataWorkerType

logUtil!!.put("Adding Listener: " +genericProfileDataWorkerType, this, this.commonStrings!!.CONSTRUCTOR)

    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.COMPARISON)
                        
                                    {
                                    this.getCaptureWorker()!!.addListener(this.getImageComparisonWorker())

                                    }
                                
                             else 
    
                        if(genericProfileDataWorkerType == GenericProfileDataWorkerType.MOTION)
                        
                                    {
                                    this.getImageComparisonWorker()!!.addListener(this.getMotionRectanglesWorker())

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun processDataWorkerResults()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
logUtil!!.put(this.commonStrings!!.START, this, this.PROCESS_DATA_WORKER_RESULTS)
this.waitForDataWorkers()

    var cacheInterface: J2SECacheInterface = CapturedBufferedImagesCacheSingleton.getInstance() as J2SECacheInterface


    var keyArray: Array<Any?> = cacheInterface!!.keySet()!!.toArray()!!


    
                        if(keyArray!!.size > 0)
                        
                                    {
                                    logUtil!!.put("Image Available", this, this.PROCESS_DATA_WORKER_RESULTS)
setFrame(keyArray[keyArray!!.size -1]!! as Long)

    
                        if(getFrame() > lastFrame)
                        
                                    {
                                    logUtil!!.put("Processing new frame: " +getFrame(), this, this.PROCESS_DATA_WORKER_RESULTS)

    var hashMap: HashMap<Any, Any> = this.getGenericProfile()!!.getGenericProfileActions()!!.getHashMap()!!


    var set: Set = hashMap!!.keys!!

logUtil!!.put("Processing " +set.size() +"Actions", this, this.PROCESS_DATA_WORKER_RESULTS)

    var actionNameArray: Array<Any?> = set.toArray()!!


    var size: Int = actionNameArray!!.size
                





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var actionNameString: String = actionNameArray[index]!! as String

logUtil!!.put("Processing Action: " +actionNameString, this, this.PROCESS_DATA_WORKER_RESULTS)

    var genericProfileAction: GenericProfileAction = hashMap!!.get(actionNameString as Object) as GenericProfileAction


    var genericProfileActionScript: GenericProfileActionScript = genericProfileAction!!.getGenericProfileActionScript()!!


    var vector: Vector = genericProfileActionScript!!.getProfileActionConditionInterfaceVector()!!

CaptureWorkerUtil.processProfileActionConditions(vector, getFrame())
}

lastFrame= getFrame()

                                    }
                                

                                    }
                                
                        else {
                            logUtil!!.put("Image Not Available", this, this.PROCESS_DATA_WORKER_RESULTS)

                        }
                            
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.PROCESS)
this.startDataWorkers()
this.processDataWorkerResults()
}


open fun getGenericProfile()
        //nullable = true from not(false or (false and true)) = true
: GenericProfile

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericProfile
}


open fun setGenericProfile(genericProfile: GenericProfile)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var genericProfile = genericProfile
this.genericProfile= genericProfile
}


open fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return frame
}


open fun setFrame(frame: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var frame = frame
this.frame= frame
}


}
                
            

