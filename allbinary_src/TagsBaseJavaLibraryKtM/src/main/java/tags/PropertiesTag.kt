
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.logic.communication.log.LogUtil

open public class PropertiesTag : CommandTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var propertiesHashMap: HashMap<Any, Any>
public constructor        (){
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.propertiesHashMap= HashMap<Any, Any>()
}


open fun getPropertiesHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.propertiesHashMap
}


open fun doEndTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(
                            "Tag Ended", this, 
                            "doEndTag")

                                    }
                                
this.propertiesHashMap= HashMap<Any, Any>()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EVAL_PAGE
}


}
                
            

