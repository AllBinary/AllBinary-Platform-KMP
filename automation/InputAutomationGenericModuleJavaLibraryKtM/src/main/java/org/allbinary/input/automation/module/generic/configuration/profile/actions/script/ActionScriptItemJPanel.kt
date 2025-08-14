
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
        

open public class ActionScriptItemJPanel : javax.swing.JPanel {
        
public constructor        (){initComponents()
}


open fun getNewActionScriptInputJPanel()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newActionScriptInputJPanel
}


open fun setNewActionScriptInputJPanel(newActionScriptInputJPanel: javax.swing.JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var newActionScriptInputJPanel = newActionScriptInputJPanel
this.newActionScriptInputJPanel= newActionScriptInputJPanel
}


open fun getRemoveJPanel()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return removeJPanel
}


open fun setRemoveJPanel(removeJPanel: javax.swing.JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var removeJPanel = removeJPanel
this.removeJPanel= removeJPanel
}


open fun getScriptItemJPanel()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scriptItemJPanel
}


open fun setScriptItemJPanel(scriptItemJPanel: javax.swing.JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var scriptItemJPanel = scriptItemJPanel
this.scriptItemJPanel= scriptItemJPanel
}


open fun getNewActionScriptConditionJPanel()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newActionScriptConditionJPanel
}


open fun setNewActionScriptConditionJPanel(newActionScriptConditionJPanel: javax.swing.JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var newActionScriptConditionJPanel = newActionScriptConditionJPanel
this.newActionScriptConditionJPanel= newActionScriptConditionJPanel
}


open fun getChildActionScriptConditionJPanel()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return childActionScriptConditionJPanel
}


open fun setChildActionScriptConditionJPanel(childActionScriptConditionJPanel: javax.swing.JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var childActionScriptConditionJPanel = childActionScriptConditionJPanel
this.childActionScriptConditionJPanel= childActionScriptConditionJPanel
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{newActionScriptInputJPanel= javax.swing.JPanel()
childActionScriptConditionJPanel= javax.swing.JPanel()
newActionScriptConditionJPanel= javax.swing.JPanel()
scriptItemJPanel= javax.swing.JPanel()
removeJPanel= javax.swing.JPanel()
newActionScriptInputJPanel!!.setLayout(java.awt.GridLayout(1, 0))

    var childActionScriptConditionJPanelLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(childActionScriptConditionJPanel)

childActionScriptConditionJPanel!!.setLayout(childActionScriptConditionJPanelLayout)
childActionScriptConditionJPanelLayout!!.setHorizontalGroup(childActionScriptConditionJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 229, Short.MAX_VALUE))
childActionScriptConditionJPanelLayout!!.setVerticalGroup(childActionScriptConditionJPanelLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 8, Short.MAX_VALUE))
newActionScriptConditionJPanel!!.setLayout(java.awt.GridLayout(1, 0))
scriptItemJPanel!!.setLayout(java.awt.GridLayout(1, 1))
removeJPanel!!.setLayout(java.awt.GridLayout(1, 1))
removeJPanel!!.setMinimumSize(java.awt.Dimension(30, 20))

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(scriptItemJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(removeJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))!!.addComponent(newActionScriptInputJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)!!.addComponent(newActionScriptConditionJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)!!.addComponent(childActionScriptConditionJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(scriptItemJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)!!.addComponent(removeJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(childActionScriptConditionJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newActionScriptConditionJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newActionScriptInputJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
}


    private var childActionScriptConditionJPanel: javax.swing.JPanel

    private var newActionScriptConditionJPanel: javax.swing.JPanel

    private var newActionScriptInputJPanel: javax.swing.JPanel

    private var removeJPanel: javax.swing.JPanel

    private var scriptItemJPanel: javax.swing.JPanel

}
                
            

