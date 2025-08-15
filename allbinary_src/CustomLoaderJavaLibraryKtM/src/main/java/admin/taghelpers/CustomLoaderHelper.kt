
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
import org.allbinary.globals.AppUrlGlobals
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class CustomLoaderHelper
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext)
            : super()
        {

                    var hashMap = hashMap


                    var pageContext = pageContext
}

public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getWebappPath()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return org.allbinary.globals.URLGLOBALS.getWebappPath()
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


                @Throws(Exception::class)
            
open fun setWebappPath(path: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var path = path

        try {
            
    var urlGlobals: AppUrlGlobals = AppUrlGlobals()

urlGlobals!!.setWebappPath(path)
URLGLOBALS.init(urlGlobals)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "setWebappPath()", e)

                                    }
                                
}

}


}
                
            

