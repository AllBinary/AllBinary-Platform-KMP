
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
        package org.allbinary.input.automation.robot.osgi




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import bundle.input.automation.robot.InputAutomationRobotServiceInterface
import org.allbinary.input.automation.robot.InputRobotFactory
import org.allbinary.input.automation.robot.InputRobotInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.osgi.OSGIServiceInterface
import org.allbinary.osgi.OSGIServiceVisitorInterface
import org.allbinary.string.CommonStrings

open public class InputAutomationRobotOSGIServiceVisitor
            : Object
        
                , OSGIServiceVisitorInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            
public constructor        ()
            : super()
        {}


open fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var anyType = anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.visit(anyType as OSGIServiceInterface)
}


open fun visit(osgiServiceInterface: OSGIServiceInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var osgiServiceInterface = osgiServiceInterface

        try {
            logUtil!!.put(this.commonStrings!!.START, this, 
                            "visit")

    var inputAutomationRobotServiceInterface: InputAutomationRobotServiceInterface = osgiServiceInterface as InputAutomationRobotServiceInterface


    var inputRobotInterfaceArray: Array<InputRobotInterface?> = inputAutomationRobotServiceInterface!!.getInputRobotInterfaceArray()!!
            





                        for (index in 0 until inputRobotInterfaceArray!!.size)


        {logUtil!!.put("Adding: " +inputRobotInterfaceArray[index]!!.getName(), this, 
                            "visit")
InputRobotFactory.getInstance()!!.add(inputRobotInterfaceArray[index]!!)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "visit", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


}
                
            

