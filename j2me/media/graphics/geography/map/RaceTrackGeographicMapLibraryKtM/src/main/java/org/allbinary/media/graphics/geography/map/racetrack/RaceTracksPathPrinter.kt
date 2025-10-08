
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
        package org.allbinary.media.graphics.geography.map.racetrack




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonLabels

open public class RaceTracksPathPrinter
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun printPath(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
var list = list

    var size: Int = list.size()!!





                        for (index in 0 until size)

        {

    var anyType: Any = list.get(index)!!

PreLogUtil.put(StringMaker().
                            append("pathList.add(cellPositionFactory.getInstance")!!.append(anyType!!.toString())!!.append(");")!!.toString(), this, "printPath")
}

}


    open fun printPaths(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
var list = list

    var size: Int = list.size()!!





                        for (index in 0 until size)

        {
System.out.println(StringMaker().
                            append(" Path ")!!.append(index)!!.append(CommonLabels.getInstance()!!.COLON_SEP)!!.toString())
this.printPath(list.get(index) as BasicArrayList)
}

}


}
                
            

