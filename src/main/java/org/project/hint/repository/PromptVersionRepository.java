package org.project.hint.repository;

import org.project.hint.domain.PromptVersion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PromptVersionRepository extends JpaRepository<PromptVersion, Long> {

    Optional<PromptVersion> findByActiveTrue();
}
