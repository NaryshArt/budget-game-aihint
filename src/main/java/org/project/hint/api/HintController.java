package org.project.hint.api;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.project.hint.api.dto.HintRequest;
import org.project.hint.api.dto.HintResponse;
import org.project.hint.service.HintService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class HintController {

    private final HintService hintService;

    @PostMapping("/hint")
    public ResponseEntity<HintResponse> getHint(@Valid @RequestBody HintRequest request) {
        return null; // TODO
    }
}
