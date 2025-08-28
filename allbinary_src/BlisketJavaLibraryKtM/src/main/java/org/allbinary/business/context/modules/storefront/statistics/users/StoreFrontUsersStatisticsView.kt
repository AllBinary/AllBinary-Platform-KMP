
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
        package org.allbinary.business.context.modules.storefront.statistics.users




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class StoreFrontUsersStatisticsView
            : Object
        
                , DomNodeInterface {
        

    private var storeFrontUsersStatisticsInterface: StoreFrontUsersStatisticsInterface
public constructor        (storeFrontUsersStatisticsInterface: StoreFrontUsersStatisticsInterface)
            : super()
        {
var storeFrontUsersStatisticsInterface = storeFrontUsersStatisticsInterface
this.storeFrontUsersStatisticsInterface= storeFrontUsersStatisticsInterface
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var hashMap: HashMap<Any, Any> = this.storeFrontUsersStatisticsInterface!!.toHashMap()!!


    var node: Node = ModDomHelper.createNameValueNodes(document, StoreFrontUsersStatisticsData.getInstance()!!.NAME, hashMap)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

