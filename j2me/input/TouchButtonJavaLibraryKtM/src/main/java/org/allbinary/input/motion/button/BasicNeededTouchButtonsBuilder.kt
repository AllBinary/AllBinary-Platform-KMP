
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
        
import org.allbinary.animation.Animation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class BasicNeededTouchButtonsBuilder : BaseTouchInput {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
override fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        {

        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

    var list: BasicArrayList = BasicArrayList()


    var touchButtonLocationHelper: TouchButtonLocationHelper = TouchButtonLocationHelper()


    var basicTouchButtonCellPositionFactory: BasicTouchButtonCellPositionFactory = BasicTouchButtonCellPositionFactory()


    var commonButtons: CommonButtons = CommonButtons.getInstance()!!


    var animationInterface: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!


    var UP: TouchButton = TouchButton(BasicTouchInputFactory.getInstance()!!.UP, animationInterface, animationInterface, commonButtons!!.NORMAL_BUTTON, basicTouchButtonCellPositionFactory!!.SECOND_FROM_BOTTOM_LEFT, touchButtonLocationHelper!!.getColumnsRemainderHalf(), touchButtonLocationHelper!!.getRowsRemainderHalf())


    var DOWN: TouchButton = TouchButton(BasicTouchInputFactory.getInstance()!!.DOWN, animationInterface, animationInterface, commonButtons!!.NORMAL_BUTTON, basicTouchButtonCellPositionFactory!!.BOTTOM_LEFT, touchButtonLocationHelper!!.getColumnsRemainderHalf(), touchButtonLocationHelper!!.getRowsRemainderHalf())


    var LEFT: TouchButton = TouchButton(BasicTouchInputFactory.getInstance()!!.LEFT, animationInterface, animationInterface, commonButtons!!.NORMAL_BUTTON, basicTouchButtonCellPositionFactory!!.BOTTOM_SECOND_FROM_RIGHT, touchButtonLocationHelper!!.getColumnsRemainderHalf(), touchButtonLocationHelper!!.getRowsRemainderHalf())


    var RIGHT: TouchButton = TouchButton(BasicTouchInputFactory.getInstance()!!.RIGHT, animationInterface, animationInterface, commonButtons!!.NORMAL_BUTTON, basicTouchButtonCellPositionFactory!!.BOTTOM_RIGHT, touchButtonLocationHelper!!.getColumnsRemainderHalf(), touchButtonLocationHelper!!.getRowsRemainderHalf())

list.add(UP)
list.add(DOWN)
list.add(LEFT)
list.add(RIGHT)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_LIST, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayListUtil.getInstance()!!.getImmutableInstance()
}

}


}
                
            

