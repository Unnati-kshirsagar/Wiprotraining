package com.wipro.sprindgdemo.beans;

public class Branch {
    private String branchCode;
    private String branchName;

    public Branch() {
        this.branchCode = "GEN";
        this.branchName = "General Studies";
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String toString() {
        return "Artificial Intelligence [branchCode=" + branchCode + ", branchName=" + branchName + "]";
    }
}
