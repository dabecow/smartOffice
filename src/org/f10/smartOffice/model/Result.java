package org.f10.smartOffice.model;

import java.util.Date;

public class Result {
    private User user;
    private Date date;
    private String actionId;
    private Boolean isSuccess;

    public Result(User user, Date date, String actionId, Boolean isSuccess) {
        this.user = user;
        this.date = date;
        this.actionId = actionId;
        this.isSuccess = isSuccess;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    @Override
    public String toString() {
        return "Result{" +
                "user=" + user +
                ", date=" + date +
                ", description='" + actionId + '\'' +
                ", isSuccess=" + isSuccess +
                '}';
    }
}
