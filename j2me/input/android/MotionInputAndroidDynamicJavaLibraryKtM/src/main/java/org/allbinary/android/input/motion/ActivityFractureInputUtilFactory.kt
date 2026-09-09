
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2009 AllBinary
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.android.ActivityFractureUtil
import org.allbinary.android.AndroidInfoFactory
import org.allbinary.android.api1.ActivityFractureUtilAPI1
import org.allbinary.android.api16.ActivityFractureUtilAPI16
import org.allbinary.android.api19.ActivityFractureUtilAPI19
import org.allbinary.android.api5.ActivityFractureUtilAPI5

open public class ActivityFractureInputUtilFactory
            : Object
         {
        
companion object {
            
    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ActivityFractureUtil{

    var SDK_VERSION: Int = AndroidInfoFactory.getInstance()!!.getVersion()!!


    
                        if(SDK_VERSION <= 4)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ActivityFractureUtilAPI1.getInstance()

                                    }
                                
                             else 
    
                        if(SDK_VERSION <= 15)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ActivityFractureUtilAPI5.getInstance()

                                    }
                                
                             else 
    
                        if(SDK_VERSION <= 16)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ActivityFractureUtilAPI16.getInstance()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ActivityFractureUtilAPI19.getInstance()

                        }
                            
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

