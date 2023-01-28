package org.recru.currenda.court.entity.base;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@SuperBuilder
@Entity
@MappedSuperclass
@NoArgsConstructor
@Getter
abstract class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(
			name = "uuid",
			unique = true,
			nullable = false,
			updatable = false
	)
	@NaturalId
	private UUID uuid;

	@Version
	private Long version;

	@Column(
			name = "created_date",
			nullable = false,
			updatable = false
	)
	@CreationTimestamp
	private LocalDateTime createdDate;

	@Column(
			name = "last_modified_date",
			nullable = false
	)
	@UpdateTimestamp
	private LocalDateTime lastModifiedDate;
}