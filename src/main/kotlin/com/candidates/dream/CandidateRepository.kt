package com.candidates.dream

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "candidates", path = "candidates")
interface CandidateRepository : PagingAndSortingRepository<Candidate, Long> {
    fun findByLastName(lastname: String): Candidate?
    fun findByEmail(email: String): Candidate?
    fun findAllByOrderByLastNameDesc(): Iterable<Candidate>
}