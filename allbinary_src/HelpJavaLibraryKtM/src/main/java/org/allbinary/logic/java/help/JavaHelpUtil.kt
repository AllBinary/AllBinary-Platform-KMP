
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
        package org.allbinary.logic.java.help



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.event.ActionEvent
import java.io.File
import java.net.URI
import java.net.URL
import javax.help.CSH
import javax.help.HelpBroker
import javax.help.HelpSet
import javax.swing
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class JavaHelpUtil
            : Object
         {
        

        companion object {


    private val instance: JavaHelpUtil = JavaHelpUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: JavaHelpUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args

        try {
            
    var javaHelpUtil: JavaHelpUtil = JavaHelpUtil.getInstance()!!
            

javaHelpUtil!!.show(javaHelpUtil!!.getHelpSet(
                            "G:/mnt/bc/mydev/working/automation/InputAutomationJavaApplication/AllBinaryInputAutomationHelp/AllBinaryInputAutomation.hs"))
} catch(e: Exception)
            {}

}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val point: Point = Point(0, 0)

    private val dimension: Dimension = Dimension(640, 480)

    private var contextSensitiveHelpActionEvent: ActionEvent = ActionEvent(JLabel(), ActionEvent.ACTION_FIRST, 
                            null)

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            
private constructor        ()
            : super()
        {}


open fun getHelpSet(filePath: String)
        //nullable = true from not(false or (false and false)) = true
: HelpSet{

                    var filePath = filePath

        try {
            
    var helpSetURI: URI = File(filePath).
                            toURI()!!
            


    var helpSetURL: URL = helpSetURI!!.toURL()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getHelpSet(helpSetURL)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, getInstance(), 
                            "set", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getHelpSet(url: URL)
        //nullable = true from not(false or (false and false)) = true
: HelpSet{

                    var url = url

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HelpSet(
                            null, url)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, getInstance(), 
                            "set", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun show(helpSet: HelpSet)
        //nullable = true from not(false or (false and false)) = true
{

                    var helpSet = helpSet

        try {
            
    var helpBroker: HelpBroker = helpSet!!.createHelpBroker()!!
            

helpBroker!!.setLocation(point)
helpBroker!!.setSize(dimension)
DisplayHelpFromSource(helpBroker).
                            actionPerformed(contextSensitiveHelpActionEvent)
logUtil!!.put(
                            "CSH Action", getInstance(), 
                            "show")
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, getInstance(), 
                            "show", e)
}

}


}
                
            

