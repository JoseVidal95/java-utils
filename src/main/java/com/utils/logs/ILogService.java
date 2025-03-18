/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utils.logs;

import com.utils.constants.ILogContextEnum;
import com.utils.constants.ILogSeverityEnum;

/**
 *
 * @author jvidal
 */
public interface ILogService {

    void log(ILogSeverityEnum severity, ILogContextEnum context, String message);

    void info(ILogContextEnum context, String message);

    void warn(ILogContextEnum context, String message);

    void error(ILogContextEnum context, String message);
}
