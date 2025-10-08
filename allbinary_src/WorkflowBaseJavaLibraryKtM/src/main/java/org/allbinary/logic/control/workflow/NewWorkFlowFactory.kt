
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.business.DynamicObjectData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.loader.AbeFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.string.CommonStrings

open public class NewWorkFlowFactory
            : Object
         {
        
companion object {
            
    private val instance: NewWorkFlowFactory = NewWorkFlowFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NewWorkFlowFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor ()
            : super()
        {
}


                @Throws(Exception::class, LicensingException::class)
            
    open fun getInstance(abeClientInformation: AbeClientInformationInterface, hashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable =  from not(true or (false and false)) = 
: WorkFlowInterface{
    //var abeClientInformation = abeClientInformation
    //var hashMap = hashMap
    //var pageContext = pageContext

        try {
            
    var className: String = hashMap!!.get(DynamicObjectData.NAME) as String


    var params: Array<Any?> = arrayOfNulls(2)


    var classes: Array<KClass<*>?> = arrayOfNulls(2)

classes[0]= hashMap!!::class
classes[1]= AbeFactory.getInstance()!!.::class
params[0]= hashMap as Object
params[1]= pageContext as Object

    var anyType: Any = AbeFactory.getInstance()!!.getInstance(abeClientInformation, className, classes, params)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return WorkFlowWrapper(anyType) as WorkFlowInterface
} catch(e: LicensingException)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "getInstance(HashMap)", e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "getInstance(HashMap)", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class, LicensingException::class)
            
    open fun getInstance(abeClientInformation: AbeClientInformationInterface, className: String)
        //nullable =  from not(true or (false and false)) = 
: WorkFlowInterface{
    //var abeClientInformation = abeClientInformation
    //var className = className

        try {
            
    var stringUtil: StringUtil = StringUtil.getInstance()!!


    
                        if(className != 
                                    null
                                 && className!!.compareTo(stringUtil!!.EMPTY_STRING) != 0)
                        
                                    {
                                    
    var anyType: Any = AbeFactory.getInstance()!!.getInstance(abeClientInformation, className, 
                            null, 
                            null)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return WorkFlowWrapper(anyType) as WorkFlowInterface

                                    }
                                
                             else 
    
                        if()
                        
} catch(e: LicensingException)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}

}


}
                
            

