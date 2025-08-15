
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
        package org.allbinary.logic.visual.transform




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.data.tables.transform.info.TransformInfoEntity
import org.allbinary.data.tables.transform.info.TransformInfoEntityBuilder
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.TransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoHttpFactory
import org.allbinary.logic.visual.transform.info.TransformInfoHttpInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.TransformInfoObjectFactory
import org.allbinary.string.CommonStrings

open public class TransformFactory
            : Object
         {
        

        companion object {
            
    private val instance: TransformFactory = TransformFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransformFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, viewName: String, ownerTransformInfoInterface: TransformInfoInterface)
        //nullable =  from not(true or (false and false)) = 
: TransformInterface{

                    var abeClientInformation = abeClientInformation


                    var viewName = viewName


                    var ownerTransformInfoInterface = ownerTransformInfoInterface

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put("Creating Transform: " +viewName, this, commonStrings!!.GET_INSTANCE)

                                    }
                                

    var ownerTransformInfoHttpInterface: TransformInfoHttpInterface = ownerTransformInfoInterface as TransformInfoHttpInterface


    var transformInfoEntity: TransformInfoEntity = TransformInfoEntityBuilder.getInstance()!!
            


    var transformInfoInterface: TransformInfoInterface = transformInfoEntity!!.get(viewName, ownerTransformInfoHttpInterface!!.getPropertiesHashMap(), ownerTransformInfoHttpInterface!!.getPageContext())!!
            


    
                        if(transformInfoInterface == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("No Such View In DB: " +viewName)

                                    }
                                
transformInfoInterface!!.setChild()

    var anyType: Any = TransformInfoObjectFactory.getInstance()!!.getInstance(abeClientInformation, transformInfoInterface)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put("Created Transform: " +viewName, this, commonStrings!!.GET_INSTANCE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType as TransformInterface
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable =  from not(true or (false and false)) = 
: TransformInterface{

                    var abeClientInformation = abeClientInformation


                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext

        try {
            
    var transformInfoData: TransformInfoData = TransformInfoData.getInstance()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put("Creating Transform: " +propertiesHashMap!!.get(transformInfoData!!.NAME), this, commonStrings!!.GET_INSTANCE)

                                    }
                                

    var transformInfoEntity: TransformInfoEntity = TransformInfoEntityBuilder.getInstance()!!
            


    var transformInfoInterface: TransformInfoInterface = transformInfoEntity!!.get(propertiesHashMap!!.get(transformInfoData!!.NAME) as String, propertiesHashMap, pageContext)!!
            


    
                        if(transformInfoInterface != 
                                    null
                                )
                        
                                    {
                                    transformInfoInterface!!.override(propertiesHashMap)

                                    }
                                
                        else {
                            transformInfoInterface= TransformInfoHttpFactory.getInstance(propertiesHashMap, pageContext) as TransformInfoInterface

                        }
                            

    var anyType: Any = TransformInfoObjectFactory.getInstance()!!.getInstance(abeClientInformation, transformInfoInterface)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put("Created Transform: " +propertiesHashMap!!.get(transformInfoData!!.NAME), this, commonStrings!!.GET_INSTANCE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType as TransformInterface
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Failed To Get Instance: ")
stringBuffer!!.append(propertiesHashMap!!.get(TransformInfoData.getInstance()!!.NAME) as String)
stringBuffer!!.append("->TransformFactory")
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface)
        //nullable =  from not(true or (false and false)) = 
: TransformInterface{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put("Creating Transform: " +transformInfoInterface!!.getName(), this, "getInstance(TransformInfoInterface)")

                                    }
                                

    var anyType: Any = TransformInfoObjectFactory.getInstance()!!.getInstance(abeClientInformation, transformInfoInterface)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put("Created Transform: " +transformInfoInterface!!.getName(), this, "getInstance(TransformInfoInterface)")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType as TransformInterface
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getInstance(TransformInfoInterface)", e)

                                    }
                                



                            throw e
}

}


}
                
            

