
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
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class ImageActionScriptOutput : BasicProfileActionScriptOutput
                , ImageActionScriptOutputInterface {
        

        companion object {
            
    private val NAME: String = "Captures"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var saved: Boolean = false

    private var display: Boolean = false

    private var imageTypes: ImageTypes

    private var actionScriptOutputJPanel: ImageActionScriptOutputJPanel
public constructor        (node: Node)                        

                            : super(NAME, node){

                    var node = node


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)

    var actionNode: Node = DomSearchHelper.getNode(ImageActionScriptOutputData.NAME, node.getChildNodes())!!


    
                        if(actionNode != 
                                    null
                                )
                        
                                    {
                                    
    var nodeList: NodeList = actionNode!!.getChildNodes()!!





                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var childNode: Node = nodeList!!.item(index)!!


    
                        if(childNode!!.getNodeName()!!.compareTo(ImageActionScriptOutputData.SAVE) == 0)
                        
                                    {
                                    
    var booleanString: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.setSaved(.
                            )

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(ImageActionScriptOutputData.DISPLAY) == 0)
                        
                                    {
                                    
    var booleanString: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.setSaved(.
                            )

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(ImageActionScriptOutputData.TYPES) == 0)
                        
                                    {
                                    this.setImageTypes(ImageTypes(childNode))

                                    }
                                
                        else {
                            


                            throw Exception("Action Script Output Unknown Node")

                        }
                            
}


                                    }
                                
                        else {
                            


                            throw Exception("Action Script Output Node Null")

                        }
                            
this.setAllowsChildren(false)
this.actionScriptOutputJPanel= ImageActionScriptOutputJPanel(this)
}

public constructor        ()                        

                            : super(NAME){

                            //For kotlin this is before the body of the constructor.
                    
this.setImageTypes(ImageTypes())
this.setAllowsChildren(false)
this.actionScriptOutputJPanel= ImageActionScriptOutputJPanel(this)
}


open fun getActionScriptOutputJPanel()
        //nullable = true from not(false or (false and true)) = true
: ImageActionScriptOutputJPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return actionScriptOutputJPanel
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(ImageActionScriptOutputData.DISPLAY, Boolean.toString(this.isDisplay()))
hashMap!!.put(ImageActionScriptOutputData.SAVE, Boolean.toString(this.isSaved()))
logUtil!!.put("HashMap: " +hashMap!!.toString(), this, "toHashMap()")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = super.toXmlNode(document)!!


    var newNode: Node = ModDomHelper.createNodeWithValueNodes(document, ImageActionScriptOutputData.NAME, this.toHashMap())!!

newNode!!.appendChild(this.getImageTypes()!!.toXmlNode(document))
node.appendChild(newNode)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
open fun process(frame: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var frame = frame
ImageActionScriptOutputProcessor.process(this, frame)
}


open fun showDialog()
        //nullable = true from not(false or (false and true)) = true
{this.actionScriptOutputJPanel!!.getCapturedImageActionJDialog()!!.setVisible(true)
}


open fun isSaved()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return saved
}


open fun setSaved(saved: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var saved = saved
this.saved= saved
}


open fun isDisplay()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return display
}


open fun setDisplay(display: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var display = display
this.display= display
}


open fun future_toString()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(" Is Save: ")
stringBuffer!!.append(this.isSaved())
stringBuffer!!.append(" Is Display: ")
stringBuffer!!.append(this.isDisplay())
stringBuffer!!.append(" ")
stringBuffer!!.append(this.getImageTypes()!!.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun log()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(this.future_toString(), this, "log")
}


open fun getImageTypes()
        //nullable = true from not(false or (false and true)) = true
: ImageTypes{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageTypes
}


open fun setImageTypes(imageTypes: ImageTypes)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageTypes = imageTypes
this.imageTypes= imageTypes
}


}
                
            

