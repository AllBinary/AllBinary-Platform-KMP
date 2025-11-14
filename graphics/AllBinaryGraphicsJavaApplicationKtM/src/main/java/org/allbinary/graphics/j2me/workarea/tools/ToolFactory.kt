
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
        package org.allbinary.graphics.j2me.workarea.tools




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.j2me.StatusFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ToolFactory
            : Object
         {
        
companion object {
            
    private val instance: ToolFactory = ToolFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ToolFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var selectedTool: GraphicsItemInterfaceFactoryInterface = 
                null
            

    private var tool: String = 
                null
            

    private val SELECTED_LABEL: String = "Selected: "

    open fun setSelectedTool(tool: String)
        //nullable = true from not(false or (false and false)) = true
{
var tool = tool

        try {
            StatusFactory.getInstance()!!.setStatus(SELECTED_LABEL +tool)
this.tool= tool
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "setSelectionTool", e)
}

}


    open fun getSelectedToolFactory()
        //nullable = true from not(false or (false and true)) = true
: GraphicsItemInterfaceFactoryInterface{
StatusFactory.getInstance()!!.setStatus("Tool In Use: " +tool)

    
                        if(tool != 
                                    null
                                )
                        
                                    {
                                    this.selectedTool= GraphicItemFactory.getInstance()!!.getInstance(tool)
logUtil!!.put("New Tool: " +this.selectedTool, this, "getSelectedToolFactory")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.selectedTool

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


}
                
            

