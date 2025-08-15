
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
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import java.util.Set
import org.allbinary.input.automation.robot.InputRobotFactory
import org.allbinary.input.automation.robot.InputRobotInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.image.comparison.ImageComparatorConstraintsInterface
import org.allbinary.media.image.comparison.motion.MotionRectangleConstraintsInterface

open public class TestInputAutomationActionWorker : AbstractInputAutomationWorker {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var sleep: Int
public constructor        (sleep: Int, inputAutomationActionInterface: InputAutomationActionInterface, imageComparatorConstraintsInterface: ImageComparatorConstraintsInterface, motionRectangleConstraintsInterface: MotionRectangleConstraintsInterface)                        

                            : super(inputAutomationActionInterface){

                    var sleep = sleep


                    var inputAutomationActionInterface = inputAutomationActionInterface


                    var imageComparatorConstraintsInterface = imageComparatorConstraintsInterface


                    var motionRectangleConstraintsInterface = motionRectangleConstraintsInterface


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put("BasicTestAttackWorder", this, this.commonStrings!!.CONSTRUCTOR)
this.sleep= sleep
}


                @Throws(Exception::class)
            
open fun processBetweenWorkers()
        //nullable = true from not(false or (false and true)) = true
{Thread.sleep(2000)
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(this.commonStrings!!.START, this, commonStrings!!.PROCESS)

    var hashtable: Hashtable<Any, Any> = InputRobotFactory.getInstance()!!.get()!!
            


    var set: Set = hashtable.keys!!
            


    var inputTypeNameArray: Array<Any?> = set.toArray()!!
            


    var size: Int = inputTypeNameArray!!.size
                





                        for (index in 0 until size)


        {
    var inputTypeNameString: String = inputTypeNameArray[index]!! as String


    var robot: InputRobotInterface = hashtable.get(inputTypeNameString as Object?) as InputRobotInterface


    
                        if(this.sleep > 0)
                        
                                    {
                                    Thread.sleep(this.sleep)

                                    }
                                
}

}


}
                
            

