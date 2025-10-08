
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
import org.allbinary.business.context.modules.storefront.StoreFront
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.string.CommonSeps

open public class StoreFrontHelper : TagHelper {
        

    private val storeFrontInterface: StoreFrontInterface

    private val currentLocation: String

    private val currentHomeLocation: String
public constructor (hashMap: HashMap<Any, Any>, pageContext: PageContext){
var hashMap = hashMap
var pageContext = pageContext

    var storeName: String = hashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String


    
                        if(storeName != 
                                    null
                                )
                        
                                    {
                                    this.storeFrontInterface= StoreFrontFactory.getInstance(storeName)
this.currentLocation= Replace(CommonSeps.getInstance()!!.SPACE, "%20").
                            all(storeFrontInterface!!.getCurrentHostName() +storeFrontInterface!!.getCurrentHostNamePath())
this.currentHomeLocation= Replace(CommonSeps.getInstance()!!.SPACE, "%20").
                            all(storeFrontInterface!!.getCurrentHomeHostName() +storeFrontInterface!!.getCurrentHomeHostNamePath())

                                    }
                                
                        else {
                            
    var stringUtil: StringUtil = StringUtil.getInstance()!!

this.storeFrontInterface= StoreFront()
this.currentLocation= stringUtil!!.EMPTY_STRING
this.currentHomeLocation= stringUtil!!.EMPTY_STRING

                        }
                            
}


    open fun getCurrentLocation()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.currentLocation
}


    open fun getCurrentHomeLocation()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.currentHomeLocation
}


}
                
            

