
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
        package org.allbinary.input.automation.actions.script.condition.processors.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.robot.InputRobotInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper

open public class KeyboardInputAutomationProcessor
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun process(keyActionScriptInputInterface: KeyboardActionScriptInputInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyActionScriptInputInterface = keyActionScriptInputInterface

    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(CommonLabels.getInstance()!!.START +keyActionScriptInputInterface!!.toString(), 
                            "KeyInputAutomationProcessor", commonStrings!!.PROCESS)

    var inputRobotInterface: InputRobotInterface = keyActionScriptInputInterface!!.getInputRobotInterface()!!
            


    var integer: Array<Integer?> = keyActionScriptInputInterface!!.getKeyArray()!!
            


    
                        if(keyActionScriptInputInterface!!.getDelayBetweenKeys() == 0)
                        
                                    {
                                    



                        for (index in 0 until keyActionScriptInputInterface!!.getKeyArray()!!.length)


        {
    
                        if(keyActionScriptInputInterface!!.isPress())
                        
                                    {
                                    inputRobotInterface!!.keyPress(integer[index]!!)

                                    }
                                
}

Thread.sleep(keyActionScriptInputInterface!!.getTime())




                        for (index in keyActionScriptInputInterface!!.getKeyArray()!!.length -1 downTo 0)


        {
    
                        if(keyActionScriptInputInterface!!.isRelease())
                        
                                    {
                                    inputRobotInterface!!.keyRelease(integer[index]!!)

                                    }
                                
}


                                    }
                                
                        else {
                            



                        for (index in 0 until keyActionScriptInputInterface!!.getKeyArray()!!.length)


        {
    
                        if(keyActionScriptInputInterface!!.isPress())
                        
                                    {
                                    inputRobotInterface!!.keyPress(integer[index]!!)

                                    }
                                
Thread.sleep(keyActionScriptInputInterface!!.getTime())

    
                        if(keyActionScriptInputInterface!!.isRelease())
                        
                                    {
                                    inputRobotInterface!!.keyRelease(integer[index]!!)

                                    }
                                

    var timeHelper: TimeDelayHelper = TimeDelayHelper(keyActionScriptInputInterface!!.getDelayBetweenKeys())


    var toLong: Int = 0


        while(!timeHelper!!.isTime() || toLong > 6000)
        {toLong++
Thread.sleep(50)
}

}


                        }
                            
}



        }
            private constructor        ()
            : super()
        {}


}
                
            

