/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils.logs;

import com.utils.logs.models.ILogService;
import com.utils.logs.models.ILogAdapter;
import com.utils.logs.models.ILogContextEnum;
import com.utils.logs.models.ILogSeverityEnum;
import com.utils.constants.LogContext;

/**
 *
 * @author jvidal
 */
public class LogService implements ILogService {

    public enum LogSeverity implements ILogSeverityEnum {
        INFO("info"),
        WARN("warn"),
        ERROR("error");

        private final String value;

        private LogSeverity(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return this.value;
        }

    }

    private final ILogAdapter adapter;

    public LogService(ILogAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void info(ILogContextEnum context, String message) {
        this.log(LogSeverity.INFO, context, message);
    }

    @Override
    public void warn(ILogContextEnum context, String message) {
        this.log(LogSeverity.WARN, context, message);
    }

    @Override
    public void error(ILogContextEnum context, String message) {
        this.log(LogSeverity.ERROR, context, message);
    }

    @Override
    public void log(ILogSeverityEnum severity, ILogContextEnum context, String message) {
        String _message = this.buildMessage(context, message);

        if (severity == LogSeverity.INFO) {
            this.adapter.info(this.buildMessage(context, _message));
            return;
        }

        if (severity == LogSeverity.WARN) {
            this.adapter.warn(this.buildMessage(context, _message));
            return;
        }

        if (severity == LogSeverity.ERROR) {
            this.adapter.error(this.buildMessage(context, _message));
            return;
        }

        this.adapter.error(this.buildMessage(LogContext.SERVICE, "Log severity not allowed"));

    }

    private String buildMessage(ILogContextEnum context, String message) {
        StringBuilder builder = new StringBuilder("### ");

        String ctx = context.getValue();

        builder.append(ctx);
        builder.append(", ");
        builder.append(message);

        return builder.toString();
    }

}
