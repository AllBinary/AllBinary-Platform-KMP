
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
        
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class TouchButtonFactory
            : Object
         {
        

        companion object {
            
    private val SINGLETON: TouchButtonFactory = TouchButtonFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TouchButtonFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    private var LIST: BasicArrayList = BasicArrayListUtil.getInstance()!!.getImmutableInstance()!!

    private var list: BasicArrayList = LIST

    private var savedList: BasicArrayList = LIST
private constructor        ()
            : super()
        {}


open fun defaultList()
        //nullable = true from not(false or (false and true)) = true
{this.list= LIST
this.toggle(false, LIST)
}


    private var saved: Boolean = false

open fun toggle(save: Boolean, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var save = save


                    var list = list

    
                        if(list != 
                                    null
                                )
                        
                                    {
                                    this.savedList= list

    
                        if(!this.saved)
                        
                                    {
                                    this.list= this.savedList

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(save)
                        
                                    {
                                    
    
                        if(!this.saved)
                        
                                    {
                                    this.saved= true
this.savedList= this.list
this.list= LIST

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                
                        else {
                            this.list= this.savedList
this.saved= false

                        }
                            

                        }
                            
}


                @Throws(Exception::class)
            
open fun setList(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list

    
                        if(list == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Null List")

                                    }
                                
this.list= list
}


open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

