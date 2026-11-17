CREATE TABLE prompt_version (
    id         BIGSERIAL PRIMARY KEY,
    text       TEXT        NOT NULL,
    created_at TIMESTAMPTZ NOT NULL DEFAULT now(),
    created_by VARCHAR(255),
    active     BOOLEAN     NOT NULL DEFAULT FALSE,
    comment    VARCHAR(500)
);

CREATE TABLE setting (
    key        VARCHAR(100) PRIMARY KEY,
    value      VARCHAR(500) NOT NULL,
    updated_at TIMESTAMPTZ,
    updated_by VARCHAR(255)
);

CREATE TABLE audit_log (
    id        BIGSERIAL PRIMARY KEY,
    who       VARCHAR(255),
    what      VARCHAR(255),
    old_value TEXT,
    new_value TEXT,
    at        TIMESTAMPTZ NOT NULL DEFAULT now()
);
