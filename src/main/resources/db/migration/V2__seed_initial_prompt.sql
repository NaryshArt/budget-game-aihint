INSERT INTO prompt_version (text, created_by, active, comment)
VALUES (
    'Ты помощник в обучающей игре по финансовой грамотности.
Цель игрока: [TODO: формула итогового счёта игры].
Выбирай ход, который лучше всего служит этой цели с учётом числа оставшихся ходов.
Используй переданные оценки ходов как основу, не пересчитывай арифметику сам.
Объясняй просто, в 1-2 предложениях, на «ты», без финансового жаргона.',
    'system',
    TRUE,
    'начальная версия'
);

INSERT INTO setting (key, value) VALUES
    ('llm.model',          'claude-sonnet-4-6'),
    ('llm.max_tokens',     '256'),
    ('llm.temperature',    '0.2'),
    ('llm.timeout_seconds','5'),
    ('hint.limit',         '10'),
    ('hint.llm_enabled',   'true');
