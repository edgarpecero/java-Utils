package org.example.matrix.enums;

import java.util.HashMap;
import java.util.Map;

public enum MatrixAction {
    SUM("Sum"),
    PRODUCT("Product"),
    TRANSPOSE("Transpose"),
    MAX("Max"),
    MIN("Min");

    private final String label;
    MatrixAction(String label) {
        this.label = label;
    }

    private static final Map<String, MatrixAction> BY_LABEL = new HashMap<>();

    static {
        for (MatrixAction s : values()) {
            BY_LABEL.put(s.label, s);
        }
    }

    @Override
    public String toString() {
        return label;
    }
}
