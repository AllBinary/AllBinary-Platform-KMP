
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
        package taghelpers




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import admin.taghelpers.HelperFactory
import org.allbinary.logic.system.security.licensing.LicensingException
import admin.taghelpers.TagHelperFactoryInterface

open public class ValidatedViewHelperFactory
            : Object
        
                , TagHelperFactoryInterface {
        

        companion object {
            
    private val CLASSNAME: String = "taghelpers.ValidationViewHelper"

    private val FACTORYNAME: String = "taghelpers.ValidationViewHelperFactory"

        }
            public constructor        ()
            : super()
        {
}


                @Throws(Exception::class, LicensingException::class)
            
open fun getInstance(hashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable =  from not(true or (false and false)) = 
: Any{
var hashMap = hashMap
var pageContext = pageContext



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HelperFactory.getInstance(FACTORYNAME, CLASSNAME, hashMap, pageContext)
}


}
                
            

