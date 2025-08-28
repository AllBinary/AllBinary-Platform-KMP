
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
        package org.allbinary.logic.visual.theme




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.control.validate.Validation
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class ThemesValidation : Validation
                , DomNodeInterface {
        

    private var themeVector: Vector
public constructor        ()

        Updates for KMP build        
        {
this.themeVector= Vector()
}

public constructor        (node: Node)

        Updates for KMP build        
        {
var node = node
}

public constructor        (hashMap: HashMap<Any, Any>)

        Updates for KMP build        
        {
var hashMap = hashMap
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

    var node: Node = document.createElement(ThemesData.getInstance()!!.NAME)!!


    var size: Int = themeVector!!.size!!





                        for (i in 0 until size)

        

        Updates for KMP build        
        {

    var themeDomNodeInterface: DomNodeInterface = themeVector!!.get(i) as DomNodeInterface

node.appendChild(themeDomNodeInterface!!.toXmlNode(document))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

