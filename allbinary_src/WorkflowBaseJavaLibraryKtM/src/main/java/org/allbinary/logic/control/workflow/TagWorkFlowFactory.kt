
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
        package org.allbinary.logic.control.workflow



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.business.DynamicObjectData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.loader.AbeFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.string.CommonStrings

open public class TagWorkFlowFactory
            : Object
         {
        

        companion object {


    private val instance: TagWorkFlowFactory = TagWorkFlowFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TagWorkFlowFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class, LicensingException::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable =  from not(true or (false and false)) = 
: WorkFlowInterface{

                    var abeClientInformation = abeClientInformation


                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext

        try {
            
    var workFlowClassName: String = propertiesHashMap!!.get(DynamicObjectData.NAME) as String


    var params: Array<Any?> = arrayOfNulls(2)


    var classes: Array<KClass<*>?> = arrayOfNulls(2)

classes[0]= propertiesHashMap!!::class
classes[1]= AbeFactory.getInstance()!!.::class
params[0]= propertiesHashMap as Object
params[1]= pageContext as Object



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbeFactory.getInstance()!!.getInstance(abeClientInformation, workFlowClassName, classes, params) as WorkFlowInterface
} catch(e: LicensingException)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var workFlowClassName: String = propertiesHashMap!!.get(DynamicObjectData.NAME) as String


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Failed To Get Instance: ")
stringBuffer!!.append(workFlowClassName)
stringBuffer!!.append(
                            "->")
stringBuffer!!.append(instance!!::class.qualifiedName!!)

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var workFlowClassName: String = propertiesHashMap!!.get(DynamicObjectData.NAME) as String


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Failed To Get Instance: ")
stringBuffer!!.append(workFlowClassName)
stringBuffer!!.append(
                            "->")
stringBuffer!!.append(instance!!::class.qualifiedName!!)

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}

}


}
                
            

