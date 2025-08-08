
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
        package org.allbinary.input.automation.module.game.test



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Set
import java.util.Vector
import org.allbinary.input.automation.module.AbstractInputAutomationWorker
import org.allbinary.input.automation.module.InputAutomationActionInterface
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileAction
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileActions
import org.allbinary.input.automation.module.generic.configuration.profile.actions.script.GenericProfileActionScript
import org.allbinary.input.media.image.capture.CapturedBufferedImagesCacheSingleton
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.cache.J2SECacheInterface
import org.allbinary.media.image.comparison.ImageComparatorConstraintsInterface
import org.allbinary.media.image.comparison.motion.MotionRectangleConstraintsInterface

open public class TestInputAutomationCaptureWorker : AbstractInputAutomationWorker {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var genericProfileActions: GenericProfileActions

    private val MESSAGE: String = "GenericInputAutomationCaptureWorker"

    private val PROCESS_DATA_WORKER_RESULTS: String = "processDataWorkerResults"

    private val IMAGE_AVAILABLE_SO_PROCESSING: String = "Image Available so processing"

    private val IMAGE_NOT_AVAILABLE: String = "Image Not Available"
public constructor        (inputAutomationActionInterface: InputAutomationActionInterface, genericProfileActions: GenericProfileActions, imageComparatorConstraintsInterface: ImageComparatorConstraintsInterface, motionRectangleConstraintsInterface: MotionRectangleConstraintsInterface)                        

                            : super(inputAutomationActionInterface){

                    var inputAutomationActionInterface = inputAutomationActionInterface


                    var genericProfileActions = genericProfileActions


                    var imageComparatorConstraintsInterface = imageComparatorConstraintsInterface


                    var motionRectangleConstraintsInterface = motionRectangleConstraintsInterface


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(MESSAGE, this, commonStrings!!.CONSTRUCTOR)
this.setGenericProfileActions(genericProfileActions)
}


                @Throws(Exception::class)
            
open fun processDataWorkerResults()
        //nullable = true from not(false or (false and true)) = true
{
    var cacheInterface: J2SECacheInterface = CapturedBufferedImagesCacheSingleton.getInstance() as J2SECacheInterface


    
                        if(cacheInterface!!.keySet()!!.size() > 0)
                        
                                    {
                                    logUtil!!.put(IMAGE_AVAILABLE_SO_PROCESSING, this, PROCESS_DATA_WORKER_RESULTS)

    var anyType: Any = cacheInterface!!.keySet()!!.toArray()[0]!!


    var hashMap: HashMap<Any, Any> = this.getGenericProfileActions()!!.getHashMap()!!
            


    var set: Set = hashMap!!.keySet()!!
            


    var actionNameArray: Array<Any?> = set.toArray()!!
            


    var size: Int = actionNameArray!!.size
                





                        for (index in 0 until size)


        {
    var actionNameString: String = actionNameArray[index]!! as String


    var genericProfileAction: GenericProfileAction = hashMap!!.get(actionNameString as Object?) as GenericProfileAction


    var genericProfileActionScript: GenericProfileActionScript = genericProfileAction!!.getGenericProfileActionScript()!!
            


    var vector: Vector = genericProfileActionScript!!.getProfileActionConditionInterfaceVector()!!
            

}

cacheInterface!!.get(anyType)

                                    }
                                
                        else {
                            logUtil!!.put(IMAGE_NOT_AVAILABLE, this, PROCESS_DATA_WORKER_RESULTS)

                        }
                            
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, commonStrings!!.PROCESS)
this.startDataWorkers()
this.processDataWorkerResults()
}


open fun getGenericProfileActions()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileActions{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericProfileActions
}


open fun setGenericProfileActions(genericProfileActions: GenericProfileActions)
        //nullable = true from not(false or (false and false)) = true
{

                    var genericProfileActions = genericProfileActions
this.genericProfileActions= genericProfileActions
}


}
                
            

