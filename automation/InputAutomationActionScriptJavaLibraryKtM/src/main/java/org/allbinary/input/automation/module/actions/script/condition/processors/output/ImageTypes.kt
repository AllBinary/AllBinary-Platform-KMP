
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
        package org.allbinary.input.automation.module.actions.script.condition.processors.output




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.input.media.image.InputImageType
import org.allbinary.logic.string.StringMaker
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class ImageTypes
            : Object
         {
        

        companion object {
            
open fun valueOf(anyType: Array<Any?>)
        //nullable = true from not(false or (false and false)) = true
: ImageTypes

        Updates for KMP build        
        {
var anyType = anyType

    var imageTypes: ImageTypes = ImageTypes()





                        for (index in 0 until anyType!!.size)

        

        Updates for KMP build        
        {

    var imageType: InputImageType = InputImageType.getInstance(anyType[index]!! as String)!!

imageTypes!!.getVector()!!.add(imageType)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageTypes
}


        }
            
    private var vector: Vector = Vector()
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
}

public constructor        (node: Node)
            : super()
        

        Updates for KMP build        
        {
var node = node

    var nodeList: NodeList = node.getChildNodes()!!





                        for (index in 0 until nodeList!!.getLength()!!)

        

        Updates for KMP build        
        {

    var childNode: Node = nodeList!!.item(index)!!


    
                        if(childNode!!.getNodeName()!!.compareTo(ImageActionScriptOutputData.TYPE) == 0)
                        
                                    {
                                    
    var nextImageTypeString: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.getVector()!!.add(InputImageType.getInstance(nextImageTypeString))

                                    }
                                
                        else {
                            


                            throw Exception("ImageTypes Unknown Node")

                        }
                            
}

}


open fun getVector()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

    var newNode: Node = document.createElement(ImageActionScriptOutputData.TYPES)!!


    var size: Int = vector.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var imageType: InputImageType = vector.get(index) as InputImageType

newNode!!.appendChild(ModDomHelper.createTextNode(document, ImageActionScriptOutputData.TYPE, imageType!!.getName()))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newNode
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("ImageTypes: ")

    var size: Int = vector.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var imageType: InputImageType = vector.get(index) as InputImageType

stringBuffer!!.append(imageType!!.getName())

    
                        if(index < size -1)
                        stringBuffer!!.append(", ")
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

