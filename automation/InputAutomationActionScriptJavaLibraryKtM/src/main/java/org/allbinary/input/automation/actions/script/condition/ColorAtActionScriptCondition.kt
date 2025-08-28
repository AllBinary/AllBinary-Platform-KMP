
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
        package org.allbinary.input.automation.actions.script.condition




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.graphics.color.ColorCacheFactory
import org.allbinary.graphics.color.ColorCacheable
import org.allbinary.input.media.image.capture.CapturedBufferedImagesCacheSingleton
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.cache.AutomaticCacheInterface
import org.allbinary.media.image.analysis.ColorRange
import org.allbinary.media.image.analysis.ColorRangeInterface
import org.allbinary.media.image.cache.BufferedImageFrameCacheable
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class ColorAtActionScriptCondition : BasicProfileActionScriptCondition
                , ColorAtActionScriptConditionInterface {
        

        companion object {
            
    private val NAME: String = "If Color At"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var colorAtActionScriptConditionJPanel: ColorAtActionScriptConditionJPanel

    private var point: Point

    private var colorRangeInterface: ColorRangeInterface = ColorRange() as ColorRangeInterface
public constructor        (node: Node)                        

                            : super(ColorAtActionScriptCondition.NAME, node)

        Updates for KMP build        
        {
var node = node


                            //For kotlin this is before the body of the constructor.
                    
this.point= Point(0, 0)

    var actionNode: Node = DomSearchHelper.getNode(ColorAtActionScriptConditionData.NAME, node.getChildNodes())!!


    
                        if(actionNode != 
                                    null
                                )
                        
                                    {
                                    
    var nodeList: NodeList = actionNode!!.getChildNodes()!!





                        for (index in 0 until nodeList!!.getLength()!!)

        

        Updates for KMP build        
        {

    var childNode: Node = nodeList!!.item(index)!!


    
                        if(childNode!!.getNodeName()!!.compareTo(ColorAtActionScriptConditionData.LOCATION_X) == 0)
                        
                                    {
                                    
    var locationX: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.point.x= Integer(Integer.valueOf(locationX))

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(ColorAtActionScriptConditionData.LOCATION_Y) == 0)
                        
                                    {
                                    
    var locationY: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.point.y= Integer(Integer.valueOf(locationY))

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(ColorAtActionScriptConditionData.MIN_RED) == 0)
                        
                                    {
                                    
    var string: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.getColorRangeInterface()!!.setMinRed(string.valueOf())

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(ColorAtActionScriptConditionData.MAX_RED) == 0)
                        
                                    {
                                    
    var string: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.getColorRangeInterface()!!.setMaxRed(string.valueOf())

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(ColorAtActionScriptConditionData.MIN_GREEN) == 0)
                        
                                    {
                                    
    var string: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.getColorRangeInterface()!!.setMinGreen(string.valueOf())

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(ColorAtActionScriptConditionData.MAX_GREEN) == 0)
                        
                                    {
                                    
    var string: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.getColorRangeInterface()!!.setMaxGreen(string.valueOf())

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(ColorAtActionScriptConditionData.MIN_BLUE) == 0)
                        
                                    {
                                    
    var string: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.getColorRangeInterface()!!.setMinBlue(string.valueOf())

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(ColorAtActionScriptConditionData.MAX_BLUE) == 0)
                        
                                    {
                                    
    var string: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.getColorRangeInterface()!!.setMaxBlue(string.valueOf())

                                    }
                                
}


                                    }
                                
                        else {
                            


                            throw Exception("Color At Action Script Condition Node Null")

                        }
                            
this.init()
}

public constructor        ()                        

                            : super(ColorAtActionScriptCondition.NAME)

        Updates for KMP build        
        {


                            //For kotlin this is before the body of the constructor.
                    
this.point= Point(0, 0)
this.init()
}


open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.colorAtActionScriptConditionJPanel= ColorAtActionScriptConditionJPanel(this)
}


open fun getPoint()
        //nullable = true from not(false or (false and true)) = true
: Point

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return point
}


open fun setPoint(point: Point)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var point = point
this.point= point
}


open fun showDialog()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.colorAtActionScriptConditionJPanel!!.getColorAtActionJDialog()!!.setVisible(true)
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(ColorAtActionScriptConditionData.LOCATION_X, Integer.toString(this.getPoint()!!.x))
hashMap!!.put(ColorAtActionScriptConditionData.LOCATION_Y, Integer.toString(this.getPoint()!!.y))
hashMap!!.put(ColorAtActionScriptConditionData.MIN_RED, Integer.toString(this.getColorRangeInterface()!!.getMinRed()))
hashMap!!.put(ColorAtActionScriptConditionData.MAX_RED, Integer.toString(this.getColorRangeInterface()!!.getMaxRed()))
hashMap!!.put(ColorAtActionScriptConditionData.MIN_GREEN, Integer.toString(this.getColorRangeInterface()!!.getMinGreen()))
hashMap!!.put(ColorAtActionScriptConditionData.MAX_GREEN, Integer.toString(this.getColorRangeInterface()!!.getMaxGreen()))
hashMap!!.put(ColorAtActionScriptConditionData.MIN_BLUE, Integer.toString(this.getColorRangeInterface()!!.getMinBlue()))
hashMap!!.put(ColorAtActionScriptConditionData.MAX_BLUE, Integer.toString(this.getColorRangeInterface()!!.getMaxBlue()))
logUtil!!.put("HashMap: " +hashMap!!.toString(), this, "toHashMap()")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

    var node: Node = super.toXmlNode(document)!!

node.appendChild(ModDomHelper.createNodeWithValueNodes(document, ColorAtActionScriptConditionData.NAME, this.toHashMap()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
open fun shouldProcess(frame: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var frame = frame

    var capturedBufferedImageCacheable: BufferedImageFrameCacheable = 
                                    (getInstance as AutomaticCacheInterface).get(frame.concatToString()

                                    ) as BufferedImageFrameCacheable


    var bufferedImage: BufferedImage = capturedBufferedImageCacheable!!.getBufferedImage()!!


    var automaticCacheInterface: AutomaticCacheInterface = ColorCacheFactory.getInstance()!!


    var colorInteger: Integer = Integer(Integer.valueOf(bufferedImage!!.getRGB(this.getPoint()!!.x, this.getPoint()!!.y)))!!


    var colorCacheable: ColorCacheable = automaticCacheInterface!!.get(colorInteger) as ColorCacheable


    var color: Color = colorCacheable!!.getColor()!!


    
                        if(this.colorRangeInterface!!.isInRange(color))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.shouldProcess(frame)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun log()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var message: String = "getPoint(): " +this.getPoint() +"\n" +this.getColorRangeInterface()!!.toString()

logUtil!!.put(message, this, "log")
}


open fun getColorRangeInterface()
        //nullable = true from not(false or (false and true)) = true
: ColorRangeInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorRangeInterface
}


open fun setColorRangeInterface(colorRangeInterface: ColorRangeInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var colorRangeInterface = colorRangeInterface
this.colorRangeInterface= colorRangeInterface
}


}
                
            

