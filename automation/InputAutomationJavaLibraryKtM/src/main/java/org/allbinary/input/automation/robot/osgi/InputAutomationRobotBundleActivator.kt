
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
        
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.framework.ServiceFactory
import org.osgi.framework.ServiceReference
import bundle.input.automation.robot.InputAutomationRobotChangeListener
import bundle.input.automation.robot.InputAutomationRobotServiceInterface
import org.allbinary.input.automation.robot.InputRobotInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.osgi.OSGIActivatorUtil
import org.allbinary.string.CommonStrings

open public class InputAutomationRobotBundleActivator
            : Object
        
                , BundleActivator {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var inputRobotInterface: Array<InputRobotInterface?>

    private var serviceFactory: ServiceFactory
public constructor        ()
            : super()
        {this.init()
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{


                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun registerAsService(bundleContext: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{

                    var bundleContext = bundleContext
OSGIActivatorUtil.registerAsService(bundleContext, getServiceFactory(), InputAutomationRobotServiceInterface::classgetName())
}


                @Throws(Exception::class)
            
open fun getInputAutomationRobotChangeListener(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
: InputAutomationRobotChangeListener{

                    var context = context

    var serviceReference: ServiceReference = context.getServiceReference(InputAutomationRobotChangeListener::classgetName())!!
            


    
                        if(serviceReference != 
                                    null
                                )
                        
                                    {
                                    
    var inputAutomationRobotChangeListener: InputAutomationRobotChangeListener = context.getService(serviceReference) as InputAutomationRobotChangeListener


    
                        if(inputAutomationRobotChangeListener == 
                                    null
                                )
                        
                                    throw Exception("No Service For ServiceReference")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationRobotChangeListener

                                    }
                                
                        else {
                            logUtil!!.put("No ServiceReference: " +InputAutomationRobotChangeListener::classgetName(), this, "getInputAutomationRobotChangeListener")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


open fun addRobots(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{

                    var context = context

        try {
            logUtil!!.put(this.commonStrings!!.START, this, "addRobots")

    var inputAutomationRobotChangeListener: InputAutomationRobotChangeListener = this.getInputAutomationRobotChangeListener(context)!!
            


    
                        if(inputAutomationRobotChangeListener != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until this.getInputRobotInterface()!!.length)


        {
    var inputAutomationRobotChangeEvent: InputAutomationRobotChangeEvent = InputAutomationRobotUtil.getChangeEvent(this.getInputRobotInterface()[index]!!)!!
            

inputAutomationRobotChangeListener!!.onAdd(inputAutomationRobotChangeEvent)
}


                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "addModules")
}

}


open fun removeRobots(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{

                    var context = context

        try {
            logUtil!!.put(this.commonStrings!!.START, this, "removeRobots")

    var inputAutomationRobotChangeListener: InputAutomationRobotChangeListener = this.getInputAutomationRobotChangeListener(context)!!
            


    
                        if(inputAutomationRobotChangeListener != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until this.getInputRobotInterface()!!.length)


        {
    var inputAutomationRobotChangeEvent: InputAutomationRobotChangeEvent = InputAutomationRobotUtil.getChangeEvent(this.getInputRobotInterface()[index]!!)!!
            

inputAutomationRobotChangeListener!!.onRemove(inputAutomationRobotChangeEvent)
}


                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "removeRobots")
}

}


                @Throws(Exception::class)
            
open fun start(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{

                    var context = context
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.START)
this.addRobots(context)
this.registerAsService(context)
}


                @Throws(Exception::class)
            
open fun stop(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{

                    var context = context
logUtil!!.put("Stop", this, this.commonStrings!!.START)
this.removeRobots(context)
}


open fun getServiceFactory()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return serviceFactory
}


open fun setServiceFactory(serviceObject: ServiceFactory)
        //nullable = true from not(false or (false and false)) = true
{

                    var serviceObject = serviceObject
this.serviceFactory= serviceObject
}


open fun getInputRobotInterface()
        //nullable = true from not(false or (false and true)) = true
: Array<InputRobotInterface?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputRobotInterface
}


open fun setInputRobotInterface(inputRobotInterface: Array<InputRobotInterface?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputRobotInterface = inputRobotInterface
this.inputRobotInterface= inputRobotInterface
}


}
                
            

