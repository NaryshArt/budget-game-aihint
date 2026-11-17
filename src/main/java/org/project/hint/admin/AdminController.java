package org.project.hint.admin;

import lombok.RequiredArgsConstructor;
import org.project.hint.domain.PromptVersion;
import org.project.hint.service.PromptService;
import org.project.hint.service.SettingsService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    private final PromptService promptService;
    private final SettingsService settingsService;

    @GetMapping("/prompts")
    public ResponseEntity<List<PromptVersion>> listPrompts() {
        return null; // TODO
    }

    @PostMapping("/prompts")
    public ResponseEntity<PromptVersion> createPrompt(@RequestBody Map<String, String> body) {
        return null; // TODO: body: text, comment
    }

    @PostMapping("/prompts/{id}/activate")
    public ResponseEntity<Void> activatePrompt(@PathVariable Long id) {
        return null; // TODO
    }

    @GetMapping("/settings")
    public ResponseEntity<Map<String, String>> getSettings() {
        return null; // TODO
    }

    @PutMapping("/settings/{key}")
    public ResponseEntity<Void> updateSetting(@PathVariable String key, @RequestBody Map<String, String> body) {
        return null; // TODO: body: value
    }

    @PostMapping("/test-hint")
    public ResponseEntity<?> testHint(@RequestBody Map<String, Object> body) {
        return null; // TODO: черновик промпта + тестовое состояние → ответ модели без активации
    }

    @GetMapping("/audit")
    public ResponseEntity<?> getAuditLog(@RequestParam(defaultValue = "0") int page) {
        return null; // TODO
    }
}
