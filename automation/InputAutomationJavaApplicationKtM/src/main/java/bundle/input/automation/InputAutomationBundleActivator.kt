
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
        package bundle.input.automation



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import bundle.input.automation.module.configuration.InputAutomationConfigurationModuleChangeListener
import bundle.input.automation.robot.InputAutomationRobotChangeListener
import org.allbinary.input.automation.InputAutomationJFrame
import org.allbinary.input.automation.module.osgi.InputAutomationModuleServiceConsumer
import org.allbinary.input.automation.module.osgi.InputAutomationNewBundleRunnable
import org.allbinary.input.automation.osgi.InputAutomationServiceFactory
import org.allbinary.input.automation.robot.osgi.InputAutomationRobotServiceConsumer
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.osgi.OSGIActivatorUtil
import org.allbinary.string.CommonStrings

open public class InputAutomationBundleActivator
            : Object
        
                , BundleActivator
                , InputAutomationBundleActivatorListenerInterface {
        

        companion object {


    private var moduleManagementThread: Thread

    private var bundleContext: BundleContext

open fun getBundleContext()
        //nullable = true from not(false or (false and true)) = true
: BundleContext{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bundleContext
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

                @Throws(Exception::class)
            
open fun start(bundleContext: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{

                    var bundleContext = bundleContext

        try {
            logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.START)
this.bundleContext= bundleContext
moduleManagementThread= Thread(InputAutomationNewBundleRunnable(this))
moduleManagementThread!!.start()
InputAutomationJFrame.create(this)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.START, e)



                            throw e
}

}


                @Throws(Exception::class)
            
open fun registerAsService()
        //nullable = true from not(false or (false and true)) = true
{OSGIActivatorUtil.registerAsService(this.getBundleContext(), InputAutomationServiceFactory.getInstance(), 
                                //Otherwise - scopeIdentifier - ClassExpr
getName())
OSGIActivatorUtil.registerAsService(this.getBundleContext(), InputAutomationServiceFactory.getInstance(), 
                                //Otherwise - scopeIdentifier - ClassExpr
getName())
}


                @Throws(Exception::class)
            
open fun useServices()
        //nullable = true from not(false or (false and true)) = true
{InputAutomationRobotServiceConsumer(this.getBundleContext()).
                            process()
InputAutomationModuleServiceConsumer(this.getBundleContext()).
                            process()
}


                @Throws(Exception::class)
            
open fun stop(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{

                    var context = context
logUtil!!.put(this.commonStrings!!.START, this, 
                            "stop")

    
                        if(InputAutomationJFrame.getInstance() != 
                                    null
                                )
                        
                                    {
                                    InputAutomationJFrame.destroy()

                                    }
                                
                        else {
                            logUtil!!.put(
                            "Nothing to stop", this, 
                            "stop")

                        }
                            
}


}
                
            

