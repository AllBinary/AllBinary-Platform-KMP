
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
        package org.allbinary.business.time.modified




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.entry.EntryData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class TimeLastModifiedView
            : Object
        
                , DomNodeInterface {
        

    private var timeLastModified: TimeLastModified
public constructor        (timeLastModified: TimeLastModified)
            : super()
        

        Updates for KMP build        
        {
var timeLastModified = timeLastModified
this.setTimeLastModified(timeLastModified)
}

public constructor        (node: Node)
            : super()
        

        Updates for KMP build        
        {
var node = node
this.setTimeLastModified(TimeLastModified(DomNodeHelper.getTextNodeValue(node)))
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createTextNode(document, EntryData.getInstance()!!.TIMECREATED, this.getTimeLastModified()!!.toString())
}


open fun getTimeLastModified()
        //nullable = true from not(false or (false and true)) = true
: TimeLastModified

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return timeLastModified
}


open fun setTimeLastModified(timeLastModified: TimeLastModified)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var timeLastModified = timeLastModified
this.timeLastModified= timeLastModified
}


}
                
            

