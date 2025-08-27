
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
        package org.allbinary.android.input.motion.button




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.AndroidResources
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.init.Init
import org.allbinary.input.motion.button.CommonButtons
import org.allbinary.input.motion.button.TouchButtonBlankResource
import org.allbinary.input.motion.button.TouchButtonDownResource
import org.allbinary.input.motion.button.TouchButtonGenericActionResource
import org.allbinary.input.motion.button.TouchButtonResource
import org.allbinary.input.motion.button.TouchButtonStartResource
import org.allbinary.input.motion.button.TouchButtonStrafeLeftResource
import org.allbinary.input.motion.button.TouchButtonStrafeRightResource
import org.allbinary.input.motion.button.TouchButtonTurnLeftResource
import org.allbinary.input.motion.button.TouchButtonTurnRightResource
import org.allbinary.input.motion.button.TouchButtonUpResource
import org.allbinary.logic.system.os.OperatingSystemFactory

open public class TouchButtonAndroidResources : Init {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun init()
        //nullable = true from not(false or (false and true)) = true
{
    var resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!


    var androidResources: AndroidResources = AndroidResources.getInstance()!!


    var RESOURCE_STRING_ARRAY: Array<TouchButtonResource?> = arrayOf(TouchButtonBlankResource.getInstance(), TouchButtonGenericActionResource.getInstance(), TouchButtonStartResource.getInstance(), TouchButtonUpResource.getInstance(), TouchButtonDownResource.getInstance(), TouchButtonTurnLeftResource.getInstance(), TouchButtonTurnRightResource.getInstance(), TouchButtonStrafeLeftResource.getInstance(), TouchButtonStrafeRightResource.getInstance())


    var RESOURCE_ARRAY: IntArray = IntArray(RESOURCE_STRING_ARRAY.size)


    
                        if(CommonButtons.getInstance()!!.STANDARD_BUTTON_SIZE == 128)
                        
                                    {
                                    RESOURCE_ARRAY[0]= androidResources!!.raw.touch_button_128_by_128
RESOURCE_ARRAY[1]= androidResources!!.raw.touch_button_generic_action_128_by_128
RESOURCE_ARRAY[2]= androidResources!!.raw.touch_button_start_128_by_128
RESOURCE_ARRAY[3]= androidResources!!.raw.touch_button_up_arrow_128_by_128
RESOURCE_ARRAY[4]= androidResources!!.raw.touch_button_down_arrow_128_by_128
RESOURCE_ARRAY[5]= androidResources!!.raw.touch_button_turn_left_arrow_128_by_128
RESOURCE_ARRAY[6]= androidResources!!.raw.touch_button_turn_right_arrow_128_by_128
RESOURCE_ARRAY[7]= androidResources!!.raw.touch_button_strafe_left_arrow_128_by_128
RESOURCE_ARRAY[8]= androidResources!!.raw.touch_button_strafe_right_arrow_128_by_128

    
                        if(OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!.isOverScan())
                        
                                    {
                                    resourceUtil!!.addResource(RESOURCE_STRING_ARRAY[2]!!.HINT, Integer(Integer.valueOf(androidResources!!.raw.ouya_o)))

                                    }
                                

                                    }
                                
                        else {
                            RESOURCE_ARRAY[0]= androidResources!!.raw.touch_button_64_by_64
RESOURCE_ARRAY[1]= androidResources!!.raw.touch_button_generic_action_64_by_64
RESOURCE_ARRAY[2]= androidResources!!.raw.touch_button_start_64_by_64
RESOURCE_ARRAY[3]= androidResources!!.raw.touch_button_up_arrow_64_by_64
RESOURCE_ARRAY[4]= androidResources!!.raw.touch_button_down_arrow_64_by_64
RESOURCE_ARRAY[5]= androidResources!!.raw.touch_button_turn_left_arrow_64_by_64
RESOURCE_ARRAY[6]= androidResources!!.raw.touch_button_turn_right_arrow_64_by_64
RESOURCE_ARRAY[7]= androidResources!!.raw.touch_button_strafe_left_arrow_64_by_64
RESOURCE_ARRAY[8]= androidResources!!.raw.touch_button_strafe_right_arrow_64_by_64

                        }
                            




                        for (index in 0 until RESOURCE_ARRAY.size)

        {resourceUtil!!.addResource(RESOURCE_STRING_ARRAY[index]!!.RESOURCE, Integer(Integer.valueOf(RESOURCE_ARRAY[index]!!)))
}

}


}
                
            

