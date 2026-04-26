package raio.article.driven.rdb.entity.type.builder;

import raio.article.driven.rdb.entity.type.builder.TypeSafeMarkers.Present;
import raio.article.driven.rdb.entity.type.builder.TypeSafeMarkers.Missing;

public sealed interface TypeSafeMarkers permits Present, Missing {
    non-sealed interface Present extends TypeSafeMarkers {}
    non-sealed interface Missing extends TypeSafeMarkers {}
}

