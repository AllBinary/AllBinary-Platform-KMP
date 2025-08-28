
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
        
import org.osgi.framework.BundleContext
import bundle.input.automation.robot.InputAutomationRobotServiceInterface
import org.allbinary.osgi.service.InputAutomationServiceConsumer

open public class InputAutomationRobotServiceConsumer : InputAutomationServiceConsumer {
        
public constructor        (bundleContext: BundleContext)                        

                            : super(InputAutomationRobotServiceInterface::class.toString()!!, bundleContext, InputAutomationRobotOSGIServiceVisitor())

        Updates for KMP build        
        {
var bundleContext = bundleContext


                            //For kotlin this is before the body of the constructor.
                    
}


}
                
            

