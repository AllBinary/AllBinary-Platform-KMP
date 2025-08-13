
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
        package org.allbinary.input.automation.configuration



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import java.io.FileInputStream
import java.util.List
import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBElement
import javax.xml.bind.Unmarshaller
import javax.xml.transform.stream.StreamSource
import org.allbinary.input.automation.module.configuration.InputAutomationModuleConfiguration
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings

open public class InputAutomationConfigurationFactory
            : Object
         {
        

        companion object {
            
    private var inputAutomationConfiguration: InputAutomationConfiguration = 
                null
            

                @Throws(Exception::class)
            
open fun init(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation

    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    var INPUT_AUTOMATION_CONFIGURATION: String = "InputAutomationConfiguration"


    var file: File = InputAutomationConfiguration.getFile()!!
            


    
                        if(file.isFile())
                        
                                    {
                                    logUtil!!.put(
                            "LoadingConfiguration", INPUT_AUTOMATION_CONFIGURATION, commonStrings!!.INIT)

    var jaxbContext: JAXBContext = JAXBContext.newInstance(InputAutomationConfiguration::class)!!
            


    var unmarshaller: Unmarshaller = jaxbContext!!.createUnmarshaller()!!
            


    var root: JAXBElement<InputAutomationConfiguration> = unmarshaller.unmarshal(StreamSource(FileInputStream(file)), InputAutomationConfiguration::class)!!
            

inputAutomationConfiguration= root.getValue() as InputAutomationConfiguration

    var inputAutomationModuleConfigurationList: List<InputAutomationModuleConfiguration> = inputAutomationConfiguration!!.getInputAutomationModuleConfigurationList()!!
            

logUtil!!.put("isInstalled: " +inputAutomationConfiguration!!.isInstalled(), INPUT_AUTOMATION_CONFIGURATION, commonStrings!!.INIT)

    var size: Int = inputAutomationModuleConfigurationList!!.size!!
            


    var inputAutomationModuleConfiguration: InputAutomationModuleConfiguration





                        for (index in 0 until size)


        {inputAutomationModuleConfiguration= inputAutomationModuleConfigurationList!!.get(index)
inputAutomationModuleConfiguration!!.init(abeClientInformation)
}

logUtil!!.put(
                            "LoadedConfiguration", INPUT_AUTOMATION_CONFIGURATION, commonStrings!!.INIT)

                                    }
                                
                        else {
                            logUtil!!.put(
                            "New Configuration", INPUT_AUTOMATION_CONFIGURATION, commonStrings!!.INIT)
inputAutomationConfiguration= InputAutomationConfiguration()

                        }
                            
}


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InputAutomationConfiguration{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationConfiguration
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


}
                
            

