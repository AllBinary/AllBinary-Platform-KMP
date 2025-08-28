
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
        package tags




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import admin.taghelpers.TagHelperFactoryInterface
import org.allbinary.logic.communication.log.LogUtil

open public class HelperTag : PropertiesTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val tagHelperFactoryInterface: TagHelperFactoryInterface

    private var anyType: Any
public constructor        (tagHelperFactoryInterface: TagHelperFactoryInterface)

        Updates for KMP build        
        {
    //var tagHelperFactoryInterface = tagHelperFactoryInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.tagHelperFactoryInterface= tagHelperFactoryInterface
}


                @Throws(Exception::class)
            
open fun setHelper()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    
                        if(this.anyType == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Creating TagHelper with: \n" +this.getPropertiesHashMap()!!.toString(), this, "doStartTag")

                                    }
                                
this.anyType= tagHelperFactoryInterface!!.getInstance(this.getPropertiesHashMap(), this.pageContext)

                                    }
                                
}


open fun getHelper()
        //nullable = true from not(false or (false and true)) = true
: Any

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.anyType
}


open fun doEndTag()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Tag Ended", this, "doEndTag")

                                    }
                                
this.anyType= 
                                        null
                                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doEndTag()
}


}
                
            

