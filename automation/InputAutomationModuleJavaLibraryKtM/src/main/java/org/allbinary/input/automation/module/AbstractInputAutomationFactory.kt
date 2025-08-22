
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
        package org.allbinary.input.automation.module




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.net.URL
import javax.help.HelpSet
import javax.swing
import org.allbinary.logic.java.help.JavaHelpUtil

open public class AbstractInputAutomationFactory : InputAutomationModuleFactoryInterface {
        

    private var name: String

    private var jPanel: JPanel

    private var helpSet: HelpSet
public constructor        (name: String, jPanel: JPanel, helpSet: HelpSet){

                    var name = name


                    var jPanel = jPanel


                    var helpSet = helpSet
this.name= name
this.jPanel= jPanel
this.helpSet= helpSet
}

public constructor        (name: String, jPanel: JPanel){

                    var name = name


                    var jPanel = jPanel
this.name= name
this.jPanel= jPanel

    var url: URL = this::class.getResource("/help/Help.hs")!!

this.helpSet= JavaHelpUtil.getInstance()!!.getHelpSet(url)
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun getConfigurationJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.jPanel
}


open fun getHelpSet()
        //nullable = true from not(false or (false and true)) = true
: HelpSet{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return helpSet
}


}
                
            

