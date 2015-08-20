package org.sample;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentNumber;
import org.knime.core.node.defaultnodesettings.SettingsModelIntegerBounded;

/**
 * <code>NodeDialog</code> for the "NumericBinner" Node.
 * Simple numeric binner with equidistant bins
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more 
 * complex dialog please derive directly from 
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author sac hin
 */
public class NumericBinnerNodeDialog extends DefaultNodeSettingsPane {

    /**
     * New pane for configuring NumericBinner node dialog.
     * This is just a suggestion to demonstrate possible default dialog
     * components.
     */
    protected NumericBinnerNodeDialog() {
        super();
        
        addDialogComponent(new DialogComponentNumber(
                new SettingsModelIntegerBounded(
                    NumericBinnerNodeModel.CFGKEY_COUNT,
                    NumericBinnerNodeModel.DEFAULT_COUNT,
                    Integer.MIN_VALUE, Integer.MAX_VALUE),
                    "Counter:", /*step*/ 1, /*componentwidth*/ 5));
                    
    }
}

