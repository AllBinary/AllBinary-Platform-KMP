
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
        package org.allbinary.logic.visual.transform.generator




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.InputOutputTypeData
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.TransformFactory
import org.allbinary.logic.visual.transform.TransformInterface
import org.allbinary.logic.visual.transform.info.TransformInfoDomNode
import org.allbinary.logic.visual.transform.info.TransformInfoHttpInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.objectConfig.generator.StoreFileGenerator

open public class TransformGeneratorUtil
            : Object
         {
        

        companion object {
            
    private val instance: TransformGeneratorUtil = TransformGeneratorUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransformGeneratorUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun generate(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface, ownerTransformInfoInterface: TransformInfoInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var ownerTransformInfoInterface = ownerTransformInfoInterface

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Generating View: " +transformInfoInterface!!.getName(), this, "generate()")

                                    }
                                

    var componentInterface: TransformInterface = TransformFactory.getInstance()!!.getInstance(abeClientInformation, transformInfoInterface!!.getName(), ownerTransformInfoInterface)!!


    var result: String = componentInterface!!.view()!!


    var httpTransformInfoInterface: TransformInfoHttpInterface = componentInterface!!.getTransformInfoInterface() as TransformInfoHttpInterface


    var inputOutputTypeData: InputOutputTypeData = InputOutputTypeData.getInstance()!!


    
                        if(result.indexOf("<HTML>") >= 0)
                        
                                    {
                                    httpTransformInfoInterface!!.getPropertiesHashMap()!!.put(inputOutputTypeData!!.NAME, inputOutputTypeData!!.DEFAULT)

                                    }
                                
                        else {
                            httpTransformInfoInterface!!.getPropertiesHashMap()!!.put(inputOutputTypeData!!.NAME, inputOutputTypeData!!.DEFAULT_FRAGMENT)

                        }
                            
StoreFileGenerator(componentInterface!!.getTransformInfoInterface()).
                            process(result)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate a view", this, "generate()", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun generate(abeClientInformation: AbeClientInformationInterface, transformInfoDomNode: TransformInfoDomNode, ownerTransformInfoInterface: TransformInfoInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var transformInfoDomNode = transformInfoDomNode


                    var ownerTransformInfoInterface = ownerTransformInfoInterface
generate(abeClientInformation, transformInfoDomNode!!.getTransformInfoInterface(), ownerTransformInfoInterface)
}


}
                
            

