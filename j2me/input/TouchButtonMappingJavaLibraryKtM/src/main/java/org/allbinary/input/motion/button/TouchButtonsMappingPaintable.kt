
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.CellPositionFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.paint.Paintable
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class TouchButtonsMappingPaintable : Paintable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    var foregroundColor: Int

    private var paintableTable: Array<Array<Paintable?>?> = arrayOfNulls(0)

    private var touchButtonLocationHelper: TouchButtonLocationHelper = TouchButtonLocationHelper()
public constructor        (basicColor: BasicColor){

                    var basicColor = basicColor
this.foregroundColor= basicColor!!.toInt()
this.init()
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.paintableTable= this.createPaintableTable()
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, "updateRectangle", e)
}

}


                @Throws(Exception::class)
            
open fun createPaintableTable()
        //nullable = true from not(false or (false and true)) = true
: Array<Array<Paintable?>?>{
    var totalColumns: Int = touchButtonLocationHelper!!.getTotalColumns()!!
            


    var totalRows: Int = touchButtonLocationHelper!!.getTotalRows()!!
            


    var paintableTable: Array<Array<Paintable?>?> = arrayOfNulls(totalColumns)


    var cellPositionFactory: CellPositionFactory = CellPositionFactory.getInstance()!!
            


    var commonButtons: CommonButtons = CommonButtons.getInstance()!!
            





                        for (index in totalColumns -1 downTo 0)


        {



                        for (rowIndex in totalRows -1 downTo 0)


        {paintableTable[index]!![rowIndex]= TouchButton(BasicTouchInputFactory.getInstance()!!.NONE, TouchButtonBlankResource.getInstance(), commonButtons!!.NORMAL_BUTTON, cellPositionFactory!!.getInstance(index, rowIndex), this.touchButtonLocationHelper!!.getColumnsRemainderHalf(), this.touchButtonLocationHelper!!.getRowsRemainderHalf())
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paintableTable
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var totalColumns: Int = touchButtonLocationHelper!!.getTotalColumns()!!
            


    var totalRows: Int = touchButtonLocationHelper!!.getTotalRows()!!
            





                        for (index in totalColumns -1 downTo 0)


        {



                        for (rowIndex in totalRows -1 downTo 0)


        {paintableTable[index]!![rowIndex]!!.paint(graphics)
}

}

}


}
                
            

