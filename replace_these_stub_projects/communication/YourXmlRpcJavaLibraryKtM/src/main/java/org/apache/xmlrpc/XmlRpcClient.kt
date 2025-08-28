
        /* Generated Code Do Not Modify */
        package org.apache.xmlrpc




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.IOException
import java.net.MalformedURLException
import java.net.URL
import java.util.Vector
import org.allbinary.init.crypt.jcehelper.CryptInterface
import org.allbinary.logic.NullUtil

open public class XmlRpcClient
            : Object
        
                , XmlRpcHandler {
        

    private val url: URL
public constructor        (url: URL)
            : super()
        

        Updates for KMP build        
        {
var url = url
this.url= url
}

public constructor        (url: String)                        

                            : this(URL(url))

        Updates for KMP build        
        {
var url = url


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (hostname: String, port: Int)                        

                            : this(URL("http://" +hostname +':' +port +"/RPC2"))

        Updates for KMP build        
        {
var hostname = hostname
var port = port


                            //For kotlin this is before the body of the constructor.
                    
}


open fun getURL()
        //nullable = true from not(false or (false and true)) = true
: URL

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.url
}


open fun setBasicAuthentication(user: String, password: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var user = user
var password = password
}


                @Throws(XmlRpcException::class, IOException::class)
            override fun execute(method: String, params: Vector<Any>)
        //nullable = true from not(false or (false and false)) = true
: Any

        Updates for KMP build        
        {
var method = method
var params = params



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_OBJECT
}


                @Throws(XmlRpcException::class, IOException::class)
            
open fun execute(method: String, params: Vector<Any>, cryptInterface: CryptInterface)
        //nullable = true from not(false or (false and false)) = true
: Any

        Updates for KMP build        
        {
var method = method
var params = params
var cryptInterface = cryptInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_OBJECT
}


}
                
            

