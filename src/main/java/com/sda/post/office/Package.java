package com.sda.post.office;

import java.util.UUID;

public class Package {
    private PackageStatus status;
    private final String contents;
    private final String packageNumber;

    public Package(String contents) {
        this.contents = contents;
        this.status = PackageStatus.SENT;
        this.packageNumber = UUID.randomUUID().toString();
    }

    public void changeStatus(PackageStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Package{" +
                "status=[" +
                status.getStatusCode() + " " +
                status.getDescription() + "]" +
                ", contents='" + contents + '\'' +
                ", packageNumber='" + packageNumber + '\'' +
                '}';
    }
}
