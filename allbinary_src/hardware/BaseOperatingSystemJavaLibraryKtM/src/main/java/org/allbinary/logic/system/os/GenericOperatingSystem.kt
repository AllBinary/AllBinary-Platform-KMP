
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
        package org.allbinary.logic.system.os




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.java.character.CharacterSet
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonSeps

open public class GenericOperatingSystem
            : Object
        
                , OperatingSystemInterface {
        

    private val osName: String

    private val osArch: String

    private val osVersion: String

    private val characterSet: CharacterSet = CharacterSet()

    var scalable: Boolean = false
public constructor        ()
            : super()
        

        Updates for KMP build        
        {

    var systemProperties: SystemProperties = SystemProperties.getInstance()!!


    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!


    var EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(stringValidationUtil!!.isEmpty(systemProperties!!.getName()))
                        
                                    {
                                    this.osName= EMPTY_STRING

                                    }
                                
                        else {
                            this.osName= systemProperties!!.getName()

                        }
                            

    
                        if(stringValidationUtil!!.isEmpty(systemProperties!!.getArch()))
                        
                                    {
                                    this.osArch= EMPTY_STRING

                                    }
                                
                        else {
                            this.osArch= systemProperties!!.getArch()

                        }
                            

    
                        if(stringValidationUtil!!.isEmpty(systemProperties!!.getVersion()))
                        
                                    {
                                    this.osVersion= EMPTY_STRING

                                    }
                                
                        else {
                            this.osVersion= systemProperties!!.getVersion()

                        }
                            
}

override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.osName
}

override fun getVersion()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.osVersion
}

override fun getArch()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.osArch
}

override fun getCharacterSet()
        //nullable = true from not(false or (false and true)) = true
: CharacterSet

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.characterSet
}

override fun isOverScan()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun getOverScanXPercent()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 100
}

override fun getOverScanYPercent()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 100
}

override fun isScalable()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scalable
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var NEW_LINE: String = CommonSeps.getInstance()!!.NEW_LINE


    var osBuffer: StringMaker = StringMaker()

osBuffer!!.append("Operating System Info: \n")
osBuffer!!.append(this.getName())
osBuffer!!.append(NEW_LINE)
osBuffer!!.append(this.getArch())
osBuffer!!.append(NEW_LINE)
osBuffer!!.append(this.getVersion())
osBuffer!!.append(NEW_LINE)
osBuffer!!.append(StringUtil.getInstance()!!.toString(this.getCharacterSet()))
osBuffer!!.append(NEW_LINE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return osBuffer!!.toString()
}


}
                
            

