
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
        package org.allbinary.input.automation.module.generic.configuration.profile.actions.script




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.actions.script.condition.ProfileActionScriptConditionInterface
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileAction
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileActionJPanel
import org.allbinary.logic.communication.log.LogUtil

open public class RemoveActionScriptItemJPanel : java.awt.Panel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var genericProfileActionJPanel: GenericProfileActionJPanel

    private var profileActionScriptConditionInterface: ProfileActionScriptConditionInterface
public constructor (genericProfileActionJPanel: GenericProfileActionJPanel, profileActionScriptConditionInterface: ProfileActionScriptConditionInterface){
var genericProfileActionJPanel = genericProfileActionJPanel
var profileActionScriptConditionInterface = profileActionScriptConditionInterface
initComponents()
this.genericProfileActionJPanel= genericProfileActionJPanel
this.profileActionScriptConditionInterface= profileActionScriptConditionInterface
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
removeJButton= javax.swing.JButton()
setLayout(java.awt.GridLayout())
removeJButton!!.setText("Remove")
removeJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
removeJButtonActionPerformed(evt)
}

                                }
                            )
add(removeJButton)
}


    open fun removeJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    var genericProfileAction: GenericProfileAction = this.genericProfileActionJPanel!!.getGenericProfileAction()!!


    
                        if(genericProfileAction == 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put("GenericProfileAction was null", this, "removeJButtonActionPerformed")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
genericProfileAction!!.getGenericProfileActionScript()!!.removeCondition(this.profileActionScriptConditionInterface)
this.genericProfileActionJPanel!!.updateProfileActionUI()
}


    private var removeJButton: javax.swing.JButton

}
                
            

