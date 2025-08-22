
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
        package org.allbinary.data.tree.dom




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tables.TableMappingInterface
import org.allbinary.logic.io.file.AbFile
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class FileDomDataModel
            : Object
        
                , DomNodeInterface {
        

    private var file: AbFile
public constructor        (file: AbFile)
            : super()
        {

                    var file = file
this.file= file
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var tableMappingInterface: TableMappingInterface = FileTableMapping(this.file) as TableMappingInterface


    var hashMap: HashMap<Any, Any> = tableMappingInterface!!.toHashMap()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNodeWithValueNodes(document, "file", hashMap)
}


}
                
            

