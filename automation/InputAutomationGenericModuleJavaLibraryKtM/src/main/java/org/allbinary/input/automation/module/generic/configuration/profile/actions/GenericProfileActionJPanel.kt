
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
        package org.allbinary.input.automation.module.generic.configuration.profile.actions



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.actions.script.JTreeInterfaceFactory
import org.allbinary.input.automation.actions.script.condition.AlwaysActionScriptCondition
import org.allbinary.input.automation.actions.script.condition.ColorAtActionScriptCondition
import org.allbinary.input.automation.actions.script.condition.ProfileActionScriptConditionInterface
import org.allbinary.input.automation.actions.script.condition.TimeIntervalActionScriptCondition
import org.allbinary.input.automation.module.generic.configuration.profile.actions.script.GenericProfileActionScriptJPanel
import org.allbinary.logic.communication.log.LogUtil

open public class GenericProfileActionJPanel : javax.swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var genericProfileAction: GenericProfileAction

    private var genericProfileActionScriptJPanel: GenericProfileActionScriptJPanel
public constructor        (){initComponents()
}


open fun updateProfileActionUI()
        //nullable = true from not(false or (false and true)) = true
{this.blankProfileActionScriptJPanel!!.removeAll()

    var genericProfileActionScriptJPanel: GenericProfileActionScriptJPanel = GenericProfileActionScriptJPanel()

JTreeInterfaceFactory.getInstance()!!.set(genericProfileActionScriptJPanel)
this.setGenericProfileActionScriptJPanel(genericProfileActionScriptJPanel)
this.getGenericProfileActionScriptJPanel()!!.setGenericProfileActionScript(this.getGenericProfileAction()!!.getGenericProfileActionScript())
this.getGenericProfileActionScriptJPanel()!!.updateJTree()

    var layout: GroupLayout = this.blankProfileActionScriptJPanel!!.getLayout() as GroupLayout

layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE)!!.addComponent(this.getGenericProfileActionScriptJPanel(), javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 256, Short.MAX_VALUE)!!.addComponent(this.getGenericProfileActionScriptJPanel(), javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))
logUtil!!.put(
                            "Updated UI", this, 
                            "updateUI")
}


open fun getGenericProfileAction()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileAction{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericProfileAction
}


open fun setGenericProfileAction(genericProfileAction: GenericProfileAction)
        //nullable = true from not(false or (false and false)) = true
{

                    var genericProfileAction = genericProfileAction
this.genericProfileAction= genericProfileAction
}


open fun getGenericProfileActionScriptJPanel()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileActionScriptJPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericProfileActionScriptJPanel
}


open fun setGenericProfileActionScriptJPanel(genericProfileActionScriptJPanel: GenericProfileActionScriptJPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var genericProfileActionScriptJPanel = genericProfileActionScriptJPanel
this.genericProfileActionScriptJPanel= genericProfileActionScriptJPanel
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{genericProfileActionScriptJScrollPane= JScrollPane()
blankProfileActionScriptJPanel= JPanel()
ifJLabel= JLabel()
newColorAtJButton= JButton()
newTimeIntervalJButton= JButton()
newAlwaysJButton= JButton()
setMinimumSize(Dimension(440, 275))
setPreferredSize(Dimension(440, 275))
genericProfileActionScriptJScrollPane!!.setPreferredSize(Dimension(474, 270))
blankProfileActionScriptJPanel!!.setMinimumSize(Dimension(400, 200))

    var blankProfileActionScriptJPanelLayout: GroupLayout = GroupLayout(blankProfileActionScriptJPanel)

blankProfileActionScriptJPanel!!.setLayout(blankProfileActionScriptJPanelLayout)
blankProfileActionScriptJPanelLayout!!.setHorizontalGroup(blankProfileActionScriptJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 9996, Short.MAX_VALUE))
blankProfileActionScriptJPanelLayout!!.setVerticalGroup(blankProfileActionScriptJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 9967, Short.MAX_VALUE))
genericProfileActionScriptJScrollPane!!.setViewportView(blankProfileActionScriptJPanel)
ifJLabel!!.setText(
                            "Conditions:")
newColorAtJButton!!.setText(
                            "Color Range At")
newColorAtJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
newColorAtJButtonActionPerformed(evt)
}

                                }
                            )
newTimeIntervalJButton!!.setText(
                            "Time Interval")
newTimeIntervalJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
newTimeIntervalJButtonActionPerformed(evt)
}

                                }
                            )
newAlwaysJButton!!.setText(
                            "Always On/Off")
newAlwaysJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
newAlwaysJButtonActionPerformed(evt)
}

                                }
                            )

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addComponent(ifJLabel)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newColorAtJButton)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newTimeIntervalJButton)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(newAlwaysJButton)!!.addContainerGap(61, Short.MAX_VALUE))!!.addComponent(genericProfileActionScriptJScrollPane, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(ifJLabel, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 14, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(newColorAtJButton)!!.addComponent(newTimeIntervalJButton)!!.addComponent(newAlwaysJButton))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(genericProfileActionScriptJScrollPane, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
}


open fun newTimeIntervalJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
logUtil!!.put(
                            "New Time Interval Action Condition", this, 
                            "newTimeIntervalJButtonActionPerformed")
getGenericProfileAction()!!.getGenericProfileActionScript()!!.addCondition(TimeIntervalActionScriptCondition() as ProfileActionScriptConditionInterface)
this.updateProfileActionUI()
}


open fun newAlwaysJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
logUtil!!.put(
                            "New EveryTime Action Condition", this, 
                            "newEveryTimeJButtonActionPerformed")
getGenericProfileAction()!!.getGenericProfileActionScript()!!.addCondition(AlwaysActionScriptCondition() as ProfileActionScriptConditionInterface)
this.updateProfileActionUI()
}


open fun newColorAtJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
logUtil!!.put(
                            "New Color At Action Condition", this, 
                            "newColorAtJButtonActionPerformed")
getGenericProfileAction()!!.getGenericProfileActionScript()!!.addCondition(ColorAtActionScriptCondition() as ProfileActionScriptConditionInterface)
this.updateProfileActionUI()
}


    private var blankProfileActionScriptJPanel: JPanel

    private var genericProfileActionScriptJScrollPane: JScrollPane

    private var ifJLabel: JLabel

    private var newAlwaysJButton: JButton

    private var newColorAtJButton: JButton

    private var newTimeIntervalJButton: JButton

}
                
            

