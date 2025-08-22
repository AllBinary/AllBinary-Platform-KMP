
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
        package org.allbinary.input.automation.actions.script.condition.processors.input




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.event.KeyEvent
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.input.KeySingletonFactory
import org.allbinary.input.KeyUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class KeyboardActionScriptInput : BasicProfileActionScriptInput
                , KeyboardActionScriptInputInterface {
        

        companion object {
            
    private val NAME: String = "Keyboard"

open fun getText(integerArray: Array<Integer?>)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var integerArray = integerArray

    var index: Int = 0


    var stringBuffer: StringMaker = StringMaker()


        while(index < integerArray!!.size)
        {
    var nextInteger: Integer = integerArray[index]!!


    
                        if(KeyUtil.isNormallyDisplayed(nextInteger))
                        
                                    {
                                    stringBuffer!!.append(KeyEvent.getKeyText(nextInteger))

                                    }
                                
                        else {
                            stringBuffer!!.append("&#" +nextInteger +";")

                        }
                            
index++
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var keyArray: Array<Integer?> = arrayOf(KeySingletonFactory.getInstance(KeyEvent.VK_0))

    private var keyboardActionScriptInputJPanel: KeyboardActionScriptInputJPanel

    private var press: Boolean= false

    private var release: Boolean= false

    private var delayBetweenKeys: Int= 0
public constructor        (node: Node)                        

                            : super(NAME, node){

                    var node = node


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)

    var actionNode: Node = DomSearchHelper.getNode(KeyboardActionScriptInputData.NAME, node.getChildNodes())!!


    
                        if(actionNode != 
                                    null
                                )
                        
                                    {
                                    
    var nodeList: NodeList = actionNode!!.getChildNodes()!!


    var vector: Vector = Vector()





                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var childNode: Node = nodeList!!.item(index)!!


    
                        if(childNode!!.getNodeName()!!.startsWith(KeyboardActionScriptInputData.KEY))
                        
                                    {
                                    
    var keyString: String = DomNodeHelper.getTextNodeValue(childNode)!!

vector.add(keyString.valueOf())

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(KeyboardActionScriptInputData.DELAY_BETWEEN_KEYS) == 0)
                        
                                    {
                                    
    var time: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.setDelayBetweenKeys(Integer.valueOf(time)!!.toInt())

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(KeyboardActionScriptInputData.PRESS) == 0)
                        
                                    {
                                    
    var value: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.setPress(value.concatToString()

                                    )

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(KeyboardActionScriptInputData.RELEASE) == 0)
                        
                                    {
                                    
    var value: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.setRelease(value.concatToString()

                                    )

                                    }
                                
                        else {
                            


                            throw Exception("Action Script Input Unknown Node")

                        }
                            
}

this.setKeyArray(vector.toArray(arrayOfNulls(vector.size)) as Array<Integer?>)

                                    }
                                
                        else {
                            


                            throw Exception("Action Script Input Node Null")

                        }
                            
this.setAllowsChildren(false)

    
                        if(!this.isPress() && !this.isRelease())
                        
                                    {
                                    this.setNormal()

                                    }
                                
this.keyboardActionScriptInputJPanel= KeyboardActionScriptInputJPanel(this)
}

public constructor        ()                        

                            : super(NAME){

                            //For kotlin this is before the body of the constructor.
                    

    
                        if(!this.isPress() && !this.isRelease())
                        
                                    {
                                    this.setNormal()

                                    }
                                
this.setAllowsChildren(false)
this.setTime(120)
this.keyboardActionScriptInputJPanel= KeyboardActionScriptInputJPanel(this)
}


open fun getDelayBetweenKeys()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.delayBetweenKeys
}


open fun setDelayBetweenKeys(delayBetweenKeys: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var delayBetweenKeys = delayBetweenKeys
this.delayBetweenKeys= delayBetweenKeys
}


open fun isPress()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.press
}


open fun setPress(press: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var press = press
this.press= press
}


open fun isRelease()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.release
}


open fun setRelease(release: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var release = release
this.release= release
}


open fun isNormal()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isRelease() && this.isPress()
}


open fun setNormal()
        //nullable = true from not(false or (false and true)) = true
{this.setPress(true)
this.setRelease(true)
}


open fun getKeyArray()
        //nullable = true from not(false or (false and true)) = true
: Array<Integer?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyArray
}


open fun setKeyArray(keyArray: Array<Integer?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyArray = keyArray

    
                        if(keyArray != 
                                    null
                                )
                        logUtil!!.put(CommonLabels.getInstance()!!.START +keyArray!!.size, this, "setKeyArray")
this.keyArray= keyArray
}


open fun showDialog()
        //nullable = true from not(false or (false and true)) = true
{this.keyboardActionScriptInputJPanel!!.getKeyActionJDialog()!!.setVisible(true)
}


open fun getText()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getText(this.getKeyArray())
}


open fun setText(text: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var text = text
logUtil!!.put(CommonLabels.getInstance()!!.START +text, this, "setText")

    var integerArray: Array<Integer?> = this.integerArrayValue(text)!!

this.setKeyArray(integerArray)
}


open fun integerArrayValue(text: String)
        //nullable = true from not(false or (false and false)) = true
: Array<Integer?>{

                    var text = text
logUtil!!.put(CommonLabels.getInstance()!!.START +text, this, "integerArrayValue")

    var vector: Vector = Vector()


    var index: Int = 0


        while(index < text.length)
        {
    var aChar: Char = text[index]!!


    
                        if(aChar == '&')
                        
                                    {
                                    
    
                        if(text[index +1] == '#')
                        
                                    {
                                    
    var endIndex: Int = text.indexOf(';', index +1)!!


    
                        if(endIndex !=  -1)
                        
                                    {
                                    
    var nextCharString: String = text.substring(index +2, endIndex)!!

logUtil!!.put("Next Char String: " +nextCharString, this, "integerArrayValue")
vector.add(substring.valueOf())
index= index +nextCharString!!.length +3


                        continue
                    

                                    }
                                

                                    }
                                

                                    }
                                
vector.add(KeySingletonFactory.getHashtable()!!.get(aChar.concatToString()

                                    ))
index++
}


    var integerArray: Array<Integer?> = vector.toArray(arrayOfNulls(vector.size)) as Array<Integer?>




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return integerArray
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()





                        for (index in 0 until this.getKeyArray()!!.length)


        {hashMap!!.put(KeyboardActionScriptInputData.KEY +index, Integer.toString(this.getKeyArray()[index]!!))
}

hashMap!!.put(KeyboardActionScriptInputData.DELAY_BETWEEN_KEYS, Integer.toString(this.getDelayBetweenKeys()))
hashMap!!.put(KeyboardActionScriptInputData.PRESS, Boolean.toString(this.isPress()))
hashMap!!.put(KeyboardActionScriptInputData.RELEASE, Boolean.toString(this.isRelease()))
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

node.appendChild(ModDomHelper.createNodeWithValueNodes(document, KeyboardActionScriptInputData.NAME, this.toHashMap()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
open fun process(frame: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var frame = frame
KeyboardInputAutomationProcessor.process(this)
}


open fun log()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(this.toString(), this, "log")
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(super.toString())
stringBuffer!!.append(" Text: ")
stringBuffer!!.append(this.getText())
stringBuffer!!.append(" isPress: ")
stringBuffer!!.append(this.isPress())
stringBuffer!!.append(" isRelease: ")
stringBuffer!!.append(this.isRelease())
stringBuffer!!.append(" Between Key Delay: ")
stringBuffer!!.append(this.getDelayBetweenKeys())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

