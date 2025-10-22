
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
        package org.allbinary.media.graphics.geography.map




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.text.TextAnimation
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.font.MyFont
import org.allbinary.logic.math.BasicDecimal

open public class GeographicMapCellHistory
            : Object
         {
        
companion object {
            
    val NULL_GEOGRPAHIC_MAP_HISTORY_ARRAY: Array<GeographicMapCellHistory?> = arrayOfNulls(0)

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val booleanFactory: BooleanFactory = BooleanFactory.getInstance()!!

    private val list: BasicArrayList

    private val visitedList: BasicArrayList

    private val MISSED_INFO: String = "Missed"

    private val animation: Animation = TextAnimation(MISSED_INFO, AnimationBehavior.getInstance())

    private var totalVisited: Int= 0

    private var halfWidth: Int = 0
public constructor ()
            : super()
        {
this.list= BasicArrayList()
this.visitedList= BasicArrayList()
this.init()
}


    open fun getTotalVisited()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.totalVisited
}


    open fun getTotalNotVisited()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getSize() -this.totalVisited
}


    open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.size()
}


    open fun track(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var list = list

    var size: Int = list.size()!!

this.list.ensureCapacity(size)
this.visitedList!!.ensureCapacity(size)

    var geographicMapCellPosition: GeographicMapCellPosition





                        for (index in 0 until size)

        {
geographicMapCellPosition= list.get(index) as GeographicMapCellPosition
this.track(geographicMapCellPosition)
}

}


    open fun track(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapCellPosition = geographicMapCellPosition

    
                        if(!this.list.contains(geographicMapCellPosition))
                        
                                    {
                                    this.list.add(geographicMapCellPosition)
this.visitedList!!.add(booleanFactory!!.FALSE)

                                    }
                                
}


    open fun getTracked()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list
}


    open fun getVisited()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.visitedList
}


    open fun getAfterIfNotLast(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{
var geographicMapCellPosition = geographicMapCellPosition

    var localList: BasicArrayList = this.list


    var index: Int = localList!!.indexOf(geographicMapCellPosition)!!


    
                        if(localList!!.size() > index +1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return localList!!.get(index +1) as GeographicMapCellPosition

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPosition
}


    open fun getFirstUnvisited()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{

    var localList: BasicArrayList = this.list


    var localVisitedList: BasicArrayList = this.visitedList


    var size: Int = localVisitedList!!.size()!!


    var value: Boolean





                        for (index in 0 until size)

        {
value= this.visitedList!!.get(index) as Boolean

    
                        if(value == booleanFactory!!.FALSE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return localList!!.get(index) as GeographicMapCellPosition

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return localList!!.get(0) as GeographicMapCellPosition
}


    open fun getFirstUnvisitedIndex()
        //nullable = true from not(false or (false and true)) = true
: Int{

    var localVisitedList: BasicArrayList = this.visitedList


    var size: Int = localVisitedList!!.size()!!


    var value: Boolean





                        for (index in 0 until size)

        {
value= this.visitedList!!.get(index) as Boolean

    
                        if(value == booleanFactory!!.FALSE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


    open fun getInPathButNotTracked(pathList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
var pathList = pathList

    var inPathButNotTrackedList: BasicArrayList = BasicArrayList()


    var localList: BasicArrayList = this.list


    var size: Int = pathList!!.size()!!


    var geographicMapCellPosition: GeographicMapCellPosition





                        for (index in 0 until size)

        {
geographicMapCellPosition= pathList!!.get(index) as GeographicMapCellPosition

    
                        if(!localList!!.contains(geographicMapCellPosition))
                        
                                    {
                                    inPathButNotTrackedList!!.add(geographicMapCellPosition)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inPathButNotTrackedList
}


    open fun isVisited(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var geographicMapCellPosition = geographicMapCellPosition

    var index: Int = this.list.indexOf(geographicMapCellPosition)!!


    
                        if(index !=  -1)
                        
                                    {
                                    
    var value: Boolean = this.visitedList!!.get(index) as Boolean


    
                        if(value == booleanFactory!!.TRUE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                
                        else {
                            
                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun visit(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var geographicMapCellPosition = geographicMapCellPosition

    var index: Int = this.list.indexOf(geographicMapCellPosition)!!


    var value: Boolean


    
                        if(index !=  -1)
                        
                                    {
                                    value= this.visitedList!!.get(index) as Boolean

    var TRUE: Boolean = booleanFactory!!.TRUE


    
                        if(value != TRUE)
                        
                                    {
                                    this.visitedList!!.set(index, TRUE)
this.totalVisited++



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                
                        else {
                            
                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
    open fun isAllVisited()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.totalVisited == this.getSize() -1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


                @Throws(Exception::class)
            
    open fun isAllVisited2()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.totalVisited == this.getSize())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


                @Throws(Exception::class)
            
    open fun isVisited(basicDecimal: BasicDecimal)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var basicDecimal = basicDecimal

    var size: Int = this.getSize()!!


    var numberRequired: Int = (size shl basicDecimal!!.getScaledFactor()) /basicDecimal!!.getUnscaled().toInt()


    var numberNotVisited: Int = this.getSize() -1 -this.totalVisited


    
                        if(size -numberNotVisited > numberRequired)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


                @Throws(Exception::class)
            
    open fun reset()
        //nullable = true from not(false or (false and true)) = true
{

    var localVisitedList: BasicArrayList = this.visitedList


    var localFalseBoolean: Boolean = booleanFactory!!.FALSE


    var size: Int = localVisitedList!!.size()!!





                        for (index in size -1 downTo 0)

        {
localVisitedList!!.set(index, localFalseBoolean)
}

this.totalVisited= 0
}


    open fun paintNotVisited(graphics: Graphics, tiledLayer: AllBinaryTiledLayer, point: GPoint)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var tiledLayer = tiledLayer
    //var point = point

    var x: Int = point.getX() -tiledLayer!!.getXP()


    var y: Int = point.getY() -tiledLayer!!.getYP()


    
                        if(halfWidth == 0)
                        
                                    {
                                    this.halfWidth= (graphics.getFont()!!.stringWidth(MISSED_INFO) shr 1)

                                    }
                                

    var myFont: MyFont = MyFont.getInstance()!!


    var height: Int = 2 *myFont!!.DEFAULT_CHAR_HEIGHT

this.animation.paint(graphics, x +halfWidth, y +(height))
}


    private val RED: Int = BasicColorFactory.getInstance()!!.RED.toInt()!!

    open fun paintNotVisited(graphics: Graphics, geographicMapInterface: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var geographicMapInterface = geographicMapInterface

        try {
            graphics.setColor(RED)

    var localVisitedList: BasicArrayList = this.visitedList


    var size: Int = localVisitedList!!.size()!!


    var geographicMapCellPosition: GeographicMapCellPosition


    var isCellVisitedBoolean: Boolean





                        for (index in size  - 1  downTo 0)

        {
geographicMapCellPosition= list.get(index) as GeographicMapCellPosition
isCellVisitedBoolean= localVisitedList!!.get(index) as Boolean

    
                        if(!isCellVisitedBoolean)
                        
                                    {
                                    this.paintNotVisited(graphics, geographicMapInterface!!.getAllBinaryTiledLayer(), geographicMapCellPosition!!.getPoint())

                                    }
                                
}

} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "paintNotVisited", e)
}

}


    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
this.list.clear()
this.visitedList!!.clear()
this.totalVisited= 0
}


}
                
            

