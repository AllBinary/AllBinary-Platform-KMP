
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
        
import org.allbinary.data.tree.dom.DomNodeInterface
import org.w3c.dom.Attr
import org.w3c.dom.Document
import org.w3c.dom.NamedNodeMap
import org.w3c.dom.Node

open public class TransformInfoDomNodeView : TransformInfoDomNode
                , DomNodeInterface {
        
public constructor        (transformInfoInterface: TransformInfoInterface, mapping: String)                        

                            : super(transformInfoInterface, mapping)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface
var mapping = mapping


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (name: String, mappedName: String)                        

                            : super(name, mappedName)

        Updates for KMP build        
        {
var name = name
var mappedName = mappedName


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (name: String)                        

                            : super(name, 
                            null)

        Updates for KMP build        
        {
var name = name


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

    var transformInfoData: TransformInfoData = TransformInfoData.getInstance()!!


    var subViewNode: Node = document.createElement(transformInfoData!!.NAME)!!


    var viewNameAttr: Attr = document.createAttribute(transformInfoData!!.NAME)!!

viewNameAttr!!.setValue(this.getTransformInfoInterface()!!.getName())

    var componentNodeAttributes: NamedNodeMap = subViewNode!!.getAttributes()!!

componentNodeAttributes!!.setNamedItem(viewNameAttr)

    
                        if(this.getMappedName() != 
                                    null
                                )
                        
                                    {
                                    
    var mappedNameAttr: Attr = document.createAttribute(transformInfoData!!.MAPPED)!!

mappedNameAttr!!.setValue(this.getMappedName())
componentNodeAttributes!!.setNamedItem(mappedNameAttr)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return subViewNode
}


}
                
            

