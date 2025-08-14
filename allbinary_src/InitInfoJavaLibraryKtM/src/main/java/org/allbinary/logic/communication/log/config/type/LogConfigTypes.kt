
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
        package org.allbinary.logic.communication.log.config.type




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.communication.log.config.LoggingInitInfo
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Node

open public class LogConfigTypes
            : Object
         {
        

        companion object {
            
    val JSP_ERROR_NO_FUNCTION: String = "in JSP Not In Function"

    var LOGGING: BasicArrayList = BasicArrayList()

                init{LogConfigTypes.init()
}

open fun init()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            PreLogUtil.put(
                            "Initialize LogconfigTypes", 
                            "LogConfigTypes", 
                            "init()")
LogConfigTypeFactory.getInstance()

    var loggingInitInfo: LoggingInitInfo = LoggingInitInfo()


    var logConfigTypeVector: BasicArrayList = loggingInitInfo!!.getTypeList()!!
            

PreLogUtil.put("Number Of Log Configs: " +loggingInitInfo!!.getNumberOfLogConfigs(), 
                            "LogConfigTypes", 
                            "init()")
PreLogUtil.put("Number Of Log Config Type Names: " +logConfigTypeVector!!.size(), 
                            "LogConfigTypes", 
                            "init()")
LogConfigTypes.LOGGING.addAll(logConfigTypeVector)
LogConfigTypes.LOGGING.add(LogConfigTypeFactory.getInstance()!!.NETBEANS_MODULE)
} catch(e: Exception)
            {PreLogUtil.put(
                            "Unable to initialize LogConfigTypes", 
                            "LogConfigTypes", 
                            "init()", e)
}

}


                @Throws(Exception::class)
            
open fun getInstance(node: Node)
        //nullable =  from not(true or (false and false)) = 
: LogConfigType{

                    var node = node

    var nameValueNode: Node = DomSearchHelper.getNode(LogConfigTypeData.getInstance()!!.NAME, node.getChildNodes())!!
            


    var name: String = DomNodeHelper.getTextNodeValue(nameValueNode)!!
            


    var descriptionValueNode: Node = DomSearchHelper.getNodeNoThrow(LogConfigTypeData.getInstance()!!.DESCRIPTION, node.getChildNodes())!!
            


    
                        if(descriptionValueNode != 
                                    null
                                )
                        
                                    {
                                    
    var description: String = DomNodeHelper.getTextNodeValue(descriptionValueNode)!!
            


                                    }
                                

    var availableLogConfigTypes: BasicArrayList = LogConfigType.availableLogConfigTypes


    var size: Int = availableLogConfigTypes!!.size()!!
            


    var logConfigType: LogConfigType





                        for (index in 0 until size)


        {logConfigType= availableLogConfigTypes!!.get(index) as LogConfigType

    
                        if(logConfigType!!.getName()!!.compareTo(name) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return logConfigType

                                    }
                                
}




                            throw Exception("No Such LogConfigType: " +name)
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

