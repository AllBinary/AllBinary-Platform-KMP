
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
        package org.allbinary.logic.communication.smtp



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.data.tree.dom.BasicErrorNodeUtil
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class EmailsNotUsed
            : Object
        
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    var emailInfoVector: Vector
public constructor        ()
            : super()
        {this.emailInfoVector= Vector()
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PAYMENT))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, 
                            "toXmlNode")

                                    }
                                

    var node: Node = document.createElement(EmailData.NAME)!!
            


    var size: Int = emailInfoVector!!.size!!
            





                        for (index in 0 until size)


        {
    var email: Email = emailInfoVector!!.get(index) as Email


    var emailNode: Node = email.toXmlNode(document)!!
            


    
                        if(emailNode != 
                                    null
                                )
                        
                                    {
                                    node.appendChild(emailNode)

                                    }
                                
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PAYMENT))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.END, this, 
                            "toXmlNode()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "toXmlNode()", e)

                                    }
                                

    var error: String = "Error Processing Order.  Please contact us if error persists.<p/>"




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicErrorNodeUtil.get(document, error)
}

}


}
                
            

