
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
        package org.allbinary.business.time.created




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.entry.EntryData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class TimeCreatedView
            : Object
        
                , DomNodeInterface {
        

    private var timeCreated: TimeCreated
public constructor (timeCreated: TimeCreated)
            : super()
        {
var timeCreated = timeCreated
this.setTimeCreated(timeCreated)
}

public constructor (node: Node)
            : super()
        {
var node = node
this.setTimeCreated(TimeCreated(DomNodeHelper.getTextNodeValue(node)))
}


                @Throws(Exception::class)
            
    open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createTextNode(document, EntryData.getInstance()!!.TIMECREATED, this.getTimeCreated()!!.toString())
}


    open fun getTimeCreated()
        //nullable = true from not(false or (false and true)) = true
: TimeCreated{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return timeCreated
}


    open fun setTimeCreated(timeCreated: TimeCreated)
        //nullable = true from not(false or (false and false)) = true
{
var timeCreated = timeCreated
this.timeCreated= timeCreated
}


}
                
            

