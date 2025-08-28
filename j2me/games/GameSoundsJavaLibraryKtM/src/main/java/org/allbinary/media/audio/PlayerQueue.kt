
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
        package org.allbinary.media.audio




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class PlayerQueue
            : Object
         {
        

        companion object {
            
    private val TOTAL: String = "Sounds In Queue: "

        }
            
    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val list: BasicArrayList = BasicArrayList()

    private var max: Int
 constructor        (max: Int)
            : super()
        

        Updates for KMP build        
        {
var max = max
this.max= max
}


open fun add(sound: Sound)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var sound = sound

        try {
            
    
                        if(!list.contains(sound))
                        
                                    {
                                    list.add(sound)

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {
PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.ADD)
}

}


open fun process()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

    var sound: Sound = NoSound.getInstance()!!


        try {
            
    var played: Boolean = false


    
                        if(list.size() > 0)
                        
                                    {
                                    sound= list.remove(0) as Sound

    
                        if(sound != 
                                    null
                                )
                        
                                    {
                                    sound.getPlayerP()!!.start()

                                    }
                                

        while(list.size() > max)
        

        Updates for KMP build        
        {
list.remove(0)
}

played= true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return played
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var resource: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(sound != 
                                    null
                                )
                        
                                    {
                                    resource= sound.getResource()

                                    }
                                
PreLogUtil.put(StringMaker().
                            append(commonStrings!!.EXCEPTION_LABEL)!!.append(resource)!!.toString(), this, commonStrings!!.PROCESS)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun clear()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.list.clear()
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(TOTAL)!!.append(this.list.size())!!.toString()
}


}
                
            

