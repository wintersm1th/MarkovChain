package org.z7.graphs_simplified.vertices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContentVertexImplTest {
    @Test
    void NumericVertex() {
        ContentVertexImpl<Integer> vert = new ContentVertexImpl<>();
        Integer content = 100;

        vert.setContent(content);

        Assertions.assertEquals(content, vert.getContent());
    }

    @Test
    void StringVertex() {
        ContentVertexImpl<String> vert = new ContentVertexImpl<>();
        String message = "message";
        vert.setContent(message);

        Assertions.assertEquals(message, vert.getContent());
    }
}
