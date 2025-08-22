
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
        
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.directory.Directory
import org.allbinary.logic.visual.transform.TransformInterface
import org.allbinary.logic.visual.transform.data.TransformDocumentFactory
import org.allbinary.logic.visual.transform.data.TransformDocumentInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class DirectoryDataModel
            : Object
        
                , DomNodeInterface
                , TransformInterface {
        

    private val fileBasicArrayList: BasicArrayList

    private var transformDocumentInterface: TransformDocumentInterface
public constructor        (file: AbFile)
            : super()
        {

                    var file = file
this.fileBasicArrayList= Directory.getInstance()!!.search(file)
this.transformDocumentInterface= TransformDocumentFactory.getInstance() as TransformDocumentInterface
}


    var NO_TYPE: Int = 0

open fun getTypeId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NO_TYPE
}


                @Throws(Exception::class)
            
open fun getTransformInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun setTransformDocumentInterface(transformDocumentInterface: TransformDocumentInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var transformDocumentInterface = transformDocumentInterface
this.transformDocumentInterface= transformDocumentInterface
}


open fun getTransformDocumentInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformDocumentInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transformDocumentInterface
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var dirNode: Node = document.createElement("dir")!!


    var size: Int = this.fileBasicArrayList!!.size()!!


    var nextFile: AbFile


    var fileNode: Node





                        for (index in 0 until size)


        {nextFile= this.fileBasicArrayList!!.get(index) as AbFile
fileNode= FileDomDataModel(nextFile).
                            toXmlNode(document)
dirNode!!.appendChild(fileNode)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dirNode
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTransformDocumentInterface()!!.getDoc()
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
    var node: Node = this.toXmlNode(this.getTransformDocumentInterface()!!.getDoc())!!

this.getTransformDocumentInterface()!!.getBaseNode()!!.appendChild(node)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomDocumentHelper.toString(this.getTransformDocumentInterface()!!.getDoc())
}


}
                
            

