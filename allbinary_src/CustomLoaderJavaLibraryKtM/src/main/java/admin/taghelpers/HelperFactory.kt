
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
        package admin.taghelpers




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.loader.AbeFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.string.CommonStrings

open public class HelperFactory
            : Object
         {
        

        companion object {
            
                @Throws(LicensingException::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, factoryName: String, className: String, hashMap: HashMap<Any, Any>, httpServletRequest: HttpServletRequest)
        //nullable =  from not(true or (false and false)) = 
: Any{

                    var abeClientInformation = abeClientInformation


                    var factoryName = factoryName


                    var className = className


                    var hashMap = hashMap


                    var httpServletRequest = httpServletRequest

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var params: Array<Any?> = arrayOfNulls(2)


    var classes: Array<KClass<*>?> = arrayOfNulls(2)


    var abeFactory: AbeFactory = AbeFactory.getInstance()!!

classes[0]= hashMap!!::class
classes[1]= abeFactory!!::class
params[0]= hashMap as Object
params[1]= httpServletRequest as Object

    var anyType: Any = abeFactory!!.getInstance(abeClientInformation, className, classes, params)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType
} catch(e: LicensingException)
            {
    var error: String = "Failed To Get Instance Args: HashMap=" +hashMap!!.toString() +" HttpServletRequest=" +httpServletRequest


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(error, factoryName +"->HelperFactory", "getInstance(String, String, HashMap, PageContext)", e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    var error: String = "Failed To Get Instance"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(error, factoryName +"->HelperFactory", "getInstance(String, String, HashMap, PageContext)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


                @Throws(LicensingException::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, factoryName: String, className: String, hashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable =  from not(true or (false and false)) = 
: Any{

                    var abeClientInformation = abeClientInformation


                    var factoryName = factoryName


                    var className = className


                    var hashMap = hashMap


                    var pageContext = pageContext

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var params: Array<Any?> = arrayOfNulls(2)


    var classes: Array<KClass<*>?> = arrayOfNulls(2)


    var abeFactory: AbeFactory = AbeFactory.getInstance()!!

classes[0]= hashMap!!::class
classes[1]= abeFactory!!::class
params[0]= hashMap as Object
params[1]= pageContext as Object

    var anyType: Any = abeFactory!!.getInstance(abeClientInformation, className, classes, params)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType
} catch(e: LicensingException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var error: String = "Failed To Get Instance Args: HashMap=" +hashMap!!.toString() +" PageContext=" +pageContext

logUtil!!.put(error, factoryName +"->HelperFactory", "getInstance(String, String, HashMap, PageContext)", e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, factoryName +"->HelperFactory", "getInstance(String, String, HashMap, PageContext)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


                @Throws(LicensingException::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, factoryName: String, className: String, hashMap: HashMap<Any, Any>, specialhashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable =  from not(true or (false and false)) = 
: Any{

                    var abeClientInformation = abeClientInformation


                    var factoryName = factoryName


                    var className = className


                    var hashMap = hashMap


                    var specialhashMap = specialhashMap


                    var pageContext = pageContext

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var params: Array<Any?> = arrayOfNulls(3)


    var classes: Array<KClass<*>?> = arrayOfNulls(3)


    var abeFactory: AbeFactory = AbeFactory.getInstance()!!

classes[0]= hashMap!!::class
classes[1]= specialhashMap!!::class
classes[2]= abeFactory!!::class
params[0]= hashMap as Object
params[1]= specialhashMap as Object
params[2]= pageContext as Object

    var anyType: Any = abeFactory!!.getInstance(abeClientInformation, className, classes, params)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType
} catch(e: LicensingException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var error: String = "Failed To Get Instance Args: HashMap=" +hashMap!!.toString() +" PageContext=" +pageContext

logUtil!!.put(error, factoryName +"->HelperFactory", "getInstance(String, String, HashMap, PageContext)", e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, factoryName +"->HelperFactory", "getInstance(String, String, HashMap, PageContext)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


                @Throws(LicensingException::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, factoryName: String, className: String)
        //nullable =  from not(true or (false and false)) = 
: Any{

                    var abeClientInformation = abeClientInformation


                    var factoryName = factoryName


                    var className = className

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var anyType: Any = AbeFactory.getInstance()!!.getInstance(abeClientInformation, className)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType
} catch(e: LicensingException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, factoryName +"->HelperFactory", "getInstance(String, String, HashMap, PageContext)", e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, factoryName +"->HelperFactory", "getInstance(String, String, HashMap, PageContext)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        ()
            : super()
        {}


}
                
            

