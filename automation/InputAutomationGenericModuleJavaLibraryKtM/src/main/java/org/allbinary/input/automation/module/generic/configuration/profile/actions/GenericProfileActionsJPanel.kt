
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
        
import org.allbinary.input.automation.module.DefaultListModelHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class GenericProfileActionsJPanel : swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var genericProfileActions: GenericProfileActions

    private var genericProfileActionJPanel: GenericProfileActionJPanel
public constructor        (){initComponents()
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{newProfileActionJDialog= JDialog()
newProfileActionJLabel= JLabel()
okNewProfileActionJButton= JButton()
newProfileActionJTextField= JTextField()
genericProfileActionsJPanel= JPanel()
genericProfileActionsJScrollPane= JScrollPane()
genericProfileActionsJList= JList()
newActionJButton= JButton()
deleteActionJButton= JButton()
saveJButton= JButton()
blankGenericProfileActionJPanel= JPanel()
newProfileActionJDialog!!.setMinimumSize(Dimension(250, 150))
newProfileActionJDialog!!.setResizable(false)
newProfileActionJLabel!!.setText(
                            "New Action Name")
okNewProfileActionJButton!!.setText(
                            "Ok")
okNewProfileActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
okNewProfileActionJButtonActionPerformed(evt)
}

                                }
                            )

    var newProfileActionJDialogLayout: GroupLayout = GroupLayout(newProfileActionJDialog!!.getContentPane())

newProfileActionJDialog!!.getContentPane()!!.setLayout(newProfileActionJDialogLayout)
newProfileActionJDialogLayout!!.setHorizontalGroup(newProfileActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(newProfileActionJDialogLayout!!.createSequentialGroup()!!.addGroup(newProfileActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(newProfileActionJDialogLayout!!.createSequentialGroup()!!.addGap(93, 93, 93)!!.addComponent(okNewProfileActionJButton))!!.addGroup(newProfileActionJDialogLayout!!.createSequentialGroup()!!.addGap(75, 75, 75)!!.addComponent(newProfileActionJLabel))!!.addGroup(newProfileActionJDialogLayout!!.createSequentialGroup()!!.addGap(29, 29, 29)!!.addComponent(newProfileActionJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 178, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)))!!.addContainerGap(34, Short.MAX_VALUE)))
newProfileActionJDialogLayout!!.setVerticalGroup(newProfileActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(javax!!.swing!!.GroupLayout.Alignment.TRAILING, newProfileActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(newProfileActionJLabel)!!.addGap(21, 21, 21)!!.addComponent(newProfileActionJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)!!.addComponent(okNewProfileActionJButton)!!.addContainerGap()))
genericProfileActionsJPanel!!.setPreferredSize(Dimension(10000, 10000))
genericProfileActionsJList!!.addListSelectionListener(object: ListSelectionListener()
                                {
                                
open override fun valueChanged(evt: ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
genericProfileActionsJListValueChanged(evt)
}

                                }
                            )
genericProfileActionsJScrollPane!!.setViewportView(genericProfileActionsJList)
newActionJButton!!.setText(
                            "New")
newActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
newActionJButtonActionPerformed(evt)
}

                                }
                            )
deleteActionJButton!!.setText(
                            "Delete")
deleteActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
deleteActionJButtonActionPerformed(evt)
}

                                }
                            )
saveJButton!!.setText(
                            "Save")
saveJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
saveJButtonActionPerformed(evt)
}

                                }
                            )
blankGenericProfileActionJPanel!!.setMinimumSize(Dimension(500, 300))

    var blankGenericProfileActionJPanelLayout: GroupLayout = GroupLayout(blankGenericProfileActionJPanel)

blankGenericProfileActionJPanel!!.setLayout(blankGenericProfileActionJPanelLayout)
blankGenericProfileActionJPanelLayout!!.setHorizontalGroup(blankGenericProfileActionJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 500, Short.MAX_VALUE))
blankGenericProfileActionJPanelLayout!!.setVerticalGroup(blankGenericProfileActionJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 296, Short.MAX_VALUE))

    var genericProfileActionsJPanelLayout: GroupLayout = GroupLayout(genericProfileActionsJPanel)

genericProfileActionsJPanel!!.setLayout(genericProfileActionsJPanelLayout)
genericProfileActionsJPanelLayout!!.setHorizontalGroup(genericProfileActionsJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(genericProfileActionsJPanelLayout!!.createSequentialGroup()!!.addComponent(genericProfileActionsJScrollPane, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 95, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(blankGenericProfileActionJPanel, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))!!.addGroup(genericProfileActionsJPanelLayout!!.createSequentialGroup()!!.addComponent(newActionJButton)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(deleteActionJButton)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(saveJButton)!!.addContainerGap()))
genericProfileActionsJPanelLayout!!.setVerticalGroup(genericProfileActionsJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(genericProfileActionsJPanelLayout!!.createSequentialGroup()!!.addGroup(genericProfileActionsJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(newActionJButton)!!.addComponent(deleteActionJButton)!!.addComponent(saveJButton))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(genericProfileActionsJPanelLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING, false)!!.addComponent(blankGenericProfileActionJPanel, 0, 296, Short.MAX_VALUE)!!.addComponent(genericProfileActionsJScrollPane, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))!!.addContainerGap(javax!!.swing!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addComponent(genericProfileActionsJPanel, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 596, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addContainerGap(javax!!.swing!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(genericProfileActionsJPanel, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 336, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))
}


open fun setModel()
        //nullable = true from not(false or (false and true)) = true
{
    var defaultListModelHelper: DefaultListModelHelper = this.getGenericProfileActions()!!.getDefaultListModelHelper()!!
            


    
                        if(defaultListModelHelper!!.getListModel()!!.getSize() > 0)
                        
                                    {
                                    this.genericProfileActionsJList!!.setModel(defaultListModelHelper!!.getListModel())

                                    }
                                
}


open fun saveJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            this.getGenericProfileActions()!!.save()
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "saveJButtonActionPerformed", e)
}

}


open fun updateProfileActionUI(profileActionNameString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var profileActionNameString = profileActionNameString
this.blankGenericProfileActionJPanel!!.removeAll()

    
                        if(profileActionNameString != 
                                    null
                                )
                        
                                    {
                                    
    var genericProfileAction: GenericProfileAction = this.getGenericProfileActions()!!.getAction(profileActionNameString)!!
            

this.setGenericProfileActionJPanel(GenericProfileActionJPanel())
this.getGenericProfileActionJPanel()!!.setGenericProfileAction(genericProfileAction)
this.getGenericProfileActionJPanel()!!.updateProfileActionUI()

    var layout: GroupLayout = this.blankGenericProfileActionJPanel!!.getLayout() as GroupLayout

layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 395, Short.MAX_VALUE)!!.addComponent(this.getGenericProfileActionJPanel(), javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGap(0, 256, Short.MAX_VALUE)!!.addComponent(this.getGenericProfileActionJPanel(), javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))
logUtil!!.put(
                            "Setting Configuration Profile Actions JPanel", this, 
                            "genericProfileActionsJListValueChanged")

                                    }
                                
}


open fun genericProfileActionsJListValueChanged(evt: ListSelectionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            
    var profileActionNameString: String = this.genericProfileActionsJList!!.getSelectedValue() as String

this.updateProfileActionUI(profileActionNameString)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "genericProfileActionsJListValueChanged", e)
}

}


open fun okNewProfileActionJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            
    var newActionName: String = this.newProfileActionJTextField!!.getText()!!
            

this.getGenericProfileActions()!!.add(newActionName)
this.setModel()
this.genericProfileActionsJList!!.setSelectedValue(newActionName, true)
this.newProfileActionJDialog!!.setVisible(false)
this.updateProfileActionUI(newActionName)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "okNewProfileActionJButtonActionPerformed", e)
}

}


open fun deleteActionJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            
    var anyType: Array<Any?> = this.genericProfileActionsJList!!.getSelectedValues()!!
            





                        for (index in 0 until anyType!!.size)


        {
    var nextSelectedValueString: String = anyType[index]!! as String

this.getGenericProfileActions()!!.remove(nextSelectedValueString)
}

this.selectFirstElement()
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "deleteActionJButtonActionPerformed", e)
}

}


                @Throws(Exception::class)
            
open fun selectFirstElement()
        //nullable = true from not(false or (false and true)) = true
{this.setModel()

    
                        if(this.genericProfileActionsJList!!.getModel()!!.getSize() > 0)
                        
                                    {
                                    this.genericProfileActionsJList!!.setSelectedValue(this.genericProfileActionsJList!!.getModel()!!.getElementAt(0), true)
this.updateProfileActionUI(this.genericProfileActionsJList!!.getModel()!!.getElementAt(0) as String)

                                    }
                                
                        else {
                            this.blankGenericProfileActionJPanel!!.removeAll()
this.blankGenericProfileActionJPanel!!.repaint()

                        }
                            
}


open fun getGenericProfileActionJPanel()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileActionJPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericProfileActionJPanel
}


open fun setGenericProfileActionJPanel(genericProfileActionJPanel: GenericProfileActionJPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var genericProfileActionJPanel = genericProfileActionJPanel
this.genericProfileActionJPanel= genericProfileActionJPanel
}


open fun getGenericProfileActions()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileActions{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericProfileActions
}


open fun setGenericProfileActions(genericProfileActions: GenericProfileActions)
        //nullable = true from not(false or (false and false)) = true
{

                    var genericProfileActions = genericProfileActions
this.genericProfileActions= genericProfileActions
}


open fun newActionJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.newProfileActionJDialog!!.setVisible(true)
}


    private var blankGenericProfileActionJPanel: JPanel

    private var deleteActionJButton: JButton

    private var genericProfileActionsJList: JList

    private var genericProfileActionsJPanel: JPanel

    private var genericProfileActionsJScrollPane: JScrollPane

    private var newActionJButton: JButton

    private var newProfileActionJDialog: JDialog

    private var newProfileActionJLabel: JLabel

    private var newProfileActionJTextField: JTextField

    private var okNewProfileActionJButton: JButton

    private var saveJButton: JButton

}
                
            

