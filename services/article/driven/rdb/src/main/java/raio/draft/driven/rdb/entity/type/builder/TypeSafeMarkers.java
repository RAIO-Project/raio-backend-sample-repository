package raio.draft.driven.rdb.entity.type.builder;

import raio.draft.driven.rdb.entity.type.builder.TypeSafeMarkers.Missing;
import raio.draft.driven.rdb.entity.type.builder.TypeSafeMarkers.Present;

public sealed interface TypeSafeMarkers permits Present, Missing {
    non-sealed interface Present extends TypeSafeMarkers {}
    non-sealed interface Missing extends TypeSafeMarkers {}
}

