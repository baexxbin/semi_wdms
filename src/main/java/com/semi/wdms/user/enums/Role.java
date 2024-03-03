package com.semi.wdms.user.enums;

public enum Role {

    ROLE_PARTNER("ROLE_PARTNER"), ROLE_MANAGER("ROLE_MANAGER"), ROLE_ADMIN("ROLE_ADMIN");

    final String role;

    Role(String role) {this.role = role;}

    public String getRole() {return role;}
}
