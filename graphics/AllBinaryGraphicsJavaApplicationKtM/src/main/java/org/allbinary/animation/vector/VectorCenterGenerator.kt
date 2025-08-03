
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
        package org.allbinary.animation.vector



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.j2me.workarea.tools.GraphicItemInterface
import org.allbinary.graphics.j2me.workarea.tools.LinesGraphicItem
import org.allbinary.graphics.j2me.workarea.tools.Points
import org.allbinary.graphics.pipeline.BasicGraphicsPipeline
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class VectorCenterGenerator
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun translate(list: BasicArrayList, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var list = list


                    var x = x


                    var y = y

    var graphicsPipe: BasicGraphicsPipeline = BasicGraphicsPipeline(list)

graphicsPipe!!.createMatrix()
graphicsPipe!!.translate(x, y)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return graphicsPipe!!.getMatrix()
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    var minX: Int = Integer.MAX_VALUE

    var minY: Int = Integer.MAX_VALUE

    var maxX: Int = Integer.MIN_VALUE

    var maxY: Int = Integer.MIN_VALUE

    private var dx: Int = 0

    private var dy: Int = 0

    private var width: Int= 0

    private var height: Int= 0
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun calculate(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashMap = hashMap

    var graphicItemArray: Array<Any?> = hashMap!!.keySet()!!.toArray()!!
            


    var size: Int = graphicItemArray!!.size
                





                        for (index in 0 until size)


        {
    var item: GraphicItemInterface = hashMap!!.get(graphicItemArray[index]!!) as GraphicItemInterface


    
                        if(item!!.getName() == LinesGraphicItem.getStaticName())
                        
                                    {
                                    this.getInstance(item!!.getPointsInterface()!!.getPoints())

                                    }
                                
}

logUtil!!.put("minX: " +minX +" minY: " +minY +" maxX: " +maxX +" maxY: " +maxY, this, commonStrings!!.GET_INSTANCE)
setWidth(maxX -minX)
setHeight(maxY -minY)

    var max: Int = getWidth()!!
            


    
                        if(getHeight() > max)
                        
                                    {
                                    max= getHeight()

                                    }
                                

    var middle: Int = max /2


    var commonLabels: CommonLabels = CommonLabels.getInstance()!!
            


    var s: String = StringMaker().
                            append(commonLabels!!.WIDTH_LABEL)!!.append(getWidth())!!.append(commonLabels!!.HEIGHT_LABEL)!!.append(getHeight())!!.append(
                            " max: ")!!.append(max)!!.append(
                            " middle: ")!!.append(middle)!!.toString()!!
            

logUtil!!.put(s, this, commonStrings!!.GET_INSTANCE)

    var currentMiddleX: Int = minX +getWidth() /2


    var currentMiddleY: Int = minY +getHeight() /2

dx= middle -currentMiddleX
dy= middle -currentMiddleY
}


                @Throws(Exception::class)
            
open fun transform(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashMap = hashMap
this.calculate(hashMap)
logUtil!!.put(StringMaker().
                            append(
                            " dx: ")!!.append(dx)!!.append(
                            " dy: ")!!.append(dy)!!.toString(), this, commonStrings!!.GET_INSTANCE)

    var graphicItemArray: Array<Any?> = hashMap!!.keySet()!!.toArray()!!
            


    var size: Int = graphicItemArray!!.size
                





                        for (index in 0 until size)


        {
    var item: GraphicItemInterface = hashMap!!.get(graphicItemArray[index]!!) as GraphicItemInterface


    var list: BasicArrayList = translate(item!!.getPointsInterface()!!.getPoints(), dx, dy)!!
            


    var newPoints: Points = Points()

newPoints!!.addPoints(list)
item!!.setPointsInterface(newPoints)
}

}


                @Throws(Exception::class)
            
open fun getInstance(pointVector: BasicArrayList)
        //nullable =  from not(true or (false and false)) = 
{

                    var pointVector = pointVector

        try {
            
    var newVector: Vector = Vector()


    var size: Int = pointVector!!.size()!!
            





                        for (index in 0 until size)


        {
    var point: GPoint = pointVector!!.get(index) as GPoint


    
                        if(point!!.getX() < minX)
                        
                                    {
                                    minX= point!!.getX()

                                    }
                                

    
                        if(point!!.getX() > maxX)
                        
                                    {
                                    maxX= point!!.getX()

                                    }
                                

    
                        if(point!!.getY() < minY)
                        
                                    {
                                    minY= point!!.getY()

                                    }
                                

    
                        if(point!!.getY() > maxY)
                        
                                    {
                                    maxY= point!!.getY()

                                    }
                                
}

} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)



                            throw e
}

}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return width
}


open fun setWidth(width: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var width = width
this.width= width
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return height
}


open fun setHeight(height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var height = height
this.height= height
}


}
                
            

