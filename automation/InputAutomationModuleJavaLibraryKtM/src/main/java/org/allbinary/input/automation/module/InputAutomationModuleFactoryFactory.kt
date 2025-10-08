
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Collection
import java.util.HashMap
import java.util.Iterator
import javax.help.HelpSet
import javax.help.event.HelpSetEvent
import javax.help.event.HelpSetListener
import javax.swing
import org.allbinary.input.automation.module.configuration.InputAutomationModuleConfiguration
import org.allbinary.input.automation.module.configuration.InputAutomationModuleConfigurations
import org.allbinary.input.automation.module.configuration.InputAutomationModuleConfigurationsSingletonFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.help.JavaHelpSetNotifier
import org.allbinary.string.CommonStrings

open public class InputAutomationModuleFactoryFactory
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var hashMap: HashMap<Any, Any>

    private var defaultListModelHelper: DefaultListModelHelper

    private var helpSetListenerInterface: HelpSetListener
public constructor (helpSetListenerInterface: HelpSetListener)
            : super()
        {
    //var helpSetListenerInterface = helpSetListenerInterface
this.helpSetListenerInterface= helpSetListenerInterface
this.defaultListModelHelper= DefaultListModelHelper()
this.hashMap= HashMap<Any, Any>()

    var inputAutomationModuleConfigurations: InputAutomationModuleConfigurations = InputAutomationModuleConfigurationsSingletonFactory.getInstance()!!


    var collection: Collection = inputAutomationModuleConfigurations!!.getHashMap()!!.values()!!


    var iterator: Iterator = collection.iterator()!!


    var inputAutomationModuleConfiguration: InputAutomationModuleConfiguration


        while(iterator.hasNext())
        {
inputAutomationModuleConfiguration= iterator.next() as InputAutomationModuleConfiguration
this.add(inputAutomationModuleConfiguration)
}

this.defaultListModelHelper!!.initDefaultModelList()
logUtil!!.put("Loaded " +this.hashMap!!.size +"/" +this.defaultListModelHelper!!.getListModel()!!.getSize() +" Input Automation Modules", this, "Contructor")
}


    open fun add(inputAutomationModuleConfiguration: InputAutomationModuleConfiguration)
        //nullable = true from not(false or (false and false)) = true
{
    //var inputAutomationModuleConfiguration = inputAutomationModuleConfiguration

    var inputAutomationModuleInterface: InputAutomationModuleFactoryInterface = inputAutomationModuleConfiguration!!.getInputAutomationModuleInterface()!!

this.hashMap!!.put(inputAutomationModuleConfiguration!!.getName(), inputAutomationModuleInterface)
this.defaultListModelHelper!!.add(inputAutomationModuleConfiguration!!.getName())

    var helpSet: HelpSet = inputAutomationModuleInterface!!.getHelpSet()!!


    
                        if(!JavaHelpSetNotifier.isNotified(helpSet))
                        
                                    {
                                    
    var helpSetEvent: HelpSetEvent = HelpSetEvent(this, helpSet, HelpSetEvent.HELPSET_ADDED)

this.helpSetListenerInterface!!.helpSetAdded(helpSetEvent)

                                    }
                                
}


    open fun getListModel()
        //nullable = true from not(false or (false and true)) = true
: ListModel{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.defaultListModelHelper!!.getListModel() as ListModel
}


    open fun getInstance(moduleName: String)
        //nullable =  from not(true or (false and false)) = 
: InputAutomationModuleFactoryInterface{
    //var moduleName = moduleName

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put("Getting Module: " +moduleName, this, commonStrings!!.GET_INSTANCE)

    var inputAutomationModuleFactoryInterface: InputAutomationModuleFactoryInterface = this.hashMap!!.get(moduleName as Object) as InputAutomationModuleFactoryInterface


    
                        if(inputAutomationModuleFactoryInterface == 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put("Module: " +moduleName +" was null", this, commonStrings!!.GET_INSTANCE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationModuleFactoryInterface
}


}
                
            

