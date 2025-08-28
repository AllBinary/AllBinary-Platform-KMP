
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
        package views.generic.user




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.user.UserDomNode
import org.allbinary.business.user.UsersData
import org.allbinary.business.user.modules.User
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView

open public class UsersView : HttpStoreComponentView
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    var userVector: Vector
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

        try {
            
    var usersNode: Node = document.createElement(UsersData.NAME)!!


    var size: Int = userVector!!.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var userInterface: User = userVector!!.get(index) as User


    
                        if(userInterface != 
                                    null
                                )
                        
                                    {
                                    
    var node: Node = UserDomNode(userInterface).
                            toXmlNode(document)!!

usersNode!!.appendChild(node)

                                    }
                                
                        else {
                            logUtil!!.put("UserHelper", this, "toXmlNode")

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return usersNode
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XSLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "toXmlNode", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.addDomNodeInterface(this as DomNodeInterface)
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            this.addDomNodeInterfaces()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.view()
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

