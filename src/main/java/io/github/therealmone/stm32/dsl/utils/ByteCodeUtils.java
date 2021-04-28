package io.github.therealmone.stm32.dsl.utils;

import io.github.therealmone.stm32.dsl.bytecode.ByteCode;
import io.github.therealmone.stm32.dsl.bytecode.Marker;
import lombok.val;

public class ByteCodeUtils {

    public static void processMarkers(ByteCode byteCode) {
        Integer toMarkerIndex;

        while ((toMarkerIndex = findNextToMarker(byteCode)) != null) {
            val toMarker = Marker.parse(byteCode.get(toMarkerIndex));

            byteCode.getBytecode().remove((int) toMarkerIndex);

            replaceFromMarkers(byteCode, toMarker, toMarkerIndex);
        }
    }

    private static Integer findNextToMarker(ByteCode byteCode) {
        for (int i = 0; i < byteCode.size(); i++) {
            if (Marker.isToMarker(byteCode.get(i))) {
                return i;
            }
        }

        return null;
    }

    private static void replaceFromMarkers(ByteCode byteCode, Marker toMarker, Integer address) {
        for (int i = 0; i < byteCode.size(); i++) {
            if (Marker.isFromMarker(byteCode.get(i))) {
                val marker = Marker.parse(byteCode.get(i));

                if (marker.getValue().equals(toMarker.getValue())) {
                    byteCode.getBytecode().set(i, address.toString());
                }
            }
        }
    }

}
