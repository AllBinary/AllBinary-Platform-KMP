
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
        package org.allbinary.input.automation.module.generic.configuration.profile




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.input.media.image.InputImageType
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class GenericProfileDataWorkerType
            : Object
        
                , GenericProfileDataWorkerTypeInterface {
        
companion object {
            
    private var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

    var SAVED_CAPTURE: GenericProfileDataWorkerType = SavedCaptureGenericProfileDataWorkerType.SAVED_CAPTURE

    var SCREEN_CAPTURE: GenericProfileDataWorkerType = GenericProfileDataWorkerType("Screen " +InputImageType.CAPTURE.getName())

    var COMPARISON: GenericProfileDataWorkerType = GenericProfileDataWorkerType(InputImageType.COMPARISON.getName())

    var MOTION: GenericProfileDataWorkerType = GenericProfileDataWorkerType(InputImageType.MOTION.getName())

    open fun getInstance(node: Node)
        //nullable =  from not(true or (false and false)) = 
: GenericProfileDataWorkerType{
var node = node

    var name: String = DomNodeHelper.getTextNodeValue(node)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap!!.get(name as Object) as GenericProfileDataWorkerType
}


        }
            
    private var name: String
public constructor (name: String)
            : super()
        {
var name = name
this.setName(name)
hashMap!!.put(this.getName(), this)
}


    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


    open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{
var name = name
this.name= name
}


                @Throws(Exception::class)
            
    open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var node: Node = ModDomHelper.createTextNode(document, GenericProfileDataWorkerData.NAME, name)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "GenericProfileDataWorkerType: " +this.getName()
}


}
                
            

