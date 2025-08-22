
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
        package org.allbinary.logic.string.regex.replace




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Set
import org.allbinary.globals.AppUrlGlobals
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class Replace
            : Object
         {
        

        companion object {
            
open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args

        try {
            
    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var appUrlGlobals: AppUrlGlobals = AppUrlGlobals()

appUrlGlobals!!.setWebappPath("G:/mnt/bc/mydev/work/allbinary_src/ToolsJavaLibrary/tools")
URLGLOBALS.init(appUrlGlobals)

    var testString: String = "\"super gun\" big tank \"goodgunriflegun"


    var replace: Replace = Replace("gun", "abcdefghijklmnopqrstuxwxyzabcdefghijklmnopqrstuxwxyz")

System.out.println("Old String: " +testString)
testString= replace.all(testString)
System.out.println("New String: " +testString)

    var replaceCat: Replace = Replace("abcdefghijklmnopqrstuxwxyzabcdefghijklmnopqrstuxwxyz", stringUtil!!.EMPTY_STRING)

testString= replaceCat!!.all(testString)
System.out.println("New String: " +testString)
} catch(e: Exception)
            {}

}


        }
            
    private val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val REPLACERS_: String = "Replacers: "

    private val ALL: String = "all"

    private val FOUND_KEY: String = "found key total: "

    private val hashMap: HashMap<Any, Any>
public constructor        (key: String, value: String)
            : super()
        {

                    var key = key


                    var value = value
hashMap= HashMap<Any, Any>()
this.hashMap!!.put(arrayOf(key), arrayOf(value))

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.REPLACE))
                        
                                    {
                                    logUtil!!.put(REPLACERS_ +this.hashMap!!.toString(), this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
}

public constructor        (keys: Array<String?>, values: Array<String?>)
            : super()
        {

                    var keys = keys


                    var values = values
hashMap= HashMap<Any, Any>()
this.hashMap!!.put(keys, values)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.REPLACE))
                        
                                    {
                                    logUtil!!.put(REPLACERS_ +this.hashMap!!.toString(), this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap
this.hashMap= hashMap

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.REPLACE_INFO))
                        
                                    {
                                    logUtil!!.put(REPLACERS_ +this.hashMap!!.toString(), this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


open fun all(replace: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var replace = replace



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.upTo(replace, Integer.MIN_VALUE)
}


open fun upTo(replace: String, total: Int)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var replace = replace


                    var total = total

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.REPLACE))
                        
                                    {
                                    logUtil!!.put(REPLACERS_ +this.hashMap!!.toString(), this, ALL)

                                    }
                                

    var newStringBuffer: StringMaker = StringMaker()


    var totalNumberOfReplaces: Int = 0


    var keySet: Set = hashMap!!.keys!!


    var keys: Array<String?>


    var values: Array<String?>


    var keyArray: Array<Any?> = keySet!!.toArray()!!


    var size: Int = keyArray!!.size
                





                        for (index2 in 0 until size)


        {keys= keyArray[index2]!! as Array<String?>
values= hashMap!!.get(keys as Object) as Array<String?>

    var foundTotal: Long = 0


    var index: Int = 0


        while(index < replace.length)
        {
    var begin: Int = replace.indexOf(keys[0]!!, index)!!


    
                        if(begin !=  -1)
                        
                                    {
                                    foundTotal++

    
                        if(foundTotal % 100 == 0)
                        
                                    {
                                    System.out.println(FOUND_KEY +foundTotal)

                                    }
                                

    var end: Int = begin +keys[0]!!.length()

newStringBuffer!!.delete(0, newStringBuffer!!.length())
newStringBuffer!!.append(replace.substring(0, begin))
newStringBuffer!!.append(values[0]!!)
index= newStringBuffer!!.length()
newStringBuffer!!.append(replace.substring(end, replace.length))
replace= newStringBuffer!!.toString()

    
                        if(keys.size > 1)
                        
                                    {
                                    
    var begin2: Int = replace.indexOf(keys[1]!!, index)!!


    
                        if(begin2 !=  -1)
                        
                                    {
                                    
    var end2: Int = begin2 +keys[1]!!.length()

newStringBuffer!!.delete(0, newStringBuffer!!.length())
newStringBuffer!!.append(replace.substring(0, begin2))
newStringBuffer!!.append(values[1]!!)
index= newStringBuffer!!.length()
newStringBuffer!!.append(replace.substring(end2, replace.length))
replace= newStringBuffer!!.toString()

                                    }
                                

                                    }
                                
totalNumberOfReplaces++

    
                        if(total != Integer.MIN_VALUE && totalNumberOfReplaces >= total)
                        
                                    {
                                    break;

                    

                                    }
                                

                                    }
                                
                        else {
                            break;

                    

                        }
                            
}

}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.REPLACE))
                        
                                    {
                                    logUtil!!.put("Total Number Of Replaces: " +totalNumberOfReplaces, this, ALL)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return replace
}


open fun line(replace: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var replace = replace

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.REPLACE))
                        
                                    {
                                    logUtil!!.put(REPLACERS_ +this.hashMap!!.toString(), this, ALL)

                                    }
                                

    var newStringBuffer: StringMaker = StringMaker()


    var totalNumberOfReplaces: Int = 0


    var keySet: Set = hashMap!!.keys!!


    var key: String


    var value: String


    var keyArray: Array<Any?> = keySet!!.toArray()!!


    var size: Int = keyArray!!.size
                





                        for (index2 in 0 until size)


        {key= keyArray[index2]!! as String
value= hashMap!!.get(key as Object) as String

    var index: Int = 0


        while(index < replace.length)
        {newStringBuffer!!.delete(0, newStringBuffer!!.length())

    var begin: Int = replace.indexOf(key, index)!!


    
                        if(begin !=  -1)
                        
                                    {
                                    System.out.println(FOUND_KEY)

    var end: Int = replace.indexOf('\n', begin +key.length) +1


    
                        if(end >= 0)
                        
                                    {
                                    newStringBuffer!!.append(replace.substring(0, begin))
index= newStringBuffer!!.length()
newStringBuffer!!.append(replace.substring(end, replace.length))
replace= newStringBuffer!!.toString()
totalNumberOfReplaces++

                                    }
                                

                                    }
                                
                        else {
                            break;

                    

                        }
                            
}

}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.REPLACE))
                        
                                    {
                                    logUtil!!.put("Total Number Of Replaces: " +totalNumberOfReplaces, this, ALL)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return replace
}


}
                
            

