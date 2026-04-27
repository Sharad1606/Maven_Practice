package com.scaleupindia.repository;

import java.util.List;

import com.scaleupindia.dto.OwnerDTO;

/**
 * @author sharad1606
 *
 */
public interface OwnerRepository {
	List<OwnerDTO> findAllOwners();
}
