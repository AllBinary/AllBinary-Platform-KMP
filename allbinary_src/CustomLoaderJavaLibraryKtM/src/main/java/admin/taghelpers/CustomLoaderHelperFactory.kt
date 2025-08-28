
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
import javax.servlet.jsp.PageContext
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory

open public class CustomLoaderHelperFactory
            : Object
        
                , TagHelperFactoryInterface {
        

        companion object {
            
    private val CLASSNAME: String = "admin.taghelpers.CustomLoaderHelper"

    private val FACTORYNAME: String = "CustomLoaderHelperFactory"

        }
            public constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


                @Throws(LicensingException::class)
            
open fun getInstance(hashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable =  from not(true or (false and false)) = 
: Any

        Updates for KMP build        
        {
    //var hashMap = hashMap
    //var pageContext = pageContext

    var abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HelperFactory.getInstance(abeClientInformation, FACTORYNAME, CLASSNAME, hashMap, pageContext)
}


                @Throws(LicensingException::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface)
        //nullable =  from not(true or (false and false)) = 
: Any

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HelperFactory.getInstance(abeClientInformation, FACTORYNAME, CLASSNAME)
}


}
                
            

