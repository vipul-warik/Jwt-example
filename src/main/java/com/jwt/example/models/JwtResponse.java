package com.jwt.example.models;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse {
	private String jwtToken;
	
	private String username;

	
}
