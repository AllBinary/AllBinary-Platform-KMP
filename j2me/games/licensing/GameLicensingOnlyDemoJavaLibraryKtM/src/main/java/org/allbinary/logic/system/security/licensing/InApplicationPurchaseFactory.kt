
        /*
                *  
                *  To change this license header, choose License Headers in Project Properties. 
                *  To change this template file, choose Tools | Templates  and open the template in the editor.  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.system.security.licensing




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class InApplicationPurchaseFactory
            : Object
         {
        

        companion object {
            
    private val instance: InApplicationPurchaseFactory = InApplicationPurchaseFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InApplicationPurchaseFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun init(anyType: Any, stateObject: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var anyType = anyType
var stateObject = stateObject
}


open fun onCreate(anyType: Any, stateObject: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var anyType = anyType
var stateObject = stateObject
}


open fun onStart()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun onResult(requestCode: Int, resultCode: Int, data: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var requestCode = requestCode
    //var resultCode = resultCode
    //var data = data
}


open fun onSaveState(anyType: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var anyType = anyType
}


open fun onStop()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun onDestroy()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun purchase(lockableFeature: LockableFeature)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var lockableFeature = lockableFeature
}


open fun isPurchased(lockableFeature: LockableFeature)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var lockableFeature = lockableFeature



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun add(lockableFeature: LockableFeature)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var lockableFeature = lockableFeature
}


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


open fun isEnabled()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

