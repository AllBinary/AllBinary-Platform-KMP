
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
        package org.allbinary.logic.visual.transform.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class TransformInfoHttpComposite
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var transformInfoInterface: TransformInfoHttpInterface
public constructor (transformInfoInterface: TransformInfoInterface)
            : super()
        {
var transformInfoInterface = transformInfoInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.transformInfoInterface= transformInfoInterface as TransformInfoHttpInterface
}


                @Throws(Exception::class)
            
    open fun getTransformInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transformInfoInterface
}


    open fun getWeblisketSession()
        //nullable = true from not(false or (false and true)) = true
: WeblisketSession{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return WeblisketSession(this.getPropertiesHashMap(), this.getPageContext())
}


    open fun getPageContext()
        //nullable = true from not(false or (false and true)) = true
: PageContext{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transformInfoInterface!!.getPageContext()
}


    open fun getPropertiesHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transformInfoInterface!!.getPropertiesHashMap()
}


}
                
            

