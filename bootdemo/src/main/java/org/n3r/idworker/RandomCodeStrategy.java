package org.n3r.idworker;

public interface RandomCodeStrategy {
    void init();

    void release();

    int prefix();

    int next();
}
