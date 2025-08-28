
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
        package org.allbinary.input.automation.module.osgi




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.framework.ServiceFactory
import org.osgi.framework.ServiceReference
import bundle.input.automation.module.InputAutomationModuleServiceInterface
import bundle.input.automation.module.configuration.InputAutomationConfigurationModuleChangeListener
import org.allbinary.input.automation.configuration.InputAutomationConfigurationModuleChangeEvent
import org.allbinary.input.automation.configuration.InputAutomationConfigurationUtil
import org.allbinary.input.automation.module.InputAutomationModuleFactoryInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.osgi.OSGIActivatorUtil
import org.allbinary.string.CommonStrings

open public class InputAutomationModuleBundleActivator
            : Object
        
                , BundleActivator {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var inputAutomationModuleInterface: Array<InputAutomationModuleFactoryInterface?>

    private var serviceFactory: ServiceFactory
public constructor        ()
            : super()
        {
this.init()
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun getInputAutomationConfigurationModuleChangeListener(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
: InputAutomationConfigurationModuleChangeListener{
var context = context

    var serviceReference: ServiceReference = context.getServiceReference(InputAutomationConfigurationModuleChangeListener::class.toString()!!)!!


    
                        if(serviceReference != 
                                    null
                                )
                        
                                    {
                                    
    var inputAutomationConfigurationModuleChangeListener: InputAutomationConfigurationModuleChangeListener = context.getService(serviceReference) as InputAutomationConfigurationModuleChangeListener


    
                        if(inputAutomationConfigurationModuleChangeListener == 
                                    null
                                )
                        
                                    throw Exception("No Service For ServiceReference")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationConfigurationModuleChangeListener

                                    }
                                
                        else {
                            logUtil!!.put("No ServiceReference: " +InputAutomationConfigurationModuleChangeListener::class.toString()!!, this, "addModules")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


open fun addModules(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{
var context = context

        try {
            logUtil!!.put(this.commonStrings!!.START, this, "addModules")

    var inputAutomationConfigurationModuleChangeListener: InputAutomationConfigurationModuleChangeListener = this.getInputAutomationConfigurationModuleChangeListener(context)!!


    
                        if(inputAutomationConfigurationModuleChangeListener != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until this.getInputAutomationModuleInterface()!!.length)

        {

    var inputAutomationConfigurationModuleChangeEvent: InputAutomationConfigurationModuleChangeEvent = InputAutomationConfigurationUtil.getChangeEvent(this.getInputAutomationModuleInterface()[index]!!)!!

inputAutomationConfigurationModuleChangeListener!!.onAdd(inputAutomationConfigurationModuleChangeEvent)
}


                                    }
                                
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "addModules")
}

}


                @Throws(Exception::class)
            
open fun registerAsService(bundleContext: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{
var bundleContext = bundleContext
OSGIActivatorUtil.registerAsService(bundleContext, getServiceFactory(), InputAutomationModuleServiceInterface::class.toString()!!)
}


open fun removeModules(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{
var context = context

        try {
            logUtil!!.put(this.commonStrings!!.START, this, "removeModules")

    var inputAutomationConfigurationModuleChangeListener: InputAutomationConfigurationModuleChangeListener = this.getInputAutomationConfigurationModuleChangeListener(context)!!


    
                        if(inputAutomationConfigurationModuleChangeListener != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until this.getInputAutomationModuleInterface()!!.length)

        {

    var inputAutomationConfigurationModuleChangeEvent: InputAutomationConfigurationModuleChangeEvent = InputAutomationConfigurationUtil.getChangeEvent(this.getInputAutomationModuleInterface()[index]!!)!!

inputAutomationConfigurationModuleChangeListener!!.onRemove(inputAutomationConfigurationModuleChangeEvent)
}


                                    }
                                
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "removeModules")
}

}


                @Throws(Exception::class)
            
open fun start(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{
var context = context
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.START)
this.addModules(context)
this.registerAsService(context)
}


                @Throws(Exception::class)
            
open fun stop(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{
var context = context
logUtil!!.put(this.commonStrings!!.START, this, "stop")
this.removeModules(context)
}


open fun getInputAutomationModuleInterface()
        //nullable = true from not(false or (false and true)) = true
: Array<InputAutomationModuleFactoryInterface?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationModuleInterface
}


open fun setInputAutomationModuleInterface(inputAutomationModuleInterface: Array<InputAutomationModuleFactoryInterface?>)
        //nullable = true from not(false or (false and false)) = true
{
var inputAutomationModuleInterface = inputAutomationModuleInterface
this.inputAutomationModuleInterface= inputAutomationModuleInterface
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


}
                
            

