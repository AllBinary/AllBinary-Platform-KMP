
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ActionScriptItemJPanel : swing.JPanel {
        
public constructor        (){initComponents()
}


open fun getNewActionScriptInputJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newActionScriptInputJPanel
}


open fun setNewActionScriptInputJPanel(newActionScriptInputJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var newActionScriptInputJPanel = newActionScriptInputJPanel
this.newActionScriptInputJPanel= newActionScriptInputJPanel
}


open fun getRemoveJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return removeJPanel
}


open fun setRemoveJPanel(removeJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var removeJPanel = removeJPanel
this.removeJPanel= removeJPanel
}


open fun getScriptItemJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scriptItemJPanel
}


open fun setScriptItemJPanel(scriptItemJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var scriptItemJPanel = scriptItemJPanel
this.scriptItemJPanel= scriptItemJPanel
}


open fun getNewActionScriptConditionJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newActionScriptConditionJPanel
}


open fun setNewActionScriptConditionJPanel(newActionScriptConditionJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var newActionScriptConditionJPanel = newActionScriptConditionJPanel
this.newActionScriptConditionJPanel= newActionScriptConditionJPanel
}


open fun getChildActionScriptConditionJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return childActionScriptConditionJPanel
}


open fun setChildActionScriptConditionJPanel(childActionScriptConditionJPanel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var childActionScriptConditionJPanel = childActionScriptConditionJPanel
this.childActionScriptConditionJPanel= childActionScriptConditionJPanel
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{newActionScriptInputJPanel= JPanel()
childActionScriptConditionJPanel= JPanel()
newActionScriptConditionJPanel= JPanel()
scriptItemJPanel= JPanel()
removeJPanel= JPanel()
newActionScriptInputJPanel!!.setLayout(GridLayout(1, 0))

    var childActionScriptConditionJPanelLayout: GroupLayout = GroupLayout(childActionScriptConditionJPanel)

childActionScriptConditionJPanel!!.setLayout(childActionScriptConditionJPanelLayout)
childActionScriptConditionJPanelLayout!!.setHorizontalGroup(childActionScriptConditionJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 229, Short.MAX_VALUE))
childActionScriptConditionJPanelLayout!!.setVerticalGroup(childActionScriptConditionJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 8, Short.MAX_VALUE))
newActionScriptConditionJPanel!!.setLayout(GridLayout(1, 0))
scriptItemJPanel!!.setLayout(GridLayout(1, 1))
removeJPanel!!.setLayout(GridLayout(1, 1))
removeJPanel!!.setMinimumSize(Dimension(30, 20))

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addComponent(scriptItemJPanel, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 167, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(removeJPanel, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))!!.addComponent(newActionScriptInputJPanel, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)!!.addComponent(newActionScriptConditionJPanel, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)!!.addComponent(childActionScriptConditionJPanel, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(scriptItemJPanel, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)!!.addComponent(removeJPanel, javax!!.swing!!.GroupLayout.Alignment.TRAILING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(childActionScriptConditionJPanel, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newActionScriptConditionJPanel, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 28, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newActionScriptInputJPanel, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 30, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)))
}


    private var childActionScriptConditionJPanel: JPanel

    private var newActionScriptConditionJPanel: JPanel

    private var newActionScriptInputJPanel: JPanel

    private var removeJPanel: JPanel

    private var scriptItemJPanel: JPanel

}
                
            

