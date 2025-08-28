
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
        package org.allbinary.game.input.mapping




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.game.input.Input
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class InputMapping
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

    private val mappedList: BasicArrayList = BasicArrayList()
protected constructor        ()
            : super()
        {
}


open fun getTotalMapped()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hashtable.size
}


open fun isDefaultNew()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getDefault()
        //nullable = true from not(false or (false and true)) = true
: InputToGameKeyMapping{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InputToGameKeyMapping.NULL_INPUT_TO_GAME_KEY_MAPPING
}


open fun removeAll()
        //nullable = true from not(false or (false and true)) = true
{
this.hashtable.clear()
this.mappedList!!.clear()
}


open fun remove(input: Input, mappedToInput: Input)
        //nullable = true from not(false or (false and false)) = true
{
    //var input = input
    //var mappedToInput = mappedToInput

    var stringBuffer: StringMaker = StringMaker()


    var stringUtil: StringUtil = StringUtil.getInstance()!!

stringBuffer!!.append(CommonLabels.getInstance()!!.START_LABEL)
stringBuffer!!.append(stringUtil!!.toString(input))
stringBuffer!!.append(" == ")
stringBuffer!!.append(stringUtil!!.toString(mappedToInput))
logUtil!!.put(stringBuffer!!.toString(), this, "InputMapping::remove")

    var list: BasicArrayList = this.getMappedInput(input)!!


    
                        if(list.contains(mappedToInput))
                        
                                    {
                                    list.remove(mappedToInput)
this.mappedList!!.remove(mappedToInput)
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Removed: ")
stringBuffer!!.append(stringUtil!!.toString(input))
stringBuffer!!.append(" == ")
stringBuffer!!.append(stringUtil!!.toString(mappedToInput))
logUtil!!.put(stringBuffer!!.toString(), this, "InputMapping::remove")

                                    }
                                
                        else {
                            stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Not Deleted: ")
stringBuffer!!.append(stringUtil!!.toString(input))
stringBuffer!!.append(" == ")
stringBuffer!!.append(stringUtil!!.toString(mappedToInput))
logUtil!!.put(stringBuffer!!.toString(), this, "InputMapping::remove")

                        }
                            
}


                @Throws(Exception::class)
            
open fun add(inputToGameKeyMapping: InputToGameKeyMapping)
        //nullable = true from not(false or (false and false)) = true
{
    //var inputToGameKeyMapping = inputToGameKeyMapping



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


open fun add(input: Input, mappedToInput: Input)
        //nullable = true from not(false or (false and false)) = true
{
    //var input = input
    //var mappedToInput = mappedToInput

    var list: BasicArrayList = this.getMappedInput(input)!!


    
                        if(!list.contains(mappedToInput))
                        
                                    {
                                    list.add(mappedToInput)
this.mappedList!!.add(mappedToInput)

                                    }
                                
}


open fun isMapped(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.mappedList!!.contains(input)
}


open fun getMappedInput(id: Input)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var id = id

    var mappingInputCanBeNullList: Any? = this.hashtable.get(id as Object)


    
                        if(mappingInputCanBeNullList == 
                                    null
                                )
                        
                                    {
                                    
    var list: BasicArrayList = BasicArrayList()

this.hashtable.put(id, list)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mappingInputCanBeNullList as BasicArrayList
}


open fun getHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


}
                
            

