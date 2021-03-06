/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.org.indt.ndg.lwuit.control;

import com.sun.lwuit.Command;
import com.nokia.mid.appl.cmd.Local;
import br.org.indt.ndg.mobile.download.DownloadNewSurveys;

public class CancelSSDownloadCommand extends BackCommand {

    private static CancelSSDownloadCommand instance;

    public static CancelSSDownloadCommand getInstance() {
        if (instance == null)
            instance = new CancelSSDownloadCommand();
        return instance;
    }

    protected Command createCommand() {
        return new Command(Local.getText(Local.QTJ_CMD_CANCEL));
    }

    protected void doAction(Object parameter) {
        DownloadNewSurveys.getInstance().cancelAndKillOperation();
    }

}
