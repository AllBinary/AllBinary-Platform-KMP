
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
        package org.allbinary.android.input.motion



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.analog.AnalogLocationInput
import org.allbinary.game.input.analog.AnalogLocationInputFactory
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.util.BasicArrayList

open public class AllAnalogControllerVisitor : AnalogControllerVisitor {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun process(allbinaryLayerManager: AllBinaryLayerManager, analogLocationInputProcessor: AnalogLocationInputProcessor)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayerManager = allbinaryLayerManager


                    var analogLocationInputProcessor = analogLocationInputProcessor

    var analogLocationInputList: BasicArrayList = AnalogLocationInputFactory.getInstance()!!.getList()!!
            


    var analogLocationInput: AnalogLocationInput





                        for (index in analogLocationInputList!!.size() -1 downTo 0)


        {analogLocationInput= analogLocationInputList!!.get(index) as AnalogLocationInput
analogLocationInputProcessor!!.process(allbinaryLayerManager, analogLocationInput)
}

}


}
                
            

