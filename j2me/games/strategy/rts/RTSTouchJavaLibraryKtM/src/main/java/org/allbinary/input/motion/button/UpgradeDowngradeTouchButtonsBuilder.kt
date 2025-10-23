
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
        
import org.allbinary.game.input.resource.TouchButtonDowngradeResource
import org.allbinary.game.input.resource.TouchButtonUpgradeResource
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.graphics.CellPositionFactory

open public class UpgradeDowngradeTouchButtonsBuilder : BaseTouchInput {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    override fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{

        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

    var list: BasicArrayList = BasicArrayList()


    var touchButtonLocationHelper: TouchButtonLocationHelper = TouchButtonLocationHelper()


    var cellPositionFactory: CellPositionFactory = CellPositionFactory.getInstance()!!


    var basicTouchButtonCellPositionFactory: BasicTouchButtonCellPositionFactory = BasicTouchButtonCellPositionFactory()


    
                        if(basicTouchButtonCellPositionFactory!!.SECOND_FROM_TOP_LEFT != cellPositionFactory!!.NONE && basicTouchButtonCellPositionFactory!!.SECOND_FROM_TOP_RIGHT != cellPositionFactory!!.NONE)
                        
                                    {
                                    
    var commonButtons: CommonButtons = CommonButtons.getInstance()!!


    var UP: TouchButton = TouchButton(BasicTouchInputFactory.getInstance()!!.SPECIAL_BUTTON_TWO, TouchButtonUpgradeResource.getInstance(), commonButtons!!.NORMAL_BUTTON, basicTouchButtonCellPositionFactory!!.SECOND_FROM_TOP_LEFT, touchButtonLocationHelper!!.getColumnsRemainderHalf(), touchButtonLocationHelper!!.getRowsRemainderHalf())


    var DOWN: TouchButton = TouchButton(BasicTouchInputFactory.getInstance()!!.SPECIAL_BUTTON_ONE, TouchButtonDowngradeResource.getInstance(), commonButtons!!.NORMAL_BUTTON, basicTouchButtonCellPositionFactory!!.SECOND_FROM_TOP_RIGHT, touchButtonLocationHelper!!.getColumnsRemainderHalf(), touchButtonLocationHelper!!.getRowsRemainderHalf())

list.add(UP)
list.add(DOWN)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayListUtil.getInstance()!!.getImmutableInstance()
}

}


}
                
            

