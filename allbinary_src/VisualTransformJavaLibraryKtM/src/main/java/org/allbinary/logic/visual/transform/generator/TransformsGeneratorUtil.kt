
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
        package org.allbinary.logic.visual.transform.generator



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.TransformInfoDomNode
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigInterface

open public class TransformsGeneratorUtil
            : Object
         {
        

        companion object {


    private val instance: TransformsGeneratorUtil = TransformsGeneratorUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransformsGeneratorUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun generateComponentsFromObjectConfig(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface, group: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var group = group

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Started Group: " +group, this, 
                            "generateComponentsFromObjectConfig(2)")

                                    }
                                

    var transformInfoObjectConfigInterface: TransformInfoObjectConfigInterface = transformInfoInterface!!.getObjectConfigInterface()!!
            


    var result: String = this.generateComponentsFromObjectConfig(abeClientInformation, transformInfoObjectConfigInterface, transformInfoInterface, group)!!
            


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("End Group: " +group, this, 
                            "generateComponentsFromObjectConfig(2)")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


                @Throws(Exception::class)
            
open fun generateComponentsFromObjectConfig(abeClientInformation: AbeClientInformationInterface, transformInfoObjectConfigInterface: TransformInfoObjectConfigInterface, transformInfoInterface: TransformInfoInterface, group: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abeClientInformation = abeClientInformation


                    var transformInfoObjectConfigInterface = transformInfoObjectConfigInterface


                    var transformInfoInterface = transformInfoInterface


                    var group = group

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Started Group: " +group, this, 
                            "generateComponentsFromObjectConfig()")

                                    }
                                

    var transformInfoObjectConfigComponentVector: Vector = transformInfoObjectConfigInterface!!.getTransformsGroup(group)!!
            


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Processing ")
stringBuffer!!.append(transformInfoObjectConfigComponentVector!!.size)
stringBuffer!!.append(
                            " Components Group: ")
stringBuffer!!.append(group)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "generateComponentsFromObjectConfig()")

                                    }
                                

    
                        if(transformInfoObjectConfigComponentVector!!.size < 1)
                        
                                    {
                                    


                            throw Exception(
                            "No Pages Generated For Template.")

                                    }
                                

    var size: Int = transformInfoObjectConfigComponentVector!!.size!!
            





                        for (index in 0 until size)


        {
    var transformInfoObjectConfigComponent: TransformInfoDomNode = transformInfoObjectConfigComponentVector!!.get(index) as TransformInfoDomNode

TransformGeneratorUtil.getInstance()!!.generate(abeClientInformation, transformInfoObjectConfigComponent, transformInfoInterface)
}


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Done Group: " +group, this, 
                            "generateComponentsFromObjectConfig()")

                                    }
                                

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "<!-- Generated all template views successfully for View: ")
stringBuffer!!.append(transformInfoInterface!!.getName())
stringBuffer!!.append(
                            "-->")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

