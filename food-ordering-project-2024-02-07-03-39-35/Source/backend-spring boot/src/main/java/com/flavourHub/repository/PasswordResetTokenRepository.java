package com.flavourHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flavourHub.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
