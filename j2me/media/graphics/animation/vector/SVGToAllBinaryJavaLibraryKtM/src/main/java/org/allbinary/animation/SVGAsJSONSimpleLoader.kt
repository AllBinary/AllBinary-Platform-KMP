
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
        package org.allbinary.animation




        import java.lang.Object        
        
        import java.lang.Math
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Enumeration
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.math.PositionStrings
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD
import org.json.me.JSONArray
import org.json.me.JSONException
import org.json.me.JSONObject

open public class SVGAsJSONSimpleLoader
            : Object
         {
        
companion object {
            
    private val instance: SVGAsJSONSimpleLoader = SVGAsJSONSimpleLoader()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SVGAsJSONSimpleLoader{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


                @Throws(Exception::class)
            
    open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var args = args

    var svgAsJson: String = "{\"svg\": {\n" +"    \"rect\": {\n" +"        \"width\": 20,\n" +"        \"fill\": \"#008c00\",\n" +"        \"height\": 20\n" +"    },\n" +"    \"xmlns\": \"http://www.w3.org/2000/svg\",\n" +"    \"width\": 20,\n" +"    \"height\": 20\n" +"}}\n"


    var points: Array<IntArray?> = SVGAsJSONSimpleLoader.getInstance()!!.load(svgAsJson)!!


    var stringBuilder: StringMaker = StringMaker()


    var size: Int = points.size
                





                        for (index in 0 until size)

        {

    var size2: Int = points[index]!!.size
                





                        for (index2 in 0 until size2)

        {
stringBuilder!!.appendint(points[index]!![index2]!!)
stringBuilder!!.append(CommonSeps.getInstance()!!.COMMA)
}

}

System.out.println(stringBuilder!!.toString())
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val shapeTypeFactory: ShapeTypeFactory = ShapeTypeFactory.getInstance()!!

    private val KEY_SVG: String = "svg"

    private val KEY_X1: String = "x1"

    private val KEY_Y1: String = "y1"

    private val KEY_X2: String = "x2"

    private val KEY_Y2: String = "y2"

    private val KEY_CX: String = "cx"

    private val KEY_CY: String = "cy"

    private val KEY_R: String = "r"

    private val KEY_X: String = PositionStrings.getInstance()!!.X

    private val KEY_Y: String = PositionStrings.getInstance()!!.Y

    private val KEY_WIDTH: String = "width"

    private val KEY_HEIGHT: String = "height"

    private val ERROR_PARSE_SVG_JSON: String = "Unable to parse SVG JSON"

    private val ERROR_MISSING_KEY_PREFIX: String = "Missing key: "

    private val ERROR_INVALID_NUMBER_PREFIX: String = "Invalid number for key: "

    private val ERROR_EXPECTED_OBJECT_PREFIX: String = "Expected object for: "

    private val EMPTY_POINTS: Array<IntArray?> = PrimitiveIntUtil.getTwoDimensionalArrayInstance()!!

    private val SHAPE_SEPARATOR: IntArray = intArrayOf(1000,1000)

    private val CIRCLE_SEGMENTS: Int = 16

                @Throws(Exception::class)
            
    open fun load(svgAsJson: String)
        //nullable = true from not(false or (false and false)) = true
: Array<IntArray?>{
    //var svgAsJson = svgAsJson

    
                        if(svgAsJson == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EMPTY_POINTS

                                    }
                                

        try {
            
    var root: JSONObject = JSONObject(svgAsJson)


    var svgValue: Any = root.opt(KEY_SVG)!!


    var svg: JSONObject = if(svgValue == 
                                    null
                                ) {
                            
                            root
                        
                            } else {
                            this.asObject(svgValue, KEY_SVG)
                            }
    


    var pointVector: BasicArrayList = BasicArrayListD()


    var keys: Enumeration<Any?> = svg.keys()!!


        while(keys.hasMoreElements())
        {

    var key: String = keys.nextElement()!! as String


    var value: Any = svg.opt(key)!!


    
                        if(this.shapeTypeFactory!!.KEY_LINE.equals(key))
                        
                                    {
                                    this.addShapes(pointVector, value, this.shapeTypeFactory!!.LINE)

                                    }
                                
                             else 
    
                        if(this.shapeTypeFactory!!.equals(key))
                        
                                    {
                                    this.addShapes(pointVector, value, this.shapeTypeFactory!!.CIRCLE)

                                    }
                                
                             else 
    
                        if(this.shapeTypeFactory!!.KEY_RECT.equals(key) || this.shapeTypeFactory!!.KEY_RECTANGLE.equals(key))
                        
                                    {
                                    this.addShapes(pointVector, value, this.shapeTypeFactory!!.RECTANGLE)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.toPoints(pointVector)
} catch(e: JSONException)
            {



                            throw IllegalArgumentException(ERROR_PARSE_SVG_JSON, e)
}

}


                @Throws(Exception::class)
            
    open fun addShapes(pointVector: BasicArrayList, value: Any, shapeType: ShapeType)
        //nullable = true from not(false or (false and false)) = true
{
    //var pointVector = pointVector
    //var value = value
    //var shapeType = shapeType

    
                        if(value is JSONArray)
                        
                                    {
                                    
    var array: JSONArray = value as JSONArray


    var size: Int = array.length()!!





                        for (index in 0 until size)

        {
this.addShape(pointVector, array.opt(index), shapeType)
}


                                    }
                                
                        else {
                            this.addShape(pointVector, value, shapeType)

                        }
                            
}


                @Throws(Exception::class)
            
    open fun addShape(pointVector: BasicArrayList, value: Any, shapeType: ShapeType)
        //nullable = true from not(false or (false and false)) = true
{
    //var pointVector = pointVector
    //var value = value
    //var shapeType = shapeType

    var shape: JSONObject = this.asObject(value, shapeType!!.getName())!!


    
                        if(shapeType == this.shapeTypeFactory!!.LINE)
                        
                                    {
                                    this.addLine(pointVector, shape)

                                    }
                                
                             else 
    
                        if(shapeType == this.shapeTypeFactory!!.CIRCLE)
                        
                                    {
                                    this.addCircle(pointVector, shape)

                                    }
                                
                        else {
                            this.addRectangle(pointVector, shape)

                        }
                            
}


                @Throws(Exception::class)
            
    open fun addLine(pointVector: BasicArrayList, line: JSONObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var pointVector = pointVector
    //var line = line
this.addPoint(pointVector, this.readInt(line, KEY_X1), this.readInt(line, KEY_Y1))
this.addPoint(pointVector, this.readInt(line, KEY_X2), this.readInt(line, KEY_Y2))
this.addSeparator(pointVector)
}


                @Throws(Exception::class)
            
    open fun addCircle(pointVector: BasicArrayList, circle: JSONObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var pointVector = pointVector
    //var circle = circle

    var cx: Int = this.readInt(circle, KEY_CX)!!


    var cy: Int = this.readInt(circle, KEY_CY)!!


    var radius: Int = this.readInt(circle, KEY_R)!!





                        for (index in 0 until CIRCLE_SEGMENTS)

        {

    var angle: Double = (Math.PI *2.0d *index) /CIRCLE_SEGMENTS


    var x: Int = Math.round(cx +(Math.cos(angle) *radius)).toInt()


    var y: Int = Math.round(cy +(Math.sin(angle) *radius)).toInt()

this.addPoint(pointVector, x, y)
}

this.addSeparator(pointVector)
}


                @Throws(Exception::class)
            
    open fun addRectangle(pointVector: BasicArrayList, rectangle: JSONObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var pointVector = pointVector
    //var rectangle = rectangle

    var x: Int = this.readInt(rectangle, KEY_X, 0)!!


    var y: Int = this.readInt(rectangle, KEY_Y, 0)!!


    var width: Int = this.readInt(rectangle, KEY_WIDTH)!!


    var height: Int = this.readInt(rectangle, KEY_HEIGHT)!!

this.addPoint(pointVector, x, y)
this.addPoint(pointVector, x +width, y)
this.addPoint(pointVector, x +width, y +height)
this.addPoint(pointVector, x, y +height)
this.addPoint(pointVector, x, y)
this.addSeparator(pointVector)
}


    open fun addPoint(pointVector: BasicArrayList, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var pointVector = pointVector
    //var x = x
    //var y = y
pointVector!!.add(intArrayOf(x,y))
}


    open fun addSeparator(pointVector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var pointVector = pointVector
pointVector!!.add(intArrayOf(SHAPE_SEPARATOR[0],SHAPE_SEPARATOR[1]))
}


                @Throws(Exception::class)
            
    open fun readInt(anyType: JSONObject, key: String)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var anyType = anyType
    //var key = key

    var value: Any = anyType!!.get(key)!!


    
                        if(value == 
                                    null
                                )
                        
                                    {
                                    


                            throw IllegalArgumentException(ERROR_MISSING_KEY_PREFIX +key)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.toInt(value, key)
}


    open fun readInt(anyType: JSONObject, key: String, defaultValue: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var anyType = anyType
    //var key = key
    //var defaultValue = defaultValue

        try {
            
    
                        if(anyType!!.has(key))
                        
                                    {
                                    
    var value: Any = anyType!!.get(key)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.toInt(value, key)

                                    }
                                
} catch(e: Exception)
            {
e.printStackTrace()
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultValue
}


    open fun toInt(value: Any, key: String)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var value = value
    //var key = key

    
                        if(value is Number)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Math.round(
                                    (value as Number).doubleValue()).toInt()

                                    }
                                

    
                        if(value is String)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Math.round((value as String).toDouble()).toInt()

                                    }
                                



                            throw IllegalArgumentException(ERROR_INVALID_NUMBER_PREFIX +key)
}


    open fun asObject(value: Object, name: Object)
        //nullable = true from not(false or (false and false)) = true
: JSONObject{
    //var value = value
    //var name = name

    
                        if(value is JSONObject)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value as JSONObject

                                    }
                                



                            throw IllegalArgumentException(ERROR_EXPECTED_OBJECT_PREFIX +name)
}


    open fun toPoints(pointVector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Array<IntArray?>{
    //var pointVector = pointVector

    
                        if(pointVector!!.size() == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EMPTY_POINTS

                                    }
                                

    var points: Array<IntArray?> = Array(pointVector!!.size()) { IntArray(2) }





                        for (index in 0 until pointVector!!.size()!!)

        {

    var point: IntArray = pointVector!!.get(index)
                        //Otherwise - castExpression - ArrayType - INT


points[index]= point
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return points
}


}
                
            

