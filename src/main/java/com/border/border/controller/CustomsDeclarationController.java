package com.border.border.controller;





import com.border.border.model.*;
import com.border.border.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/declarations")
public class CustomsDeclarationController {
    @Autowired
    private CustomsDeclarationService declarationService;

    @GetMapping
    public List<CustomsDeclaration> getAllDeclarations() {
        return declarationService.getAllDeclarations();
    }

    @GetMapping("/{id}")
    public Optional<CustomsDeclaration> getDeclarationById(@PathVariable Long id) {
        return declarationService.getDeclarationById(id);
    }

    @PostMapping
    public CustomsDeclaration createDeclaration(@RequestBody CustomsDeclaration declaration) {
        return declarationService.saveDeclaration(declaration);
    }

    @DeleteMapping("/{id}")
    public void deleteDeclaration(@PathVariable Long id) {
        declarationService.deleteDeclaration(id);
    }
}
