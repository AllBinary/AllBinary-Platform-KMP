
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
        package org.allbinary.input.automation.osgi



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.swing
import org.osgi.framework.Bundle
import org.osgi.framework.BundleContext
import bundle.input.automation.InputAutomationBundleActivator
import org.allbinary.gui.dialog.BasicTextJDialog

open public class DesktopBundle
            : Object
         {
        

        companion object {


    private val DESKTOP_SYMBOLIC_NAME: String = "org.knopflerfish.bundle.desktop"


        }
            
    private var bundle: Bundle
public constructor        ()
            : super()
        {
    var bundleContext: BundleContext = InputAutomationBundleActivator.getBundleContext()!!
            


    
                        if(bundleContext != 
                                    null
                                )
                        
                                    {
                                    
    var bundleArray: Array<Bundle?> = bundleContext!!.getBundles()!!
            





                        for (index in 0 until bundleArray!!.size)


        {
    var bundle: Bundle = bundleArray[index]!!


    var symbolicName: String = bundle!!.getSymbolicName()!!
            


    
                        if(symbolicName!!.compareTo(DESKTOP_SYMBOLIC_NAME) == 0)
                        
                                    {
                                    this.bundle= bundle

                                    }
                                
}


                                    }
                                
                        else {
                            
    var textJDialog: JDialog = BasicTextJDialog(
                            "BundlContext is Null")

textJDialog!!.setVisible(true)

                        }
                            
}


                @Throws(Exception::class)
            
open fun start()
        //nullable = true from not(false or (false and true)) = true
{this.bundle!!.start()
}


}
                
            

