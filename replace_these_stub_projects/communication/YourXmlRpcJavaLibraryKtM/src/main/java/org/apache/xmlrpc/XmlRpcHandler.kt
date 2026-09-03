
        /* Generated Code Do Not Modify */
        package org.apache.xmlrpc




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

interface XmlRpcHandler {
        

                @Throws(Exception::class)
            
    open fun execute(method: String, params: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Any

}
                
            

