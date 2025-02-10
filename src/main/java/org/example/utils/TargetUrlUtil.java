package org.example.utils;

import org.example.constants.TargetUrlEnum;

import static org.example.configs.Defaults.DEFAULT_URL;

public class TargetUrlUtil {
    private static final String LOCAL_SERVER_URL = "127.0.0.1:5500/";
    private static final String GITHUB_PAGES_URL = "https://jlcruza.github.io/software-testing-homework/";

    public static String getUrl() {
        return getUrl(DEFAULT_URL);
    }

    public static String getUrl(TargetUrlEnum targetUrl) {
        switch (targetUrl) {
            case LOCAL_SERVER:
                return LOCAL_SERVER_URL;
            case GITHUB_PAGES:
                return GITHUB_PAGES_URL;
            default:
                return "";
        }
    }
}
