package com.demo.springglobalexceptionhandler.consts;

import org.springframework.lang.Nullable;

public enum ApiStatus {
    Failed(-1, "请求失败"),
    // 1xxx 首页
    UserNotFoundException(1000, "用户不存在"),
    // 2xxx 生活
    BalanceNotEnoughException(2000, "余额不足");


    private final int value;

    private final String reasonPhrase;

    ApiStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    /**
     * Return the integer value of this status code.
     */
    public int value() {
        return this.value;
    }

    /**
     * Return a string representation of this status code.
     */
    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

    /**
     * Return the enum constant of this type with the specified numeric value.
     *
     * @param statusCode the numeric value of the enum to be returned
     * @return the enum constant with the specified numeric value
     * @throws IllegalArgumentException if this enum has no constant for the specified numeric value
     */
    public static ApiStatus valueOf(int statusCode) {
        ApiStatus status = resolve(statusCode);
        if (status == null) {
            throw new IllegalArgumentException("No matching constant for [" + statusCode + "]");
        }
        return status;
    }

    /**
     * Resolve the given status code to an {@code HttpStatus}, if possible.
     *
     * @param statusCode the HTTP status code (potentially non-standard)
     * @return the corresponding {@code HttpStatus}, or {@code null} if not found
     * @since 5.0
     */
    @Nullable
    public static ApiStatus resolve(int statusCode) {
        for (ApiStatus status : values()) {
            if (status.value == statusCode) {
                return status;
            }
        }
        return null;
    }

    public String message() {
        return reasonPhrase;
    }
}
