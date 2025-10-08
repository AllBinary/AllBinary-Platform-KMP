
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




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.robot.InputRobotInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class MouseInputAutomationProcessor
            : Object
         {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun process(mouseActionScriptInputInterface: MouseActionScriptInputInterface)
        //nullable = true from not(false or (false and false)) = true
{
var mouseActionScriptInputInterface = mouseActionScriptInputInterface

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(StringMaker().
                            append("Start - Processing Mouse Input at: ")!!.append(mouseActionScriptInputInterface!!.getPoint()!!.toString())!!.append(" clicks: ")!!.append(mouseActionScriptInputInterface!!.getButtonClicks())!!.toString(), "MouseInputAutomationProcessor", commonStrings!!.PROCESS)

    var inputRobotInterface: InputRobotInterface = mouseActionScriptInputInterface!!.getInputRobotInterface()!!


    
                        if(mouseActionScriptInputInterface!!.getPoint()!!.x !=  -1 && mouseActionScriptInputInterface!!.getPoint()!!.y !=  -1)
                        
                                    {
                                    inputRobotInterface!!.mouseMove(mouseActionScriptInputInterface!!.getPoint())

                                    }
                                
Thread.sleep(mouseActionScriptInputInterface!!.getTime())

    
                        if(mouseActionScriptInputInterface!!.getButtonClicks() != 0)
                        
                                    {
                                    inputRobotInterface!!.mousePress(mouseActionScriptInputInterface!!.getButtonClicks())
Thread.sleep(mouseActionScriptInputInterface!!.getTime())
inputRobotInterface!!.mouseRelease(mouseActionScriptInputInterface!!.getButtonClicks())

                                    }
                                
Thread.sleep(mouseActionScriptInputInterface!!.getTime())
}


        }
            private constructor ()
            : super()
        {
}


}
                
            

