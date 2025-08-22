
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2007 AllBinary 
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
        
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil

open public class PreGameScrollSelectionTouchButtonsBuilder : BaseTouchInput {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{
        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.GET_LIST)

    var list: BasicArrayList = BasicArrayList()


    var touchButtonLocationHelper: TouchButtonLocationHelper = TouchButtonLocationHelper()


    var commonButtons: CommonButtons = CommonButtons.getInstance()!!


    var basicTouchButtonCellPositionFactory: BasicTouchButtonCellPositionFactory = BasicTouchButtonCellPositionFactory()


    var LEFT: TouchButton = TouchButton(BasicTouchInputFactory.getInstance()!!.LEFT, TouchButtonStrafeLeftResource.getInstance(), commonButtons!!.NORMAL_BUTTON, basicTouchButtonCellPositionFactory!!.TOP_LEFT, touchButtonLocationHelper!!.getColumnsRemainderHalf(), touchButtonLocationHelper!!.getRowsRemainderHalf())


    var RIGHT: TouchButton = TouchButton(BasicTouchInputFactory.getInstance()!!.RIGHT, TouchButtonStrafeRightResource.getInstance(), commonButtons!!.NORMAL_BUTTON, basicTouchButtonCellPositionFactory!!.TOP_RIGHT, touchButtonLocationHelper!!.getColumnsRemainderHalf(), touchButtonLocationHelper!!.getRowsRemainderHalf())


    var START: TouchButton = TouchButton(BasicTouchInputFactory.getInstance()!!.SPECIAL_BUTTON_FIVE, TouchButtonStartResource.getInstance(), commonButtons!!.NORMAL_BUTTON, basicTouchButtonCellPositionFactory!!.BOTTOM_RIGHT, touchButtonLocationHelper!!.getColumnsRemainderHalf(), touchButtonLocationHelper!!.getRowsRemainderHalf())

list.add(LEFT)
list.add(RIGHT)
list.add(START)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_LIST, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayListUtil.getInstance()!!.getImmutableInstance()
}

}


}
                
            

